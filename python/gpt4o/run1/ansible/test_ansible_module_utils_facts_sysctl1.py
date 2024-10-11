import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.sysctl import get_sysctl

class TestGetSysctl(unittest.TestCase):
    def setUp(self):
        self.module = Mock()
        self.module.get_bin_path.return_value = '/sbin/sysctl'
        self.module.run_command = Mock()

    def test_get_sysctl_success(self):
        self.module.run_command.return_value = (0, 'net.ipv4.ip_forward = 1\n', '')
        result = get_sysctl(self.module, ['net.ipv4.ip_forward'])
        self.assertEqual(result, {'net.ipv4.ip_forward': '1'})

    def test_get_sysctl_empty_output(self):
        self.module.run_command.return_value = (0, '', '')
        result = get_sysctl(self.module, ['net.ipv4.ip_forward'])
        self.assertEqual(result, {})

    def test_get_sysctl_multiline_value(self):
        self.module.run_command.return_value = (0, 'net.ipv4.ip_forward = 1\n net.ipv4.conf.all.forwarding = 1\n', '')
        result = get_sysctl(self.module, ['net.ipv4.ip_forward'])
        self.assertEqual(result, {'net.ipv4.ip_forward': '1\n net.ipv4.conf.all.forwarding = 1'})

    def test_get_sysctl_split_error(self):
        self.module.run_command.return_value = (0, 'net.ipv4.ip_forward 1\n', '')
        with patch('ansible.module_utils.facts.sysctl.to_text', side_effect=lambda x: x):
            result = get_sysctl(self.module, ['net.ipv4.ip_forward'])
        self.assertEqual(result, {})

    def test_get_sysctl_run_command_error(self):
        self.module.run_command.side_effect = IOError('Test IOError')
        with patch('ansible.module_utils.facts.sysctl.to_text', side_effect=lambda x: x):
            result = get_sysctl(self.module, ['net.ipv4.ip_forward'])
        self.assertEqual(result, {})

    def test_get_sysctl_run_command_non_zero_rc(self):
        self.module.run_command.return_value = (1, '', 'error')
        result = get_sysctl(self.module, ['net.ipv4.ip_forward'])
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()