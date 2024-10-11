import unittest
from pymonet.immutable_list import ImmutableList


class TestImmutableList(unittest.TestCase):
    def test_init(self):
        # Test default initialization
        empty_list = ImmutableList()
        self.assertEqual(empty_list.head, None)
        self.assertEqual(empty_list.tail, None)
        self.assertFalse(empty_list.is_empty)

        # Test initialization with head and tail
        head = 1
        tail = ImmutableList(2, 3, 4)
        list_with_head_and_tail = ImmutableList(head, tail)
        self.assertEqual(list_with_head_and_tail.head, head)
        self.assertEqual(list_with_head_and_tail.tail, tail)
        self.assertFalse(list_with_head_and_tail.is_empty)

    def test_eq(self):
        # Test equality with another ImmutableList instance
        list1 = ImmutableList(1, 2, 3)
        list2 = ImmutableList(1, 2, 3)
        self.assertEqual(list1, list2)

        # Test inequality with a different type
        self.assertNotEqual(list1, 1)

        # Test inequality with a different head
        list3 = ImmutableList(4, 2, 3)
        self.assertNotEqual(list1, list3)

        # Test inequality with a different tail
        list4 = ImmutableList(1, 2, 4)
        self.assertNotEqual(list1, list4)

        # Test inequality with a different is_empty flag
        list5 = ImmutableList(is_empty=True)
        self.assertNotEqual(list1, list5)

    def test_str(self):
        # Test string representation
        list1 = ImmutableList(1, 2, 3)
        self.assertEqual(str(list1), 'ImmutableList[1, 2, 3]')

        # Test string representation of an empty list
        empty_list = ImmutableList()
        self.assertEqual(str(empty_list), 'ImmutableList[]')

    def test_add(self):
        # Test addition of two lists
        list1 = ImmutableList(1, 2, 3)
        list2 = ImmutableList(4, 5, 6)
        combined_list = list1 + list2
        self.assertEqual(combined_list.head, 1)
        self.assertEqual(combined_list.head, 1)
        self.assertEqual(combined_list.tail.tail.head, 3)
        self.assertEqual(combined_list.tail.tail.tail.head, 4)
        self.assertEqual(combined_list.tail.tail.tail.tail.head, 5)
        self.assertEqual(combined_list.tail.tail.tail.tail.tail.head, 6)

        # Test addition of a list to an empty list
        empty_list = ImmutableList()
        combined_list = empty_list + list1
        self.assertEqual(combined_list.head, 1)
        self.assertEqual(combined_list.tail.head, 2)
        self.assertEqual(combined_list.tail.tail.head, 3)

        # Test addition of an empty list to a non-empty list
        combined_list = list1 + empty_list
        self.assertEqual(combined_list.head, 1)
        self.assertEqual(combined_list.tail.head, 2)
        self.assertEqual(combined_list.tail.tail.head, 3)

        # Test addition of a non-list to a list
        with self.assertRaises(ValueError):
            list1 + 1

    def test_len(self):
        # Test length of a list
        list1 = ImmutableList(1, 2, 3)
        self.assertEqual(len(list1), 2)

        # Test length of an empty list
        empty_list = ImmutableList()
        self.assertEqual(len(empty_list), 0)

if __name__ == '__main__':
    unittest.main()