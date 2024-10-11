import unittest
from ansible.module_utils.common.collections import *


class TestImmutableDict(unittest.TestCase):
    def test_init(self):
        instance = ImmutableDict()
        self.assertEqual(instance._store, dict())

    def test_getitem(self):
        instance = ImmutableDict()
        result = instance.__getitem__(0)
        self.assertEqual(result, 1)

    def test_iter(self):
        instance = ImmutableDict()
        result = instance.__iter__()
        self.assertEqual(result, dict().keys())

    def test_len(self):
        instance = ImmutableDict()
        result = instance.__len__()
        self.assertEqual(result, dict().__len__())

    def test_hash(self):
        instance = ImmutableDict()
        result = instance.__hash__()
        self.assertEqual(result, hash(frozenset(instance.items())))

    def test_eq(self):
        instance = ImmutableDict()
        result = instance.__eq__(1)
        self.assertEqual(result, False)

    def test_repr(self):
        instance = ImmutableDict()
        result = instance.__repr__()
        self.assertEqual(result, 'ImmutableDict({0})'.format(repr(instance._store)))

    def test_union(self):
        instance = ImmutableDict()
        result = instance.union({1: 1})
        self.assertEqual(result, ImmutableDict(instance._store, **1))

    def test_difference(self):
        instance = ImmutableDict()
        result = instance.difference([1])
        self.assertEqual(result, ImmutableDict((k, instance._store[k]) for k in instance._store.keys() if k not in frozenset(1)))

class TestIsString(unittest.TestCase):
    def test_is_string(self):
        result = is_string(1)
        self.assertEqual(result, False)

class TestIsIterable(unittest.TestCase):
    def test_is_iterable(self):
        result = is_iterable(1)
        self.assertEqual(result, False)

class TestIsSequence(unittest.TestCase):
    def test_is_sequence(self):
        result = is_sequence(1)
        self.assertEqual(result, False)

class TestCount(unittest.TestCase):
    def test_count(self):
        result = count([1])
        self.assertEqual(result, dict())

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