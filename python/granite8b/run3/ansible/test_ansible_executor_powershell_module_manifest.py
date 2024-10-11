from ansible.module_utils.common.collections import ImmutableDict
import unittest
from ansible.executor.powershell.module_manifest import _slurp, _strip_comments, _create_powershell_wrapper


class TestModuleManifest(unittest.TestCase):
    def test_slurp(self):
        with self.assertRaises(AnsibleError):
            _slurp('nonexistent_path')

    def test_strip_comments(self):
        source = b'line1\n#comment\nline2'
        expected = b'line1\nline2'
        actual = _strip_comments(source)
        self.assertEqual(actual, expected)

    def test_create_powershell_wrapper(self):
        b_module_data = b'powershell module data'
        module_path = 'module_path'
        module_args = 'module_args'
        environment = {'key': 'value'}
        async_timeout = 10
        become = True
        become_method = 'runas'
        become_user = 'user'
        become_password = 'password'
        become_flags = 'flags'
        substyle = 'powershell'
        task_vars = {}
        module_fqn = 'module_fqn'
        expected = b'powershell wrapper data'
        actual = _create_powershell_wrapper(b_module_data, module_path, module_args, environment, async_timeout, become, become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn)
        self.assertEqual(actual, expected)

if __name__ == '__main__':
    unittest.main()