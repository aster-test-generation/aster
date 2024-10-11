import unittest
from ansible.plugins.action import ActionModule


class TestIncludeVars(unittest.TestCase):
    def test_set_dir_defaults(self):
        instance = include_vars.ActionModule()
        instance.depth = 0
        instance.matcher = None
        instance.ignore_files = []
        instance._set_dir_defaults()
        self.assertEqual(instance.depth, 0)
        self.assertIsNone(instance.matcher)
        self.assertEqual(instance.ignore_files, [])

    def test_set_args(self):
        instance = include_vars.ActionModule()
        instance.hash_behaviour = None
        instance.return_results_as_name = None
        instance.source_dir = None
        instance.source_file = None
        instance.depth = None
        instance.files_matching = None
        instance.ignore_unknown_extensions = False
        instance.ignore_files = None
        instance.valid_extensions = ['yaml', 'yml', 'json']
        instance._set_args()
        self.assertIsNone(instance.hash_behaviour)
        self.assertIsNone(instance.return_results_as_name)
        self.assertIsNone(instance.source_dir)
        self.assertIsNone(instance.source_file)
        self.assertIsNone(instance.depth)
        self.assertIsNone(instance.files_matching)
        self.assertFalse(instance.ignore_unknown_extensions)
        self.assertIsNone(instance.ignore_files)
        self.assertEqual(instance.valid_extensions, ['yaml', 'yml', 'json'])

    def test_run(self):
        instance = include_vars.ActionModule()
        result = instance.run()
        self.assertEqual(result['failed'], False)
        self.assertEqual(result['message'], 'ok')

if __name__ == '__main__':
    unittest.main()