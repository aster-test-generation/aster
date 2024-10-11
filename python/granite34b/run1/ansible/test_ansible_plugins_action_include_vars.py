import unittest
from ansible.plugins.action.include_vars import ActionModule


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)

    def test_set_dir_defaults(self):
        self.action.depth = None
        self.action.files_matching = None
        self.action.ignore_files = None
        self.action._set_dir_defaults()
        self.assertEqual(self.action.depth, 0)
        self.assertIsNone(self.action.matcher)
        self.assertEqual(self.action.ignore_files, [])

    def test_set_args(self):
        self.action.hash_behaviour = None
        self.action.return_results_as_name = None
        self.action.source_dir = None
        self.action.source_file = None
        self.action.depth = None
        self.action.files_matching = None
        self.action.ignore_unknown_extensions = False
        self.action.ignore_files = None
        self.action.valid_extensions = None
        self.action._set_args()
        self.assertIsNone(self.action.hash_behaviour)
        self.assertIsNone(self.action.return_results_as_name)
        self.assertIsNone(self.action.source_dir)
        self.assertIsNone(self.action.source_file)
        self.assertIsNone(self.action.depth)
        self.assertIsNone(self.action.files_matching)
        self.assertFalse(self.action.ignore_unknown_extensions)
        self.assertIsNone(self.action.ignore_files)
        self.assertEqual(self.action.valid_extensions, ['yaml', 'yml', 'json'])

    def test_run(self):
        task_vars = {}
        result = self.action.run(task_vars=task_vars)
        self.assertEqual(result['ansible_included_var_files'], [])
        self.assertEqual(result['ansible_facts'], {})
        self.assertFalse(result['_ansible_no_log'])

    def test_set_root_dir(self):
        self.action.source_dir = 'vars'
        self.action._set_root_dir()
        self.assertEqual(self.action.source_dir, '/path/to/role/vars')

    def test_traverse_dir_depth(self):
        self.action.source_dir = '/path/to/vars'
        self.action.depth = 1
        self.action._set_root_dir()
        self.action._set_dir_defaults()
        self.assertEqual(self.action.source_dir, '/path/to/role/vars')
        self.assertEqual(self.action.depth, 1)
        self.assertEqual(self.action.matcher, None)
        self.assertEqual(self.action.ignore_files, [])
        self.assertEqual(self.action.valid_extensions, ['yaml', 'yml', 'json'])
        self.assertEqual(self.action.source_dir, '/path/to/role/vars')
        self.assertEqual(self.action.depth, 1)
        self.assertEqual(self.action.matcher, None)
        self.assertEqual(self.action.ignore_files, [])
        self.assertEqual(self.action.valid_extensions, ['yaml', 'yml', 'json'])
        self.assertEqual(self.action.source_dir, '/path/to/role/vars')
        self.assertEqual(self.action.depth, 1)
        self.assertEqual(self.action.matcher, None)
        self.assertEqual(self.action.ignore_files, [])
        self.assertEqual(self.action.valid_extensions, ['yaml', 'yml', 'json'])

    def test_ignore_file(self):
        self.action.ignore_files = ['.svn', '.git']
        self.assertTrue(self.action._ignore_file('.svn'))
        self.assertTrue(self.action._ignore_file('.git'))
        self.assertFalse(self.action._ignore_file('main.yml'))

    def test_is_valid_file_ext(self):
        self.action.valid_extensions = ['yaml', 'yml', 'json']
        self.assertTrue(self.action._is_valid_file_ext('main.yml'))
        self.assertFalse(self.action._is_valid_file_ext('main.txt'))

if __name__ == '__main__':
    unittest.main()