import unittest
from blib2to3.pytree import BasePattern


class TestLeafPattern(unittest.TestCase):
    def test_init(self):
        instance = LeafPattern()
        self.assertIsInstance(instance, LeafPattern)

    def test_match(self):
        instance = LeafPattern()
        result = instance.match(Leaf(1, 'test'))
        self.assertEqual(result, False)

    def test_submatch(self):
        instance = LeafPattern()
        result = instance._LeafPattern__submatch(Leaf(1, 'test'))
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()