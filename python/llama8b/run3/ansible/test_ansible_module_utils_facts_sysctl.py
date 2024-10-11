import unittest
from ansible.module_utils.facts.sysctl import get_sysctl


class TestGetSysctl(unittest.TestCase):
    def test_get_sysctl(self):
        module = object()
        prefixes = ['sysctl1', 'sysctl2']
        result = get_sysctl(module, prefixes)
        self.assertIsInstance(result, dict)

    def test_get_sysctl_failure(self):
        module = object()
        prefixes = ['sysctl1', 'sysctl2']
        module.run_command = lambda *args: (1, '', 'error')
        result = get_sysctl(module, prefixes)
        self.assertIsNone(result)

    def test_get_sysctl_empty_output(self):
        module = object()
        prefixes = ['sysctl1', 'sysctl2']
        module.run_command = lambda *args: (0, '', '')
        result = get_sysctl(module, prefixes)
        self.assertEqual(result, {})

    def test_get_sysctl_invalid_output(self):
        module = object()
        prefixes = ['sysctl1', 'sysctl2']
        module.run_command = lambda *args: (0, 'invalid output', '')
        result = get_sysctl(module, prefixes)
        self.assertIsNone(result)

    def test_get_sysctl_re_split_failure(self):
        module = object()
        prefixes = ['sysctl1', 'sysctl2']
        module.run_command = lambda *args: (0, 'key=value', '')
        result = get_sysctl(module, prefixes)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()