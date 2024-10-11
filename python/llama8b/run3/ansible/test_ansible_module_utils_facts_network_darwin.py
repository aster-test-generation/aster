import unittest
from ansible.module_utils.facts.network.darwin import DarwinNetwork, DarwinNetworkCollector


class TestDarwinNetwork(unittest.TestCase):
    def test_init(self):
        instance = DarwinNetwork()
        self.assertEqual(instance.platform, 'Darwin')

    def test_parse_media_line(self):
        instance = DarwinNetwork()
        words = ['media', 'eth0', '<unknown type>']
        current_if = {}
        ips = []
        instance.parse_media_line(words, current_if, ips)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'eth0')
        self.assertEqual(current_if['media_type'], 'unknown type')

    def test_get_options(self):
        instance = DarwinNetwork()
        options = instance.get_options('options')
        self.assertEqual(options, [])

    def test_str_method(self):
        instance = DarwinNetwork()
        result = str(instance)
        self.assertEqual(result, 'DarwinNetwork')

    def test_repr_method(self):
        instance = DarwinNetwork()
        result = repr(instance)
        self.assertEqual(result, 'DarwinNetwork()')

class TestDarwinNetworkCollector(unittest.TestCase):
    def test_init(self):
        instance = DarwinNetworkCollector()
        self.assertEqual(instance._fact_class, DarwinNetwork)
        self.assertEqual(instance._platform, 'Darwin')

    def test_get_fact_class(self):
        instance = DarwinNetworkCollector()
        result = instance.get_fact_class()
        self.assertEqual(result, DarwinNetwork)

    def test_get_platform(self):
        instance = DarwinNetworkCollector()
        result = instance.get_platform()
        self.assertEqual(result, 'Darwin')

if __name__ == '__main__':
    unittest.main()