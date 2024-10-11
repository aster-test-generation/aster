import unittest
from ansible.utils.vars import *


class TestAnsibleUtilsVars(unittest.TestCase):
    def test_get_unique_id(self):
        result = get_unique_id()
        self.assertIsInstance(result, str)

    def test_combine_vars(self):
        a = {'a': 1, 'b': 2}
        b = {'c': 3, 'd': 4}
        result = combine_vars(a, b)
        self.assertEqual(result, {'a': 1, 'b': 2, 'c': 3, 'd': 4})

    def test_merge_hash(self):
        a = {'a': 1, 'b': 2}
        b = {'c': 3, 'd': 4}
        result = merge_hash(a, b)
        self.assertEqual(result, {'a': 1, 'b': 2, 'c': 3, 'd': 4})

    def test_load_extra_vars(self):
        loader = object()
        extra_vars = load_extra_vars(loader)
        self.assertIsInstance(extra_vars, dict)

    def test_load_options_vars(self):
        version = '2.9.0'
        options_vars = load_options_vars(version)
        self.assertIsInstance(options_vars, dict)

    def test_isidentifier_PY3(self):
        self.assertTrue(_isidentifier_PY3('hello'))
        self.assertFalse(_isidentifier_PY3('hello world'))
        self.assertFalse(_isidentifier_PY3('hello.'))
        self.assertFalse(_isidentifier_PY3('hello_'))

    def test_isidentifier_PY2(self):
        self.assertTrue(_isidentifier_PY2('hello'))
        self.assertFalse(_isidentifier_PY2('hello world'))
        self.assertFalse(_isidentifier_PY2('hello.'))
        self.assertFalse(_isidentifier_PY2('hello_'))

if __name__ == '__main__':
    unittest.main()