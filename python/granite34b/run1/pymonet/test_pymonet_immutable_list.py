import unittest
from pymonet.immutable_list import ImmutableList


class TestImmutableList(unittest.TestCase):
    def test_init(self):
        # Test the __init__ method
        # Test with different values for head, tail, and is_empty
        # Assert that the attributes are set correctly
        pass

    def test_eq(self):
        # Test the __eq__ method
        # Test with different instances of ImmutableList
        # Assert that the equality check returns the expected result
        pass

    def test_str(self):
        # Test the __str__ method
        # Test with different instances of ImmutableList
        # Assert that the string representation is as expected
        pass

    def test_add(self):
        # Test the __add__ method
        # Test with different instances of ImmutableList
        # Assert that the concatenation is as expected
        pass

    def test_len(self):
        # Test the __len__ method
        # Test with different instances of ImmutableList
        # Assert that the length is as expected
        pass

    def test_of(self):
        # Test the of class method
        # Test with different values for head and elements
        # Assert that the returned instance is as expected
        pass

    def test_empty(self):
        # Test the empty class method
        # Assert that the returned instance is empty
        pass

    def test_to_list(self):
        # Test the to_list method
        # Test with different instances of ImmutableList
        # Assert that the list representation is as expected
        pass

    def test_append(self):
        # Test the append method
        # Test with different instances of ImmutableList and new_element
        # Assert that the new instance is as expected
        pass

    def test_unshift(self):
        # Test the unshift method
        # Test with different instances of ImmutableList and new_element
        # Assert that the new instance is as expected
        pass

    def test_map(self):
        # Test the map method
        # Test with different instances of ImmutableList and a function
        # Assert that the new instance is as expected
        pass

    def test_filter(self):
        # Test the filter method
        # Test with different instances of ImmutableList and a function
        # Assert that the new instance is as expected
        pass

    def test_find(self):
        # Test the find method
        # Test with different instances of ImmutableList and a function
        # Assert that the result is as expected
        pass

    def test_reduce(self):
        # Test the reduce method
        # Test with different instances of ImmutableList, a function, and an initial value
        # Assert that the result is as expected
        pass

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

class TestImmutableList(unittest.TestCase):
    def test_init(self):
        # Test the __init__ method
        self.assertEqual(ImmutableList().head, None)
        self.assertEqual(ImmutableList().tail, None)
        self.assertEqual(ImmutableList().is_empty, True)
        self.assertEqual(ImmutableList(1).head, 1)
        self.assertEqual(ImmutableList(1).tail, None)
        self.assertEqual(ImmutableList(1).is_empty, False)
        self.assertEqual(ImmutableList(1, 2).head, 1)
        self.assertEqual(ImmutableList(1, 2).tail.head, 2)
        self.assertEqual(ImmutableList(1, 2).tail.tail, None)
        self.assertEqual(ImmutableList(1, 2).is_empty, False)

    def test_eq(self):
        # Test the __eq__ method
        self.assertEqual(ImmutableList(1), ImmutableList(1))
        self.assertEqual(ImmutableList(1, 2), ImmutableList(1, 2))
        self.assertNotEqual(ImmutableList(1), ImmutableList(2))
        self.assertNotEqual(ImmutableList(1, 2), ImmutableList(1, 3))
        self.assertNotEqual(ImmutableList(1, 2),ImmutableList(2, 3))
        self.assertNotEqual(ImmutableList(1, 2),ImmutableList(2))

    def test_str(self):
        # Test the __str__ method
        self.assertEqual(str(ImmutableList()), 'ImmutableList[]')
        self.assertEqual(str(ImmutableList(1)), 'ImmutableList[1]')
        self.assertEqual(str(ImmutableList(1, 2)), 'ImmutableList[1, 2]')

    def test_add(self):
        # Test the __add__ method
        self.assertEqual(ImmutableList(1) + ImmutableList(2), ImmutableList(1, 2))
        self.assertEqual(ImmutableList(1, 2) + ImmutableList(3), ImmutableList(1, 2, 3))
        self.assertEqual(ImmutableList(1, 2) + ImmutableList(3, 4), ImmutableList(1, 2, 3, 4))
        self.assertEqual(ImmutableList(1) + ImmutableList(2) + ImmutableList(3), ImmutableList(1, 2, 3))

    def test_len(self):
        # Test the __len__ method
        self.assertEqual(len(ImmutableList()), 0)
        self.assertEqual(len(ImmutableList(1)), 1)
        self.assertEqual(len(ImmutableList(1, 2)), 2)
        self.assertEqual(len(ImmutableList(1, 2, 3)), 3)

    def test_of(self):
        # Test the of class method
        self.assertEqual(ImmutableList.of(1), ImmutableList(1))
        self.assertEqual(ImmutableList.of(1, 2), ImmutableList(1, 2))
        self.assertEqual(ImmutableList.of(1, 2, 3), ImmutableList(1, 2, 3))

    def test_empty(self):
        # Test the empty class method
        self.assertEqual(ImmutableList.empty(), ImmutableList())

    def test_to_list(self):
        # Test the to_list method
        self.assertEqual(ImmutableList().to_list(), [])
        self.assertEqual(ImmutableList(1).to_list(), [1])
        self.assertEqual(ImmutableList(1, 2).to_list(), [1, 2])
        self.assertEqual(ImmutableList(1, 2, 3).to_list(), [1, 2, 3])

    def test_append(self):
        # Test the append method
        self.assertEqual(ImmutableList(1).append(2), ImmutableList(1, 2))
        self.assertEqual(ImmutableList(1, 2).append(3), ImmutableList(1, 2, 3))
        self.assertEqual(ImmutableList(1, 2, 3).append(4), ImmutableList(1, 2, 3, 4))

    def test_unshift(self):
        # Test the unshift method
        self.assertEqual(ImmutableList(1).unshift(2), ImmutableList(2, 1))
        self.assertEqual(ImmutableList(1, 2).unshift(3), ImmutableList(3, 1, 2))
        self.assertEqual(ImmutableList(1, 2, 3).unshift(4), ImmutableList(4, 1, 2, 3))


def test_init():
    empty_list = ImmutableList()
    assert empty_list.head is None
    assert empty_list.tail is None
    assert empty_list.is_empty is True

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list.head == 1
    assert non_empty_list.tail.head == 2
    assert non_empty_list.tail.tail.head == 3
    assert non_empty_list.tail.tail.tail is None
    assert non_empty_list.is_empty is False

def test_eq():
    empty_list1 = ImmutableList()
    empty_list2 = ImmutableList()
    assert empty_list1 == empty_list2

    non_empty_list1 = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    non_empty_list2 = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list1 == non_empty_list2

def test_str():
    empty_list = ImmutableList()
    assert str(empty_list) == 'ImmutableList[]'

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert str(non_empty_list) == 'ImmutableList[1, 2, 3]'

def test_add():
    empty_list = ImmutableList()
    assert empty_list + empty_list == empty_list

    non_empty_list1 = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    non_empty_list2 = ImmutableList(4, ImmutableList(5, ImmutableList(6)))
    assert non_empty_list1 + non_empty_list2 == ImmutableList(1, ImmutableList(2, ImmutableList(3, 4, 5, 6)))

def test_len():
    empty_list = ImmutableList()
    assert len(empty_list) == 0

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert len(non_empty_list) == 3

def test_of():
    empty_list = ImmutableList.of()
    assert empty_list.head is None
    assert empty_list.tail is None
    assert empty_list.is_empty is True

    non_empty_list = ImmutableList.of(1, 2, 3)
    assert non_empty_list.head == 1
    assert non_empty_list.tail.head == 2
    assert non_empty_list.tail.tail.head == 3
    assert non_empty_list.tail.tail.tail is None
    assert non_empty_list.is_empty is False

def test_empty():
    empty_list = ImmutableList.empty()
    assert empty_list.head is None
    assert empty_list.tail is None
    assert empty_list.is_empty is True

def test_to_list():
    empty_list = ImmutableList()
    assert empty_list.to_list() == []

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list.to_list() == [1, 2, 3]

def test_append():
    empty_list = ImmutableList()
    assert empty_list.append(1) == ImmutableList(1)

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list.append(4) == ImmutableList(1, ImmutableList(2, ImmutableList(3, 4)))

def test_unshift():
    empty_list = ImmutableList()
    assert empty_list.unshift(1) == ImmutableList(1)

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list.unshift(4) == ImmutableList(4, ImmutableList(1, ImmutableList(2, ImmutableList(3))))

def test_map():
    empty_list = ImmutableList()
    assert empty_list.map(lambda x: x + 1) == empty_list

    non_empty_list = ImmutableList(1, ImmutableList(2, ImmutableList(3)))
    assert non_empty_list.map(lambda x: x + 1) == ImmutableList(2, ImmutableList(3, ImmutableList(4)))

if __name__ == '__main__':
    unittest.main()