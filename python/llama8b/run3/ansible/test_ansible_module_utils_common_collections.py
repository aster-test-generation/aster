import unittest
from ansible.module_utils.common._collections_compat import Mapping, Sequenc
from ansible.module_utils.common import is_string, is_iterable, is_sequence, count
from ansible.module_utils.common.collections import ImmutableDict, is_string, is_iterable, is_sequence, count


class TestImmutableDict(unittest.TestCase):
    def test_init(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(instance._store, {'a': 1, 'b': 2})

    def test_getitem(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(instance['a'], 1)
        self.assertEqual(instance['b'], 2)

    def test_iter(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(list(instance), ['a', 'b'])

    def test_len(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(len(instance), 2)

    def test_hash(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(hash(frozenset(instance.items())), hash({'a': 1, 'b': 2}))

    def test_eq(self):
        instance1 = ImmutableDict(a=1, b=2)
        instance2 = ImmutableDict(a=1, b=2)
        self.assertTrue(instance1 == instance2)

    def test_repr(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(repr(instance), 'ImmutableDict({\'a\": 1, \'b\": 2})')

    def test_union(self):
        instance = ImmutableDict(a=1, b=2)
        result = instance.union({'c': 3})
        self.assertEqual(result._store, {'a': 1, 'b': 2, 'c': 3})

    def test_difference(self):
        instance = ImmutableDict(a=1, b=2, c=3)
        result = instance.difference(['a', 'c'])
        self.assertEqual(result._store, {'b': 2})

class TestIsString(unittest.TestCase):
    def test_string(self):
        self.assertTrue(is_string('hello'))

    def test_binary(self):
        self.assertTrue(is_string(b'hello'))

    def test_non_string(self):
        self.assertFalse(is_string(123))

class TestIsIterable(unittest.TestCase):
    def test_iterable(self):
        self.assertTrue(is_iterable([1, 2, 3]))

    def test_non_iterable(self):
        self.assertFalse(is_iterable(123))

class TestIsSequence(unittest.TestCase):
    def test_sequence(self):
        self.assertTrue(is_sequence([1, 2, 3]))

    def test_non_sequence(self):
        self.assertFalse(is_iterable('hello'))


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
        self.assertTrue(is_iterable((1, 2, 3)))
        self.assertFalse(is_iterable(123))

    def test_is_sequence(self):
        self.assertTrue(is_sequence([1, 2, 3]))
        self.assertTrue(is_sequence((1, 2, 3)))
        self.assertFalse(is_iterable('hello'))

    def test_count(self):
        self.assertEqual(count([1, 2, 2, 3, 3, 3]), {1: 1, 2: 2, 3: 3})

if __name__ == '__main__':
    unittest.main()