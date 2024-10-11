import unittest
from pymonet.immutable_list import ImmutableList


class TestImmutableList(unittest.TestCase):
    def test_init(self):
        instance = ImmutableList([1, ImmutableList([2, ImmutableList([3])])])
        self.assertEqual(instance.head, 1)
        self.assertEqual(instance.tail.head, 2)
        self.assertEqual(instance.tail.tail.head, 3)
        self.assertFalse(instance.is_empty)

    def test_eq(self):
        instance1 = ImmutableList([1, ImmutableList([2, ImmutableList([3])])])
        instance2 = ImmutableList([1, ImmutableList([2, ImmutableList([3])])])
        self.assertTrue(instance1 == instance2)

    def test_str(self):
        instance = ImmutableList([1, ImmutableList([2, ImmutableList([3])])])
        self.assertEqual(instance.__str__(), 'ImmutableList[1, 2, 3]')

    def test_add(self):
        instance1 = ImmutableList([1, ImmutableList([2, ImmutableList([3])])])
        instance2 = ImmutableList([4, ImmutableList([5, ImmutableList([6])])])
        result = instance1 + instance2
        self.assertEqual(result.head, 1)
        self.assertEqual(result.tail.head, 2)
        self.assertEqual(result.tail.tail.head, 3)
        self.assertEqual(result.tail.tail.tail.head, 4)
        self.assertEqual(result.tail.tail.tail.tail.head, 5)
        self.assertEqual(result.tail.tail.tail.tail.tail.head, 6)

    def test_len(self):
        instance = ImmutableList([1, ImmutableList([2, ImmutableList([3])])])
        self.assertEqual(len(instance), 3)

    def test_of(self):
        instance = ImmutableList.of(1, 2, 3)
        self.assertEqual(instance.head, 1)
        self.assertEqual(instance.tail.head, 2)
        self.assertEqual(instance.tail.tail.head, 3)
        self.assertFalse(instance.is_empty)

    def test_empty(self):
        instance = ImmutableList.empty()
        self.assertTrue(instance.is_empty)

    def test_to_list(self):
        instance = ImmutableList([1, ImmutableList([2, ImmutableList([3])])])
        self.assertEqual(instance.to_list(), [1, 2, 3])

    def test_append(self):
        instance = ImmutableList([1, ImmutableList([2, ImmutableList([3])])])
        result = instance.append(4)
        self.assertEqual(result.head, 1)
        self.assertEqual(result.tail.head, 2)
        self.assertEqual(result.tail.tail.head, 3)
        self.assertEqual(result.tail.tail.tail.head, 4)

    def test_unshift(self):
        instance = ImmutableList([1, ImmutableList([2, ImmutableList([3])])])
        result = instance.unshift(0)
        self.assertEqual(result.head, 0)
        self.assertEqual(result.tail.head, 1)
        self.assertEqual(result.tail.tail.head, 2)
        self.assertEqual(result.tail.tail.tail.head, 3)

    def test_map(self):
        instance = ImmutableList([1, ImmutableList([2, ImmutableList([3])])])
        result = instance.map(lambda x: x * 2)
        self.assertEqual(result.head, 2)
        self.assertEqual(result.tail.head, 4)
        self.assertEqual(result.tail.tail.head, 6)

    def test_filter(self):
        instance = ImmutableList([1, ImmutableList([2, 3, 4, 5])])
        result = instance.filter(lambda x: x % 2 == 0)
        self.assertEqual(result.head, 2)
        self.assertEqual(result.tail.head, 4)

    def test_find(self):
        instance = ImmutableList([1, ImmutableList([2, 3, 4, 5])])
        self.assertEqual(instance.find(lambda x: x % 2 == 0), 2)

    def test_reduce(self):
        instance = ImmutableList([1, ImmutableList([2, 3, 4, 5])])
        result = instance.reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 15)

class TestImmutableList(unittest.TestCase):
    def test_init(self):
        instance = ImmutableList(1)
        self.assertEqual(instance.head, 1)
        self.assertIsNone(instance.tail)
        self.assertFalse(instance.is_empty)

    def test_eq(self):
        instance1 = ImmutableList(1)
        instance2 = ImmutableList(1)
        self.assertTrue(instance1 == instance2)

    def test_str(self):
        instance = ImmutableList(1)
        result = instance.__str__()
        self.assertEqual(result, 'ImmutableList[1]')

    def test_add(self):
        instance1 = ImmutableList(1)
        instance2 = ImmutableList(2)
        result = instance1 + instance2
        self.assertEqual(result.head, 1)
        self.assertEqual(result.tail.head, 2)
        self.assertIsNone(result.tail.tail)

    def test_len(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        self.assertEqual(len(instance), 3)

    def test_of(self):
        instance = ImmutableList.of(1, 2, 3)
        self.assertEqual(instance.head, 1)
        self.assertEqual(instance.tail.head, 2)
        self.assertEqual(instance.tail.tail.head, 3)
        self.assertIsNone(instance.tail.tail.tail)

    def test_empty(self):
        instance = ImmutableList.empty()
        self.assertTrue(instance.is_empty)

    def test_to_list(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        result = instance.to_list()
        self.assertEqual(result, [1, 2, 3])

    def test_append(self):
        instance = ImmutableList(1)
        result = instance.append(2)
        self.assertEqual(result.head, 1)
        self.assertEqual(result.tail.head, 2)
        self.assertIsNone(result.tail.tail)

    def test_unshift(self):
        instance = ImmutableList(1)
        result = instance.unshift(2)
        self.assertEqual(result.head, 2)
        self.assertEqual(result.tail.head, 1)
        self.assertIsNone(result.tail.tail)

    def test_map(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        result = instance.map(lambda x: x * 2)
        self.assertEqual(result.head, 2)
        self.assertEqual(result.tail.head, 4)
        self.assertEqual(result.tail.tail.head, 6)
        self.assertIsNone(result.tail.tail.tail)

    def test_filter(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        result = instance.filter(lambda x: x % 2 == 0)
        self.assertEqual(result.head, 2)
        self.assertEqual(result.tail.head, 2)
        self.assertIsNone(result.tail.tail)

    def test_find(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        result = instance.find(lambda x: x == 2)
        self.assertEqual(result, 2)

    def test_reduce(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        result = instance.reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 6)

    def test_reduce_empty(self):
        instance = ImmutableList.empty()
        result = instance.reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 0)

    def test_reduce_single(self):
        instance = ImmutableList(1)
        result = instance.reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 1)

class TestImmutableList(unittest.TestCase):
    def test_init(self):
        instance = ImmutableList(1, ImmutableList(2, 3), False)
        self.assertEqual(instance.head, 1)
        self.assertEqual(instance.tail, ImmutableList(2, 3))
        self.assertFalse(instance.is_empty)

    def test_eq(self):
        instance1 = ImmutableList(1, 2, False)
        instance2 = ImmutableList(1, 2, False)
        self.assertTrue(instance1 == instance2)

    def test_str(self):
        instance = ImmutableList(1, 2, False)
        self.assertEqual(instance.__str__(), 'ImmutableList[1, 2]')

    def test_add(self):
        instance1 = ImmutableList(1, 2, False)
        instance2 = ImmutableList(3, 4, False)
        result = instance1 + instance2
        self.assertEqual(result.head, 1)
        self.assertEqual(result.tail, ImmutableList(2, ImmutableList(3, 4)))

    def test_len(self):
        instance = ImmutableList(1, 2, False)
        self.assertEqual(len(instance), 2)

    def test_of(self):
        instance = ImmutableList.of(1, 2, 3)
        self.assertEqual(instance.head, 1)
        self.assertEqual(instance.tail.head, 2)
        self.assertEqual(instance.tail.tail.head, 3)

    def test_empty(self):
        instance = ImmutableList.empty()
        self.assertTrue(instance.is_empty)

    def test_to_list(self):
        instance = ImmutableList(1, 2, False)
        self.assertEqual(instance.to_list(), [1, 2])

    def test_append(self):
        instance = ImmutableList(1, 2, False)
        result = instance.append(3)
        self.assertEqual(result.head, 1)
        self.assertEqual(result.tail.head, 2)
        self.assertEqual(result.tail.tail.head, 3)

    def test_unshift(self):
        instance = ImmutableList(1, 2, False)
        result = instance.unshift(0)
        self.assertEqual(result.head, 0)
        self.assertEqual(result.tail.head, 1)
        self.assertEqual(result.tail.tail.head, 2)

    def test_map(self):
        instance = ImmutableList(1, 2, False)
        result = instance.map(lambda x: x * 2)
        self.assertEqual(result.head, 2)
        self.assertEqual(result.tail.head, 4)

    def test_filter(self):
        instance = ImmutableList(1, 2, 3, 4, 5)
        result = instance.filter(lambda x: x % 2 == 0)
        self.assertEqual(result.head, 2)
        self.assertEqual(result.tail.head, 4)

    def test_find(self):
        instance = ImmutableList(1, 2, 3, 4, 5)
        self.assertEqual(instance.find(lambda x: x == 3), 3)

    def test_reduce(self):
        instance = ImmutableList(1, 2, 3, 4, 5)
        result = instance.reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 15)

if __name__ == '__main__':
    unittest.main()