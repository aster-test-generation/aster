import unittest
from ansible.module_utils.facts.network.darwin import DarwinNetwork, DarwinNetworkCollector



class TestDarwinNetwork(unittest.TestCase):
    def test_parse_media_line(self):
        instance = DarwinNetwork(module)
        words = ['media:', 'Unknown', '<unknown', 'type>']
        current_if = {}
        ips = []
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'unknown type')
        self.assertEqual(current_if['media_options'], None)

    def test_parse_media_line_2(self):
        instance = DarwinNetwork(module=None)
        words = ['media:', 'Unknown', 'Ethernet']
        current_if = {}
        ips = []
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'Ethernet')
        self.assertEqual(current_if['media_options'], None)

    def test_parse_media_line_3(self):
        instance = DarwinNetwork(module)
        words = ['media:', 'Unknown', 'Ethernet', 'autoselect']
        current_if = {}
        ips = []
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'Ethernet')
        self.assertEqual(current_if['media_options'], 'autoselect')

    def test_parse_media_line_4(self):
        instance = DarwinNetwork(module)
        words = ['media:', 'Unknown', 'Ethernet', 'autoselect', '1000baseT']
        current_if = {}
        ips = []
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'Ethernet')
        self.assertEqual(current_if['media_options'], 'autoselect,1000baseT')

    def test_parse_media_line_5(self):
        instance = DarwinNetwork(module)
        words = ['media:', 'Unknown', 'Ethernet', 'autoselect', '1000baseT', 'full-duplex']
        current_if = {}
        ips = []
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'Ethernet')
        self.assertEqual(current_if['media_options'], 'autoselect,1000baseT,full-duplex')

if __name__ == '__main__':
    unittest.main()