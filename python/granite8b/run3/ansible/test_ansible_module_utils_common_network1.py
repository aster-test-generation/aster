import unittest
from ansible.module_utils.common.network import *

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

if __name__ == '__main__':
    unittest.main()