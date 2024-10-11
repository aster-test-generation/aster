import unittest
from blib2to3.pytree import Node, Leaf, convert, generate_matches


class TestPytree(unittest.TestCase):
    def test_convert(self):
        raw_node = (1, 'value', (None, (1, 1)), None)
        node = convert(None, raw_node)
        self.assertEqual(node.type, 1)
        self.assertEqual(node.value, 'value')
        self.assertEqual(node.context, (None, (1, 1)))
        self.assertIsNone(node.children)

    def test_generate_matches(self):
        patterns = [Node(1, []), Node(2, [])]
        nodes = [Leaf(1, 'value1'), Leaf(2, 'value2')]
        matches = list(generate_matches(patterns, nodes))
        self.assertEqual(len(matches), 2)
        self.assertEqual(matches[0][0], 1)
        self.assertEqual(matches[0][1], {1: Leaf(1, 'value1'), 2: Leaf(2, 'value2')})
        self.assertEqual(matches[1][0], 2)
        self.assertEqual(matches[1][1], {1: Leaf(1, 'value1'), 2: Leaf(2, 'value2')})

if __name__ == '__main__':
    unittest.main()