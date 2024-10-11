import unittest
from unittest.mock import Mock
from ansible.module_utils.facts.sysctl import get_sysctl


class TestGetSysctl(unittest.TestCase):
    def test_get_sysctl_success(self):
        module = MockModule()
        prefixes = ['prefix1', 'prefix2']
        result = get_sysctl(module, prefixes)
        self.assertIsInstance(result, dict)

    def test_get_sysctl_ioerror(self):
        module = MockModule()
        prefixes = ['prefix1', 'prefix2']
        module.run_command = Mock(side_effect=IOError('test error'))
        result = get_sysctl(module, prefixes)
        self.assertIsInstance(result, dict)

    def test_get_sysctl_oserror(self):
        module = MockModule()
        prefixes = ['prefix1', 'prefix2']
        module.run_command = Mock(side_effect=OSError('test error'))
        result = get_sysctl(module, prefixes)
        self.assertIsInstance(result, dict)

    def test_get_sysctl_split_error(self):
        module = MockModule()
        prefixes = ['prefix1', 'prefix2']
        module.run_command = Mock(return_value=(0, 'key = value\n invalid line', ''))
        result = get_sysctl(module, prefixes)
        self.assertIsInstance(result, dict)

class MockModule:
    def __init__(self):
        self.warn_calls = []

    def warn(self, message):
        self.warn_calls.append(message)

    def get_bin_path(self, cmd):
        return cmd

    def run_command(self, cmd):
        return (0, 'key1 = value1\nkey2 = value2', '')

if __name__ == '__main__':
    unittest.main()