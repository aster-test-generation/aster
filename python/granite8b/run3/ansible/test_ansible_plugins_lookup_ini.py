import unittest
from ansible.plugins.lookup import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_get_value(self):
        lookup = LookupModule()
        self.assertEqual(lookup.get_value('key', 'section', 'default', False), 'default')
        self.assertEqual(lookup.get_value('key', 'section', 'default', True), [])

    def test_run(self):
        lookup = LookupModule()
        self.assertEqual(lookup.run(['key=value'], {}, file='file.ini', section='section'), ['value'])
        self.assertEqual(lookup.run(['key'], {}, file='file.ini', section='section', default='default'), ['default'])
        self.assertEqual(lookup.run(['key'], {}, file='file.ini', section='section', re=True), [])

if __name__ == '__main__':
    unittest.main()