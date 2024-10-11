import unittest
from pymonet.immutable_list import ImmutableList


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
        instance = ImmutableList.of(1, 2, 3)
        self.assertEqual(str(instance), 'ImmutableList[1, 2, 3]')

    def test_add(self):
        instance1 = ImmutableList.of(1, 2)
        instance2 = ImmutableList.of(3, 4)
        result = instance1 + instance2
        self.assertEqual(result.to_list(), [1, 2, 3, 4])

    def test_len(self):
        instance = ImmutableList.of(1, 2, 3)
        self.assertEqual(len(instance), 3)

    def test_of(self):
        instance = ImmutableList.of(1, 2, 3)
        self.assertEqual(instance.to_list(), [1, 2, 3])

    def test_empty(self):
        instance = ImmutableList.empty()
        self.assertTrue(instance.is_empty)

    def test_to_list(self):
        instance = ImmutableList.of(1, 2, 3)
        self.assertEqual(instance.to_list(), [1, 2, 3])

    def test_append(self):
        instance = ImmutableList.of(1, 2)
        result = instance.append(3)
        self.assertEqual(result.to_list(), [1, 2, 3])

    def test_unshift(self):
        instance = ImmutableList.of(2, 3)
        result = instance.unshift(1)
        self.assertEqual(result.to_list(), [1, 2, 3])

    def test_map(self):
        instance = ImmutableList.of(1, 2, 3)
        result = instance.map(lambda x: x * 2)
        self.assertEqual(result.to_list(), [2, 4, 6])

    def test_filter(self):
        instance = ImmutableList.of(1, 2, 3, 4)
        result = instance.filter(lambda x: x % 2 == 0)
        self.assertEqual(result.to_list(), [2, 4])

    def test_find(self):
        instance = ImmutableList.of(1, 2, 3, 4)
        result = instance.find(lambda x: x == 3)
        self.assertEqual(result, 3)

    def test_reduce(self):
        instance = ImmutableList.of(1, 2, 3, 4)
        result = instance.reduce(lambda acc, x: acc + x, 0)
        self.assertEqual(result, 10)

if __name__ == '__main__':
    unittest.main()