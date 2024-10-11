import unittest
from ansible.plugins.action.include_vars import IncludeVarsAction



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
        instance._set_dir_defaults()
        instance._set_root_dir()
        current_depth = 0
        sorted_walk = list(walk(instance.source_dir))
        sorted_walk.sort(key=lambda x: x[0])
        for current_root, current_dir, current_files in sorted_walk:
            current_depth += 1
            if current_depth <= instance.depth or instance.depth == 0:
                current_files.sort()
                yield (current_root, current_files)
            else:
                break

    def test_ignore_file(self):
        instance = ActionModule()
        self.assertEqual(instance._ignore_file(''), False)

    def test_is_valid_file_ext(self):
        instance = ActionModule()
        self.assertEqual(instance._is_valid_file_ext(''), False)

    def test_load_files(self):
        instance = ActionModule()
        self.assertEqual(instance._load_files('', False), (True, '', {}))

if __name__ == '__main__':
    unittest.main()