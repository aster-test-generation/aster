import unittest
from pymonet.immutable_list import ImmutableList

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
        head = 1
        elements = [2, 3]
        result = ImmutableList.of(head, *elements)
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
        new_element = 1
        result = instance.append(new_element)
        self.assertEqual(result, ImmutableList(1))

    def test_unshift(self):
        instance = ImmutableList()
        new_element = 1
        result = instance.unshift(new_element)
        self.assertEqual(result, ImmutableList(1))

    def test_map(self):
        instance = ImmutableList()
        fn = lambda x: x
        result = instance.map(fn)
        self.assertEqual(result, ImmutableList())

    def test_filter(self):
        instance = ImmutableList()
        fn = lambda x: x
        result = instance.filter(fn)
        self.assertEqual(result, ImmutableList())

    def test_find(self):
        instance = ImmutableList()
        fn = lambda x: x
        result = instance.find(fn)
        self.assertEqual(result, None)

    def test_reduce(self):
        instance = ImmutableList()
        fn = lambda x, y: x
        acc = 1
        result = instance.reduce(fn, acc)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()