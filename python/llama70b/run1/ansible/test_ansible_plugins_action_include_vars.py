import unittest
from ansible.module_utils.basic import


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_TRANSFERS_FILES(self):
        instance = ActionModule()
        self.assertFalse(instance.TRANSFERS_FILES)

    def test_VALID_FILE_EXTENSIONS(self):
        instance = ActionModule()
        self.assertEqual(instance.VALID_FILE_EXTENSIONS, ['yaml', 'yml', 'json'])

    def test_VALID_DIR_ARGUMENTS(self):
        instance = ActionModule()
        self.assertEqual(instance.VALID_DIR_ARGUMENTS, ['dir', 'depth', 'files_matching', 'ignore_files', 'extensions', 'ignore_unknown_extensions'])

    def test_VALID_FILE_ARGUMENTS(self):
        instance = ActionModule()
        self.assertEqual(instance.VALID_FILE_ARGUMENTS, ['file', '_raw_params'])

    def test_VALID_ALL(self):
        instance = ActionModule()
        self.assertEqual(instance.VALID_ALL, ['name', 'hash_behaviour'])

    def test_set_dir_defaults(self):
        instance = ActionModule()
        instance.depth = None
        instance.files_matching = None
        instance.ignore_files = None
        instance._set_dir_defaults()
        self.assertEqual(instance.depth, 0)
        self.assertIsNone(instance.matcher)
        self.assertEqual(instance.ignore_files, [])

    def test_set_args(self):
        instance = ActionModule()
        instance._task = mock.Mock(args={'hash_behaviour': 'foo', 'name': 'bar', 'dir': 'baz', 'file': 'qux'})
        instance._set_args()
        self.assertEqual(instance.hash_behaviour, 'foo')
        self.assertEqual(instance.return_results_as_name, 'bar')
        self.assertEqual(instance.source_dir, 'baz')
        self.assertEqual(instance.source_file, 'qux')

    def test_run(self):
        instance = ActionModule()
        instance._task = mock.Mock(args={'dir': 'baz'})
        instance._set_args = mock.Mock()
        instance._set_dir_defaults = mock.Mock()
        instance._traverse_dir_depth = mock.Mock(return_value=[('root', ['file1', 'file2'])])
        instance._load_files_in_dir = mock.Mock(return_value=(False, '', {'result': 'success'}))
        result = instance.run()
        self.assertIsInstance(result, dict)
        self.assertIn('ansible_included_var_files', result)
        self.assertIn('ansible_facts', result)

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
        result = instance._traverse_dir_depth()
        self.assertIsInstance(result, list)

    def test_ignore_file(self):
        instance = ActionModule()
        instance.ignore_files = ['foo']
        self.assertTrue(instance._ignore_file('file.foo'))
        self.assertFalse(instance._ignore_file('file.bar'))

    def test_is_valid_file_ext(self):
        instance = ActionModule()
        self.assertTrue(instance._is_valid_file_ext('file.yaml'))
        self.assertFalse(instance._is_valid_file_ext('file.txt'))

    def test_load_files(self):
        instance = ActionModule()
        instance._loader = mock.Mock(_get_file_contents=mock.Mock(return_value=('content', True)))
        instance._loader.load = mock.Mock(return_value={'result': 'success'})
        result = instance._load_files('file.yaml')
        self.assertIsInstance(result, tuple)
        self.assertEqual(result[0], False)
        self.assertEqual(result[1], '')
        self.assertEqual(result[2], {'result': 'success'})

    def test_load_files_in_dir(self):
        instance = ActionModule()
        instance._load_files = mock.Mock(return_value=(False, '', {'result': 'success'}))
        result = instance._load_files_in_dir('root', ['file1', 'file2'])
        self.assertIsInstance(result, tuple)
        self.assertEqual(result[0], False)
        self.assertEqual(result[1], '')
        self.assertEqual(result[2], {'result': 'success'})

    def test_private_method(self):
        instance = ActionModule()
        result = instance._ActionModule__private_method('foo')
        self.assertEqual(result, 'foo')

    def test_protected_method(self):
        instance = ActionModule()
        result = instance._set_dir_defaults()
        self.assertIsNone(result)

    def test_magic_method(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()