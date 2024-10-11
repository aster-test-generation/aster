import unittest
from ansible.module_utils.common.network import *

class TestIsNetmask(unittest.TestCase):
    def test_is_netmask(self):
        self.assertTrue(is_netmask('255.255.255.255'))
        self.assertFalse(is_netmask('255.255.255.256'))

class TestIsMasklen(unittest.TestCase):
    def test_is_masklen(self):
        self.assertTrue(is_masklen('32'))
        self.assertFalse(is_masklen('33'))

class TestToNetmask(unittest.TestCase):
    def test_to_netmask(self):
        self.assertEqual(to_netmask('24'), '255.255.255.0')
        self.assertEqual(to_netmask('25'), '255.255.255.128')

class TestToMasklen(unittest.TestCase):
    def test_to_masklen(self):
        self.assertEqual(to_masklen('255.255.255.0'), '24')
        self.assertEqual(to_masklen('255.255.255.128'), '25')

class TestToSubnet(unittest.TestCase):
    def test_to_subnet(self):
        self.assertEqual(to_subnet('192.168.1.0', '255.255.255.0'), '192.168.1.0/24')
        self.assertEqual(to_subnet('192.168.1.0', '255.255.255.0', True), '192.168.1.0 255.255.255.0')

class TestToIpv6Subnet(unittest.TestCase):
    def test_to_ipv6_subnet(self):
        self.assertEqual(to_ipv6_subnet('2001:db8::'), '2001:db8::/64')

class TestToIpv6Network(unittest.TestCase):
    def test_to_ipv6_network(self):
        self.assertEqual(to_ipv6_network('2001:db8::'), '2001:db8::/64')

class TestToBits(unittest.TestCase):
    def test_to_bits(self):
        self.assertEqual(to_bits('192.168.1.0'), '11000000101010000000000100000000')

class TestIsMac(unittest.TestCase):
    def test_is_mac(self):
        self.assertTrue(is_mac('00:11:22:33:44:55'))
        self.assertFalse(is_mac('00:11:22:33:44:55:66'))

if __name__ == '__main__':
    unittest.main()