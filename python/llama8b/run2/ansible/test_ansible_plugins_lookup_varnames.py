import unittest
from ansible.module_utils.basic import AnsibleModule, missing_required_li


class TestLookupModule(unittest.TestCase):
    def test_run(self):
        lookup = LookupModule()
        terms = ['test', 'test1']
        variables = {'test': 'value', 'test1': 'value1'}
        result = lookup.run(terms, variables)
        self.assertEqual(result, ['test', 'test1'])

    def test_run_invalid_term(self):
        lookup = LookupModule()
        terms = ['test', 123]
        variables = {'test': 'value'}
        with self.assertRaises(AnsibleError):
            lookup.run(terms, variables)

    def test_run_invalid_variable(self):
        lookup = LookupModule()
        terms = ['test']
        variables = {'test': 'value'}
        with self.assertRaises(AnsibleError):
            lookup.run(['test', 'invalid'], variables)

    def test_run_no_variables(self):
        lookup = LookupModule()
        terms = ['test']
        with self.assertRaises(AnsibleError):
            lookup.run(terms, None)

    def test_set_options(self):
        lookup = LookupModule()
        lookup.set_options(var_options={'test': 'value'}, direct={'direct': 'value'})
        self.assertEqual(lookup.var_options, {'test': 'value'})
        self.assertEqual(lookup.direct, {'direct': 'value'})

    def test_init(self):
        lookup = LookupModule()
        self.assertEqual(lookup.__class__, LookupModule)

    def test_str(self):
        lookup = LookupModule()
        self.assertEqual(str(lookup), 'LookupModule')

    def test_repr(self):
        lookup = LookupModule()
        self.assertEqual(repr(lookup), 'LookupModule()')

if __name__ == '__main__':
    unittest.main()