import unittest
from ansible.module_utils.facts.network.darwin import DarwinNetwork, DarwinNetworkCollector


class TestDarwinNetwork(unittest.TestCase):
    def test_parse_media_line(self):
        collector = DarwinNetworkCollector()
        network = DarwinNetwork()
        words = ['media', 'eth0', '<unknown type>']
        current_if = {}
        network.parse_media_line(words, current_if, [])
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'eth0')
        self.assertEqual(current_if['media_type'], 'unknown type')

    def test_get_options(self):
        collector = DarwinNetworkCollector()
        network = DarwinNetwork()
        options = network.get_options('options')
        self.assertEqual(options, [])

    def test_str_method(self):
        collector = DarwinNetworkCollector()
        network = DarwinNetwork()
        result = str(network)
        self.assertEqual(result, 'DarwinNetwork')

    def test_repr_method(self):
        collector = DarwinNetworkCollector()
        network = DarwinNetwork()
        result = repr(network)
        self.assertEqual(result, 'DarwinNetwork()')

class TestDarwinNetworkCollector(unittest.TestCase):
    def test_init_method(self):
        collector = DarwinNetworkCollector()
        self.assertEqual(collector._fact_class, DarwinNetwork)
        self.assertEqual(collector._platform, 'Darwin')

    def test_str_method(self):
        collector = DarwinNetworkCollector()
        result = str(collector)
        self.assertEqual(result, 'DarwinNetworkCollector')

    def test_repr_method(self):
        collector = DarwinNetworkCollector()
        result = repr(collector)
        self.assertEqual(result, 'DarwinNetworkCollector()')

if __name__ == '__main__':
    unittest.main()