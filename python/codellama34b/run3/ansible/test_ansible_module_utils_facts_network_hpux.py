import unittest
from ansible.module_utils.facts.network.hpux import *


class TestHPUXNetwork(unittest.TestCase):
    def test_populate(self):
        instance = HPUXNetwork(module)
        result = instance.populate()
        self.assertIsInstance(result, dict)

    def test_get_default_interfaces(self):
        instance = HPUXNetwork(module)
        result = instance.get_default_interfaces()
        self.assertIsInstance(result, dict)

    def test_get_interfaces_info(self):
        instance = HPUXNetwork(module)
        result = instance.get_interfaces_info()
        self.assertIsInstance(result, dict)

class TestHPUXNetworkCollector(unittest.TestCase):
    def test_fact_class(self):
        instance = HPUXNetworkCollector()
        result = instance._fact_class
        self.assertEqual(result, HPUXNetwork)

    def test_platform(self):
        instance = HPUXNetworkCollector()
        result = instance._platform
        self.assertEqual(result, 'HP-UX')

if __name__ == '__main__':
    unittest.main()