import unittest
from ansible.module_utils.basic import AnsibleModule, missing_required_li


class TestLookupModule(unittest.TestCase):
    def test__split_on(self):
        lookup = LookupModule()
        result = lookup._split_on('a,b,c', ',')
        self.assertEqual(result, ['a', 'b', 'c'])

    def test__process_terms(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {}
        kwargs = {}
        result, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['a', 'b', 'c'])
        self.assertFalse(skip)

    def test__process_terms_with_mapping(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}]
        variables = {}
        kwargs = {}
        result, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, [])
        self.assertFalse(skip)

    def test__process_terms_with_sequence(self):
        lookup = LookupModule()
        terms = [['a', 'b', 'c']]
        variables = {}
        kwargs = {}
        result, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['a', 'b', 'c'])
        self.assertFalse(skip)

    def test__process_terms_with_string(self):
        lookup = LookupModule()
        terms = 'a,b,c'
        variables = {}
        kwargs = {}
        result, skip = lookup._process_terms(terms, variables, kwargs)
        self.assertEqual(result, ['a', 'b', 'c'])
        self.assertFalse(skip)

    def test_run(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {}
        kwargs = {}
        result = lookup.run(terms, variables, **kwargs)
        self.assertEqual(result, [])

    def test_run_with_file_found(self):
        lookup = LookupModule()
        terms = ['a']
        variables = {}
        kwargs = {}
        result = lookup.run(terms, variables, **kwargs)
        self.assertEqual(result, ['a'])

    def test_run_with_file_not_found(self):
        lookup = LookupModule()
        terms = ['a']
        variables = {}
        kwargs = {}
        result = lookup.run(terms, variables, **kwargs)
        self.assertEqual(result, [])

    def test_run_with_skip(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {}
        kwargs = {'skip': True}
        result = lookup.run(terms, variables, **kwargs)
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()