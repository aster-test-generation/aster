from ansible.module_utils.facts.network.darwin import DarwinNetwork, DarwinNetworkCollector
import unittest


class TestDarwinNetwork(unittest.TestCase):
    def test_parse_media_line(self):
        instance = DarwinNetwork(module=None)
        current_if = {'media': 'Unknown', 'media_select': 'autoselect', 'media_type': 'unknown type', 'media_options': {}}
        ips = []
        instance.parse_media_line(['autoselect', 'type', 'en0'], current_if, ips)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'type')
        self.assertEqual(current_if['media_type'], 'unknown type')
        self.assertEqual(current_if['media_options'], {})

class TestDarwinNetworkCollector(unittest.TestCase):
    def test_get_network_data(self):
        instance = DarwinNetworkCollector()
        data = instance.get_network_data()
        self.assertIsNotNone(data)

if __name__ == '__main__':
    unittest.main()