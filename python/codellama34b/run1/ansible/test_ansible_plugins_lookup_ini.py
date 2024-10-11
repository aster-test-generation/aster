import unittest
from ansible.plugins.lookup import ini


class TestLookupModule(unittest.TestCase):
    def test_get_value(self):
        instance = LookupModule()
        result = instance.get_value('key', 'section', 'dflt', 'is_regexp')
        self.assertEqual(result, 'value')

    def test_run(self):
        instance = LookupModule()
        result = instance.run('terms', 'variables', 'kwargs')
        self.assertEqual(result, ['value'])

if __name__ == '__main__':
    unittest.main()