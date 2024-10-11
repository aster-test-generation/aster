import unittest
from ansible.module_utils.facts.network.darwin import DarwinNetwork, DarwinNetworkCollector


class TestDarwinNetwork(unittest.TestCase):
    def setUp(self):
        self.darwin_network = DarwinNetwork(None)

    def test_parse_media_line_basic(self):
        current_if = {}
        words = ['media:', '1000baseT', 'full-duplex']
        ips = []
        self.darwin_network.parse_media_line(words, current_if, ips)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], '1000baseT')
        self.assertEqual(current_if['media_type'], 'full-duplex')

    def test_parse_media_line_unknown_type(self):
        current_if = {}
        words = ['media:', '<unknown', 'type>']
        ips = []
        self.darwin_network.parse_media_line(words, current_if, ips)
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'unknown type')

    def test_parse_media_line_with_options(self):
        current_if = {}
        words = ['media:', '1000baseT', 'full-duplex', 'options=flowcontrol']
        ips = []
        self.darwin_network.parse_media_line(words, current_if, ips)
        self.assertEqual(current_if['media_options'], ['flowcontrol'])

    def test_parse_media_line_no_options(self):
        current_if = {}
        words = ['media:', '1000baseT']
        ips = []
        self.darwin_network.parse_media_line(words, current_if, ips)
        self.assertNotIn('media_options', current_if)

class TestDarwinNetworkCollector(unittest.TestCase):
    def setUp(self):
        self.collector = DarwinNetworkCollector(None)

    def test_fact_class(self):
        self.assertEqual(self.collector._fact_class, DarwinNetwork)

    def test_platform(self):
        self.assertEqual(self.collector._platform, 'Darwin')

if __name__ == '__main__':
    unittest.main()