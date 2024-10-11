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
        self.assertEqual(list(iter(instance)), ['a', 'b'])

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

    def test_eq_different(self):
        instance1 = ImmutableDict(a=1, b=2)
        instance2 = ImmutableDict(a=1, b=3)
        self.assertFalse(instance1 == instance2)

    def test_repr(self):
        instance = ImmutableDict(a=1, b=2)
        self.assertEqual(repr(instance), "ImmutableDict({'a': 1, 'b': 2})")

    def test_union(self):
        instance = ImmutableDict(a=1, b=2)
        new_instance = instance.union({'b': 3, 'c': 4})
        self.assertEqual(new_instance._store, {'a': 1, 'b': 3, 'c': 4})

    def test_difference(self):
        instance = ImmutableDict(a=1, b=2, c=3)
        new_instance = instance.difference(['b'])
        self.assertEqual(new_instance._store, {'a': 1, 'c': 3})

class TestUtilityFunctions(unittest.TestCase):
    def test_is_string_text_type(self):
        self.assertTrue(is_string("test"))

    def test_is_string_binary_type(self):
        self.assertTrue(is_string(b"test"))

    def test_is_string_encrypted(self):
        class EncryptedString:
            __ENCRYPTED__ = True
        self.assertTrue(is_string(EncryptedString()))

    def test_is_iterable_list(self):
        self.assertTrue(is_iterable([1, 2, 3]))

    def test_is_iterable_string(self):
        self.assertFalse(is_iterable("test"))

    def test_is_iterable_include_strings(self):
        self.assertTrue(is_iterable("test", include_strings=True))

    def test_is_sequence_list(self):
        self.assertTrue(is_sequence([1, 2, 3]))

    def test_is_sequence_string(self):
        self.assertFalse(is_sequence("test"))

    def test_is_sequence_include_strings(self):
        self.assertTrue(is_sequence("test", include_strings=True))

    def test_count(self):
        self.assertEqual(count([1, 2, 2, 3, 3, 3]), {1: 1, 2: 2, 3: 3})

    def test_count_non_iterable(self):
        with self.assertRaises(Exception) as context:
            count(123)
        self.assertEqual(str(context.exception), 'Argument provided  is not an iterable')

if __name__ == '__main__':
    unittest.main()