import unittest
from ansible.plugins.lookup import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_process_terms(self):
        lookup = LookupModule()
        terms = ['file1.txt', 'file2.txt']
        variables = {'var1': 'value1', 'var2': 'value2'}
        kwargs = {'key1': 'value1', 'key2': 'value2'}
        total_search, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(total_search, ['file1.txt', 'file2.txt'])
        self.assertFalse(skip)

    def test_run(self):
        lookup = LookupModule()
        terms = ['file1.txt', 'file2.txt']
        variables = {'var1': 'value1', 'var2': 'value2'}
        kwargs = {'key1': 'value1', 'key2': 'value2'}
        path = lookup.run(terms, variables, **kwargs)
        self.assertEqual(path, ['file1.txt', 'file2.txt'])

if __name__ == '__main__':
    unittest.main()