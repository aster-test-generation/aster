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

    def test_match_with_non_leaf_node(self):
        instance = LeafPattern()
        node = BasePattern()  # Assuming BasePattern is a valid non-Leaf node
        result = instance.match(node)
        self.assertFalse(result)

    def test_match_with_leaf_node(self):
        instance = LeafPattern()
        node = Leaf(1, "value")  # Assuming Leaf is a valid Leaf node
        result = instance.match(node)
        self.assertTrue(result)

    def test_submatch_with_matching_content(self):
        instance = LeafPattern(content="value")
        node = Leaf(1, "value")  # Assuming Leaf is a valid Leaf node
        result = instance._submatch(node)
        self.assertTrue(result)

    def test_submatch_with_non_matching_content(self):
        instance = LeafPattern(content="value")
        node = Leaf(1, "different_value")  # Assuming Leaf is a valid Leaf node
        result = instance._submatch(node)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()