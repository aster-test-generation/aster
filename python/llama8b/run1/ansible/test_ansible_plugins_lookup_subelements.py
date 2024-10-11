import unittest
from ansible.module_utils.basic import AnsibleModule, env_fallbac
from ansible.module_utils.six import string_types
from ansible.module_utils.parsing.convert_bool import boolean
from ansible.utils.listify import listify_lookup_plugin_terms
from ansible.errors import AnsibleError
from ansible.plugins.lookup.subelements import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = [['a', 'b', 'c'], {'d': 'e'}, {'skipped': False}]
        variables = {}
        result = lookup.run(terms, variables)
        self.assertEqual(result, [])

    def test_run_terms_error(self):
        lookup = LookupModule()
        terms = ['a', 'b']
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error2(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c']
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error3(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': 'd'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error4(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': 'd', 'e': 'f'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error5(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': 'd', 'e': 'f', 'g': 'h'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error6(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': 'd', 'e': 'f', 'g': 'h', 'i': 'j'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error7(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': 'd', 'e': 'f', 'g': 'h', 'i': 'j', 'k': 'l'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error8(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': 'd', 'e': 'f', 'g': 'h', 'i': 'j', 'k': 'l', 'm': 'n'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error9(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': 'd', 'e': 'f', 'g': 'h', 'i': 'j', 'k': 'l', 'm': 'n', 'o': 'p'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error10(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': 'd', 'e': 'f', 'g': 'h', 'i': 'j', 'k': 'l', 'm': 'n', 'o': 'p', 'q': 'r'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error11(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': 'd', 'e': 'f', 'g': 'h', 'i': 'j', 'k': 'l', 'm': 'n', 'o': 'p', 'q': 'r', 's': 't'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

if __name__ == '__main__':
    unittest.main()