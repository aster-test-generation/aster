from ansible.plugins.lookup.first_found import first_foun
import unittest
from ansible.plugins.lookup.first_found import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_process_terms(self):
        lookup = LookupModule()
        terms = ['file1', 'file2']
        variables = {}
        kwargs = {}
        result, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['file1', 'file2'])
        self.assertFalse(skip)

    def test_process_terms_with_mapping(self):
        lookup = LookupModule()
        terms = [{'file': 'file1'}, {'file': 'file2'}]
        variables = {}
        kwargs = {}
        result, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['file1', 'file2'])
        self.assertFalse(skip)

    def test_process_terms_with_sequence(self):
        lookup = LookupModule()
        terms = [{'file': 'file1'}, {'file': 'file2'}]
        variables = {}
        kwargs = {}
        result, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['file1', 'file2'])
        self.assertFalse(skip)

    def test_process_terms_with_string(self):
        lookup = LookupModule()
        terms = 'file1,file2'
        variables = {}
        kwargs = {}
        result, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['file1', 'file2'])
        self.assertFalse(skip)

    def test_process_terms_with_skip(self):
        lookup = LookupModule()
        terms = ['file1', 'file2']
        variables = {}
        kwargs = {'skip': True}
        result, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, [])
        self.assertTrue(skip)

    def test_run(self):
        lookup = LookupModule()
        terms = ['file1', 'file2']
        variables = {}
        kwargs = {}
        result = lookup.run(terms, variables, **kwargs)
        self.assertEqual(result, ['file1'])

    def test_run_with_skip(self):
        lookup = LookupModule()
        terms = ['file1', 'file2']
        variables = {}
        kwargs = {'skip': True}
        result = lookup.run(terms, variables, **kwargs)
        self.assertEqual(result, [])

    def test_run_with_no_file_found(self):
        lookup = LookupModule()
        terms = ['file1', 'file2']
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleLookupError):
            lookup.run(terms, variables, **kwargs)

if __name__ == '__main__':
    unittest.main()