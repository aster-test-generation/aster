import unittest
from ansible.module_utils.facts.sysctl import get_sysctl


class TestGetSysctl(unittest.TestCase):
    def test_get_sysctl(self):
        module = object()
        prefixes = ['prefix1', 'prefix2']
        result = get_sysctl(module, prefixes)
        self.assertIsInstance(result, dict)

    def test_get_sysctl_io_error(self):
        module = object()
        prefixes = ['prefix1', 'prefix2']
        module.run_command = lambda *args: (1, 'error', 'error')
        result = get_sysctl(module, prefixes)
        self.assertEqual(result, {})

    def test_get_sysctl_os_error(self):
        module = object()
        prefixes = ['prefix1', 'prefix2']
        module.run_command = lambda *args: (1, 'error', 'error')
        result = get_sysctl(module, prefixes)
        self.assertEqual(result, {})

    def test_get_sysctl_invalid_line(self):
        module = object()
        prefixes = ['prefix1', 'prefix2']
        out = 'invalid line'
        module.run_command = lambda *args: (0, out, '')
        result = get_sysctl(module, prefixes)
        self.assertEqual(result, {})

    def test_get_sysctl_valid_line(self):
        module = object()
        prefixes = ['prefix1', 'prefix2']
        out = 'key = value'
        module.run_command = lambda *args: (0, out, '')
        result = get_sysctl(module, prefixes)
        self.assertEqual(result, {'key': 'value'})

    def test_get_sysctl_multiple_lines(self):
        module = object()
        prefixes = ['prefix1', 'prefix2']
        out = 'key1 = value1\nkey2 = value2'
        module.run_command = lambda *args: (0, out, '')
        result = get_sysctl(module, prefixes)
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

if __name__ == '__main__':
    unittest.main()