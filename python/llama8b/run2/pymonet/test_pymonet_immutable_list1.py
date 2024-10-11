import unittest
from pymonet.immutable_list import ImmutableList

class TestImmutableList(unittest.TestCase):
    def test_init(self):
        instance = ImmutableList(1, ImmutableList.empty())
        self.assertEqual(instance.head, 1)
        self.assertEqual(instance.tail, ImmutableList.empty())
        self.assertFalse(instance.is_empty)

    def test_eq(self):
        instance1 = ImmutableList(1, ImmutableList.empty())
        instance2 = ImmutableList(1, ImmutableList.empty())
        self.assertTrue(instance1 == instance2)

    def test_str(self):
        instance = ImmutableList(1, ImmutableList.empty())
        self.assertEqual(instance.__str__(), 'ImmutableList[1]')

    def test_add(self):
        instance1 = ImmutableList(1, ImmutableList.empty())
        instance2 = ImmutableList(2, ImmutableList.empty())
        result = instance1 + instance2
        self.assertEqual(result.head, 1)
        self.assertEqual(result.tail.head, 2)
        self.assertEqual(result.tail.tail, ImmutableList.empty())

    def test_len(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList.empty()))
        self.assertEqual(len(instance), 2)

    def test_of(self):
        instance = ImmutableList.of(1, 2, 3)
        self.assertEqual(instance.head, 1)
        self.assertEqual(instance.tail.head, 2)
        self.assertEqual(instance.tail.tail.head, 3)
        self.assertEqual(instance.tail.tail.tail, ImmutableList.empty())

    def test_empty(self):
        instance = ImmutableList.empty()
        self.assertTrue(instance.is_empty)

    def test_to_list(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3, ImmutableList.empty())))
        self.assertEqual(instance.to_list(), [1, 2, 3])

    def test_append(self):
        instance = ImmutableList(1, ImmutableList.empty())
        result = instance.append(2)
        self.assertEqual(result.head, 1)
        self.assertEqual(result.tail.head, 2)
        self.assertEqual(result.tail.tail, ImmutableList.empty())

    def test_unshift(self):
        instance = ImmutableList(1, ImmutableList.empty())
        result = instance.unshift(2)
        self.assertEqual(result.head, 2)
        self.assertEqual(result.tail.head, 1)
        self.assertEqual(result.tail.tail, ImmutableList.empty())

    def test_map(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList.empty()))
        result = instance.map(lambda x: x * 2)
        self.assertEqual(result.head, 2)
        self.assertEqual(result.tail.head, 4)
        self.assertEqual(result.tail.tail, ImmutableList.empty())

    def test_filter(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3, ImmutableList.empty())))
        result = instance.filter(lambda x: x % 2 == 0)
        self.assertEqual(result.head, 2)
        self.assertEqual(result.tail.head, 2)
        self.assertEqual(result.tail.tail, ImmutableList.empty())

    def test_find(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3, ImmutableList.empty())))
        self.assertEqual(instance.find(lambda x: x == 2), 2)

    def test_reduce(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3, ImmutableList.empty())))
        result = instance.reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 6)

    def test_reduce_empty(self):
        instance = ImmutableList.empty()
        result = instance.reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 0)

    def test_reduce_single(self):
        instance = ImmutableList(1, ImmutableList.empty())
        result = instance.reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 1)

    def test_reduce_multiple(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3, ImmutableList.empty())))
        result = instance.reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 6)

    def test_reduce_private_method(self):
        instance = ImmutableList(1, ImmutableList(2, ImmutableList(3, ImmutableList.empty())))
        result = instance._ImmutableList__reduce(lambda x, y: x + y, 0)
        self.assertEqual(result, 6)

if __name__ == '__main__':
    unittest.main()