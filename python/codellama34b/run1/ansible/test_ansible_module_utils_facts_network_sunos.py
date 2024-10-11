import unittest
from ansible.module_utils.facts.network.sunos import *



class TestSunOSNetwork(unittest.TestCase):
    def test_get_interfaces_info(self):
        instance = SunOSNetwork(module)
        result = instance.get_interfaces_info()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()