import unittest
from ansible.module_utils.facts.network.hpux import HPUXNetwork, HPUXNetworkCollector


class TestHPUXNetwork(unittest.TestCase):
    def test_populate(self):
        network = HPUXNetwork()
        network_facts = network.populate()
        self.assertIsInstance(network_facts, dict)

    def test_get_default_interfaces(self):
        network = HPUXNetwork()
        default_interfaces = network.get_default_interfaces()
        self.assertIsInstance(default_interfaces, dict)

    def test_get_interfaces_info(self):
        network = HPUXNetwork()
        interfaces = network.get_interfaces_info()
        self.assertIsInstance(interfaces, dict)

    def test__init__(self):
        network = HPUXNetwork()
        self.assertEqual(network.platform, 'HP-UX')

    def test__str__(self):
        network = HPUXNetwork()
        self.assertEqual(str(network), 'HPUXNetwork')

    def test__repr__(self):
        network = HPUXNetwork()
        self.assertEqual(repr(network), 'HPUXNetwork()')

class TestHPUXNetworkCollector(unittest.TestCase):
    def test__init__(self):
        collector = HPUXNetworkCollector()
        self.assertEqual(collector._fact_class, HPUXNetwork)
        self.assertEqual(collector._platform, 'HP-UX')

    def test_get_fact_class(self):
        collector = HPUXNetworkCollector()
        self.assertEqual(collector.get_fact_class(), HPUXNetwork)

    def test_get_platform(self):
        collector = HPUXNetworkCollector()
        self.assertEqual(collector.get_platform(), 'HP-UX')

if __name__ == '__main__':
    unittest.main()