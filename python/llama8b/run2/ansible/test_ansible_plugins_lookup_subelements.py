import unittest
from ansible.module_utils.basic import AnsibleModule, env_fallback
from ansible.module_utils.parsing.convert_bool import boolean
from ansible.module_utils.six import string_types
from ansible.module_utils.six.moves import range
from ansible.errors import AnsibleError
from ansible.plugins.lookup.subelements import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = [['a', 'b', 'c'], {'d': 'e', 'f': 'g'}, {'skip_missing': True}]
        variables = {}
        result = lookup.run(terms, variables)
        self.assertEqual(result, [])

    def test_run_terms_error(self):
        lookup = LookupModule()
        terms = ['a', 'b', 'c']
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_first_dict_or_list(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', 'd']
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_second_string(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c']
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_third_dict(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': True, 'd': 'e'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_third_dict_flags(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': True, 'f': 'g'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_third_dict_flags_invalid(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': True, 'f': 'g', 'h': 'i'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_third_dict_flags_invalid2(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': True, 'f': 'g', 'skip_missing': True}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_third_dict_flags_invalid3(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': True, 'f': 'g', 'skip_missing': False}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_third_dict_flags_invalid4(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': True, 'f': 'g', 'skip_missing': 'True'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_third_dict_flags_invalid5(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': True, 'f': 'g', 'skip_missing': 'False'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_third_dict_flags_invalid6(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': True, 'f': 'g', 'skip_missing': 'True'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_third_dict_flags_invalid7(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': True, 'f': 'g', 'skip_missing': 'False'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_terms_error_third_dict_flags_invalid8(self):
        lookup = LookupModule()
        terms = [{'a': 'b'}, 'c', {'skip_missing': True, 'f': 'g', 'skip_missing': 'True'}]
        variables = {}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

if __name__ == '__main__':
    unittest.main()