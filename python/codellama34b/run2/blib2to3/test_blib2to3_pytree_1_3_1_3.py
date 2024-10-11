import unittest
from blib2to3.pytree import BasePattern


class TestLeafPattern(unittest.TestCase):
    def test_init(self):
        instance = LeafPattern()
        self.assertEqual(instance.type, None)
        self.assertEqual(instance.content, None)
        self.assertEqual(instance.name, None)

    def test_match(self):
        instance = LeafPattern()
        node = Leaf()
        result = instance.match(node)
        self.assertEqual(result, False)

    def test_submatch(self):
        instance = LeafPattern()
        node = Leaf()
        result = instance._submatch(node)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()