
import unittest
from ansible.module_utils.common.network import *

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

if __name__ == '__main__':
    unittest.main()