import unittest
from ansible.module_utils.common.collections import ImmutableDict

class TestImmutableDict(unittest.TestCase):
    def test_init(self):
        d = ImmutableDict()
        self.assertEqual(d, {})
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
        self.assertEqual(repr(d), 'ImmutableDict({"a": 1, "b": 2})')

    def test_union(self):
        d1 = ImmutableDict(a=1, b=2)
        d2 = ImmutableDict(b=3, c=4)
        d3 = d1.union(d2)
        self.assertEqual(d3, {'a': 1, 'b': 3, 'c': 4})

    def test_difference(self):
        d1 = ImmutableDict(a=1, b=2, c=3)
        d2 = ImmutableDict(b=2, c=4)
        d3 = d1.difference(d2)
        self.assertEqual(d3, {'a': 1})

if __name__ == '__main__':
    unittest.main()