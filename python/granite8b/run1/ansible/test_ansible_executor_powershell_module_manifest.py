import unittest
from ansible.executor.powershell.module_manifest import _create_powershell_wrapper


class TestModuleManifest(unittest.TestCase):
    def test_create_powershell_wrapper(self):
        b_module_data = b'This is the module data'
        module_path = '/path/to/module'
        module_args = 'arg1 arg2'
        environment = {'ENV_VAR': 'value'}
        async_timeout = 10
        become = True
        become_method = 'runas'
        become_user = 'admin'
        become_password = 'password'
        become_flags = '-SomeFlag'
        substyle = 'powershell'
        task_vars = {}
        module_fqn = 'module.name'
        b_data = _create_powershell_wrapper(b_module_data, module_path, module_args, environment, async_timeout, become, become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn)
        self.assertIsInstance(b_data, bytes)
        self.assertGreater(len(b_data), 0)

if __name__ == '__main__':
    unittest.main()