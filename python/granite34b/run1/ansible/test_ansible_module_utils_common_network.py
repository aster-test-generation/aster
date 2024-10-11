import unittest
from ansible.module_utils.common.network import is_netmask, is_masklen, to_netmask, to_masklen, to_subnet, to_ipv6_subnet, to_ipv6_network, to_bits, is_mac


class TestNetworkUtils(unittest.TestCase):
    def test_is_netmask(self):
        self.assertTrue(is_netmask('255.255.255.0'))
        self.assertFalse(is_netmask('256.255.255.0'))
        self.assertFalse(is_netmask('255.255.255.256'))

    def test_is_masklen(self):
        self.assertTrue(is_masklen('24'))
        self.assertFalse(is_masklen('256'))

    def test_to_netmask(self):
        self.assertEqual(to_netmask('24'), '255.255.255.0')
        with self.assertRaises(ValueError):
            to_netmask('256')

    def test_to_masklen(self):
        self.assertEqual(to_masklen('255.255.255.0'), 24)
        with self.assertRaises(ValueError):
            to_masklen('256.255.255.0')

    def test_to_subnet(self):
        self.assertEqual(to_subnet('192.168.1.1', '255.255.255.0'), '192.168.1.0/24')
        self.assertEqual(to_subnet('192.168.1.1', '24', True), '192.168.1.0 255.255.255.0')
        with self.assertRaises(ValueError):
            to_subnet('192.168.1.1', '256.255.255.0')

    def test_to_ipv6_subnet(self):
        self.assertEqual(to_ipv6_subnet('2001:db8:1234:5678::'), '2001:db8:1234:5678::')
        self.assertEqual(to_ipv6_subnet('2001:db8:1234:5678::1'), '2001:db8:1234:5678::')
        self.assertEqual(to_ipv6_subnet('2001:db8:1234:5678::1/64'), '2001:db8:1234:5678::')

    def test_to_ipv6_network(self):
        self.assertEqual(to_ipv6_network('2001:db8:1234:5678::'), '2001:db8:1234::')
        self.assertEqual(to_ipv6_network('2001:db8:1234:5678::1'), '2001:db8:1234:5678::')
        self.assertEqual(to_ipv6_network('2001:db8:1234:5678::1/64'), '2001:db8:1234:5678::')

    def test_to_bits(self):
        self.assertEqual(to_bits('192.168.1.1'), '11000000101010000000000100000001')

    def test_is_mac(self):
        self.assertTrue(is_mac('00:11:22:33:44:55'))
        self.assertFalse(is_mac('00-11-22-33-44-55'))
        self.assertFalse(is_mac('001122334455'))

class TestNetworkUtils(unittest.TestCase):
    def test_is_netmask(self):
        self.assertTrue(is_netmask('255.255.255.0'))
        self.assertFalse(is_netmask('256.255.255.0'))
        self.assertFalse(is_netmask('255.255.255.256'))

    def test_is_masklen(self):
        self.assertTrue(is_masklen(0))
        self.assertTrue(is_masklen(32))
        self.assertFalse(is_masklen(-1))
        self.assertFalse(is_masklen(33))

    def test_to_netmask(self):
        self.assertEqual(to_netmask(24), '255.255.255.0')
        self.assertEqual(to_netmask(16), '255.255.0.0')
        with self.assertRaises(ValueError):
            to_netmask(33)

    def test_to_masklen(self):
        self.assertEqual(to_masklen('255.255.255.0'), 24)
        self.assertEqual(to_masklen('255.255.0.0'), 16)
        with self.assertRaises(ValueError):
            to_masklen('255.255.255.256')

    def test_to_subnet(self):
        self.assertEqual(to_subnet('192.168.1.1', '255.255.255.0'), '192.168.1.0/24')
        self.assertEqual(to_subnet('192.168.1.1', '255.255.0.0'), '192.168.0.0/16')
        with self.assertRaises(ValueError):
            to_subnet('192.168.1.1', '255.255.255.256')

    def test_to_ipv6_subnet(self):
        self.assertEqual(to_ipv6_subnet('2001:db8::1'), '2001:db8::')
        self.assertEqual(to_ipv6_subnet('2001:db8::1:2:3:4'), '2001:db8::1:2:3:4')

    def test_to_ipv6_network(self):
        self.assertEqual(to_ipv6_network('2001:db8::1'), '2001:db8::')
        self.assertEqual(to_ipv6_network('2001:db8::1:2:3:4'), '2001:db8::1:2:3::')

    def test_to_bits(self):
        self.assertEqual(to_bits('192.168.1.1'), '11000000101010000000000100000001')

    def test_is_mac(self):
        self.assertTrue(is_mac('00:11:22:33:44:55'))
        self.assertFalse(is_mac('00:11:22:33:44:5G'))

if __name__ == '__main__':
    unittest.main()