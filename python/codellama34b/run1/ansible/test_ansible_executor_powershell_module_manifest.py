import unittest
from ansible.executor.powershell.module_manifest import *


class Test_slurp(unittest.TestCase):
    def test_slurp(self):
        path = ''
        result = _slurp(path)
        self.assertEqual(result, '')

class Test_strip_comments(unittest.TestCase):
    def test_strip_comments(self):
        source = ''
        result = _strip_comments(source)
        self.assertEqual(result, '')

class Test_create_powershell_wrapper(unittest.TestCase):
    def test_create_powershell_wrapper(self):
        b_module_data = ''
        module_path = ''
        module_args = ''
        environment = ''
        async_timeout = 0
        become = False
        become_method = ''
        become_user = ''
        become_password = ''
        become_flags = ''
        substyle = ''
        task_vars = ''
        module_fqn = ''
        result = _create_powershell_wrapper(b_module_data, module_path, module_args, environment, async_timeout, become, become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn)
        self.assertEqual(result, '')

if __name__ == '__main__':
    unittest.main()