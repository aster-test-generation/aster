import unittest
from ansible.utils.vars import *



class TestGetUniqueId(unittest.TestCase):
    def test_get_unique_id(self):
        result = get_unique_id()
        self.assertEqual(len(result), 36)

class TestCombineVars(unittest.TestCase):
    def test_combine_vars(self):
        a = {'a': 1}
        b = {'b': 2}
        result = combine_vars(a, b)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_combine_vars_merge(self):
        a = {'a': 1}
        b = {'b': 2}
        result = combine_vars(a, b, merge=True)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_combine_vars_no_merge(self):
        a = {'a': 1}
        b = {'b': 2}
        result = combine_vars(a, b, merge=False)
        self.assertEqual(result, {'a': 1, 'b': 2})

class TestMergeHash(unittest.TestCase):
    def test_merge_hash(self):
        x = {'a': 1}
        y = {'b': 2}
        result = merge_hash(x, y)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_merge_hash_recursive(self):
        x = {'a': 1}
        y = {'b': 2}
        result = merge_hash(x, y, recursive=True)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_merge_hash_no_recursive(self):
        x = {'a': 1}
        y = {'b': 2}
        result = merge_hash(x, y, recursive=False)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_merge_hash_list_merge_replace(self):
        x = {'a': 1}
        y = {'b': 2}
        result = merge_hash(x, y, list_merge='replace')
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_merge_hash_list_merge_keep(self):
        x = {'a': 1}
        y = {'b': 2}
        result = merge_hash(x, y, list_merge='keep')
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_merge_hash_list_merge_append(self):
        x = {'a': 1}
        y = {'b': 2}
        result = merge_hash(x, y, list_merge='append')
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_merge_hash_list_merge_prepend(self):
        x = {'a': 1}
        y = {'b': 2}
        result = merge_hash(x, y, list_merge='prepend')
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_merge_hash_list_merge_append_rp(self):
        x = {'a': 1}
        y = {'b': 2}
        result = merge_hash(x, y, list_merge='append_rp')
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_merge_hash_list_merge_prepend_rp(self):
        x = {'a': 1}
        y = {'b': 2}
        result = merge_hash(x, y, list_merge='prepend_rp')
        self.assertEqual(result, {'a': 1, 'b': 2})


if __name__ == '__main__':
    unittest.main()