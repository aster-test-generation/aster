import unittest
from ansible.module_utils.common.collections import ImmutableDict, is_string, is_iterable, is_sequence, count


class TestImmutableDict(unittest.TestCase):
    def test_init(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(instance._store, {'a': 1, 'b': 2})

    def test_getitem(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(instance['a'], 1)

    def test_iter(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(list(instance), ['a', 'b'])

    def test_len(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(len(instance), 2)

    def test_hash(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(hash(instance), hash(frozenset(instance.items())))

    def test_eq(self):
        instance1 = ImmutableDict(a=1, b=2)
        instance2 = ImmutableDict(a=1, b=2)
        self.assertTrue(instance1 == instance2)

    def test_repr(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(repr(instance), 'ImmutableDict({\'a\': 1, \'b\': 2})')

    def test_union(self):
        instance = ImmutableDict(a=1, b=2)
        overriding_mapping = {'c': 3, 'd': 4}
        result = instance.union(overriding_mapping)
        self.assertEqual(result, ImmutableDict(a=1, b=2, c=3, d=4))

    def test_difference(self):
        instance = ImmutableDict(a=1, b=2, c=3, d=4)
        subtractive_iterable = ['c', 'd']
        result = instance.difference(subtractive_iterable)
        self.assertEqual(result, ImmutableDict(a=1, b=2))

class TestFunctions(unittest.TestCase):
    def test_is_string(self):
        self.assertTrue(is_string('hello'))
        self.assertTrue(is_string(b'hello'))
        self.assertFalse(is_string(123))

    def test_is_iterable(self):
        self.assertTrue(is_iterable([1, 2, 3]))
        self.assertTrue(is_iterable('hello'))
        self.assertFalse(is_iterable(123))

    def test_is_sequence(self):
        self.assertTrue(is_sequence([1, 2, 3]))
        self.assertFalse(is_sequence('hello'))
        self.assertFalse(is_sequence(123))

    def test_count(self):
        seq = [1, 2, 2, 3, 3, 3]
        result = count(seq)
        self.assertEqual(result, {1: 1, 2: 2, 3: 3})

if __name__ == '__main__':
    unittest.main()