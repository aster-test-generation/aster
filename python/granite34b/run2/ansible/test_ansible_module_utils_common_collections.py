import unittest
from ansible.module_utils.common.collections import ImmutableDict, is_string, is_iterable, is_sequence, count


class TestImmutableDict(unittest.TestCase):
    def test_init(self):
        d = ImmutableDict()
        self.assertEqual(d, ImmutableDict({}))
        d = ImmutableDict(a=1, b=2)
        self.assertEqual(d, {'a': 1, 'b': 2})

    def test_getitem(self):
        d = ImmutableDict(a=1, b=2)
        self.assertEqual(d['a'], 1)
        self.assertEqual(d['b'], 2)

    def test_iter(self):
        d = ImmutableDict(a=1, b=2)
        self.assertEqual(list(d), ['a', 'b'])

    def test_len(self):
        d = ImmutableDict(a=1, b=2)
        self.assertEqual(len(d), 2)

    def test_hash(self):
        d1 = ImmutableDict(a=1, b=2)
        d2 = ImmutableDict(b=2, a=1)
        self.assertEqual(hash(d1), hash(d2))

    def test_eq(self):
        d1 = ImmutableDict(a=1, b=2)
        d2 = ImmutableDict(b=2, a=1)
        self.assertEqual(d1, d2)

    def test_repr(self):
        d = ImmutableDict(a=1, b=2)
        self.assertEqual(repr(d), "ImmutableDict({'a': 1, 'b': 2})")

    def test_union(self):
        d1 = ImmutableDict(a=1, b=2)
        d2 = ImmutableDict(b=3, c=4)
        self.assertEqual(d1.union(d2), ImmutableDict(a=1, b=3, c=4))

    def test_difference(self):
        d = ImmutableDict(a=1, b=2, c=3)
        self.assertEqual(d.difference(['b', 'c']), ImmutableDict(a=1))

class TestIsString(unittest.TestCase):
    def test_is_string(self):
        self.assertTrue(is_string("hello"))
        self.assertTrue(is_string(b"hello"))
        self.assertFalse(is_string(123))
        self.assertFalse(is_string([1, 2, 3]))

class TestIsIterable(unittest.TestCase):
    def test_is_iterable(self):
        self.assertTrue(is_iterable([1, 2, 3]))
        self.assertTrue(is_iterable("hello"))
        self.assertTrue(is_iterable(b"hello"))
        self.assertTrue(is_iterable({1: 2, 3: 4}))
        self.assertFalse(is_iterable(123))

class TestIsSequence(unittest.TestCase):
    def test_is_sequence(self):
        self.assertTrue(is_sequence([1, 2, 3]))
        self.assertTrue(is_sequence("hello"))
        self.assertTrue(is_sequence(b"hello"))
        self.assertFalse(is_sequence({1: 2, 3: 4}))
        self.assertFalse(is_sequence(123))

class TestCount(unittest.TestCase):
    def test_count(self):
        self.assertEqual(count([1, 2, 3, 1, 2, 1]), {1: 3, 2: 2, 3: 1})
        self.assertEqual(count("hello"), {'h': 1, 'e': 1, 'l': 2, 'o': 1})
        self.assertEqual(count(b"hello"), {'h': 1, 'e': 1, 'l': 2, 'o': 1})
        with self.assertRaises(Exception):
            count(123)

if __name__ == '__main__':
    unittest.main()