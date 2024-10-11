import unittest
from ansible.module_utils.facts.network.darwin import *



class TestDarwinNetwork(unittest.TestCase):
    def test_parse_media_line(self):
        words = ['media:', 'Unknown', '<unknown', 'type>']
        current_if = {'media': 'Unknown'}
        ips = []
        instance = DarwinNetwork(module)
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'unknown type')
        self.assertEqual(current_if['media_options'], None)

    def test_parse_media_line_2(self):
        words = ['media:', 'Unknown', '1000baseT', '(1Gb)', 'full', 'dup', 'flow']
        current_if = {'media': 'Unknown'}
        ips = []
        instance = DarwinNetwork(module)
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], '1000baseT')
        self.assertEqual(current_if['media_type'], '1Gb')
        self.assertEqual(current_if['media_options'], ['full', 'dup', 'flow'])

    def test_parse_media_line_3(self):
        words = ['media:', 'autoselect', '1000baseT', '(1Gb)', 'full', 'dup', 'flow']
        current_if = {'media': 'Unknown'}
        ips = []
        instance = DarwinNetwork(module)
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'autoselect')
        self.assertEqual(current_if['media_type'], '1Gb')
        self.assertEqual(current_if['media_options'], ['full', 'dup', 'flow'])

    def test_parse_media_line_4(self):
        words = ['media:', 'autoselect', '1000baseT', '(1Gb)', 'full', 'dup', 'flow', 'active']
        current_if = {'media': 'Unknown'}
        ips = []
        instance = DarwinNetwork(module)
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'autoselect')
        self.assertEqual(current_if['media_type'], '1Gb')
        self.assertEqual(current_if['media_options'], ['full', 'dup', 'flow', 'active'])

    def test_parse_media_line_5(self):
        words = ['media:', 'autoselect', '1000baseT', '(1Gb)', 'full', 'dup', 'flow', 'active', '1000baseT', '(1Gb)']
        current_if = {'media': 'Unknown'}
        ips = []
        instance = DarwinNetwork(module=module)
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'autoselect')
        self.assertEqual(current_if['media_type'], '1Gb')
        self.assertEqual(current_if['media_options'], ['full', 'dup', 'flow', 'active', '1000baseT', '(1Gb)'])

if __name__ == '__main__':
    unittest.main()