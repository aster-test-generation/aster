import unittest
from unittest.mock import patch, Mock
from ansible.module_utils.basic import AnsibleModul


class TestActionModule(unittest.TestCase):
    def test_assemble_from_fragments(self):
        action_module = ActionModule()
        src_path = 'src_path'
        delimiter = 'delimiter'
        compiled_regexp = re.compile('regexp')
        ignore_hidden = True
        decrypt = True
        result = action_module._assemble_from_fragments(src_path, delimiter, compiled_regexp, ignore_hidden, decrypt)
        self.assertEqual(result, 'temp_path')

    def test_run(self):
        action_module = ActionModule()
        tmp = Mock()
        task_vars = Mock()
        result = action_module.run(tmp, task_vars)
        self.assertEqual(result, {})

    def test_execute_module(self):
        action_module = ActionModule()
        module_name = 'ansible.legacy.assemble'
        module_args = {'dest': 'dest'}
        task_vars = Mock()
        result = action_module._execute_module(module_name, module_args, task_vars)
        self.assertEqual(result, {})

    def test_find_needle(self):
        action_module = ActionModule()
        needle = 'needle'
        result = action_module._find_needle('files', needle)
        self.assertEqual(result, 'needle')

    def test_execute_remote_stat(self):
        action_module = ActionModule()
        dest = 'dest'
        all_vars = Mock()
        follow = True
        result = action_module._execute_remote_stat(dest, all_vars, follow)
        self.assertEqual(result, {'checksum': 'checksum'})

    def test_get_diff_data(self):
        action_module = ActionModule()
        dest = 'dest'
        path = 'path'
        task_vars = Mock()
        result = action_module._get_diff_data(dest, path, task_vars)
        self.assertEqual(result, {})

    def test_transfer_file(self):
        action_module = ActionModule()
        path = 'path'
        remote_path = 'remote_path'
        result = action_module._transfer_file(path, remote_path)
        self.assertEqual(result, 'xfered')

    def test_fixup_perms2(self):
        action_module = ActionModule()
        tmpdir = 'tmpdir'
        remote_path = 'remote_path'
        action_module._fixup_perms2((tmpdir, remote_path))

    def test_remove_tmp_path(self):
        action_module = ActionModule()
        tmpdir = 'tmpdir'
        action_module._remove_tmp_path(tmpdir)

    def test_init(self):
        action_module = ActionModule()
        self.assertEqual(action_module._supports_check_mode, False)

    def test_str(self):
        action_module = ActionModule()
        result = str(action_module)
        self.assertEqual(result, 'ActionModule')

    def test_repr(self):
        action_module = ActionModule()
        result = repr(action_module)
        self.assertEqual(result, 'ActionModule()')

    def test_eq(self):
        action_module1 = ActionModule()
        action_module2 = ActionModule()
        self.assertEqual(action_module1, action_module2)

if __name__ == '__main__':
    unittest.main()