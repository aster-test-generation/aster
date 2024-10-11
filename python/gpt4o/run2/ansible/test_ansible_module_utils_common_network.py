import unittest
from ansible.module_utils.common.network import *


class TestNetworkUtils(unittest.TestCase):
    def test_is_netmask_valid(self):
        self.assertTrue(is_netmask('255.255.255.0'))

    def test_is_netmask_invalid(self):
        self.assertFalse(is_netmask('255.255.255.256'))

    def test_is_masklen_valid(self):
        self.assertTrue(is_masklen(24))

    def test_is_masklen_invalid(self):
        self.assertFalse(is_masklen(33))

    def test_to_netmask_valid(self):
        self.assertEqual(to_netmask(24), '255.255.255.0')

    def test_to_netmask_invalid(self):
        with self.assertRaises(ValueError):
            to_netmask(33)

    def test_to_masklen_valid(self):
        self.assertEqual(to_masklen('255.255.255.0'), 24)

    def test_to_masklen_invalid(self):
        with self.assertRaises(ValueError):
            to_masklen('255.255.255.256')

    def test_to_subnet_valid(self):
        self.assertEqual(to_subnet('192.168.1.1', 24), '192.168.1.0/24')

    def test_to_subnet_invalid(self):
        with self.assertRaises(ValueError):
            to_subnet('192.168.1.1', '255.255.255.256')

    def test_to_subnet_dotted_notation(self):
        self.assertEqual(to_subnet('192.168.1.1', 24, dotted_notation=True), '192.168.1.0 255.255.255.0')

    def test_to_ipv6_subnet(self):
        self.assertEqual(to_ipv6_subnet('2001:db8::1'), '2001:db8::')

    def test_to_ipv6_network(self):
        self.assertEqual(to_ipv6_network('2001:db8::1'), '2001:db8::')

    def test_to_bits(self):
        self.assertEqual(to_bits('255.255.255.0'), '11111111111111111111111100000000')

    def test_is_mac_valid(self):
        self.assertTrue(is_mac('00:1A:2B:3C:4D:5E'))

    def test_is_mac_invalid(self):
        self.assertFalse(is_mac('00:1A:2B:3C:4D:5G'))

if __name__ == '__main__':
    unittest.main()