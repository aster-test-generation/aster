import unittest
from blib2to3.pytree import Node, Leaf, convert, generate_matches


class TestPytree(unittest.TestCase):
    def test_type_repr(self):
        self.assertEqual(type_repr(1), 'LPAR')
        self.assertEqual(type_repr(2), 2)

    def test_convert(self):
        raw_node = (1, 'value', (None, (1, 1)), None)
        node = convert(None, raw_node)
        self.assertIsInstance(node, Leaf)
        self.assertEqual(node.type, 1)
        self.assertEqual(node.value, 'value')
        self.assertEqual(node.context, (None, (1, 1)))

    def test_generate_matches(self):
        patterns = [BasePattern(), BasePattern()]
        nodes = [Node(1, []), Node(2, [])]
        matches = list(generate_matches(patterns, nodes))
        self.assertEqual(len(matches), 1)
        self.assertEqual(matches[0][0], 2)
        self.assertEqual(matches[0][1], {})

if __name__ == '__main__':
    unittest.main()