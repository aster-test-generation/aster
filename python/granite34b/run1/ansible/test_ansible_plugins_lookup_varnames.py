import unittest
from ansible.plugins.lookup.varnames import LookupModule


class TestVarnamesLookup(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_run_with_no_variables(self):
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run([], None)
        self.assertEqual(str(context.exception), 'No variables available to search')

    def test_run_with_invalid_term(self):
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run([123], {})
        self.assertEqual(str(context.exception), 'Invalid setting identifier, "123" is not a string, it is a <class \'int\'>')

    def test_run_with_valid_term(self):
        result = self.lookup.run(['abc'], variables={'abc': 123, 'def': 456})
        self.assertEqual(result, ['abc'])

    def test_run_with_regex_term(self):
        result = self.lookup.run(['^a.*'], variables={'abc': 123, 'def': 456, 'axy': 789})
        self.assertEqual(result, ['abc', 'axy'])

    def test_run_with_private_method(self):
        result = self.lookup.__private_method()
        self.assertEqual(result, 'private')

    def test_run_with_protected_method(self):
        result = self.lookup.protected_method()
        self.assertEqual(result, 'protected')

    def test_run_with_magic_method(self):
        result = self.lookup.__str__()
        self.assertEqual(type(result), str)

if __name__ == '__main__':
    unittest.main()