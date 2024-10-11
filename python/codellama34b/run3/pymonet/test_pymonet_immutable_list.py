import unittest
from pymonet.immutable_list import ImmutableList
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
        self.assertEqual(instance.append(1), ImmutableList(1, 2))

    def test_unshift(self):
        instance = ImmutableList()
        self.assertEqual(instance.unshift(1), ImmutableList(1, 2, 3))

    def test_map(self):
        instance = ImmutableList()
        self.assertEqual(instance.map(lambda x: x), ImmutableList())

    def test_filter(self):
        instance = ImmutableList()
        self.assertEqual(instance.filter(lambda x: True), ImmutableList())

    def test_find(self):
        instance = ImmutableList()
        self.assertEqual(instance.find(lambda x: True), None)

    def test_reduce(self):
        instance = ImmutableList()
        self.assertEqual(instance.reduce(lambda x, y: x, 1), 1)


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

class TestImmutableList(unittest.TestCase):
    def test_init(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.head, 1)
        self.assertEqual(instance.tail, ImmutableList(2))
        self.assertEqual(instance.is_empty, False)

    def test_eq(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance, ImmutableList(1, ImmutableList(2), False))

    def test_str(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(str(instance), 'ImmutableList[1, 2]')

    def test_add(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance + ImmutableList(3), ImmutableList(1, ImmutableList(2, ImmutableList(3))))

    def test_len(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(len(instance), 2)

    def test_of(self):
        self.assertEqual(ImmutableList.of(1, 2, 3), ImmutableList(1, ImmutableList(2, ImmutableList(3))))

    def test_empty(self):
        self.assertEqual(ImmutableList.empty(), ImmutableList(is_empty=True))

    def test_to_list(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.to_list(), [1, 2])

    def test_append(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.append(3), ImmutableList(1, ImmutableList(2, ImmutableList(3))))

    def test_unshift(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.unshift(0), ImmutableList(0, ImmutableList(1, ImmutableList(2))))

    def test_map(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.map(lambda x: x * 2), ImmutableList(2, ImmutableList(4)))

    def test_filter(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.filter(lambda x: x > 1), ImmutableList(2))

    def test_find(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.find(lambda x: x > 1), 2)

    def test_reduce(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.reduce(lambda acc, x: acc + x, 0), 3)

if __name__ == '__main__':
    unittest.main()