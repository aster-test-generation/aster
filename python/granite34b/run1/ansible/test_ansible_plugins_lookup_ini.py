import unittest
from ansible.plugins.lookup.ini import LookupModule


class TestIniLookup(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_get_value(self):
        self.assertEqual(self.lookup.get_value('key', 'section', 'default', False), 'value')

    def test_run(self):
        self.assertEqual(self.lookup.run(['term'], None), None)

if __name__ == '__main__':
    unittest.main()