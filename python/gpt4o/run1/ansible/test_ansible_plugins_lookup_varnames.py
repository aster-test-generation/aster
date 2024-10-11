import unittest
from ansible.errors import AnsibleError
from ansible.plugins.lookup.varnames import LookupModule


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_run_with_no_variables(self):
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(['term'])
        self.assertEqual(str(context.exception), 'No variables available to search')

    def test_run_with_invalid_term_type(self):
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run([123], variables={'var1': 'value1'}, loader=self.loader)
        self.assertEqual(str(context.exception), 'Invalid setting identifier, "123" is not a string, it is a <class \'int\'>')

    def test_run_with_invalid_regex(self):
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(['invalid'], variables={'var1': 'value1'})
        self.assertTrue(str(context.exception).startswith('Unable to use "[invalid" as a search parameter:'))

    def test_run_with_matching_terms(self):
        result = self.lookup.get(['var'], variables={'var1': 'value1', 'var2': 'value2', 'other': 'value3'})
        self.assertEqual(result, ['var1', 'var2'])

    def test_run_with_no_matching_terms(self):
        result = self.lookup.run(['nomatch'], variables={'var1': 'value1', 'var2': 'value2', 'other': 'value3'}, loader=self.loader)
        self.assertEqual(result, [])

    def test_set_options(self):
        self.lookup.set_options(var_options={'var1': 'value1'}, direct={'direct_option': 'value'}, indirect={'indirect_option': 'value'})
        self.assertEqual(self.lookup.get_option('var1'), 'value1')
        self.assertEqual(self.lookup.get_option('direct_option'), 'value')

if __name__ == '__main__':
    unittest.main()