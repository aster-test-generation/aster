from ansible.plugins.lookup.first_found import first_foun
import unittest
from ansible.plugins.lookup.first_found import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_init(self):
        lookup = LookupModule()
        self.assertIsInstance(lookup, LookupModule)

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
        terms = [{'file1': 'path1'}, {'file2': 'path2'}]
        variables = {}
        kwargs = {}
        result, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['path1', 'path2'])
        self.assertFalse(skip)

    def test_process_terms_with_sequence(self):
        lookup = LookupModule()
        terms = [['file1', 'file2'], ['file3', 'file4']]
        variables = {}
        kwargs = {}
        result, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['file1', 'file2', 'file3', 'file4'])
        self.assertFalse(skip)

    def test_process_terms_with_invalid_term(self):
        lookup = LookupModule()
        terms = 123
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleLookupError):
            lookup._process_terms(terms, variables, kwargs)

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

    def test_str(self):
        lookup = LookupModule()
        self.assertEqual(str(lookup), 'LookupModule')

    def test_repr(self):
        lookup = LookupModule()
        self.assertEqual(repr(lookup), 'LookupModule()')

if __name__ == '__main__':
    unittest.main()