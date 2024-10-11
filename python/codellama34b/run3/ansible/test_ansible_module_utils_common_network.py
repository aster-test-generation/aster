import unittest
from ansible.module_utils.common.network import *


class TestCommonNetwork(unittest.TestCase):
    def test_is_netmask(self):
        self.assertTrue(is_netmask('255.255.255.255'))
        self.assertFalse(is_netmask('255.255.255.256'))

    def test_is_masklen(self):
        self.assertTrue(is_masklen('24'))
        self.assertFalse(is_masklen('33'))

    def test_to_netmask(self):
        self.assertEqual(to_netmask('24'), '255.255.255.0')
        self.assertEqual(to_netmask('32'), '255.255.255.255')

    def test_to_masklen(self):
        self.assertEqual(to_masklen('255.255.255.0'), 24)
        self.assertEqual(to_masklen('255.255.255.255'), '32')

    def test_to_subnet(self):
        self.assertEqual(to_subnet('192.168.1.1', '24'), '192.168.1.0/24')
        self.assertEqual(to_subnet('192.168.1.1', '255.255.255.0'), '192.168.1.0/24')

    def test_to_ipv6_subnet(self):
        self.assertEqual(to_ipv6_subnet('2001:db8:1234:0000:0000:0000:0000:0000'), '2001:db8:1234:0000::')

    def test_to_ipv6_network(self):
        self.assertEqual(to_ipv6_network('2001:db8:1234:0000:0000:0000:0000:0000'), '2001:db8:1234::')

    def test_to_bits(self):
        self.assertEqual(to_bits('192.168.1.1'), '11000000101010000000000100000001')

    def test_is_mac(self):
        self.assertTrue(is_mac('00:11:22:33:44:55'))
        self.assertFalse(is_mac('00:11:22:33:44:55:66'))



class TestIsNetmask(unittest.TestCase):
    def test_is_netmask(self):
        result = is_netmask('255.255.255.255')
        self.assertTrue(result)

    def test_is_netmask(self):
        result = is_netmask('255.255.255.254')
        self.assertFalse(result)

class TestIsMasklen(unittest.TestCase):
    def test_is_masklen(self):
        result = is_masklen('32')
        self.assertTrue(result)

    def test_is_masklen(self):
        result = is_masklen('33')
        self.assertFalse(result)

class TestToNetmask(unittest.TestCase):
    def test_to_netmask(self):
        result = to_netmask('32')
        self.assertEqual(result, '255.255.255.255')

    def test_to_netmask(self):
        result = to_netmask('33')
        self.assertRaises(ValueError)

class TestToMasklen(unittest.TestCase):
    def test_to_masklen(self):
        result = to_masklen('255.255.255.255')
        self.assertEqual(result, '32')

    def test_to_masklen(self):
        result = to_masklen('255.255.255.254')
        self.assertRaises(ValueError)

class TestToSubnet(unittest.TestCase):
    def test_to_subnet(self):
        result = to_subnet('192.168.1.1', '255.255.255.0')
        self.assertEqual(result, '192.168.1.0/24')

    def test_to_subnet(self):
        result = to_subnet('192.168.1.1', '255.255.255.255')
        self.assertEqual(result, '192.168.1.1/32')

    def test_to_subnet(self):
        result = to_subnet('192.168.1.1', '255.255.255.0', True)
        self.assertEqual(result, '192.168.1.0 255.255.255.0')

    def test_to_subnet(self):
        result = to_subnet('192.168.1.1', '255.255.255.255', True)
        self.assertEqual(result, '192.168.1.1 255.255.255.255')

    def test_to_subnet(self):
        result = to_subnet('192.168.1.1', '32')
        self.assertEqual(result, '192.168.1.1/32')

    def test_to_subnet(self):
        result = to_subnet('192.168.1.1', '32', True)
        self.assertEqual(result, '192.168.1.1 255.255.255.255')

    def test_to_subnet(self):
        result = to_subnet('192.168.1.1', '33')
        self.assertRaises(ValueError)

    def test_to_subnet(self):
        result = to_subnet('192.168.1.1', '33', True)
        self.assertRaises(ValueError)

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