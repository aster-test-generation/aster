import unittest
from ansible.module_utils.facts.network.darwin import DarwinNetwork, DarwinNetworkCollector


class TestDarwinNetwork(unittest.TestCase):
    def test_parse_media_line(self):
        current_if = {}
        ips = []
        darwin_network = DarwinNetwork(module=None)
        darwin_network.parse_media_line(['auto', 'en0', 'ether', '02:00:00:00:00:00', 'media: Ethernet 10baseT <full-duplex>'], current_if, ips)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'en0')
        self.assertEqual(current_if['media_type'], 'Ethernet 10baseT')
        self.assertEqual(current_if['media_options'], ['full-duplex'])

class TestDarwinNetworkCollector(unittest.TestCase):
    def test_get_network_data(self):
        darwin_network_collector = DarwinNetworkCollector()
        network_data = darwin_network_collector.get_network_data()
        self.assertIsNotNone(network_data)

if __name__ == '__main__':
    unittest.main()