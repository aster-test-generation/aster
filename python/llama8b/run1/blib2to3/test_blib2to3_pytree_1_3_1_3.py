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
        node = Leaf('value', 'content')
        self.assertTrue(leaf_pattern.match(node))

    def test_submatch(self):
        leaf_pattern = LeafPattern(type=1, content='content', name='name')
        node = Leaf('value', 'content')
        self.assertTrue(leaf_pattern._submatch(node))

    def test_match_failure(self):
        leaf_pattern = LeafPattern(type=1, content='content', name='name')
        node = Leaf('wrong_value', 'wrong_content')
        self.assertFalse(leaf_pattern.match(node))

    def test_str_method(self):
        leaf_pattern = LeafPattern(type=1, content='content', name='name')
        result = str(leaf_pattern)
        self.assertEqual(result, 'LeafPattern(type=1, content=content, name=name)')

    def test_repr_method(self):
        leaf_pattern = LeafPattern(type=1, content='content', name='name')
        result = repr(leaf_pattern)
        self.assertEqual(result, 'LeafPattern(type=1, content=content, name=name)')

if __name__ == '__main__':
    unittest.main()