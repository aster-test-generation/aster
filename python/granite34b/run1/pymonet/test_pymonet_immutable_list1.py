import unittest
from pymonet.immutable_list import ImmutableList

class TestImmutableList(unittest.TestCase):
    def test_init(self):
        # Test the __init__ method
        # Create an empty list
        empty_list = ImmutableList()
        self.assertEqual(empty_list.head, None)
        self.assertEqual(empty_list.tail, None)
        self.assertTrue(empty_list.is_empty)
        # Create a list with a head and a tail
        head = 1
        tail = ImmutableList(2, 3)
        list_with_head_and_tail = ImmutableList(head, tail)
        self.assertEqual(list_with_head_and_tail.head, head)
        self.assertEqual(list_with_head_and_tail.tail, tail)
        self.assertFalse(list_with_head_and_tail.is_empty)

    def test_eq(self):
        # Test the __eq__ method
        # Compare two empty lists
        empty_list1 = ImmutableList()
        empty_list2 = ImmutableList()
        self.assertEqual(empty_list1, empty_list2)
        # Compare a list with a head and a tail with an equivalent list
        head = 1
        tail = ImmutableList(2, 3)
        list1 = ImmutableList(head, tail)
        list2 = ImmutableList(head, tail)
        self.assertEqual(list1, list2)
        # Compare a list with a head and a tail with a different list
        list3 = ImmutableList(head, tail, 4)
        self.assertNotEqual(list1, list3)

    def test_str(self):
        # Test the __str__ method
        # Create an empty list and check its string representation
        empty_list = ImmutableList()
        self.assertEqual(str(empty_list), 'ImmutableList[]')
        # Create a list with a head and a tail and check its string representation
        head = 1
        tail = ImmutableList(2, 3)
        list_with_head_and_tail = ImmutableList(head, tail)
        self.assertEqual(str(list_with_head_and_tail), 'ImmutableList[1, 2, 3]')

    def test_add(self):
        # Test the __add__ method
        # Add two lists
        list1 = ImmutableList(1, 2)
        list2 = ImmutableList(3, 4)
        added_list = list1 + list2
        self.assertEqual(added_list.head, 1)
        self.assertEqual(added_list.tail.head, 2)
        self.assertEqual(added_list.tail.tail.head, 3)
        self.assertEqual(added_list.tail.tail.tail.head, 4)
        # Try to add a non- ImmutableList object
        with self.assertRaises(ValueError):
            list1 + 1

    def test_len(self):
        # Test the __len__ method
        # Check the length of an empty list
        empty_list = ImmutableList()
        self.assertEqual(len(empty_list), 0)
        # Check the length of a list with a head and a tail
        head = 1
        tail = ImmutableList(2, 3)
        list_with_head_and_tail = ImmutableList(head, tail)
        self.assertEqual(len(list_with_head_and_tail), 3)

    def test_of(self):
        # Test the of class method
        # Create a list with a head and a tail using of
        head = 1
        tail = ImmutableList(2, 3)
        list_with_head_and_tail = ImmutableList.of(head, *tail.to_list())
        self.assertEqual(list_with_head_and_tail.head, head)
        self.assertEqual(list_with_head_and_tail.tail, tail)
        # Create an empty list using of
        empty_list = ImmutableList.of()
        self.assertEqual(empty_list.head, None)
        self.assertEqual(empty_list.tail, None)
        self.assertTrue(empty_list.is_empty)

    def test_empty(self):
        # Test the empty class method
        # Create an empty list using empty
        empty_list = ImmutableList.empty()
        self.assertEqual(empty_list.head, None)
        self.assertEqual(empty_list.tail, None)
        self.assertTrue(empty_list.is_empty)

if __name__ == '__main__':
    unittest.main()