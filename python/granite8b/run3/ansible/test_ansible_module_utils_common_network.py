import unittest
from ansible.module_utils.common.network import *


class TestCommonNetwork(unittest.TestCase):
    def test_is_netmask(self):
        self.assertTrue(is_netmask('255.255.255.0'))
        self.assertFalse(is_netmask('256.255.255.0'))
        self.assertFalse(is_netmask('255.255.255.256'))
        self.assertFalse(is_netmask('255.255.255'))
        self.assertFalse(is_netmask('255.255.255.255.255'))

    def test_is_masklen(self):
        self.assertTrue(is_masklen('0'))
        self.assertTrue(is_masklen('32'))
        self.assertFalse(is_masklen('-1'))
        self.assertFalse(is_masklen('33'))

    def test_to_netmask(self):
        self.assertEqual(to_netmask('0'), '0.0.0.0')
        self.assertEqual(to_netmask('32'), '255.255.255.255')
        self.assertEqual(to_netmask('1'), '128.0.0.0')
        self.assertEqual(to_netmask('2'), '0.0.0.192')
        self.assertEqual(to_netmask('3'), '0.0.0.224')
        self.assertEqual(to_netmask('4'), '0.0.0.240')
        self.assertEqual(to_netmask('5'), '0.0.0.248')
        self.assertEqual(to_netmask('6'), '0.0.0.252')
        self.assertEqual(to_netmask('7'), '0.0.0.254')
        self.assertEqual(to_netmask('8'), '0.0.0.255')
        self.assertEqual(to_netmask('9'), '0.0.1.0')

    def test_to_masklen(self):
        self.assertEqual(to_masklen('0.0.0.0'), 0)
        self.assertEqual(to_masklen('255.255.255.255'), '32')
        self.assertEqual(to_masklen('0.0.0.128'), '1')
        self.assertEqual(to_masklen('0.0.0.192'), '2')
        self.assertEqual(to_masklen('0.0.0.224'), '3')
        self.assertEqual(to_masklen('0.0.0.240'), '4')
        self.assertEqual(to_masklen('0.0.0.248'), '5')
        self.assertEqual(to_masklen('0.0.0.252'), '6')
        self.assertEqual(to_masklen('0.0.0.254'), '7')
        self.assertEqual(to_masklen('0.0.0.255'), '8')
        self.assertEqual(to_masklen('0.0.1.0'), '9')

class TestNetworkUtils(unittest.TestCase):
    def test_is_netmask(self):
        self.assertTrue(is_netmask('255.255.255.0'))
        self.assertFalse(is_netmask('255.255.255.256'))
        self.assertFalse(is_netmask('255.255.255.255.255'))
        self.assertFalse(is_netmask('255.255.255'))
        self.assertFalse(is_netmask('255.255.255.255'))

    def test_is_masklen(self):
        self.assertTrue(is_masklen('0'))
        self.assertTrue(is_masklen('32'))
        self.assertFalse(is_masklen('-1'))
        self.assertFalse(is_masklen('33'))
        self.assertFalse(is_masklen('abc'))

class TestExampleClass(unittest.TestCase):
    def test_is_netmask(self):
        self.assertTrue(is_netmask('255.255.255.0'))
        self.assertFalse(is_netmask('256.255.255.0'))
        self.assertFalse(is_netmask('255.255.255.256'))
        self.assertFalse(is_netmask('255.255.255'))
        self.assertFalse(is_netmask('255.255.255.255.255'))

    def test_is_masklen(self):
        self.assertTrue(is_masklen('0'))
        self.assertTrue(is_masklen('32'))
        self.assertFalse(is_masklen('-1'))
        self.assertFalse(is_masklen('33'))
        self.assertFalse(is_masklen('abc'))

    def test_to_netmask(self):
        self.assertEqual(to_netmask('0'), '0.0.0.0')
        self.assertEqual(to_netmask('32'), '255.255.255.255')
        self.assertRaises(ValueError, to_netmask, '-1')
        self.assertRaises(ValueError, to_netmask, '33')
        self.assertRaises(ValueError, to_netmask, 'abc')

    def test_to_masklen(self):
        self.assertEqual(to_masklen('0.0.0.0'), '0')
        self.assertEqual(to_masklen('255.255.255.255'), '32')
        self.assertRaises(ValueError, to_masklen, '255.255.255.256')
        self.assertRaises(ValueError, to_masklen, '255.255.255')
        self.assertRaises(ValueError, to_masklen, '255.255.255.255.255')

    def test_to_subnet(self):
        self.assertEqual(to_subnet('192.168.1.1', '255.255.255.0'), '192.168.1.0/24')
        self.assertEqual(to_subnet('192.168.1.1', '24'), '192.168.1.0/24')
        self.assertRaises(ValueError, to_subnet, '192.168.1.1', '256.255.255.0')
        self.assertRaises(ValueError, to_subnet, '192.168.1.1', '255.255.255')
        self.assertRaises(ValueError, to_subnet, '192.168.1.1', '255.255.255.255.255')

    def test_to_ipv6_subnet(self):
        self.assertEqual(to_ipv6_subnet('2001:db8:cafe::1/64'), '2001:db8:cafe::/64')
        self.assertEqual(to_ipv6_subnet('2001:db8:cafe::1'), '2001:db8:cafe::/64')
        self.assertRaises(ValueError, to_ipv6_subnet, '2001:db8:cafe::1/129')
        self.assertRaises(ValueError, to_ipv6_subnet, '2001:db8:cafe::1/64/64')

if __name__ == '__main__':
    unittest.main()