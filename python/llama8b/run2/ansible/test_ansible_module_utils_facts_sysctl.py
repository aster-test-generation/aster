import unittest
from ansible.module_utils.facts.sysctl import get_sysctl


class TestGetSysctl(unittest.TestCase):
    def test_get_sysctl(self):
        module = object()
        prefixes = ['net.ipv4.ip_forward']
        result = get_sysctl(module, prefixes)
        self.assertIsInstance(result, dict)

    def test_get_sysctl_with_error(self):
        module = object()
        prefixes = ['non-existent']
        result = get_sysctl(module, prefixes)
        self.assertIsNone(result)

    def test_get_sysctl_with_warning(self):
        module = object()
        prefixes = ['non-existent']
        with unittest.mock.patch.object(module, 'warn') as mock_warn:
            result = get_sysctl(module, prefixes)
            self.assertIsNone(result)
            mock_warn.assert_called_once()

    def test_get_sysctl_with_output(self):
        module = object()
        prefixes = ['net.ipv4.ip_forward']
        with unittest.mock.patch.object(module, 'run_command') as mock_run_command:
            mock_run_command.return_value = (0, 'key=value', '')
            result = get_sysctl(module, prefixes)
            self.assertEqual(result, {'key': 'value'})

    def test_get_sysctl_with_multiple_lines(self):
        module = object()
        prefixes = ['net.ipv4.ip_forward']
        with unittest.mock.patch.object(module, 'run_command') as mock_run_command:
            mock_run_command.return_value = (0, 'key=value\nanother_key=another_value', '')
            result = get_sysctl(module, prefixes)
            self.assertEqual(result, {'key': 'value', 'another_key': 'another_value'})

    def test_get_sysctl_with_error_splitting_line(self):
        module = object()
        prefixes = ['net.ipv4.ip_forward']
        with unittest.mock.patch.object(module, 'run_command') as mock_run_command:
            mock_run_command.return_value = (0, 'key=value: another_key=another_value', '')
            with unittest.mock.patch.object(module, 'warn') as mock_warn:
                result = get_sysctl(module, prefixes)
                self.assertEqual(result, {'key': 'value'})
                mock_warn.assert_called_once()

if __name__ == '__main__':
    unittest.main()