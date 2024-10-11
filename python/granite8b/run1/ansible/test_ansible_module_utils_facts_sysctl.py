import unittest
from ansible.module_utils.facts.sysctl import get_sysctl


class TestGetSysctl(unittest.TestCase):
    def test_get_sysctl(self):
        module = MagicMock()
        prefixes = ['net.ipv4.ip_forward']
        sysctl = get_sysctl(module, prefixes)
        self.assertEqual(sysctl, {'net.ipv4.ip_forward': '1'})

if __name__ == '__main__':
    unittest.main()