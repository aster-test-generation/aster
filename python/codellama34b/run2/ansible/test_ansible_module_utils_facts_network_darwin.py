import unittest
from ansible.module_utils.facts.network.darwin import *



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
        instance = DarwinNetwork(module)
        words = ['media:', 'Unknown', 'type']
        current_if = {}
        ips = []
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'type')
        self.assertEqual(current_if['media_options'], None)

    def test_parse_media_line_3(self):
        instance = DarwinNetwork(module)
        words = ['media:', 'Unknown', 'type', 'options']
        current_if = {}
        ips = []
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'type')
        self.assertEqual(current_if['media_options'], 'options')

    def test_parse_media_line_4(self):
        instance = DarwinNetwork(module)
        words = ['media:', 'Unknown', 'type', 'options', 'more']
        current_if = {}
        ips = []
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'type')
        self.assertEqual(current_if['media_options'], 'options')

    def test_parse_media_line_5(self):
        instance = DarwinNetwork(module)
        words = ['media:', 'Unknown', 'type', 'options', 'more', 'words']
        current_if = {}
        ips = []
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'type')
        self.assertEqual(current_if['media_options'], 'options')

    def test_parse_media_line_6(self):
        instance = DarwinNetwork(module=module)
        words = ['media:', 'Unknown', 'type', 'options', 'more', 'words', 'and', 'more']
        current_if = {}
        ips = []
        result = instance.parse_media_line(words, current_if, ips)
        self.assertEqual(result, None)
        self.assertEqual(current_if['media'], 'Unknown')
        self.assertEqual(current_if['media_select'], 'Unknown')
        self.assertEqual(current_if['media_type'], 'type')
        self.assertEqual(current_if['media_options'], 'options')

if __name__ == '__main__':
    unittest.main()