import unittest
from blib2to3.pytree import type_repr, convert, generate_matches, BasePattern
from blib2to3.pgen2.grammar import Grammar
from blib2to3.pytree import Node, Leaf, BasePattern


class TestTypeRepr(unittest.TestCase):
    def test_type_repr_existing(self):
        global _type_reprs
        _type_reprs = {1: 'NAME'}
        result = type_repr(1)
        self.assertEqual(result, 'NAME')

    def test_type_repr_new(self):
        global _type_reprs
        _type_reprs = {}
        result = type_repr(999)
        self.assertEqual(result, 999)

class TestConvert(unittest.TestCase):
    def setUp(self):
        self.grammar = Grammar()

    def test_convert_with_children(self):
        raw_node = (1, 'value', ('context', (1, 1)), [Leaf(2, 'child')])
        result = convert(self.grammar, raw_node)
        self.assertIsInstance(result, Node)
        self.assertEqual(result.type, 1)
        self.assertEqual(result.children[0].type, 2)

    def test_convert_without_children(self):
        raw_node = (1, 'value', ('context', (1, 1)), None)
        result = convert(self.grammar, raw_node)
        self.assertIsInstance(result, Leaf)
        self.assertEqual(result.type, 1)
        self.assertEqual(result.value, 'value')

class TestGenerateMatches(unittest.TestCase):
    def test_generate_matches_no_patterns(self):
        patterns = []
        nodes = [Leaf(1, 'value')]
        result = list(generate_matches(patterns, nodes))
        self.assertEqual(result, [(0, {})])

    def test_generate_matches_with_patterns(self):
        class MockPattern(BasePattern):
            def generate_matches(self, nodes):
                yield (1, {'key': 'value'})

        patterns = [MockPattern()]
        nodes = [Leaf(1, 'value')]
        result = list(generate_matches(patterns, nodes))
        self.assertEqual(result, [(1, {'key': 'value'})])

if __name__ == '__main__':
    unittest.main()