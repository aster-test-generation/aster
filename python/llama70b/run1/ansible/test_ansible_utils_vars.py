import unittest
from ansible.utils.vars import *


class TestGetUniqueId(unittest.TestCase):
    def test_get_unique_id(self):
        result = get_unique_id()
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 32)

class TestValidateMutableMappings(unittest.TestCase):
    def test_validate_mutable_mappings(self):
        a = {'a': 1}
        b = {'b': 2}
        _validate_mutable_mappings(a, b)
        self.assertTrue(True)  # no exception raised

    def test_validate_mutable_mappings_failure(self):
        a = {'a': 1}
        b = [1, 2, 3]
        with self.assertRaises(AnsibleError):
            _validate_mutable_mappings(a, b)

class TestCombineVars(unittest.TestCase):
    def test_combine_vars_merge(self):
        a = {'a': 1}
        b = {'b': 2}
        result = combine_vars(a, b, merge=True)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_combine_vars_update(self):
        a = {'a': 1}
        b = {'b': 2}
        result = combine_vars(a, b)
        self.assertEqual(result, {'a': 1, 'b': 2})

class TestMergeHash(unittest.TestCase):
    def test_merge_hash_recursive(self):
        x = {'a': 1, 'b': {'c': 2}}
        y = {'b': {'d': 3}, 'e': 4}
        result = merge_hash(x, y, recursive=True)
        self.assertEqual(result, {'a': 1, 'b': {'c': 2, 'd': 3}, 'e': 4})

    def test_merge_hash_non_recursive(self):
        x = {'a': 1, 'b': {'c': 2}}
        y = {'b': {'d': 3}, 'e': 4}
        result = merge_hash(x, y, recursive=False)
        self.assertEqual(result, {'a': 1, 'b': {'d': 3}, 'e': 4})

class TestLoadExtraVars(unittest.TestCase):
    def test_load_extra_vars(self):
        loader = MockLoader()
        extra_vars = load_extra_vars(loader)
        self.assertIsInstance(extra_vars, dict)

class TestLoadOptionsVars(unittest.TestCase):
    def test_load_options_vars(self):
        version = '1.2.3'
        result = load_options_vars(version)
        self.assertIsInstance(result, dict)
        self.assertEqual(result['ansible_version'], version)

class TestIsIdentifier(unittest.TestCase):
    def test_isidentifier_PY3(self):
        ident = 'valid_ident'
        self.assertTrue(isidentifier(ident))

    def test_isidentifier_PY2(self):
        ident = 'valid_ident'
        self.assertTrue(isidentifier(ident))

    def test_isidentifier_invalid(self):
        ident = 'invalid ident'
        self.assertFalse(isidentifier(ident))

if __name__ == '__main__':
    unittest.main()