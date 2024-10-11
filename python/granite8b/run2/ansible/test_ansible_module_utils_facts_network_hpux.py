import unittest
from ansible.module_utils.facts.network.hpux import HPUXNetwork, HPUXNetworkCollector


class TestHPUXNetwork(unittest.TestCase):
    def test_populate(self):
        network = HPUXNetwork(module=None)
        result = network.populate()
        self.assertIsInstance(result, dict)
        self.assertIn('interfaces', result)
        self.assertIn('default_interface', result)
        self.assertIn('default_gateway', result)

    def test_get_default_interfaces(self):
        network = HPUXNetwork(module=None)
        result = network.get_default_interfaces()
        self.assertIsInstance(result, dict)
        self.assertIn('default_interface', result)
        self.assertIn('default_gateway', result)

    def test_get_interfaces_info(self):
        network = HPUXNetwork(module=None)
        result = network.get_interfaces_info()
        self.assertIsInstance(result, dict)
        self.assertIn('lan0', result)
        self.assertIn('device', result['lan0'])
        self.assertIn('ipv4', result['lan0'])
        self.assertIn('address', result['lan0']['ipv4'])
        self.assertIn('network', result['lan0']['ipv4'])
        self.assertIn('interface', result['lan0']['ipv4'])

class TestHPUXNetworkCollector(unittest.TestCase):
    def test_collect(self):
        collector = HPUXNetworkCollector(module=None)
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('ansible_net_interfaces', result)
        self.assertIn('ansible_default_ipv4', result)

if __name__ == '__main__':
    unittest.main()