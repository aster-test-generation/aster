import unittest
from ansible.module_utils.facts.network.hpux import HPUXNetwork, HPUXNetworkCollector


class TestHPUXNetwork(unittest.TestCase):
    def test_populate(self):
        network = HPUXNetwork(module=None)
        result = network.populate()
        self.assertIsInstance(result, dict)

    def test_get_default_interfaces(self):
        network = HPUXNetwork(module=None)
        result = network.get_default_interfaces()
        self.assertIsInstance(result, dict)

    def test_get_interfaces_info(self):
        network = HPUXNetwork(module=None)
        result = network.get_interfaces_info()
        self.assertIsInstance(result, dict)

class TestHPUXNetworkCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = HPUXNetworkCollector(module=None)
        self.assertEqual(collector._fact_class, HPUXNetwork)

    def test_platform(self):
        collector = HPUXNetworkCollector(module=None)
        self.assertEqual(collector._platform, 'HP-UX')

if __name__ == '__main__':
    unittest.main()