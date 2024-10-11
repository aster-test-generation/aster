import unittest
from blib2to3.pytree import Pattern


class TestLeafPattern(unittest.TestCase):
    def test_init(self):
        pattern = LeafPattern(type=1, content="test", name="name")
        self.assertEqual(pattern.type, 1)
        self.assertEqual(pattern.content, "test")
        self.assertEqual(pattern.name, "name")

    def test_match(self):
        pattern = LeafPattern(type=1, content="test", name="name")
        node = Leaf(type=1, value="test")
        self.assertTrue(pattern.match(node))

    def test_submatch(self):
        pattern = LeafPattern(type=1, content="test", name="name")
        node = Leaf(type=1, value="test")
        self.assertTrue(pattern._submatch(node))

if __name__ == '__main__':
    unittest.main()