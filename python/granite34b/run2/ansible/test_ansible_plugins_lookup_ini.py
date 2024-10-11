import configparser
import unittest
from ansible.plugins.lookup.ini import LookupModule


class TestIniLookup(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()
        self.lookup.cp = configparser.ConfigParser()
        self.lookup.cp.read_string("""
[section1]
key1 = value1
key2 = value2
key3 = value3
""")

    def test_get_value(self):
        self.assertEqual(self.lookup.get_value('key1', 'section1', 'default', False), 'value1')
        self.assertEqual(self.lookup.get_value('key2', 'section1', 'default', False), 'value2')
        self.assertEqual(self.lookup.get_value('key4', 'section1', 'default', False), 'default')

    def test_run(self):
        terms = ['key1', 'key2']
        variables = {}
        kwargs = {}
        result = self.lookup._load_name(terms, variables, **kwargs)
        self.assertEqual(result, ['value1', 'value2'])

if __name__ == '__main__':
    unittest.main()