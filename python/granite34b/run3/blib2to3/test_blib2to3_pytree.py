import unittest
from blib2to3.pygram import *


class TestPytree(unittest.TestCase):
    def test_type_repr(self):
        self.assertEqual(type_repr(1), 1)
        self.assertEqual(type_repr(2), 2)
        self.assertEqual(type_repr(3), 3)

    def test_convert(self):
        gr = Grammar()
        raw_node = (1, 'value', None, None)
        self.assertEqual(convert(gr, raw_node), Leaf(1, 'value'))

    def test_generate_matches(self):
        patterns = [BasePattern(), BasePattern()]
        nodes = [Node(1, []), Node(2, [])]
        matches = generate_matches(patterns, nodes)
        self.assertEqual(list(matches), [(1, {}), (1, {})])

if __name__ == '__main__':
    unittest.main()