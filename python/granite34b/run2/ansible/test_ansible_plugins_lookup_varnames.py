from ansible.plugins.lookup.varnames import AnsibleError
import unittest
from ansible.plugins.lookup.varnames import LookupModule


class TestLookupModule(unittest.TestCase):
    def test_run_method(self):
        lookup_module = LookupModule()
        variables = {'key1': 'value1', 'key2': 'value2'}
        result = lookup_module._load_name('key1', variables)
        self.assertEqual(result, ['key1'])

    def test_run_method_with_pattern(self):
        lookup_module = LookupModule()
        variables = {'key1': 'value1', 'key2': 'value2'}
        result = lookup_module._load_name('k.*', variables)
        self.assertEqual(result, ['key1', 'key2'])

    def test_run_method_with_invalid_term(self):
        lookup_module = LookupModule()
        variables = {'key1': 'value1', 'key2': 'value2'}
        with self.assertRaises(AnsibleError) as context:
            lookup_module._load_name([123], variables)
        self.assertTrue('Invalid setting identifier' in str(context.exception))

    def test_run_method_with_invalid_pattern(self):
        lookup_module = LookupModule()
        variables = {'key1': 'value1', 'key2': 'value2'}
        with self.assertRaises(AnsibleError) as context:
            lookup_module.run(['['], variables)
        self.assertTrue('Unable to use' in str(context.exception))

if __name__ == '__main__':
    unittest.main()