from ansible.errors import AnsibleError
import unittest
from ansible.plugins.lookup.varnames import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run_method(self):
        lookup = LookupModule()
        result = lookup.run(['test'], {'test': 'value'})
        self.assertEqual(result, ['test'])

    def test_run_method_with_regex(self):
        lookup = LookupModule()
        result = lookup.run(['^t'], {'test': 'value'})
        self.assertEqual(result, ['test'])

    def test_run_method_with_invalid_regex(self):
        lookup = LookupModule()
        with self.assertRaises(AnsibleError):
            lookup.run(['['], {})

    def test_run_method_with_no_variables(self):
        lookup = LookupModule()
        with self.assertRaises(AnsibleError):
            lookup.run(['test'], {})

    def test_run_method_with_invalid_term(self):
        lookup = LookupModule()
        with self.assertRaises(AnsibleError):
            lookup.run([123], {'test': 'value'})

if __name__ == '__main__':
    unittest.main()