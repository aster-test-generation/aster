import unittest
from ansible.errors import AnsibleError
from ansible.module_utils._text import to_native
from ansible.module_utils.six import string_types
from ansible.plugins.lookup import LookupBase
from ansible.plugins.lookup.varnames import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        variables = {
            "var1": 1,
            "var2": 2,
            "var3": 3
        }
        terms = ["var1", "var2"]
        lookup = LookupModule()
        result = lookup.run(terms, variables)
        self.assertEqual(result, ["var1", "var2"])

    def test_run_with_invalid_term(self):
        variables = {
            "var1": 1,
            "var2": 2,
            "var3": 3
        }
        terms = [123]
        lookup = LookupModule()
        with self.assertRaises(AnsibleError) as context:
            lookup._load_name(terms, variables)
        self.assertTrue("Invalid setting identifier" in str(context.exception))

    def test_run_with_invalid_search_parameter(self):
        variables = {
            "var1": 1,
            "var2": 2,
            "var3": 3
        }
        terms = ["["]
        lookup = LookupModule()
        with self.assertRaises(AnsibleError) as context:
            lookup._load_name(name)
        self.assertTrue("Unable to use" in str(context.exception))

if __name__ == '__main__':
    unittest.main()