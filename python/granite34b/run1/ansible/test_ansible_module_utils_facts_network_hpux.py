import unittest
from ansible.module_utils.facts.network.hpux import HPUXNetwork, HPUXNetworkCollector


class TestHPUXNetwork(unittest.TestCase):
    def test_populate(self):
        network = HPUXNetwork()
        network_facts = network.populate()
        self.assertIsInstance(network_facts, dict)

    def test_get_default_interfaces(self):
        network = HPUXNetwork()
        default_interfaces_facts = network.get_default_interfaces()
        self.assertIsInstance(default_interfaces_facts, dict)

    def test_get_interfaces_info(self):
        network = HPUXNetwork()
        interfaces = network.get_interfaces_info()
        self.assertIsInstance(interfaces, dict)

class TestHPUXNetworkCollector(unittest.TestCase):
    def test_populate(self):
        collector = HPUXNetworkCollector()
        network_facts = collector.populate()
        self.assertIsInstance(network_facts, dict)

if __name__ == '__main__':
    unittest.main()