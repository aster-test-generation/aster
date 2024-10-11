import unittest
from ansible.module_utils.common.collections import ImmutableDict, is_string, is_iterable, is_sequence, count

class TestImmutableDict(unittest.TestCase):
    def test_init(self):
        dict1 = ImmutableDict({'a': 1, 'b': 2})
        self.assertEqual(dict1._store, {'a': 1, 'b': 2})

    def test_getitem(self):
        dict1 = ImmutableDict({'a': 1, 'b': 2})
        self.assertEqual(dict1['a'], 1)

    def test_iter(self):
        dict1 = ImmutableDict({'a': 1, 'b': 2})
        self.assertEqual(list(dict1), ['a', 'b'])

    def test_len(self):
        dict1 = ImmutableDict({'a': 1, 'b': 2})
        self.assertEqual(len(dict1), 2)

    def test_hash(self):
        dict1 = ImmutableDict({'a': 1, 'b': 2})
        self.assertEqual(hash(dict1), hash(frozenset(dict1.items())))

    def test_eq(self):
        dict1 = ImmutableDict({'a': 1, 'b': 2})
        dict2 = ImmutableDict({'a': 1, 'b': 2})
        self.assertTrue(dict1 == dict2)

    def test_repr(self):
        dict1 = ImmutableDict({'a': 1, 'b': 2})
        self.assertEqual(repr(dict1), 'ImmutableDict({\'a\": 1, \'b\": 2})')

    def test_union(self):
        dict1 = ImmutableDict({'a': 1, 'b': 2})
        dict2 = ImmutableDict({'b': 3, 'c': 4})
        self.assertEqual(dict1.union(dict2), ImmutableDict({'a': 1, 'b': 3, 'c': 4}))

    def test_difference(self):
        dict1 = ImmutableDict({'a': 1, 'b': 2, 'c': 3})
        dict2 = ImmutableDict({'b': 3, 'c': 4})
        self.assertEqual(dict1.difference(dict2), ImmutableDict({'a': 1}))

class TestFunctions(unittest.TestCase):
    def test_is_string(self):
        self.assertTrue(is_string('hello'))
        self.assertTrue(is_string(b'hello'))
        self.assertFalse(is_string([1, 2, 3]))

    def test_is_iterable(self):
        self.assertTrue(is_iterable([1, 2, 3]))
        self.assertTrue(is_iterable('hello'))
        self.assertFalse(is_iterable(123))

    def test_is_sequence(self):
        self.assertTrue(is_sequence([1, 2, 3]))
        self.assertFalse(is_sequence('hello'))

    def test_count(self):
        self.assertEqual(count([1, 2, 2, 3, 3, 3]), {1: 1, 2: 2, 3: 3})

if __name__ == '__main__':
    unittest.main()