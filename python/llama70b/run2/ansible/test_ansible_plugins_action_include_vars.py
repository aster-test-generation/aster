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
        instance._task = mock.Mock(args={'hash_behaviour': 'merge', 'name': 'test'})
        instance._set_args()
        self.assertEqual(instance.hash_behaviour, 'merge')
        self.assertEqual(instance.return_results_as_name, 'test')

    def test_run(self):
        instance = ActionModule()
        instance._task = mock.Mock(args={'dir': 'test_dir'})
        instance.source_dir = 'test_dir'
        instance._set_dir_defaults = mock.Mock()
        instance._set_root_dir = mock.Mock()
        instance._traverse_dir_depth = mock.Mock(return_value=[('root', ['file1', 'file2'])])
        instance._load_files_in_dir = mock.Mock(return_value=(False, '', {'result': 'success'}))
        result = instance.run()
        self.assertIn('ansible_included_var_files', result)
        self.assertIn('ansible_facts', result)

    def test_set_root_dir(self):
        instance = ActionModule()
        instance._task = mock.Mock(_role=mock.Mock(_role_path='role_path'))
        instance.source_dir = 'vars/test_dir'
        instance._set_root_dir()
        self.assertEqual(instance.source_dir, 'role_path/vars/test_dir')

    def test_traverse_dir_depth(self):
        instance = ActionModule()
        instance.source_dir = 'test_dir'
        result = instance._traverse_dir_depth()
        self.assertIsInstance(result, list)

    def test_ignore_file(self):
        instance = ActionModule()
        instance.ignore_files = ['test_file']
        self.assertTrue(instance._ignore_file('test_file.txt'))

    def test_is_valid_file_ext(self):
        instance = ActionModule()
        self.assertTrue(instance._is_valid_file_ext('test_file.yaml'))

    def test_load_files(self):
        instance = ActionModule()
        instance._loader = mock.Mock(_get_file_contents=mock.Mock(return_value=('data', True)))
        result = instance._load_files('test_file.yaml')
        self.assertIsInstance(result, tuple)

    def test_load_files_in_dir(self):
        instance = ActionModule()
        instance._load_files = mock.Mock(return_value=(False, '', {'result': 'success'}))
        result = instance._load_files_in_dir('root_dir', ['file1', 'file2'])
        self.assertIsInstance(result, tuple)

    def test_str(self):
        instance = ActionModule()
        self.assertEqual(str(instance), 'ActionModule')

    def test_repr(self):
        instance = ActionModule()
        self.assertEqual(repr(instance), 'ActionModule()')

    def test_eq(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()