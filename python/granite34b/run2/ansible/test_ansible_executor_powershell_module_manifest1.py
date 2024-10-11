import unittest
from ansible.executor.powershell.module_manifest import _slurp, _strip_comments, _create_powershell_wrapper

class TestModuleManifest(unittest.TestCase):
    def test_slurp(self):
        path = '/path/to/file'
        data = _slurp(path)
        self.assertEqual(data, b'file data')

    def test_strip_comments(self):
        source = b'This is a line with a comment # this is a comment\nThis is another line'
        result = _strip_comments(source)
        self.assertEqual(result, b'This is a line with a comment \nThis is another line')

    def test_create_powershell_wrapper(self):
        b_module_data = b'module data'
        module_path = '/path/to/module'
        module_args = 'module args'
        environment = 'environment'
        async_timeout = 10
        become = True
        become_method = 'become method'
        become_user = 'become user'
        become_password = 'become password'
        become_flags = 'become flags'
        substyle = 'powershell'
        task_vars = {}
        module_fqn = 'module fqn'
        result = _create_powershell_wrapper(b_module_data, module_path, module_args, environment, async_timeout, become, become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn)
        self.assertEqual(result, b'powershell wrapper data')

if __name__ == '__main__':
    unittest.main()