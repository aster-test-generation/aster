import unittest
from unittest.mock import patch
from ansible.plugins.lookup.random_choice import LookupModule
from ansible.errors import AnsibleError


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    def test_run_with_terms(self):
        terms = ['a', 'b', 'c']
        with patch('random.choice', return_value='a'):
            result = self.lookup.run(terms)
            self.assertEqual(result, ['a'])

    def test_run_with_empty_terms(self):
        terms = []
        result = self.lookup.run(terms)
        self.assertEqual(result, terms)

    def test_run_with_exception(self):
        terms = ['a', 'b', 'c']
        with patch('random.choice', side_effect=Exception('Test Exception')):
            with self.assertRaises(AnsibleError) as context:
                self.lookup.run(terms)
            self.assertIn('Unable to choose random term', str(context.exception))

if __name__ == '__main__':
    unittest.main()