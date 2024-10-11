import unittest
from ansible.module_utils.common.collections import *

class TestImmutableDict(unittest.TestCase):
    def test_init(self):
        instance = ImmutableDict()
        self.assertEqual(instance._store, {})

    def test_getitem(self):
        instance = ImmutableDict()
        self.assertEqual(instance['key'], None)

    def test_iter(self):
        instance = ImmutableDict()
        self.assertEqual(instance.__iter__(), None)

    def test_len(self):
        instance = ImmutableDict()
        self.assertEqual(instance.__len__(), 0)

    def test_hash(self):
        instance = ImmutableDict()
        self.assertEqual(instance.__hash__(), None)

    def test_eq(self):
        instance = ImmutableDict()
        self.assertEqual(instance.__eq__(), None)

    def test_repr(self):
        instance = ImmutableDict()
        self.assertEqual(instance.__repr__(), 'ImmutableDict({0})')

    def test_union(self):
        instance = ImmutableDict()
        self.assertEqual(instance.union(), None)

    def test_difference(self):
        instance = ImmutableDict()
        self.assertEqual(instance.difference(), None)

class TestIsString(unittest.TestCase):
    def test_is_string(self):
        self.assertEqual(is_string('seq'), None)

class TestIsIterable(unittest.TestCase):
    def test_is_iterable(self):
        self.assertEqual(is_iterable('seq'), None)

class TestIsSequence(unittest.TestCase):
    def test_is_sequence(self):
        self.assertEqual(is_sequence('seq'), None)

class TestCount(unittest.TestCase):
    def test_count(self):
        self.assertEqual(count('seq'), None)

if __name__ == '__main__':
    unittest.main()