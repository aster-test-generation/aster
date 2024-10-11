import tempfile
import unittest
from blib2to3.pgen2.grammar import Grammar


class TestGrammar(unittest.TestCase):
    def test_dump(self):
        grammar = Grammar()
        grammar.symbol2number = {"a": 1, "b": 2}
        grammar.number2symbol = {1: "a", 2: "b"}
        grammar.states = [[(1, 2)]]
        grammar.dfas = {(1, 2): ([[(1, 2)]], {})}
        grammar.labels = [(0, "EMPTY")]
        grammar.keywords = {"a": 1, "b": 2}
        grammar.tokens = {1: 1, 2: 2}
        grammar.symbol2label = {"a": 1, "b": 2}
        grammar.start = 1
        grammar.async_keywords = False

        with tempfile.NamedTemporaryFile() as f:
            grammar.dump(f.name)
            with open(f.name, "rb") as g:
                new_grammar = Grammar()
                new_grammar.load(g)

        self.assertEqual(grammar.symbol2number, new_grammar.symbol2number)
        self.assertEqual(grammar.number2symbol, new_grammar.number2symbol)
        self.assertEqual(grammar.states, new_grammar.states)
        self.assertEqual(grammar.dfas, new_grammar.dfas)
        self.assertEqual(grammar.labels, new_grammar.labels)
        self.assertEqual(grammar.keywords, new_grammar.keywords)
        self.assertEqual(grammar.tokens, new_grammar.tokens)
        self.assertEqual(grammar.symbol2label, new_grammar.symbol2label)
        self.assertEqual(grammar.start, new_grammar.start)
        self.assertEqual(grammar.async_keywords, new_grammar.async_keywords)

    def test_copy(self):
        grammar = Grammar()
        grammar.symbol2number = {"a": 1, "b": 2}
        grammar.number2symbol = {1: "a", 2: "b"}
        grammar.states = [[(1, 2)]]
        grammar.dfas = {(1, 2): ([[(1, 2)]], {})}
        grammar.labels = [(0, "EMPTY")]
        grammar.keywords = {"a": 1, "b": 2}
        grammar.tokens = {1: 1, 2: 2}
        grammar.symbol2label = {"a": 1, "b": 2}
        grammar.start = 1
        grammar.async_keywords = False

        new_grammar = grammar.copy()

        self.assertEqual(grammar.symbol2number, new_grammar.symbol2number)
        self.assertEqual(grammar.number2symbol, new_grammar.number2symbol)
        self.assertEqual(grammar.states, new_grammar.states)
        self.assertEqual(grammar.dfas, new_grammar.dfas)
        self.assertEqual(grammar.labels, new_grammar.labels)
        self.assertEqual(grammar.keywords, new_grammar.keywords)
        self.assertEqual(grammar.tokens, new_grammar.tokens)
        self.assertEqual(grammar.symbol2label, new_grammar.symbol2label)
        self.assertEqual(grammar.start, new_grammar.start)
        self.assertEqual(grammar.async_keywords, new_grammar.async_keywords)

    def test_report(self):
        grammar = Grammar()
        grammar.symbol2number = {"a": 1, "b": 2}
        grammar.number2symbol = {1: "a", 2: "b"}
        grammar.states = [[(1, 2)]]
        grammar.dfas = {(1, 2): ([[(1, 2)]], {})}
        grammar.labels = [(0, "EMPTY")]
        grammar.keywords = {"a": 1, "b": 2}
        grammar.tokens = {1: 1, 2: 2}
        grammar.symbol2label = {"a": 1, "b": 2}
        grammar.start = 1
        grammar.async_keywords = False

        with self.assertRaises(AttributeError):
            grammar.report()

if __name__ == '__main__':
    unittest.main()