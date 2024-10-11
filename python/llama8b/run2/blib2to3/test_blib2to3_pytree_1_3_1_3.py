import unittest
from blib2to3.pytree import LeafPattern


class TestLeafPattern(unittest.TestCase):
    def test_init(self):
        leaf_pattern = LeafPattern(type=1, content='content', name='name')
        self.assertEqual(leaf_pattern.type, 1)
        self.assertEqual(leaf_pattern.content, 'content')
        self.assertEqual(leaf_pattern.name, 'name')

    def test_match(self):
        leaf_pattern = LeafPattern(type=1, content='content', name='name')
        node = Leaf('content')
        self.assertTrue(leaf_pattern.match(node))

    def test_submatch(self):
        leaf_pattern = LeafPattern(content='content')
        node = Leaf('content')
        self.assertTrue(leaf_pattern._submatch(node))

    def test_init_with_none(self):
        leaf_pattern = LeafPattern()
        self.assertIsNone(leaf_pattern.type)
        self.assertIsNone(leaf_pattern.content)
        self.assertIsNone(leaf_pattern.name)

    def test_match_with_none(self):
        leaf_pattern = LeafPattern()
        node = Leaf('content')
        self.assertFalse(leaf_pattern.match(node))

    def test_str_method(self):
        leaf_pattern = LeafPattern(type=1, content='content', name='name')
        result = str(leaf_pattern)
        self.assertEqual(result, "LeafPattern(type=1, content='content', name='name')")

    def test_repr_method(self):
        leaf_pattern = LeafPattern(type=1, content='content', name='name')
        result = repr(leaf_pattern)
        self.assertEqual(result, "LeafPattern(type=1, content='content', name='name')")

    def test_eq_method(self):
        leaf_pattern1 = LeafPattern(type=1, content='content', name='name')
        leaf_pattern2 = LeafPattern(type=1, content='content', name='name')
        self.assertTrue(leaf_pattern1 == leaf_pattern2)

if __name__ == '__main__':
    unittest.main()