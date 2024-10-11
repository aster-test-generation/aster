import unittest
from ansible.module_utils.facts.network.darwin import DarwinNetwork, DarwinNetworkCollector


class TestDarwinNetwork(unittest.TestCase):
    def test_parse_media_line(self):
        instance = DarwinNetwork(module)
        current_if = {}
        ips = []
        instance.parse_media_line(['auto', 'en0', 'ether', '0a:55:0a:55:0a'], current_if, ips)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'auto')
        self.assertEqual(current_if['media_type'], 'ether')
        self.assertEqual(current_if['media_options'], {'ether': '0a:55:0a:55:0a'})

class TestDarwinNetworkCollector(unittest.TestCase):
    def test_get_network_data(self):
        instance = DarwinNetworkCollector()
        facts = instance.get_facts()
        self.assertIn('interfaces', facts)
        self.assertIn('ansible_default_ipv4', facts)
        self.assertIn('ansible_default_ipv6', facts)

if __name__ == '__main__':
    unittest.main()