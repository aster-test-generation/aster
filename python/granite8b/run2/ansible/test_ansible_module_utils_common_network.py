import unittest
from ansible.module_utils.common.network import (
    is_netmask,
    is_masklen,
    to_netmask,
    to_masklen,
    to_subnet,
    to_ipv6_subnet,
    to_ipv6_network,
    to_bits,
    is_mac,
)
from ansible.module_utils.common.network import *


class TestNetworkUtils(unittest.TestCase):
    def test_is_netmask(self):
        self.assertTrue(is_netmask('255.255.255.0'))
        self.assertTrue(is_netmask('255.255.0.0'))
        self.assertTrue(is_netmask('255.0.0.0'))
        self.assertTrue(is_netmask('0.0.0.0'))
        self.assertFalse(is_netmask('256.255.255.0'))
        self.assertFalse(is_netmask('255.256.255.0'))
        self.assertFalse(is_netmask('255.255.256.0'))
        self.assertFalse(is_netmask('255.255.255.256'))
        self.assertFalse(is_netmask('255.255.255'))
        self.assertFalse(is_netmask('255.255.255.255.255'))

    def test_is_masklen(self):
        self.assertTrue(is_masklen('0'))
        self.assertTrue(is_masklen('32'))
        self.assertFalse(is_masklen('-1'))
        self.assertFalse(is_masklen('33'))
        self.assertFalse(is_masklen('foo'))

class TestNetworkUtils(unittest.TestCase):
    def test_is_netmask(self):
        self.assertTrue(is_netmask('255.255.255.0'))
        self.assertFalse(is_netmask('256.255.255.0'))
        self.assertFalse(is_netmask('255.255.255'))
        self.assertFalse(is_netmask('255.255.255.256'))
        self.assertFalse(is_netmask('255.255.255.255.255'))

    def test_is_masklen(self):
        self.assertTrue(is_masklen('0'))
        self.assertTrue(is_masklen('32'))
        self.assertFalse(is_masklen('-1'))
        self.assertFalse(is_masklen('33'))

    def test_to_netmask(self):
        self.assertEqual(to_netmask('0'), '0.0.0.0')
        self.assertEqual(to_netmask('32'), '255.255.255.255')
        self.assertRaises(ValueError, to_netmask, '33')

    def test_to_masklen(self):
        self.assertEqual(to_masklen('0.0.0.0'), '0')
        self.assertEqual(to_masklen('255.255.255.255'), '32')
        self.assertRaises(ValueError, to_masklen, '255.255.255.256')

    def test_to_subnet(self):
        self.assertEqual(to_subnet('192.168.1.1', '255.255.255.0'), '192.168.1.1/24')
        self.assertEqual(to_subnet('192.168.1.1', '24'), '192.168.1.1/24')
        self.assertEqual(to_subnet('192.168.1.1', '255.255.255.255'), '192.168.1.1/32')
        self.assertRaises(ValueError, to_subnet, '192.168.1.1', '256.255.255.0')

    def test_to_ipv6_subnet(self):
        self.assertEqual(to_ipv6_subnet('2001:db8::/64'), '2001:db8::/64')
        self.assertEqual(to_ipv6_subnet('2001:db8::/64'), '2001:db8::/64')
        self.assertEqual(to_ipv6_subnet('2001:db8::/128'), '2001:db8::/128')
        self.assertRaises(ValueError, to_ipv6_subnet, '2001:db8::/129')

    def test_to_ipv6_network(self):
        self.assertEqual(to_ipv6_network('2001:db8::/64'), '2001:db8::/64')
        self.assertEqual(to_ipv6_network('2001:db8::/64'), '2001:db8::/64')
        self.assertEqual(to_ipv6_network('2001:db8::/128'), '2001:db8::/128')
        self.assertRaises(ValueError, to_ipv6_network, '2001:db8::/129')

if __name__ == '__main__':
    unittest.main()