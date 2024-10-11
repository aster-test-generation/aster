import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.sysctl import get_sysctl


class TestGetSysctl(unittest.TestCase):
    def setUp(self):
        self.module = Mock()
        self.module.get_bin_path.return_value = '/sbin/sysctl'
        self.module.run_command = Mock()

    def test_get_sysctl_success(self):
        self.module.run_command.return_value = (0, 'net.ipv4.ip_forward = 1\nkernel.hostname = myhost\n', '')
        prefixes = ['net.ipv4.ip_forward', 'kernel.hostname']
        result = get_sysctl(self.module, prefixes)
        expected = {
            'net.ipv4.ip_forward': '1',
            'kernel.hostname': 'myhost'
        }
        self.assertEqual(result, expected)

    def test_get_sysctl_empty_output(self):
        self.module.run_command.return_value = (0, '', '')
        prefixes = ['net.ipv4.ip_forward']
        result = get_sysctl(self.module, prefixes)
        expected = {}
        self.assertEqual(result, expected)

    def test_get_sysctl_with_multiline_value(self):
        self.module.run_command.return_value = (0, 'net.ipv4.ip_forward = 1\n kernel.hostname = myhost\n', '')
        prefixes = ['net.ipv4.ip_forward', 'kernel.hostname']
        result = get_sysctl(self.module, prefixes)
        expected = {
            'net.ipv4.ip_forward': '1\n kernel.hostname = myhost'
        }
        self.assertEqual(result, expected)

    def test_get_sysctl_command_failure(self):
        self.module.run_command.side_effect = IOError("Command not found")
        prefixes = ['net.ipv4.ip_forward']
        result = get_sysctl(self.module, prefixes)
        expected = {}
        self.assertEqual(result, expected)

    def test_get_sysctl_split_error(self):
        self.module.run_command.return_value = (0, 'net.ipv4.ip_forward = 1\ninvalid line\n', '')
        prefixes = ['net.ipv4.ip_forward']
        result = get_sysctl(self.module, prefixes)
        expected = {
            'net.ipv4.ip_forward': '1'
        }
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()