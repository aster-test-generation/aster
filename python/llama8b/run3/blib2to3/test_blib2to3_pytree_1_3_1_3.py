import unittest
from blib2to3.pytree import Grammar, LeafPattern, BasePattern
from blib2to3.pgen2.grammar import NL, RawNode, _Results, _Convert
from blib2to3.pytree import Node, Leaf
from io import StringIO
from typing import Any, Callable, Dict, Iterator, List, Optional, Text, Tuple, TypeVar, Union, Set, Iterable, Sequence


class TestBlib2to3(unittest.TestCase):
    def test_Grammar_init(self):
        grammar = Grammar()
        self.assertEqual(grammar.__class__, Grammar)

    def test_LeafPattern_init(self):
        leaf_pattern = LeafPattern(type=1, content='content', name='name')
        self.assertEqual(leaf_pattern.type, 1)
        self.assertEqual(leaf_pattern.content, 'content')
        self.assertEqual(leaf_pattern.name, 'name')

    def test_LeafPattern_match(self):
        leaf_pattern = LeafPattern(type=1, content='content', name='name')
        node = Leaf(value='content')
        self.assertTrue(leaf_pattern.match(node))

    def test_LeafPattern_submatch(self):
        leaf_pattern = LeafPattern(content='content')
        node = Leaf(value='content')
        self.assertTrue(leaf_pattern._submatch(node))

    def test_Grammar_match(self):
        grammar = Grammar()
        node = Node()
        self.assertFalse(grammar.match(node))

    def test_Grammar_convert(self):
        grammar = Grammar()
        raw_node = RawNode(1, None, None, None)
        self.assertEqual(grammar.convert(raw_node), None)

    def test_Grammar_results(self):
        grammar = Grammar()
        self.assertEqual(grammar.results, {})

    def test_Grammar_convert_type(self):
        grammar = Grammar()
        raw_node = RawNode(1, None, None, None)
        self.assertIsInstance(grammar.convert(raw_node), Any)

    def test_Grammar_convert_type_error(self):
        grammar = Grammar()
        raw_node = RawNode(1, None, None, None)
        with self.assertRaises(TypeError):
            grammar.convert(raw_node, 'wrong_type')

    def test_Grammar_convert_type_error_message(self):
        grammar = Grammar()
        raw_node = RawNode(1, None, None, None)
        with self.assertRaises(TypeError) as e:
            grammar.convert(raw_node, 'wrong_type')
        self.assertEqual(str(e.exception), "convert() got an unexpected keyword argument 'wrong_type'")

if __name__ == '__main__':
    unittest.main()