import unittest
from unittest.mock import patch, Mock
from ansible.module_utils.basic import


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.module = ActionModule()

    def test_assemble_from_fragments(self):
        src_path = 'src_path'
        delimiter = 'delimiter'
        compiled_regexp = re.compile('regexp')
        ignore_hidden = True
        decrypt = True
        result = self.module._assemble_from_fragments(src_path, delimiter, compiled_regexp, ignore_hidden, decrypt)
        self.assertIsInstance(result, str)

    def test_run(self):
        tmp = Mock()
        task_vars = {'task_vars': 'task_vars'}
        result = self.module.run(tmp, task_vars)
        self.assertIsInstance(result, dict)

    def test_execute_module(self):
        module_name = 'ansible.legacy.assemble'
        module_args = {'module_args': 'module_args'}
        task_vars = {'task_vars': 'task_vars'}
        result = self.module._execute_module(module_name, module_args, task_vars)
        self.assertIsInstance(result, dict)

    def test_find_needle(self):
        needle = 'needle'
        haystack = 'haystack'
        result = self.module._find_needle('files', haystack)
        self.assertEqual(result, needle)

    def test_execute_remote_stat(self):
        dest = 'dest'
        all_vars = {'all_vars': 'all_vars'}
        follow = True
        result = self.module._execute_remote_stat(dest, all_vars, follow)
        self.assertIsInstance(result, dict)

    def test_transfer_file(self):
        path = 'path'
        remote_path = 'remote_path'
        result = self.module._transfer_file(path, remote_path)
        self.assertIsInstance(result, str)

    def test_fixup_perms2(self):
        tmpdir = 'tmpdir'
        remote_path = 'remote_path'
        self.module._fixup_perms2((tmpdir, remote_path))

    def test_remove_tmp_path(self):
        tmpdir = 'tmpdir'
        self.module._remove_tmp_path(tmpdir)

    def test_str_method(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertEqual(result, 'ActionModule')

    def test_repr_method(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertEqual(result, 'ActionModule()')

    def test_eq_method(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        self.assertEqual(instance1, instance2)

    def test_init_method(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

if __name__ == '__main__':
    unittest.main()