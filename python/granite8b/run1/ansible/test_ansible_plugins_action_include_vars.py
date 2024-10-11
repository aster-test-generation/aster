import unittest
from ansible.module_utils.common.collections import ImmutableDict


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
        instance.show_content = True
        instance.included_files = []
        instance._set_args()
        result = instance.run()
        self.assertTrue(result['ansible_facts'])
        self.assertEqual(result['ansible_included_var_files'], [])
        self.assertTrue(result['_ansible_no_log'])

    def test_set_root_dir(self):
        instance = include_vars.ActionModule()
        instance._task._role = None
        instance._task._ds._data_source = 'vars/main.yml'
        instance.source_dir = 'vars'
        instance._set_root_dir()
        self.assertEqual(instance.source_dir, 'vars')

    def test_traverse_dir_depth(self):
        instance = include_vars.ActionModule()
        instance.depth = 0
        instance.source_dir = '/path/to/dir'
        sorted_walk = [
            ('/path/to/dir', ['dir1', 'dir2'], ['file1.yaml', 'file2.json']),
            ('/path/to/dir/dir1', [], ['file3.yaml']),
            ('/path/to/dir/dir2', [], ['file4.json'])
        ]
        with self.assertRaises(StopIteration):
            for root_dir, dirs, files in instance._traverse_dir_depth():
                self.assertEqual(root_dir, '/path/to/dir')
                self.assertEqual(dirs, ['dir1', 'dir2'])
                self.assertEqual(files, ['file1.yaml', 'file2.json'])
                raise StopIteration

    def test_ignore_file(self):
        instance = include_vars.ActionModule()
        instance.ignore_files = ['*.yaml', '*.json']
        self.assertTrue(instance._ignore_file('file1.yaml'))
        self.assertTrue(instance._ignore_file('file2.json'))
        self.assertFalse(instance._ignore_file('file3.txt'))

    def test_is_valid_file_ext(self):
        instance = include_vars.ActionModule()
        self.assertTrue(instance._is_valid_file_ext('file1.yaml'))
        self.assertTrue(instance._is_valid_file_ext('file2.json'))
        self.assertFalse(instance._is_valid_file_ext('file3.txt'))

    def test_load_files(self):
        instance = include_vars.ActionModule()
        instance._loader = None
        instance.show_content = True
        instance.included_files = []
        with self.assertRaises(AnsibleError) as cm:
            instance._load_files('file1.yaml')
        self.assertEqual(str(cm.exception), 'file1.yaml does not have a valid extension: yaml, yml, json')

if __name__ == '__main__':
    unittest.main()