import unittest
from ansible.module_utils.facts.network.darwin import DarwinNetwork, DarwinNetworkCollector


class TestDarwinNetwork(unittest.TestCase):
    def test_parse_media_line(self):
        network = DarwinNetwork(module=None)
        current_if = {}
        words = ['media', 'select', 'type']
        network.parse_media_line(words, current_if)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'select')
        self.assertEqual(current_if['media_type'], 'type')

class TestDarwinNetworkCollector(unittest.TestCase):
    def test_init(self):
        collector = DarwinNetworkCollector()
        self.assertEqual(collector._fact_class, DarwinNetwork)
        self.assertEqual(collector._platform, 'Darwin')

if __name__ == '__main__':
    unittest.main()