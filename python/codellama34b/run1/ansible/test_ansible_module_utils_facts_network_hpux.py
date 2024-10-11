import unittest
from ansible.module_utils.facts.network.hpux import *


class TestHPUXNetwork(unittest.TestCase):
    def test_populate(self):
        network = HPUXNetwork(module)
        network_facts = network.populate()
        self.assertIsInstance(network_facts, dict)

    def test_get_default_interfaces(self):
        network = HPUXNetwork(module)
        default_interfaces = network.get_default_interfaces()
        self.assertIsInstance(default_interfaces, dict)

    def test_get_interfaces_info(self):
        network = HPUXNetwork(module)
        interfaces = network.get_interfaces_info()
        self.assertIsInstance(interfaces, dict)

class TestHPUXNetworkCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = HPUXNetworkCollector()
        self.assertEqual(collector._fact_class, HPUXNetwork)

    def test_platform(self):
        collector = HPUXNetworkCollector()
        self.assertEqual(collector._platform, 'HP-UX')

if __name__ == '__main__':
    unittest.main()