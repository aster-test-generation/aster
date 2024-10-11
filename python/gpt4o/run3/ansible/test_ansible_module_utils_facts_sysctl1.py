import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.sysctl import get_sysctl

class TestGetSysctl(unittest.TestCase):
    def setUp(self):
        self.module = Mock()
        self.module.get_bin_path.return_value = '/sbin/sysctl'
        self.module.run_command = Mock()

    def test_get_sysctl_success(self):
        self.module.run_command.return_value = (0, 'net.ipv4.ip_forward = 1\nnet.ipv4.conf.all.rp_filter = 1\n', '')
        prefixes = ['net.ipv4']
        result = get_sysctl(self.module, prefixes)
        expected = {
            'net.ipv4.ip_forward': '1',
            'net.ipv4.conf.all.rp_filter': '1'
        }
        self.assertEqual(result, expected)

    def test_get_sysctl_ioerror(self):
        self.module.run_command.side_effect = IOError('Test IOError')
        prefixes = ['net.ipv4']
        with patch('ansible.module_utils.facts.sysctl.to_text', return_value='Test IOError'):
            result = get_sysctl(self.module, prefixes)
            self.module.warn.assert_called_with('Unable to read sysctl: Test IOError')
            self.assertEqual(result, {})

    def test_get_sysctl_oserror(self):
        self.module.run_command.side_effect = OSError('Test OSError')
        prefixes = ['net.ipv4']
        with patch('ansible.module_utils.facts.sysctl.to_text', return_value='Test OSError'):
            result = get_sysctl(self.module, prefixes)
            self.module.warn.assert_called_with('Unable to read sysctl: Test OSError')
            self.assertEqual(result, {})

    def test_get_sysctl_split_error(self):
        self.module.run_command.return_value = (0, 'net.ipv4.ip_forward = 1\ninvalid line\n', '')
        prefixes = ['net.ipv4']
        with patch('ansible.module_utils.facts.sysctl.to_text', side_effect=lambda x: x):
            result = get_sysctl(self.module, prefixes)
            self.module.warn.assert_called_with('Unable to split sysctl line (invalid line): not enough values to unpack (expected 2, got 1)')
            expected = {
                'net.ipv4.ip_forward': '1'
            }
            self.assertEqual(result, expected)

    def test_get_sysctl_multiline_value(self):
        self.module.run_command.return_value = (0, 'net.ipv4.ip_forward = 1\n net.ipv4.ip_forward continued\n', '')
        prefixes = ['net.ipv4']
        result = get_sysctl(self.module, prefixes)
        expected = {
            'net.ipv4.ip_forward': '1\nnet.ipv4.ip_forward continued'
        }
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()