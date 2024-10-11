import unittest
from ansible.module_utils.facts.sysctl import get_sysctl


class TestGetSysctl(unittest.TestCase):
    def test_get_sysctl(self):
        sysctl = get_sysctl(None, ['net.ipv4.ip_forward'])
        self.assertEqual(sysctl['net.ipv4.ip_forward'], '1')

    def test_get_sysctl_private_method(self):
        sysctl = get_sysctl(None, ['net.ipv4.ip_forward'])
        self.assertEqual(sysctl['net.ipv4.ip_forward'], '1')

    def test_get_sysctl_protected_method(self):
        sysctl = get_sysctl(None, ['net.ipv4.ip_forward'])
        self.assertEqual(sysctl['net.ipv4.ip_forward'], '1')

    def test_get_sysctl_magic_method(self):
        sysctl = get_sysctl(None, ['net.ipv4.ip_forward'])
        self.assertEqual(sysctl['net.ipv4.ip_forward'], '1')

if __name__ == '__main__':
    unittest.main()