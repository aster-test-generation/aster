import unittest
from ansible.module_utils.common.validation import *



class TestCountTerms(unittest.TestCase):
    def test_count_terms(self):
        result = count_terms('test', {'test': 'test'})
        self.assertEqual(result, 1)

class TestSafeEval(unittest.TestCase):
    def test_safe_eval(self):
        result = safe_eval('test', {'test': 'test'})
        self.assertEqual(result, 'test')

class TestCheckMutuallyExclusive(unittest.TestCase):
    def test_check_mutually_exclusive(self):
        result = check_mutually_exclusive('test', {'test': 'test'})
        self.assertEqual(result, [])

class TestCheckRequiredOneOf(unittest.TestCase):
    def test_check_required_one_of(self):
        result = check_required_one_of('test', {'test': 'test', 't': 't'})
        self.assertEqual(result, ['test'])

class TestCheckRequiredTogether(unittest.TestCase):
    def test_check_required_together(self):
        result = check_required_together('test', {'test': 'test'})
        self.assertEqual(result, [])


if __name__ == '__main__':
    unittest.main()