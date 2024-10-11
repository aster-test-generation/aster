import unittest
from ansible.plugins.action.include_vars import ActionModule


class TestActionModule(unittest.TestCase):
    def test_set_dir_defaults(self):
        action = ActionModule(connection=None, loader=None, templar=None, shared_loader_obj=None)
        action.depth = None
        action.files_matching = None
        action.ignore_files = None
        action._set_dir_defaults()
        self.assertEqual(action.depth, 0)
        self.assertIsNone(action.matcher)
        self.assertEqual(action.ignore_files, [])

    def test_set_args(self):
        action = ActionModule(connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        action._task = mock.Mock()
        action._task.args = {
            'hash_behaviour': 'merge',
            'name': 'test',
            'dir': '/path/to/dir',
            'file': '/path/to/file',
            'depth': 1,
            'files_matching': '.*',
            'ignore_unknown_extensions': True,
            'ignore_files': ['.txt', '.log'],
            'extensions': ['yaml', 'yml', 'json']
        }
        action._set_args()
        self.assertEqual(action.hash_behaviour, 'merge')
        self.assertEqual(action.return_results_as_name, 'test')
        self.assertEqual(action.source_dir, '/path/to/dir')
        self.assertEqual(action.source_file, '/path/to/file')
        self.assertEqual(action.depth, 1)
        self.assertEqual(action.files_matching, '.*')
        self.assertTrue(action.ignore_unknown_extensions)
        self.assertEqual(action.ignore_files, ['.txt', '.log'])
        self.assertEqual(action.valid_extensions, ['yaml', 'yml', 'json'])

    def test_run(self):
        def setUp(self):
        action._task = mock.Mock()
        action._task.args = {
            'hash_behaviour': 'merge',
            'name': 'test',
            'dir': '/path/to/dir',
            'file': '/path/to/file',
            'depth': 1,
            'files_matching': '.*',
            'ignore_unknown_extensions': True,
            'ignore_files': ['.txt', '.log'],
            'extensions': ['yaml', 'yml', 'json']
        }
        action._set_args()
        action._set_root_dir = mock.Mock()
        action._traverse_dir_depth = mock.Mock()
        action._load_files_in_dir = mock.Mock()
        action._load_files = mock.Mock()
        action._load_files.return_value = (False, '', {'key': 'value'})
        result = action.run()
        self.assertEqual(result['ansible_included_var_files'], [])
        self.assertEqual(result['ansible_facts'], {'test': {'key': 'value'}})
        self.assertFalse(result['failed'])
        self.assertFalse(result['_ansible_no_log'])

if __name__ == '__main__':
    unittest.main()