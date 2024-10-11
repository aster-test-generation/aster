import unittest
from ansible.plugins.lookup import varnames


class TestLookupModule(unittest.TestCase):
    def test_run_with_no_terms(self):
        lookup = LookupModule()
        result = lookup.run([])
        self.assertEqual(result, [])

    def test_run_with_no_variables(self):
        lookup = LookupModule()
        result = lookup.run(['foo'])
        self.assertEqual(result, [])

    def test_run_with_no_matching_variables(self):
        lookup = LookupModule()
        result = lookup.run(['foo'], {'bar': 'baz'})
        self.assertEqual(result, [])

    def test_run_with_one_matching_variable(self):
        lookup = LookupModule()
        result = lookup.run(['foo'], {'foo': 'bar'})
        self.assertEqual(result, ['foo'])

    def test_run_with_multiple_matching_variables(self):
        lookup = LookupModule()
        result = lookup.run(['foo'], {'foo': 'bar', 'foo_bar': 'baz', 'foobar': 'qux'})
        self.assertEqual(result, ['foo', 'foo_bar', 'foobar'])

    def test_run_with_private_method(self):
        lookup = LookupModule()
        result = lookup._LookupModule__run(['foo'], {'foo': 'bar'})
        self.assertEqual(result, ['foo'])

    def test_run_with_protected_method(self):
        lookup = LookupModule()
        result = lookup._LookupModule__run(['foo'], {'foo': 'bar'})
        self.assertEqual(result, ['foo'])

    def test_run_with_magic_method(self):
        lookup = LookupModule()
        result = lookup.__init__()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()