import unittest
from ansible.utils.vars import *


class TestAnsibleUtilsVars(unittest.TestCase):
    def test_get_unique_id(self):
        result = get_unique_id()
        self.assertIsInstance(result, str)

    def test_combine_vars(self):
        a = {'a': 1, 'b': 2}
        b = {'b': 3, 'c': 4}
        result = combine_vars(a, b)
        self.assertEqual(result, {'a': 1, 'b': 3, 'c': 4})

    def test_merge_hash(self):
        a = {'a': 1, 'b': 2}
        b = {'b': 3, 'c': 4}
        result = merge_hash(a, b)
        self.assertEqual(result, {'a': 1, 'b': 3, 'c': 4})

    def test_load_extra_vars(self):
        loader = object()
        extra_vars = load_extra_vars(loader)
        self.assertIsInstance(extra_vars, dict)

    def test_load_options_vars(self):
        version = '2.9.0'
        options_vars = load_options_vars(version)
        self.assertIsInstance(options_vars, dict)

    def test_isidentifier(self):
        self.assertTrue(isidentifier('hello'))
        self.assertFalse(isidentifier('hello-world'))
        self.assertFalse(isidentifier('hello_world'))
        self.assertFalse(isidentifier('hello-world'))

    def test__validate_mutable_mappings(self):
        a = {'a': 1, 'b': 2}
        b = {'b': 3, 'c': 4}
        _validate_mutable_mappings(a, b)

    def test__isidentifier_PY3(self):
        self.assertTrue(_isidentifier_PY3('hello'))
        self.assertFalse(_isidentifier_PY3('hello-world'))
        self.assertFalse(_isidentifier_PY3('hello_world'))
        self.assertFalse(_isidentifier_PY3('hello-world'))

    def test__isidentifier_PY2(self):
        self.assertTrue(_isidentifier_PY2('hello'))
        self.assertFalse(_isidentifier_PY2('hello-world'))
        self.assertFalse(_isidentifier_PY2('hello_world'))
        self.assertFalse(_isidentifier_PY2('hello-world'))

if __name__ == '__main__':
    unittest.main()