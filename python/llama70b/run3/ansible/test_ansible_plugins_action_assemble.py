import unittest
from ansible.module_utils.basic import


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_run(self):
        instance = ActionModule()
        task_vars = {}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIsInstance(result, dict)

    def test_assemble_from_fragments(self):
        instance = ActionModule()
        src_path = '/path/to/src'
        delimiter = None
        compiled_regexp = None
        ignore_hidden = False
        decrypt = True
        temp_path = instance._assemble_from_fragments(src_path, delimiter, compiled_regexp, ignore_hidden, decrypt)
        self.assertIsInstance(temp_path, str)

    def test__assemble_from_fragments_private(self):
        instance = ActionModule()
        src_path = '/path/to/src'
        delimiter = None
        compiled_regexp = None
        ignore_hidden = False
        decrypt = True
        temp_path = instance._ActionModule__assemble_from_fragments(src_path, delimiter, compiled_regexp, ignore_hidden, decrypt)
        self.assertIsInstance(temp_path, str)

    def test__find_needle_protected(self):
        instance = ActionModule()
        src = 'files'
        result = instance._find_needle('files', src)
        self.assertIsInstance(result, str)

    def test__execute_module_protected(self):
        instance = ActionModule()
        module_name = 'ansible.legacy.assemble'
        task_vars = {}
        result = instance._execute_module(module_name, task_vars=task_vars)
        self.assertIsInstance(result, dict)

    def test__remote_expand_user_protected(self):
        instance = ActionModule()
        dest = '/path/to/dest'
        result = instance._remote_expand_user(dest)
        self.assertIsInstance(result, str)

    def test__execute_remote_stat_protected(self):
        instance = ActionModule()
        dest = '/path/to/dest'
        task_vars = {}
        follow = False
        result = instance._execute_remote_stat(dest, all_vars=task_vars, follow=follow)
        self.assertIsInstance(result, dict)

    def test__get_diff_data_protected(self):
        instance = ActionModule()
        dest = '/path/to/dest'
        path = '/path/to/path'
        task_vars = {}
        result = instance._get_diff_data(dest, path, task_vars)
        self.assertIsInstance(result, dict)

    def test__transfer_file_protected(self):
        instance = ActionModule()
        path = '/path/to/path'
        remote_path = '/path/to/remote_path'
        result = instance._transfer_file(path, remote_path)
        self.assertIsInstance(result, str)

    def test__fixup_perms2_protected(self):
        instance = ActionModule()
        tmpdir = '/path/to/tmpdir'
        remote_path = '/path/to/remote_path'
        instance._fixup_perms2((tmpdir, remote_path))

    def test__remove_tmp_path_protected(self):
        instance = ActionModule()
        tmpdir = '/path/to/tmpdir'
        instance._remove_tmp_path(tmpdir)

    def test_str_method(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()