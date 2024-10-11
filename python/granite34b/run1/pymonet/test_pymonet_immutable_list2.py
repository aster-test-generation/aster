import unittest
from pymonet.immutable_list import ImmutableList

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

if __name__ == '__main__':
    unittest.main()