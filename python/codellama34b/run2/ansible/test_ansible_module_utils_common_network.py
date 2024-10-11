import unittest
from ansible.module_utils.common.network import *



class TestIsNetmask(unittest.TestCase):
    def test_is_netmask(self):
        result = is_netmask('255.255.255.255')
        self.assertTrue(result)

    def test_is_netmask_false(self):
        result = is_netmask('255.255.255.256')
        self.assertFalse(result)

class TestIsMasklen(unittest.TestCase):
    def test_is_masklen(self):
        result = is_masklen('32')
        self.assertTrue(result)

    def test_is_masklen_false(self):
        result = is_masklen('33')
        self.assertFalse(result)

class TestToNetmask(unittest.TestCase):
    def test_to_netmask(self):
        result = to_netmask('32')
        self.assertEqual(result, '255.255.255.255')

    def test_to_netmask_false(self):
        result = to_netmask('33')
        self.assertNotEqual(result, '255.255.255.255')

class TestToMasklen(unittest.TestCase):
    def test_to_masklen(self):
        result = to_masklen('255.255.255.255')
        self.assertEqual(result, '32')

    def test_to_masklen_false(self):
        result = to_masklen('255.255.255.256')
        self.assertNotEqual(result, '32')

class TestToSubnet(unittest.TestCase):
    def test_to_subnet(self):
        result = to_subnet('192.168.1.1', '24')
        self.assertEqual(result, '192.168.1.0/24')

    def test_to_subnet_false(self):
        result = to_subnet('192.168.1.1', '24')
        self.assertNotEqual(result, '192.168.1.0/25')

class TestToIpv6Subnet(unittest.TestCase):
    def test_to_ipv6_subnet(self):
        result = to_ipv6_subnet('2001:db8:1234:5678:1234:5678:1234:5678')
        self.assertEqual(result, '2001:db8:1234:5678::')

    def test_to_ipv6_subnet_false(self):
        result = to_ipv6_subnet('2001:db8:1234:5678:1234:5678:1234:5678')
        self.assertNotEqual(result, '2001:db8:1234:5678:1234:5678:1234:5678')

class TestToIpv6Network(unittest.TestCase):
    def test_to_ipv6_network(self):
        result = to_ipv6_network('2001:db8:1234:5678:1234:5678:1234:5678')
        self.assertEqual(result, '2001:db8:1234:5678::')

if __name__ == '__main__':
    unittest.main()