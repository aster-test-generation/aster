import unittest
from ansible.module_utils._text import to_bytes


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = assemble.ActionModule()
        self.assertIsInstance(instance, assemble.ActionBase)

    def test_assemble_from_fragments(self):
        instance = assemble.ActionModule()
        src_path = '/path/to/src'
        delimiter = '---'
        compiled_regexp = re.compile('regex_pattern')
        ignore_hidden = True
        decrypt = False
        result = instance._assemble_from_fragments(src_path, delimiter, compiled_regexp, ignore_hidden, decrypt)
        self.assertIsInstance(result, str)

    def test_run(self):
        instance = assemble.ActionModule()
        tmp = None
        task_vars = {}
        result = instance.run(tmp, task_vars)
        self.assertIsInstance(result, dict)

    def test_private_method__find_needle(self):
        instance = assemble.ActionModule()
        needle_type = 'files'
        needle_path = '/path/to/needle'
        result = instance._ActionModule__find_needle(needle_type, needle_path)
        self.assertIsInstance(result, str)

    def test_private_method__execute_module(self):
        instance = assemble.ActionModule()
        module_name = 'ansible.legacy.assemble'
        task_vars = {}
        result = instance._ActionModule__execute_module(module_name, task_vars)
        self.assertIsInstance(result, dict)

    def test_private_method__execute_remote_stat(self):
        instance = assemble.ActionModule()
        path = '/path/to/remote/path'
        all_vars = {}
        follow = True
        result = instance._ActionModule__execute_remote_stat(path, all_vars, follow)
        self.assertIsInstance(result, dict)

    def test_private_method__get_diff_data(self):
        instance = assemble.ActionModule()
        dest = '/path/to/dest'
        path = '/path/to/path'
        task_vars = {}
        result = instance._ActionModule__get_diff_data(dest, path, task_vars)
        self.assertIsInstance(result, dict)

    def test_private_method__transfer_file(self):
        instance = assemble.ActionModule()
        path = '/path/to/path'
        remote_path = '/path/to/remote/path'
        result = instance._ActionModule__transfer_file(path, remote_path)
        self.assertIsInstance(result, str)

    def test_private_method__fixup_perms2(self):
        instance = assemble.ActionModule()
        path = '/path/to/path'
        result = instance._ActionModule__fixup_perms2(path)
        self.assertIsNone(result)

    def test_private_method__remove_tmp_path(self):
        instance = assemble.ActionModule()
        tmpdir = '/path/to/tmpdir'
        result = instance._ActionModule__remove_tmp_path(tmpdir)
        self.assertIsNone(result)

    def test_str_method(self):
        instance = assemble.ActionModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = assemble.ActionModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()