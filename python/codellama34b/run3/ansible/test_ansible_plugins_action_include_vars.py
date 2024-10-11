import unittest
from ansible.plugins.action.include_vars import *



class TestActionModule(unittest.TestCase):
    def test_set_dir_defaults(self):
        instance = ActionModule()
        instance._set_dir_defaults()
        self.assertEqual(instance.depth, 0)
        self.assertEqual(instance.matcher, None)

    def test_set_args(self):
        instance = ActionModule()
        instance._set_args()
        self.assertEqual(instance.hash_behaviour, None)
        self.assertEqual(instance.return_results_as_name, None)
        self.assertEqual(instance.source_dir, None)
        self.assertEqual(instance.source_file, None)
        self.assertEqual(instance.depth, None)
        self.assertEqual(instance.files_matching, None)
        self.assertEqual(instance.ignore_unknown_extensions, False)
        self.assertEqual(instance.ignore_files, None)
        self.assertEqual(instance.valid_extensions, ['yaml', 'yml', 'json'])

    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['message'], 'You are mixing file only and dir only arguments, these are incompatible')

    def test_set_root_dir(self):
        instance = ActionModule()
        instance._set_root_dir()
        self.assertEqual(instance.source_dir, None)

    def test_traverse_dir_depth(self):
        instance = ActionModule()
        instance.source_dir = '/tmp'
        instance._set_root_dir()
        instance._traverse_dir_depth()

    def test_ignore_file(self):
        instance = ActionModule()
        self.assertEqual(instance._ignore_file('test.txt'), False)

    def test_is_valid_file_ext(self):
        instance = ActionModule()
        self.assertEqual(instance._is_valid_file_ext('test.txt'), False)

    def test_load_files(self):
        instance = ActionModule()
        self.assertEqual(instance._load_files('test.txt'), (True, 'test.txt does not have a valid extension: yaml, yml, json', dict()))

if __name__ == '__main__':
    unittest.main()