import unittest
from unittest.mock import patch
from ansible.plugins.lookup.random_choice import LookupModule
from ansible.errors import AnsibleError


class TestLookupModule(unittest.TestCase):
    def setUp(self):
        self.lookup = LookupModule()

    @patch('random.choice', return_value='chosen_term')
    def test_run_with_terms(self, mock_choice):
        terms = ['term1', 'term2', 'term3']
        result = self.lookup.run(terms)
        self.assertEqual(result, ['chosen_term'])

    @patch('random.choice', side_effect=Exception('Random choice error'))
    def test_run_with_exception(self, mock_choice):
        terms = ['term1', 'term2', 'term3']
        with self.assertRaises(AnsibleError) as context:
            self.lookup.run(terms)
        self.assertIn('Unable to choose random term: Random choice error', str(context.exception))

    def test_run_without_terms(self):
        terms = []
        result = self.lookup.run(terms)
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()