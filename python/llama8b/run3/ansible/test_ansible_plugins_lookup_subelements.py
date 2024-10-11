from ansible.plugins.lookup.subelements import subelement
import unittest
from ansible.plugins.lookup import LookupBase
from ansible.module_utils.six import string_types
from ansible.module_utils.parsing.convert_bool import boolean
from ansible.utils.listify import listify_lookup_plugin_terms
from ansible.plugins.lookup.subelements import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {}
        kwargs = {}
        result = lookup.run(terms, variables, **kwargs)
        self.assertEqual(result, [])

    def test_run_terms_error(self):
        lookup = LookupModule()
        terms = ['a']
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables, **kwargs)

    def test_run_terms_error_msg(self):
        lookup = LookupModule()
        terms = ['a', 'b']
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError) as e:
            lookup.run(terms, variables, **kwargs)
        self.assertEqual(str(e.exception), "subelements lookup expects a list of two or three items, ")

    def test_run_terms_error_dict(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c']
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables, **kwargs)

    def test_run_terms_error_string(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c', 'd']
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables, **kwargs)

    def test_run_terms_error_flags(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c', {'skip_missing': 'not a boolean'}]
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables, **kwargs)

    def test_run_terms_error_flags_keys(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c', {'skip_missing': 'not in FLAGS'}]
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables, **kwargs)

    def test_run_terms_error_flags_values(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c', {'skip_missing': 'not a boolean', 'not_in_FLAGS': 'value'}]
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables, **kwargs)

    def test_run_terms_error_flags_type(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c', {'skip_missing': 123}]
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables, **kwargs)

    def test_run_terms_error_flags_type2(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c', {'skip_missing': 'not a boolean', 'not_in_FLAGS': 123}]
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables, **kwargs)

    def test_run_terms_error_flags_type3(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c', {'skip_missing': 'not a boolean', 'not_in_FLAGS': {'not a dict'}}]
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables, **kwargs)

    def test_run_terms_error_flags_type4(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c', {'skip_missing': 'not a boolean', 'not_in_FLAGS': [1, 2, 3]}]
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables, **kwargs)

    def test_run_terms_error_flags_type5(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c', {'skip_missing': 'not a boolean', 'not_in_FLAGS': {'a': 1, 'b': 2}}]
        variables = {}
        kwargs = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables, **kwargs)

if __name__ == '__main__':
    unittest.main()