import os
import unittest
from blib2to3.pgen2.grammar import Grammar


class TestGrammar(unittest.TestCase):
    def test_init(self):
        grammar = Grammar()
        self.assertEqual(grammar.symbol2number, {})
        self.assertEqual(grammar.number2symbol, {})
        self.assertEqual(grammar.states, [])
        self.assertEqual(grammar.dfas, {})
        self.assertEqual(grammar.labels, [(0, "EMPTY")])
        self.assertEqual(grammar.keywords, {})
        self.assertEqual(grammar.tokens, {})
        self.assertEqual(grammar.symbol2label, {})
        self.assertEqual(grammar.start, 256)
        self.assertEqual(grammar.async_keywords, False)

    def test_dump(self):
        grammar = Grammar()
        grammar.dump("test.pkl")
        self.assertTrue(os.path.exists("test.pkl"))
        os.remove("test.pkl")

    def test_update(self):
        grammar = Grammar()
        grammar._update({"symbol2number": {"test": 1}})
        self.assertEqual(grammar.symbol2number, {"test": 1})

    def test_load(self):
        grammar = Grammar()
        grammar.dump("test.pkl")
        grammar.load("test.pkl")
        self.assertTrue(os.path.exists("test.pkl"))
        os.remove("test.pkl")

    def test_loads(self):
        grammar = Grammar()
        grammar.dump("test.pkl")
        with open("test.pkl", "rb") as f:
            pkl = f.read()
        grammar.loads(pkl)
        self.assertTrue(os.path.exists("test.pkl"))
        os.remove("test.pkl")

    def test_copy(self):
        grammar = Grammar()
        grammar.symbol2number = {"test": 1}
        grammar.number2symbol = {"1": "test"}
        grammar.states = [["test"]]
        grammar.dfas = {"test": [["test"]]}
        grammar.labels = [(0, "test")]
        grammar.keywords = {"test": 1}
        grammar.tokens = {"1": "test"}
        grammar.symbol2label = {"test": 1}
        grammar.start = 1
        grammar.async_keywords = True
        copied_grammar = grammar.copy()
        self.assertEqual(grammar.symbol2number, copied_grammar.symbol2number)
        self.assertEqual(grammar.number2symbol, copied_grammar.number2symbol)
        self.assertEqual(grammar.states, copied_grammar.states)
        self.assertEqual(grammar.dfas, copied_grammar.dfas)
        self.assertEqual(grammar.labels, copied_grammar.labels)
        self.assertEqual(grammar.keywords, copied_grammar.keywords)
        self.assertEqual(grammar.tokens, copied_grammar.tokens)
        self.assertEqual(grammar.symbol2label, copied_grammar.symbol2label)
        self.assertEqual(grammar.start, copied_grammar.start)
        self.assertEqual(grammar.async_keywords, copied_grammar.async_keywords)

if __name__ == '__main__':
    unittest.main()