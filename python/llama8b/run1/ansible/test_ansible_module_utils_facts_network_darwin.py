import unittest
from ansible.module_utils.facts.network.darwin import DarwinNetwork, DarwinNetworkCollector


class TestDarwinNetwork(unittest.TestCase):
    def test_parse_media_line(self):
        network = DarwinNetwork()
        words = ['media', 'eth0', 'Ethernet', 'full-duplex']
        current_if = {}
        ips = []
        result = network.parse_media_line(words, current_if, ips)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'eth0')
        self.assertEqual(current_if['media_type'], 'Ethernet')
        self.assertEqual(current_if['media_options'], 'full-duplex')

    def test_parse_media_line_unknown_type(self):
        network = DarwinNetwork()
        words = ['media', 'eth0', '<unknown type>']
        current_if = {}
        ips = []
        result = network.parse_media_line(words, current_if, ips)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'eth0')
        self.assertEqual(current_if['media_type'], 'unknown type')

    def test_parse_media_line_multiple_options(self):
        network = DarwinNetwork()
        words = ['media', 'eth0', 'Ethernet', 'full-duplex', 'autonegotiation']
        current_if = {}
        ips = []
        result = network.parse_media_line(words, current_if, ips)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'eth0')
        self.assertEqual(current_if['media_type'], 'Ethernet')
        self.assertEqual(current_if['media_options'], 'full-duplex,autonegotiation')

class TestDarwinNetworkCollector(unittest.TestCase):
    def test_init(self):
        collector = DarwinNetworkCollector()
        self.assertEqual(collector._fact_class, DarwinNetwork)
        self.assertEqual(collector._platform, 'Darwin')

if __name__ == '__main__':
    unittest.main()