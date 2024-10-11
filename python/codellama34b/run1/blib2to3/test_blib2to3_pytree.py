import unittest
from blib2to3.pytree import BasePattern


class TestTypeRepr(unittest.TestCase):
    def test_type_repr(self):
        result = type_repr(1)
        self.assertEqual(result, 1)

class TestConvert(unittest.TestCase):
    def test_convert(self):
        gr = Grammar()
        raw_node = (1, None, None, None)
        result = convert(gr, raw_node)
        self.assertEqual(result, Node(1, None, context=None))

class TestGenerateMatches(unittest.TestCase):
    def test_generate_matches(self):
        patterns = []
        nodes = []
        result = generate_matches(patterns, nodes)
        self.assertEqual(result, (0, {}))

if __name__ == '__main__':
    unittest.main()