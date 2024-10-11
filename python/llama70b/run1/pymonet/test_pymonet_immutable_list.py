import unittest
from pymonet.immutable_list import ImmutableList


class TestImmutableList(unittest.TestCase):
    def test_init(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        self.assertEqual(instance.head, 1)
        self.assertEqual(instance.tail.head, 2)
        self.assertEqual(instance.tail.tail.head, 3)

    def test_eq(self):
        instance1 = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        instance2 = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        self.assertTrue(instance1 == instance2)

    def test_str(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        self.assertEqual(str(instance), "ImmutableList[1, 2, 3]")

    def test_add(self):
        instance1 = ImmutableList(1, ImmutableList(2))
        instance2 = ImmutableList(3, ImmutableList(4))
        result = instance1 + instance2
        self.assertEqual(result.to_list(), [1, 2, 3, 4])

    def test_len(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        self.assertEqual(len(instance), 3)

    def test_of(self):
        instance = ImmutableList.of(1, 2, 3)
        self.assertEqual(instance.to_list(), [1, 2, 3])

    def test_empty(self):
        instance = ImmutableList.empty()
        self.assertTrue(instance.is_empty)

    def test_to_list(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        self.assertEqual(instance.to_list(), [1, 2, 3])

    def test_append(self):
        instance = ImmutableList(1, ImmutableList(2))
        result = instance.append(3)
        self.assertEqual(result.to_list(), [1, 2, 3])

    def test_unshift(self):
        instance = ImmutableList(1, ImmutableList(2))
        result = instance.unshift(0)
        self.assertEqual(result.to_list(), [0, 1, 2])

    def test_map(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        result = instance.map(lambda x: x * 2)
        self.assertEqual(result.to_list(), [2, 4, 6])

    def test_filter(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        result = instance.filter(lambda x: x % 2 == 0)
        self.assertEqual(result.to_list(), [2])

    def test_find(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        result = instance.find(lambda x: x == 2)
        self.assertEqual(result, 2)

    def test_reduce(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        result = instance.reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 6)

    def test_private_methods(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
        self.assertRaises(AttributeError, lambda: instance._ImmutableList__private_method())

if __name__ == '__main__':
    unittest.main()