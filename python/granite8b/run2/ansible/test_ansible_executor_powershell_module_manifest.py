import unittest
from ansible.executor.powershell.module_manifest import _strip_comments, _create_powershell_wrapper


class TestModuleManifest(unittest.TestCase):
    def test_strip_comments(self):
        source = b'''
        function foo {
            Write-Host "Hello, World!"
        }
        '''
        expected = b'''
        function foo {
            Write-Host "Hello, World!"
        }
        '''
        result = _strip_comments(source)
        self.assertEqual(result, expected)

    def test_create_powershell_wrapper(self):
        b_module_data = b'''
        function foo {
            Write-Host "Hello, World!"
        }
        '''
        module_path = '/path/to/module.ps1'
        module_args = 'arg1 arg2'
        environment = {'ENV_VAR': 'value'}
        async_timeout = 0
        become = False
        become_method = 'runas'
        become_user = 'SYSTEM'
        become_password = None
        become_flags = None
        substyle = 'powershell'
        task_vars = {}
        module_fqn = 'foo.bar'
        expected = {
            'module_entry': 'SGVsbG8sIFdvcmxkIQ==',
            'powershell_modules': {},
            'csharp_utils': {},
            'csharp_utils_module': [],
            'module_args': 'arg1 arg2',
            'actions': ['module_powershell_wrapper'],
            'environment': {'ENV_VAR': 'value'},
            'encoded_output': False,
            'async_jid': None,
            'async_timeout_sec': 0,
            'async_startup_timeout': 0,
            'min_ps_version': '2.0',
            'min_os_version': '10.0'
        }
        result = _create_powershell_wrapper(b_module_data, module_path, module_args, environment, async_timeout, become, become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()