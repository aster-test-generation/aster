import unittest
from ansible.executor.powershell.module_manifest import *


class TestPSModuleDepFinder(unittest.TestCase):
    def test_init(self):
        finder = PSModuleDepFinder()
        self.assertIsInstance(finder, PSModuleDepFinder)

    def test_scan_module(self):
        finder = PSModuleDepFinder()
        b_module_data = b'some_module_data'
        module_fqn = 'some_module_fqn'
        finder.scan_module(b_module_data, fqn=module_fqn, powershell=True)
        self.assertIn(module_fqn, finder.exec_scripts)

    def test_scan_exec_script(self):
        finder = PSModuleDepFinder()
        script_name = 'some_script_name'
        finder.scan_exec_script(script_name)
        self.assertIn(script_name, finder.exec_scripts)

    def test_add_module(self):
        finder = PSModuleDepFinder()
        module_name = 'some_module_name'
        module_path = 'some_module_path'
        finder._add_module(module_name, module_path, None, False, wrapper=False)
        self.assertIn(module_name, finder.ps_modules)

class TestCreatePowershellWrapper(unittest.TestCase):
    def test_create_powershell_wrapper(self):
        b_module_data = b'some_module_data'
        module_path = 'some_module_path'
        module_args = {'some_arg': 'some_value'}
        environment = {'some_env_var': 'some_value'}
        async_timeout = 10
        become = True
        become_method = 'runas'
        become_user = 'some_user'
        become_password = 'some_password'
        become_flags = 'some_flags'
        substyle = 'powershell'
        task_vars = {'some_var': 'some_value'}
        module_fqn = 'some_module_fqn'
        result = _create_powershell_wrapper(b_module_data, module_path, module_args, environment, async_timeout, become, become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn)
        self.assertIsInstance(result, bytes)

class TestSlurp(unittest.TestCase):
    def test_slurp(self):
        path = 'some_path'
        with open(path, 'wb') as f:
            f.write(b'some_data')
        result = _slurp(path)
        self.assertEqual(result, b'some_data')

class TestStripComments(unittest.TestCase):
    def test_strip_comments(self):
        source = b'some_source_code'
        result = _strip_comments(source)
        self.assertIsInstance(result, bytes)

if __name__ == '__main__':
    unittest.main()