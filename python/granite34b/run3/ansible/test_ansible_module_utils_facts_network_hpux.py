import unittest
from ansible.module_utils.facts.network.hpux import HPUXNetwork, HPUXNetworkCollector


class TestHPUXNetwork(unittest.TestCase):
    def test_populate(self):
        network = HPUXNetwork(module=None)
        network_facts = network.populate()
        self.assertIsInstance(network_facts, dict)

    def test_get_default_interfaces(self):
        network = HPUXNetwork(module=module)
        default_interfaces = network.get_default_interfaces()
        self.assertIsInstance(default_interfaces, dict)

    def test_get_interfaces_info(self):
        network = HPUXNetwork(module=None)
        interfaces = network.get_interfaces_info()
        self.assertIsInstance(interfaces, dict)

class TestHPUXNetworkCollector(unittest.TestCase):
    def test_populate(self):
        collector = HPUXNetworkCollector()
        network_facts = collector.populate().data
        self.assertIsInstance(network_facts, dict)

if __name__ == '__main__':
    unittest.main()