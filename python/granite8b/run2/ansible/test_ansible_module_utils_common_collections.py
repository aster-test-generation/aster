import unittest
from ansible.module_utils.common.collections import ImmutableDict, is_string, is_iterable, is_sequence, count


class TestImmutableDict(unittest.TestCase):
    def test_init(self):
        d = ImmutableDict(a=1, b=2)
        self.assertEqual(d._store, {'a': 1, 'b': 2})

    def test_getitem(self):
        d = ImmutableDict(a=1, b=2)
        self.assertEqual(d['a'], 1)

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
        self.assertEqual(repr(d), 'ImmutableDict({"a": 1, "b": 2})')

    def test_union(self):
        d1 = ImmutableDict(a=1, b=2)
        d2 = ImmutableDict(b=3, c=4)
        d3 = d1.union(d2)
        self.assertEqual(d3._store, {'a': 1, 'b': 3, 'c': 4})

    def test_difference(self):
        d1 = ImmutableDict(a=1, b=2, c=3)
        d2 = ImmutableDict(b=2, c=3, d=4)
        d3 = d1.difference(['b', 'c'])
        self.assertEqual(d3._store, {'a': 1})

class TestIsString(unittest.TestCase):
    def test_true(self):
        self.assertTrue(is_string('abc'))
        self.assertTrue(is_string(u'abc'))

    def test_false(self):
        self.assertFalse(is_string(123))
        self.assertFalse(is_string([1, 2, 3]))

class TestIsIterable(unittest.TestCase):
    def test_true(self):
        self.assertTrue(is_iterable([1, 2, 3]))
        self.assertFalse(is_iterable('abc'))

    def test_false(self):
        self.assertFalse(is_iterable(123))
        self.assertFalse(is_iterable('abc'))

class TestIsSequence(unittest.TestCase):
    def test_true(self):
        self.assertTrue(is_sequence([1, 2, 3]))
        self.assertFalse(is_sequence('abc'))

    def test_false(self):
        self.assertFalse(is_sequence(123))
        self.assertFalse(is_sequence({'a': 1, 'b': 2}))

class TestCount(unittest.TestCase):
    def test_count(self):
        self.assertEqual(count([1, 2, 3, 1, 2]), {1: 2, 2: 2, 3: 1})
        self.assertEqual(count('abcabc'), {'a': 3, 'b': 3, 'c': 3})

if __name__ == '__main__':
    unittest.main()