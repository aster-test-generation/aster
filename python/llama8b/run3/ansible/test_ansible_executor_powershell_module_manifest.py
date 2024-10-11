import os
import unittest
from ansible.executor.powershell.module_manifest import _slurp, _strip_comments, _create_powershell_wrapper


class TestModuleManifest(unittest.TestCase):
    def test_slurp(self):
        path = 'path/to/module'
        with open(path, 'wb') as f:
            f.write(b'imported module support code')
        result = _slurp(path)
        self.assertEqual(result, b'imported module support code')
        os.remove(path)

    def test_strip_comments(self):
        source = b'imported module support code\n# this is a comment\n'
        result = _strip_comments(source)
        self.assertEqual(result, b'imported module support code\n')

    def test_create_powershell_wrapper(self):
        b_module_data = b'imported module support code'
        module_path = 'path/to/module'
        module_args = {'arg1': 'value1', 'arg2': 'value2'}
        environment = {'env1': 'value1', 'env2': 'value2'}
        async_timeout = 10
        become = True
        become_method = 'runas'
        become_user = 'user'
        become_password = 'password'
        become_flags = 'flags'
        substyle = 'script'
        task_vars = {'var1': 'value1', 'var2': 'value2'}
        module_fqn = 'module.fqn'
        result = _create_powershell_wrapper(b_module_data, module_path, module_args, environment, async_timeout, become, become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn)
        self.assertIsInstance(result, bytes)

if __name__ == '__main__':
    unittest.main()