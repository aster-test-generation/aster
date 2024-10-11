import unittest
from ansible.module_utils.common.network import *

class TestNetworkUtils(unittest.TestCase):
    def test_is_netmask(self):
        self.assertTrue(is_netmask('255.255.255.0'))
        self.assertFalse(is_netmask('255.255.255.256'))
        self.assertFalse(is_netmask('255.255.255'))
        self.assertFalse(is_netmask('255.255.255.255.255'))
        self.assertFalse(is_netmask('255.255.255.255'))

    def test_is_masklen(self):
        self.assertTrue(is_masklen('0'))
        self.assertTrue(is_masklen('32'))
        self.assertFalse(is_masklen('-1'))
        self.assertFalse(is_masklen('33'))
        self.assertFalse(is_masklen('abc'))

    def test_to_netmask(self):
        self.assertEqual(to_netmask('24'), '255.255.255.0')
        self.assertEqual(to_netmask('16'), '255.255.0.0')
        self.assertEqual(to_netmask('8'), '255.0.0.0')
        self.assertEqual(to_netmask('0'), '0.0.0.0')

    def test_to_masklen(self):
        self.assertEqual(to_masklen('255.255.255.0'), '24')
        self.assertEqual(to_masklen('255.255.0.0'), '16')
        self.assertEqual(to_masklen('255.0.0.0'), '8')
        self.assertEqual(to_masklen('0.0.0.0'), '0')

    def test_to_subnet(self):
        self.assertEqual(to_subnet('192.168.1.1', '255.255.255.0'), '192.168.1.1/24')
        self.assertEqual(to_subnet('192.168.1.1', '24'), '192.168.1.1/24')
        self.assertEqual(to_subnet('192.168.1.1', '255.255.255.255'), '192.168.1.1/32')
        self.assertEqual(to_subnet('192.168.1.1', '32'), '192.168.1.1/32')

    def test_to_ipv6_subnet(self):
        self.assertEqual(to_ipv6_subnet('2001:db8:cafe::1'), '2001:db8:cafe::/64')
        self.assertEqual(to_ipv6_subnet('2001:db8:cafe::1/64'), '2001:db8:cafe::/64')

    def test_to_ipv6_network(self):
        self.assertEqual(to_ipv6_network('2001:db8:cafe::1'), '2001:db8:cafe::/64')
        self.assertEqual(to_ipv6_network('2001:db8:cafe::1/64'), '2001:db8:cafe::/64')

    def test_to_bits(self):
        self.assertEqual(to_bits('192.168.1.1'), '1100000010101000000000000000001')
        self.assertEqual(to_bits('192.168.1.1'), '1100000010101000000000000000001')

if __name__ == '__main__':
    unittest.main()