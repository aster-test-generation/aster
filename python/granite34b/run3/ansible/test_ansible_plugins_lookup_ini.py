import configparser
import unittest
from ansible.plugins.lookup.ini import LookupModule


class TestIniLookup(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()
        self.lookup.cp = configparser.ConfigParser()
        self.lookup.cp.add_section('section1')
        self.lookup.cp.set('section1', 'key1', 'value1')
        self.lookup.cp.set('section1', 'key2', 'value2')
        self.lookup.cp.add_section('section2')
        self.lookup.cp.set('section2', 'key3', 'value3')
        self.lookup.cp.set('section2', 'key4', 'value4')

    def test_get_value(self):
        self.assertEqual(self.lookup.get_value('key1', 'section1', None, False), 'value1')
        self.assertEqual(self.lookup.get_value('key2', 'section1', None, False), 'value2')
        self.assertEqual(self.lookup.get_value('key3', 'section2', None, False), 'value3')
        self.assertEqual(self.lookup.get_value('key4', 'section2', None, False), 'value4')

    def test_run(self):
        terms = ['key1', 'section1', 'key3', 'section2']
        result = self.lookup._load_name(terms)
        self.assertEqual(result, ['value1', 'value2', 'value3', 'value4'])

if __name__ == '__main__':
    unittest.main()