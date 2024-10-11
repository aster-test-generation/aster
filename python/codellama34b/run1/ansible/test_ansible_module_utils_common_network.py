import unittest
from ansible.module_utils.common.network import *






class TestIsNetmask(unittest.TestCase):
    def test_is_netmask(self):
        result = is_netmask('255.255.255.0')
        self.assertTrue(result)

    def test_is_netmask_false(self):
        result = is_netmask('255.255.255.0.0')
        self.assertFalse(result)

class TestIsMasklen(unittest.TestCase):
    def test_is_masklen(self):
        result = is_masklen('24')
        self.assertTrue(result)

    def test_is_masklen_false(self):
        result = is_masklen('24.0')
        self.assertFalse(result)

class TestToNetmask(unittest.TestCase):
    def test_to_netmask(self):
        result = to_netmask('24')
        self.assertEqual(result, '255.255.255.0')

    def test_to_netmask_false(self):
        result = to_netmask('24.0')
        self.assertNotEqual(result, '255.255.255.0')

class TestToMasklen(unittest.TestCase):
    def test_to_masklen(self):
        result = to_masklen('255.255.255.0')
        self.assertEqual(result, '24')

    def test_to_masklen_false(self):
        result = to_masklen('255.255.255.0.0')
        self.assertNotEqual(result, '24')

class TestToSubnet(unittest.TestCase):
    def test_to_subnet(self):
        result = to_subnet('192.168.1.1', '24')
        self.assertEqual(result, '192.168.1.0/24')

    def test_to_subnet_false(self):
        result = to_subnet('192.168.1.1', '24.0')
        self.assertNotEqual(result, '192.168.1.0/24')

class TestToIpv6Subnet(unittest.TestCase):
    def test_to_ipv6_subnet(self):
        result = to_ipv6_subnet('2001:db8::')
        self.assertEqual(result, '2001:db8::/64')

    def test_to_ipv6_subnet_false(self):
        result = to_ipv6_subnet('2001:db8::/64')
        self.assertNotEqual(result, '2001:db8::/64')

class TestToIpv6Network(unittest.TestCase):
    def test_to_ipv6_network(self):
        result = to_ipv6_network('2001:db8::')
        self.assertEqual(result, '2001:db8::/64')

    def test_to_ipv6_network_false(self):
        result = to_ipv6_network('2001:db8::/64')
        self.assertNotEqual(result, '2001:db8::/64')

class TestToBits(unittest.TestCase):
    def test_to_bits(self):
        result = to_bits('192.168.1.1')
        self.assertEqual(result, '11000000101010000000000100000001')

if __name__ == '__main__':
    unittest.main()