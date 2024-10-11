import unittest
from pymonet.immutable_list import ImmutableList

class TestImmutableList(unittest.TestCase):
    def test_init(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.head, 1)
        self.assertEqual(instance.tail, ImmutableList(2))
        self.assertEqual(instance.is_empty, False)

    def test_eq(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance, ImmutableList(1, ImmutableList(2), False))

    def test_str(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(str(instance), 'ImmutableList[1, 2]')

    def test_add(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance + ImmutableList(3), ImmutableList(1, ImmutableList(2, ImmutableList(3))))

    def test_len(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(len(instance), 2)

    def test_of(self):
        self.assertEqual(ImmutableList.of(1, 2, 3), ImmutableList(1, ImmutableList(2, ImmutableList(3))))

    def test_empty(self):
        self.assertEqual(ImmutableList.empty(), ImmutableList(is_empty=True))

    def test_to_list(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.to_list(), [1, 2])

    def test_append(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.append(3), ImmutableList(1, ImmutableList(2, ImmutableList(3))))

    def test_unshift(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.unshift(0), ImmutableList(0, ImmutableList(1, ImmutableList(2))))

    def test_map(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.map(lambda x: x * 2), ImmutableList(2, ImmutableList(4)))

    def test_filter(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.filter(lambda x: x > 1), ImmutableList(2))

    def test_find(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.find(lambda x: x > 1), 2)

    def test_reduce(self):
        instance = ImmutableList(1, ImmutableList(2), False)
        self.assertEqual(instance.reduce(lambda acc, x: acc + x, 0), 3)

if __name__ == '__main__':
    unittest.main()