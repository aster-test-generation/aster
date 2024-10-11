import unittest
from unittest.mock import patch
from ansible.module_utils.basic import AnsibleModul


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule()

    def test_set_dir_defaults(self):
        self.action_module.depth = None
        self.action_module.files_matching = None
        self.action_module.ignore_files = None
        self.action_module._set_dir_defaults()
        self.assertEqual(self.action_module.depth, 0)
        self.assertEqual(self.action_module.files_matching, None)
        self.assertEqual(self.action_module.ignore_files, [])

    def test_set_args(self):
        self.action_module._set_args()
        self.assertEqual(self.action_module.hash_behaviour, None)
        self.assertEqual(self.action_module.return_results_as_name, None)
        self.assertEqual(self.action_module.source_dir, None)
        self.assertEqual(self.action_module.source_file, None)
        self.assertEqual(self.action_module.depth, None)
        self.assertEqual(self.action_module.files_matching, None)
        self.assertEqual(self.action_module.ignore_unknown_extensions, False)
        self.assertEqual(self.action_module.ignore_files, None)

    def test_run(self):
        with patch('ansible.module_utils._text.to_native') as to_native_mock:
            with patch('ansible.module_utils._text.to_text') as to_text_mock:
                self.action_module.run()
                to_native_mock.assert_called_once()
                to_text_mock.assert_called_once()

    def test_set_root_dir(self):
        self.action_module._set_root_dir()
        self.assertEqual(self.action_module.source_dir, '')

    def test_traverse_dir_depth(self):
        with patch('os.walk') as walk_mock:
            self.action_module._traverse_dir_depth()
            walk_mock.assert_called_once()

    def test_ignore_file(self):
        self.assertTrue(self.action_module._ignore_file('file.txt'))
        self.assertFalse(self.action_module._ignore_file('file.yml'))

    def test_is_valid_file_ext(self):
        self.assertTrue(self.action_module._is_valid_file_ext('file.yml'))
        self.assertFalse(self.action_module._is_valid_file_ext('file.txt'))

    def test_load_files(self):
        with patch('ansible.module_utils._loader._get_file_contents') as get_file_contents_mock:
            with patch('ansible.module_utils._loader.load') as load_mock:
                self.action_module._load_files('file.yml')
                get_file_contents_mock.assert_called_once()
                load_mock.assert_called_once()

    def test_load_files_in_dir(self):
        with patch('os.path.join') as join_mock:
            with patch('os.path.exists') as exists_mock:
                with patch('os.path.isfile') as isfile_mock:
                    with patch('re.search') as search_mock:
                        self.action_module._load_files_in_dir('root_dir', ['file1', 'file2'])
                        join_mock.assert_called_once()
                        exists_mock.assert_called_once()
                        isfile_mock.assert_called_once()
                        search_mock.assert_called_once()

    def test__private_method(self):
        with self.assertRaises(NotImplementedError):
            self.action_module.__private_method(1)

    def test__protected_method(self):
        with self.assertRaises(NotImplementedError):
            self.action_module._protected_method(1)

    def test_str_method(self):
        self.assertEqual(str(self.action_module), 'ActionModule')

    def test_repr_method(self):
        self.assertEqual(repr(self.action_module), 'ActionModule()')

    def test_eq_method(self):
        other = ActionModule()
        self.assertEqual(self.action_module, other)

if __name__ == '__main__':
    unittest.main()