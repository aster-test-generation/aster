import unittest
from ansible.module_utils.common.network import *

class TestNetworkFunctions(unittest.TestCase):
    def test_is_netmask(self):
        self.assertTrue(is_netmask('255.255.255.0'))
        self.assertFalse(is_netmask('256.256.256.256'))
        self.assertFalse(is_netmask('1.1.1'))
        self.assertFalse(is_netmask('1.1.1.1.1'))

    def test_is_masklen(self):
        self.assertTrue(is_masklen(8))
        self.assertTrue(is_masklen(24))
        self.assertFalse(is_masklen(33))
        self.assertFalse(is_masklen('a'))

    def test_to_netmask(self):
        self.assertEqual(to_netmask(8), '255.0.0.0')
        self.assertEqual(to_netmask(24), '255.255.255.0')
        self.assertRaises(ValueError, to_netmask, 33)

    def test_to_masklen(self):
        self.assertEqual(to_masklen('255.255.255.0'), 24)
        self.assertEqual(to_masklen('255.255.0.0'), 16)
        self.assertRaises(ValueError, to_masklen, '256.256.256.256')

    def test_to_subnet(self):
        self.assertEqual(to_subnet('192.168.1.1', 24), '192.168.1.0/24')
        self.assertEqual(to_subnet('192.168.1.1', 24, dotted_notation=True), '192.168.1.0 255.255.255.0')
        self.assertRaises(ValueError, to_subnet, '192.168.1.1', '24')

    def test_to_ipv6_subnet(self):
        self.assertEqual(to_ipv6_subnet('2001:0db8:85a3:0000:0000:8a2e:0370:7334'), '2001:0db8:85a3::8a2e:370:7334')
        self.assertEqual(to_ipv6_network('2001:0db8:85a3:0000:0000:8a2e:0370:7334'), '2001:0db8:85a3::8a2e:370:7334')

    def test_to_bits(self):
        self.assertEqual(to_bits('192.168.1.1'), '11000000 10101000 00000100 00000001')

    def test_is_mac(self):
        self.assertTrue(is_mac('00:11:22:33:44:55'))
        self.assertFalse(is_mac('00:11:22:33:44'))
        self.assertFalse(is_mac('00:11:22:33:44:55:66'))

if __name__ == '__main__':
    unittest.main()