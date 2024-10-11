import unittest
from ansible.plugins.action.include_vars import ActionModule


class TestIncludeVars(unittest.TestCase):
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
        self.action.valid_extensions = ['yaml', 'yml', 'json']
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

if __name__ == '__main__':
    unittest.main()