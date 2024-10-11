import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.action.include_vars import ActionModule
from ansible.errors import AnsibleError


class TestActionModule(unittest.TestCase):

    def setUp(self):
        self.task = MagicMock()
        self.task.args = {}
        self.loader = MagicMock()
        self.instance = ActionModule(task=self.task, connection=None, play_context=None, loader=self.loader, templar=None, shared_loader_obj=None)

    def test_set_dir_defaults_no_depth(self):
        self.instance.depth = None
        self.instance.files_matching = None
        self.instance.ignore_files = None
        self.instance._set_dir_defaults()
        self.assertEqual(self.instance.depth, 0)

    def test_set_dir_defaults_with_depth(self):
        self.instance.depth = 2
        self.instance.files_matching = None
        self.instance.ignore_files = None
        self.instance._set_dir_defaults()
        self.assertEqual(self.instance.depth, 2)

    def test_set_dir_defaults_files_matching(self):
        self.instance.depth = None
        self.instance.files_matching = '.*\.yml'
        self.instance.ignore_files = None
        self.instance._set_dir_defaults()
        self.assertIsNotNone(self.instance.matcher)

    def test_set_dir_defaults_ignore_files(self):
        self.instance.depth = None
        self.instance.files_matching = None
        self.instance.ignore_files = 'file1 file2'
        self.instance._set_dir_defaults()
        self.assertEqual(self.instance.ignore_files, ['file1', 'file2'])

    def test_set_dir_defaults_ignore_files_dict(self):
        self.instance.depth = None
        self.instance.files_matching = None
        self.instance.ignore_files = {'key': 'value'}
        result = self.instance._set_dir_defaults()
        self.assertTrue(result['failed'])

    def test_set_args(self):
        self.task.args = {
            'hash_behaviour': 'merge',
            'name': 'test_name',
            'dir': 'test_dir',
            'file': 'test_file',
            'depth': 2,
            'files_matching': '.*\.yml',
            'ignore_unknown_extensions': True,
            'ignore_files': 'file1 file2',
            'extensions': 'yaml yml'
        }
        self.instance._set_args()
        self.assertEqual(self.instance.hash_behaviour, 'merge')
        self.assertEqual(self.instance.return_results_as_name, 'test_name')
        self.assertEqual(self.instance.source_dir, 'test_dir')
        self.assertEqual(self.instance.source_file, 'test_file')
        self.assertEqual(self.instance.depth, 2)
        self.assertEqual(self.instance.files_matching, '.*\.yml')
        self.assertTrue(self.instance.ignore_unknown_extensions)
        self.assertEqual(self.instance.ignore_files, 'file1 file2')
        self.assertEqual(self.instance.valid_extensions, ['yaml', 'yml'])

    def test_run_invalid_option(self):
        self.task.args = {'invalid_option': 'value'}
        with self.assertRaises(AnsibleError):
            self.instance.run()

    def test_run_mixed_arguments(self):
        self.task.args = {'dir': 'test_dir', 'file': 'test_file'}
        with self.assertRaises(AnsibleError):
            self.instance.run()

    def test_run_valid_dir(self):
        self.task.args = {'dir': 'test_dir'}
        with patch('os.path.exists', return_value=True), patch('os.path.isdir', return_value=True), patch.object(self.instance, '_traverse_dir_depth', return_value=[('root', ['file1.yml'])]), patch.object(self.instance, '_load_files_in_dir', return_value=(False, '', {})):
            result = self.instance.run(async=False)
            self.assertIn('ansible_included_var_files', result)

    def test_run_valid_file(self):
        self.task.args = {'file': 'test_file'}
        with patch.object(self.instance, '_find_needle', return_value='test_file'), patch.object(self.instance, '_load_files', return_value=(False, '', {})):
            result = self.instance.run(async=False)
            self.assertIn('ansible_included_var_files', result)

    def test_set_root_dir_with_role(self):
        self.task._role = MagicMock()
        self.task._role._role_path = '/role_path'
        self.instance.source_dir = 'vars/test_dir'
        self.instance._set_root_dir()
        self.assertEqual(self.instance.source_dir, 'vars/test_dir')

    def test_set_root_dir_without_role(self):
        self.task._role = None
        self.task._ds = MagicMock()
        self.task._ds._data_source = '/data_source/file.yml'
        self.instance.source_dir = 'test_dir'
        self.instance._set_root_dir()
        self.assertEqual(self.instance.source_dir, '/data_source/test_dir')

    def test_traverse_dir_depth(self):
        self.instance.source_dir = 'test_dir'
        self.instance.depth = 1
        with patch('os.walk', return_value=[('root', [], ['file1.yml'])]):
            result = list(self.instance._traverse_dir_depth())
            self.assertEqual(result, [])

    def test_ignore_file(self):
        self.instance.ignore_files = ['.*\.yml']
        result = self.instance._ignore_file('test.yml')
        self.assertTrue(result)

    def test_is_valid_file_ext(self):
        self.instance.valid_extensions = ['yml']
        result = self.instance._is_valid_file_ext('test.yml')
        self.assertTrue(result)

    def test_load_files_invalid_extension(self):
        with patch.object(self.instance, '_is_valid_file_ext', return_value=False):
            result = self.instance._load_files('test.txt', validate_extension=True)
            self.assertTrue(result[0])

    def test_load_files_valid_extension(self):
        with patch.object(self.instance, '_is_valid_file_ext', return_value=True), patch.object(self.loader, '_get_file_contents', return_value=(b'data', True)), patch.object(self.loader, 'load', return_value={'key': 'value'}):
            result = self.instance.load_files('test.yml', validate_extensions=True)
            self.assertFalse(result[0])

    def test_load_files_in_dir(self):
        self.instance.ignore_unknown_extensions = False
        self.instance.files_matching = None
        self.instance.ignore_files = []
        with patch('os.path.exists', return_value=True), patch.object(self.instance, '_ignore_file', return_value=False), patch.object(self.instance, '_is_valid_file_ext', return_value=True), patch.object(self.instance, '_load_files', return_value=(False, '', {'key': 'value'})):
            result = self.instance._load_files_in_dir('root', ['file1.yml'])
            self.assertFalse(result[0])

if __name__ == '__main__':
    unittest.main()