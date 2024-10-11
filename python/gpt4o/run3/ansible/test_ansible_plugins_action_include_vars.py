import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.action.include_vars import ActionModule
from ansible.errors import AnsibleError


class TestActionModule(unittest.TestCase):

    def setUp(self):
        self.task = MagicMock()
        self.task.args = {}
        self.task._role = None
        self.task._ds = None
        self.loader = MagicMock()
        self.instance = ActionModule(task=self.task, connection=None, play_context=None, loader=self.loader, templar=None, shared_loader_obj=None)

    def test_set_dir_defaults(self):
        self.instance.depth = None
        self.instance.files_matching = None
        self.instance.ignore_files = None
        self.instance._set_dir_defaults()
        self.assertEqual(self.instance.depth, 0)
        self.assertIsNone(self.instance.matcher)
        self.assertEqual(self.instance.ignore_files, [])

    def test_set_args(self):
        self.task.args = {
            'hash_behaviour': 'merge',
            'name': 'test_name',
            'dir': 'test_dir',
            'file': 'test_file',
            'depth': 2,
            'files_matching': '.*',
            'ignore_unknown_extensions': True,
            'ignore_files': 'ignore_this',
            'extensions': 'yaml'
        }
        self.instance._set_args()
        self.assertEqual(self.instance.hash_behaviour, 'merge')
        self.assertEqual(self.instance.return_results_as_name, 'test_name')
        self.assertEqual(self.instance.source_dir, 'test_dir')
        self.assertEqual(self.instance.source_file, 'test_file')
        self.assertEqual(self.instance.depth, 2)
        self.assertEqual(self.instance.files_matching, '.*')
        self.assertTrue(self.instance.ignore_unknown_extensions)
        self.assertEqual(self.instance.ignore_files, 'ignore_this')
        self.assertEqual(self.instance.valid_extensions, ['yaml'])

    def test_run(self):
        self.task.args = {'file': 'test_file'}
        self.instance._set_args = MagicMock()
        self.instance._find_needle = MagicMock(return_value='test_file')
        self.instance._load_files = MagicMock(return_value=(False, '', {'key': 'value'}))
        result = self.instance.run(source_dir='some_directory', task_vars={})
        self.assertIn('ansible_facts', result)
        self.assertEqual(result['ansible_facts'], {'key': 'value'})

    def test_set_root_dir(self):
        self.instance.source_dir = 'vars/test_dir'
        self.task._role = MagicMock()
        self.task._role._role_path = '/role_path'
        self.instance._set_root_dir()
        self.assertEqual(self.instance.source_dir, 'vars/test_dir')

    def test_traverse_dir_depth(self):
        self.instance.source_dir = '/test_dir'
        self.instance.depth = 1
        with patch('ansible.plugins.action.include_vars.walk', return_value=[('/test_dir', [], ['file1', 'file2'])]):
            result = list(self.instance._traverse_dir_depth())
        self.assertEqual(result, [('/test_dir', ['file1', 'file2'])])

    def test_ignore_file(self):
        self.instance.ignore_files = ['ignore_this']
        result = self.instance._ignore_file('ignore_this_file')
        self.assertTrue(result is True)

    def test_is_valid_file_ext(self):
        self.instance.valid_extensions = ['yaml']
        result = self.instance._is_valid_file_ext('test.yaml')
        self.assertTrue(result)

    def test_load_files(self):
        self.loader._get_file_contents = MagicMock(return_value=(b'key: value', True))
        self.loader.load = MagicMock(return_value={'key': 'value'})
        result = self.instance.load_files('test.yaml')
        self.assertEqual(result, (False, '', {'key': 'value'}))

    def test_load_files_in_dir(self):
        self.instance._task._role = None
        self.instance.files_matching = None
        self.instance.ignore_unknown_extensions = False
        self.instance._ignore_file = MagicMock(return_value=False)
        self.instance._is_valid_file_ext = MagicMock(return_value=True)
        self.instance._load_files = MagicMock(return_value=(False, '', {'key': 'value'}))
        result = self.instance._load_files_in_dir('/test_dir', ['file1'])
        self.assertEqual(result, (False, '', {}))

if __name__ == '__main__':
    unittest.main()