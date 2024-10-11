import unittest
from ansible.module_utils.basic import


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_set_dir_defaults(self):
        instance = ActionModule()
        instance._set_dir_defaults()
        self.assertEqual(instance.depth, 0)
        self.assertIsNone(instance.matcher)

    def test_set_args(self):
        instance = ActionModule()
        instance._task = mock.Mock(args={'hash_behaviour': 'merge', 'name': 'test', 'dir': '/path/to/dir'})
        instance._set_args()
        self.assertEqual(instance.hash_behaviour, 'merge')
        self.assertEqual(instance.return_results_as_name, 'test')
        self.assertEqual(instance.source_dir, '/path/to/dir')

    def test_run(self):
        instance = ActionModule()
        instance._task = mock.Mock(args={'dir': '/path/to/dir'})
        instance._set_args()
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test_set_root_dir(self):
        instance = ActionModule()
        instance._task = mock.Mock(_role=mock.Mock(_role_path='/path/to/role'))
        instance.source_dir = 'vars'
        instance._set_root_dir()
        self.assertEqual(instance.source_dir, '/path/to/role/vars')

    def test_traverse_dir_depth(self):
        instance = ActionModule()
        instance.source_dir = '/path/to/dir'
        instance.depth = 1
        result = list(instance._traverse_dir_depth())
        self.assertEqual(len(result), 1)

    def test_ignore_file(self):
        instance = ActionModule()
        instance.ignore_files = ['test']
        self.assertTrue(instance._ignore_file('test_file'))
        self.assertFalse(instance._ignore_file('other_file'))

    def test_is_valid_file_ext(self):
        instance = ActionModule()
        instance.valid_extensions = ['yaml', 'yml']
        self.assertTrue(instance._is_valid_file_ext('test.yaml'))
        self.assertFalse(instance._is_valid_file_ext('test.txt'))

    def test_load_files(self):
        instance = ActionModule()
        instance._loader = mock.Mock(_get_file_contents=lambda x: ('data', True))
        result = instance._load_files('test.yaml')
        self.assertIsInstance(result, tuple)

    def test_load_files_in_dir(self):
        instance = ActionModule()
        instance.source_dir = '/path/to/dir'
        instance.files_matching = 'test'
        result = instance._load_files_in_dir('/path/to/dir', ['test.yaml', 'other.yaml'])
        self.assertIsInstance(result, tuple)

    def test_private_method(self):
        instance = ActionModule()
        result = instance._ActionModule__private_method('test')
        self.assertEqual(result, 'test')

    def test_str_method(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertEqual(result, 'ActionModule')

    def test_repr_method(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertEqual(result, 'ActionModule()')

if __name__ == '__main__':
    unittest.main()