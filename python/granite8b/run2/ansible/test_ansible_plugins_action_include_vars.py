import unittest
from ansible.plugins.action import ActionBase


class TestIncludeVars(unittest.TestCase):
    def test_set_dir_defaults(self):
        # Test the _set_dir_defaults method
        instance = include_vars()
        instance.depth = 0
        instance.matcher = None
        instance.ignore_files = []
        instance.valid_extensions = ['yaml', 'yml', 'json']
        instance._set_dir_defaults()
        self.assertEqual(instance.depth, 0)
        self.assertIsNone(instance.matcher)
        self.assertEqual(instance.ignore_files, [])
        self.assertEqual(instance.valid_extensions, ['yaml', 'yml', 'json'])

    def test_set_args(self):
        # Test the _set_args method
        instance = include_vars()
        instance.hash_behaviour = None
        instance.return_results_as_name = None
        instance.source_dir = None
        instance.source_file = None
        instance.depth = None
        instance.files_matching = None
        instance.ignore_unknown_extensions = False
        instance.ignore_files = None
        instance.valid_extensions = None
        instance._set_args()
        self.assertIsNone(instance.hash_behaviour)
        self.assertIsNone(instance.return_results_as_name)
        self.assertIsNone(instance.source_dir)
        self.assertIsNone(instance.source_file)
        self.assertIsNone(instance.depth)
        self.assertIsNone(instance.files_matching)
        self.assertFalse(instance.ignore_unknown_extensions)
        self.assertIsNone(instance.ignore_files)
        self.assertIsNone(instance.valid_extensions)

    def test_run(self):
        # Test the run method
        instance = include_vars()
        instance.show_content = True
        instance.included_files = []
        instance.source_dir = '/path/to/dir'
        instance.source_file = '/path/to/file'
        instance.depth = 0
        instance.files_matching = None
        instance.ignore_unknown_extensions = False
        instance.ignore_files = []
        instance.valid_extensions = ['yaml', 'yml', 'json']
        instance.hash_behaviour = None
        instance.return_results_as_name = None
        instance.valid_extensions = ['yaml', 'yml', 'json']
        result = instance.run()
        self.assertTrue(instance.show_content)
        self.assertEqual(instance.included_files, [])
        self.assertEqual(instance.source_dir, '/path/to/dir')
        self.assertEqual(instance.source_file, '/path/to/file')
        self.assertEqual(instance.depth, 0)
        self.assertIsNone(instance.files_matching)
        self.assertFalse(instance.ignore_unknown_extensions)
        self.assertEqual(instance.ignore_files, [])
        self.assertEqual(instance.valid_extensions, ['yaml', 'yml', 'json'])
        self.assertIsNone(instance.hash_behaviour)
        self.assertIsNone(instance.return_results_as_name)
        self.assertEqual(result['ansible_included_var_files'], [])
        self.assertEqual(result['ansible_facts'], {})
        self.assertTrue(result['_ansible_no_log'])

if __name__ == '__main__':
    unittest.main()