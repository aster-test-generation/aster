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

    def test_str_method(self):
        network = HPUXNetwork()
        result = str(network)
        self.assertEqual(result, "HPUXNetwork")

    def test_repr_method(self):
        network = HPUXNetwork()
        result = repr(network)
        self.assertEqual(result, "HPUXNetwork()")

    def test_eq_method(self):
        network1 = HPUXNetwork()
        network2 = HPUXNetwork()
        self.assertEqual(network1, network2)

class TestHPUXNetworkCollector(unittest.TestCase):
    def test_init_method(self):
        collector = HPUXNetworkCollector()
        self.assertIsInstance(collector, HPUXNetworkCollector)

    def test_fact_class_method(self):
        collector = HPUXNetworkCollector()
        self.assertEqual(collector._fact_class, HPUXNetwork)

    def test_platform_method(self):
        collector = HPUXNetworkCollector()
        self.assertEqual(collector._platform, 'HP-UX')

if __name__ == '__main__':
    unittest.main()