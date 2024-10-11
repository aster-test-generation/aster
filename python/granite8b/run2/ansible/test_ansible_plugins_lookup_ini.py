import configparser
import unittest
from ansible.plugins.lookup import LookupModule


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_get_value(self):
        self.lookup.cp = configparser.ConfigParser()
        self.lookup.cp.read_string("""
[section]
key1 = value1
key2 = value2
""")
        self.assertEqual(self.lookup.get_value('key1', 'section', 'default', False), 'value1')
        self.assertEqual(self.lookup.get_value('key2', 'section', 'default', False), 'value2')
        self.assertEqual(self.lookup.get_value('key3', 'section', 'default', False), 'default')

    def test_run(self):
        self.lookup.cp = configparser.ConfigParser()
        self.lookup.cp.read_string("""
[section]
key1 = value1
key2 = value2
""")
        self.assertEqual(self.lookup.run(['key1', 'key2'], {'file': 'test.ini', 'section': 'section', 'default': 'default', 're': False}), ['value1', 'value2'])
        self.assertEqual(self.lookup.run(['key3', 'key4'], {'file': 'test.ini', 'section': 'section', 'default': 'default', 're': False}), ['default', 'default'])

if __name__ == '__main__':
    unittest.main()