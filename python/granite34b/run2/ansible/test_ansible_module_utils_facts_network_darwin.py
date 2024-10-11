import unittest
from ansible.module_utils.facts.network.darwin import DarwinNetwork, DarwinNetworkCollector


class TestDarwinNetwork(unittest.TestCase):
    def test_parse_media_line(self):
        current_if = {}
        words = ['media', 'media_select', 'media_type']
        ips = []
        DarwinNetwork.parse_media_line(self, words, current_if, ips)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'media_select')
        self.assertEqual(current_if['media_type'], 'media_typ')

class TestDarwinNetworkCollector(unittest.TestCase):
    def test_init(self):
        DarwinNetworkCollector()

if __name__ == '__main__':
    unittest.main()