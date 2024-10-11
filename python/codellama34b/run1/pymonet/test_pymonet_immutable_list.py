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
        self.assertEqual(instance.__eq__(ImmutableList()), True)

    def test_str(self):
        instance = ImmutableList()
        self.assertEqual(instance.__str__(), 'ImmutableList[None]')

    def test_add(self):
        instance = ImmutableList()
        self.assertEqual(instance.__add__(ImmutableList()), ImmutableList([1, 2, 3]))

    def test_len(self):
        instance = ImmutableList()
        self.assertEqual(instance.__len__(), 0)

    def test_of(self):
        instance = ImmutableList()
        self.assertEqual(instance.of(1), ImmutableList(1))

    def test_empty(self):
        instance = ImmutableList()
        self.assertEqual(instance.empty(), ImmutableList(is_empty=True))

    def test_to_list(self):
        instance = ImmutableList()
        self.assertEqual(instance.to_list(), [None])

    def test_append(self):
        instance = ImmutableList()
        self.assertEqual(instance.append(1), ImmutableList(1, 2, 3))

    def test_unshift(self):
        instance = ImmutableList()
        self.assertEqual(instance.unshift(1), ImmutableList(1, 2, 3, 4, 5))

    def test_map(self):
        instance = ImmutableList()
        self.assertEqual(instance.map(lambda x: x), ImmutableList())

    def test_filter(self):
        instance = ImmutableList()
        self.assertEqual(instance.filter(lambda x: x), ImmutableList([1, 2, 3]))

    def test_find(self):
        instance = ImmutableList()
        self.assertEqual(instance.find(lambda x: x), None)

    def test_reduce(self):
        instance = ImmutableList()
        self.assertEqual(instance.reduce(lambda x, y: x, 1), 1)


if __name__ == '__main__':
    unittest.main()