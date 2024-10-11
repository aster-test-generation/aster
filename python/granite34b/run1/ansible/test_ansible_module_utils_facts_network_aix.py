import unittest
from ansible.module_utils.facts.network.aix import AIXNetwork, AIXNetworkCollector


class TestAIXNetwork(unittest.TestCase):
    def test_get_default_interfaces(self):
        network = AIXNetwork(module=None)
        interface = network.get_default_interfaces()
        self.assertEqual(interface, ({'v4': {}, 'v6': {}}, {'v4': {}, 'v6': {}}))

    def test_get_interfaces_info(self):
        network = AIXNetwork(module='test')
        interfaces, ips = network.get_interfaces_info()
        self.assertEqual(interfaces, {})
        self.assertEqual(ips, {'all_ipv4_addresses': [], 'all_ipv6_addresses': []})

class TestAIXNetworkCollector(unittest.TestCase):
    def test_init(self):
        collector = AIXNetworkCollector()
        self.assertEqual(collector._fact_class, AIXNetwork)
        self.assertEqual(collector.platform, 'AIX')

if __name__ == '__main__':
    unittest.main()