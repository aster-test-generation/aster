import unittest
from blib2to3.pytree import LeafPattern, Leaf


class TestLeafPattern(unittest.TestCase):
    def test_init_with_type(self):
        instance = LeafPattern(type=100)
        self.assertEqual(instance.type, 100)

    def test_init_with_content(self):
        instance = LeafPattern(content="test")
        self.assertEqual(instance.content, "test")

    def test_init_with_name(self):
        instance = LeafPattern(name="test_name")
        self.assertEqual(instance.name, "test_name")

    def test_init_with_invalid_type(self):
        with self.assertRaises(AssertionError):
            LeafPattern(type=300)

    def test_init_with_invalid_content(self):
        with self.assertRaises(AssertionError):
            LeafPattern(content=123)

    def test_match_with_leaf_node(self):
        leaf = Leaf(1, "value")
        instance = LeafPattern(type=1, content="value")
        result = instance.match(leaf)
        self.assertTrue(result)

    def test_match_with_non_leaf_node(self):
        class FakeNode:
            pass
        fake_node = FakeNode()
        instance = LeafPattern()
        result = instance.match(fake_node)
        self.assertFalse(result)

    def test_submatch_with_matching_content(self):
        leaf = Leaf(1, "value")
        instance = LeafPattern(content="value")
        result = instance._submatch(leaf)
        self.assertTrue(result)

    def test_submatch_with_non_matching_content(self):
        leaf = Leaf(1, "value")
        instance = LeafPattern(content="different")
        result = instance._submatch(leaf)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()