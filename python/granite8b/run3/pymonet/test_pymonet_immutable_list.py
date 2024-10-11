import unittest
from pymonet.immutable_list import ImmutableList


class TestImmutableList(unittest.TestCase):
    def test_init(self):
        list1 = ImmutableList(1, 2, 3)
        self.assertEqual(list1.head, 1)
        self.assertEqual(list1.tail.head, 1)
        self.assertEqual(list1.tail.tail.head, 3)
        self.assertIsNone(list1.tail.tail.tail)

    def test_eq(self):
        list1 = ImmutableList(1, 2, 3)
        list2 = ImmutableList(1, 2, 3)
        list3 = ImmutableList(1, 2)
        self.assertEqual(list1, list2)
        self.assertNotEqual(list1, list3)

    def test_str(self):
        list1 = ImmutableList(1, 2, 3)
        self.assertEqual(list1.to_list(), [1, 2, 3])

    def test_add(self):
        list1 = ImmutableList(1, 2, 3)
        list2 = ImmutableList(4, 5, 6)
        list3 = list1 + list2
        self.assertEqual(list3.head, 1)
        self.assertEqual(list3.tail.head, 3)
        self.assertEqual(list3.tail.tail.head, 3)
        self.assertEqual(list3.tail.tail.tail.head, 4)
        self.assertEqual(list3.tail.tail.tail.tail.head, 5)
        self.assertEqual(list3.tail.tail.tail.tail.tail.head, 6)
        self.assertIsNone(list3.tail.tail.tail.tail.tail.tail)

    def test_len(self):
        list1 = ImmutableList(1, 2, 3)
        self.assertEqual(len(list1), 4)
        list2 = ImmutableList(1)
        self.assertEqual(len(list2), 1)
        list3 = ImmutableList()
        self.assertEqual(len(list3), 0)

    def test_of(self):
        list1 = ImmutableList.of(1, 2, 3)
        self.assertEqual(list1.head, 1)
        self.assertEqual(list1.tail.head, 2)
        self.assertEqual(list1.tail.tail.head, 3)
        self.assertIsNone(list1.tail.tail.tail)

    def test_empty(self):
        list1 = ImmutableList.empty()
        self.assertIsNone(list1.head)
        self.assertIsNone(list1.tail)

    def test_to_list(self):
        list1 = ImmutableList(1, 2, 3)
        self.assertEqual(list1.to_list(), [1, 2, 3])
        list2 = ImmutableList(1)
        self.assertEqual(list2.to_list(), [1])
        list3 = ImmutableList()
        self.assertEqual(list3.to_list(), [])

    def test_append(self):
        list1 = ImmutableList(1, 2, 3)
        list2 = list1.append(4)
        self.assertEqual(list2.head, 1)
        self.assertEqual(list2.tail.head, 3)
        self.assertEqual(list2.tail.tail.head, 3)
        self.assertEqual(list2.tail.tail.tail.head, 4)
        self.assertIsNone(list2.tail.tail.tail.tail)

    def test_unshift(self):
        list1 = ImmutableList(1, 2, 3)
        list2 = list1.unshift(0)
        self.assertEqual(list2.head, 0)
        self.assertEqual(list2.tail.head, 1)
        self.assertEqual(list2.tail.tail.head, 3)
        self.assertEqual(list2.tail.tail.tail.head, 3)
        self.assertIsNone(list2.tail.tail.tail.tail)

class TestImmutableList(unittest.TestCase):
    def test_init(self):
        list1 = ImmutableList(1, 2, 3)
        self.assertEqual(list1.head, 1)
        self.assertEqual(list1.tail.head, 2)
        self.assertEqual(list1.tail.tail.head, 3)
        self.assertTrue(list1.tail.tail.tail is None)

    def test_eq(self):
        list1 = ImmutableList(1, 2, 3)
        list2 = ImmutableList(1, 2, 3)
        list3 = ImmutableList(1, 2)
        self.assertEqual(list1, list2)
        self.assertNotEqual(list1, list3)

    def test_str(self):
        list1 = ImmutableList(1, 2, 3)
        self.assertEqual(str(list1), 'ImmutableList[1, 2, 3]')

    def test_add(self):
        list1 = ImmutableList(1, 2, 3)
        list2 = ImmutableList(4, 5, 6)
        list3 = list1 + list2
        self.assertEqual(list3.head, 1)
        self.assertEqual(list3.tail.head, 2)
        self.assertEqual(list3.tail.tail.head, 3)
        self.assertEqual(list3.tail.tail.tail.head, 4)
        self.assertEqual(list3.tail.tail.tail.tail.head, 5)
        self.assertEqual(list3.tail.tail.tail.tail.tail.head, 6)
        self.assertTrue(list3.tail.tail.tail.tail.tail.tail is None)

    def test_len(self):
        list1 = ImmutableList(1, 2, 3)
        self.assertEqual(len(list1), 3)
        list2 = ImmutableList()
        self.assertEqual(len(list2), 0)

    def test_of(self):
        list1 = ImmutableList.of(1, 2, 3)
        self.assertEqual(list1.head, 1)
        self.assertEqual(list1.tail.head, 2)
        self.assertEqual(list1.tail.tail.head, 3)
        self.assertTrue(list1.tail.tail.tail is None)

    def test_empty(self):
        list1 = ImmutableList.empty()
        self.assertTrue(list1.is_empty)

    def test_to_list(self):
        list1 = ImmutableList(1, 2, 3)
        self.assertEqual(list1.to_list(), [1, 2, 3])

    def test_append(self):
        list1 = ImmutableList(1, 2, 3)
        list2 = list1.append(4)
        self.assertEqual(list2.head, 1)
        self.assertEqual(list2.tail.head, 2)
        self.assertEqual(list2.tail.tail.head, 3)
        self.assertEqual(list2.tail.tail.tail.head, 4)
        self.assertTrue(list2.tail.tail.tail.tail is None)

    def test_unshift(self):
        list1 = ImmutableList(1, 2, 3)
        list2 = list1.unshift(4)
        self.assertEqual(list2.head, 4)
        self.assertEqual(list2.tail.head, 1)
        self.assertEqual(list2.tail.tail.head, 2)
        self.assertEqual(list2.tail.tail.tail.head, 3)
        self.assertTrue(list2.tail.tail.tail.tail is None)

    def test_map(self):
        list1 = ImmutableList(1, 2, 3)
        list2 = list1.map(lambda x: x * 2)
        self.assertEqual(list2.head, 2)
        self.assertEqual(list2.tail.head, 4)
        self.assertEqual(list2.tail.tail.head, 6)
        self.assertTrue(list2.tail.tail.tail is None)

if __name__ == '__main__':
    unittest.main()