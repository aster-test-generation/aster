import unittest
from ansible.module_utils.facts.network.darwin import DarwinNetwork, DarwinNetworkCollector


class TestDarwinNetwork(unittest.TestCase):
    def test_parse_media_line(self):
        instance = DarwinNetwork()
        words = ['media', '<unknown', 'type>']
        current_if = {}
        ips = []
        instance.parse_media_line(words, current_if, ips)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'unknown type')

    def test_parse_media_line_with_options(self):
        instance = DarwinNetwork()
        words = ['media', '<unknown', 'type>', 'options']
        current_if = {}
        ips = []
        instance.parse_media_line(words, current_if, ips)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'unknown type')
        self.assertEqual(current_if['media_options'], 'options')

    def test_get_options(self):
        instance = DarwinNetwork()
        words = ['options', 'value']
        result = instance.get_options(words[1])
        self.assertEqual(result, 'value')

    def test___init__(self):
        instance = DarwinNetwork()
        self.assertIsInstance(instance, DarwinNetwork)

    def test___str__(self):
        instance = DarwinNetwork()
        result = instance.__str__()
        self.assertEqual(result, 'DarwinNetwork')

    def test___repr__(self):
        instance = DarwinNetwork()
        result = instance.__repr__()
        self.assertEqual(result, 'DarwinNetwork()')

class TestDarwinNetworkCollector(unittest.TestCase):
    def test___init__(self):
        instance = DarwinNetworkCollector()
        self.assertIsInstance(instance, DarwinNetworkCollector)

    def test_fact_class(self):
        instance = DarwinNetworkCollector()
        self.assertEqual(instance._fact_class, DarwinNetwork)

    def test_platform(self):
        instance = DarwinNetworkCollector()
        self.assertEqual(instance._platform, 'Darwin')

    def test___str__(self):
        instance = DarwinNetworkCollector()
        result = instance.__str__()
        self.assertEqual(result, 'DarwinNetworkCollector')

    def test___repr__(self):
        instance = DarwinNetworkCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'DarwinNetworkCollector()')

if __name__ == '__main__':
    unittest.main()