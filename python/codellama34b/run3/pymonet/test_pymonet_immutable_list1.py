import unittest
from pymonet.immutable_list import *

class TestImmutableList(unittest.TestCase):
    def test_init(self):
        instance = ImmutableList()
        self.assertEqual(instance.head, None)
        self.assertEqual(instance.tail, None)
        self.assertEqual(instance.is_empty, False)

    def test_eq(self):
        instance = ImmutableList()
        other = ImmutableList()
        result = instance.__eq__(other)
        self.assertEqual(result, True)

    def test_str(self):
        instance = ImmutableList()
        result = instance.__str__()
        self.assertEqual(result, 'ImmutableList[]')

    def test_add(self):
        instance = ImmutableList()
        other = ImmutableList()
        result = instance.__add__(other)
        self.assertEqual(result, ImmutableList())

    def test_len(self):
        instance = ImmutableList()
        result = instance.__len__()
        self.assertEqual(result, 0)

    def test_of(self):
        result = ImmutableList.of(1, 2, 3)
        self.assertEqual(result, ImmutableList(1, ImmutableList(2, ImmutableList(3))))

    def test_empty(self):
        result = ImmutableList.empty()
        self.assertEqual(result, ImmutableList(is_empty=True))

    def test_to_list(self):
        instance = ImmutableList()
        result = instance.to_list()
        self.assertEqual(result, [])

    def test_append(self):
        instance = ImmutableList()
        result = instance.append(1)
        self.assertEqual(result, ImmutableList(1))

    def test_unshift(self):
        instance = ImmutableList()
        result = instance.unshift(1)
        self.assertEqual(result, ImmutableList(1))

    def test_map(self):
        instance = ImmutableList()
        result = instance.map(lambda x: x)
        self.assertEqual(result, ImmutableList())

    def test_filter(self):
        instance = ImmutableList()
        result = instance.filter(lambda x: True)
        self.assertEqual(result, ImmutableList())

    def test_find(self):
        instance = ImmutableList()
        result = instance.find(lambda x: True)
        self.assertEqual(result, None)

    def test_reduce(self):
        instance = ImmutableList()
        result = instance.reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()