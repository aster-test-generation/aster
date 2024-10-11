import pickle
import unittest
from blib2to3.pgen2.grammar import Grammar


class TestGrammar(unittest.TestCase):
    def test_dump(self):
        grammar = Grammar()
        grammar.dump("test.pkl")
        with open("test.pkl", "rb") as f:
            data = pickle.load(f)
        self.assertEqual(data["symbol2number"], grammar.symbol2number)
        self.assertEqual(data["number2symbol"], grammar.number2symbol)
        self.assertEqual(data["dfas"], grammar.dfas)
        self.assertEqual(data["keywords"], grammar.keywords)
        self.assertEqual(data["tokens"], grammar.tokens)
        self.assertEqual(data["symbol2label"], grammar.symbol2label)
        self.assertEqual(data["labels"], grammar.labels)
        self.assertEqual(data["states"], grammar.states)
        self.assertEqual(data["start"], grammar.start)
        self.assertEqual(data["async_keywords"], grammar.async_keywords)

    def test_load(self):
        grammar = Grammar()
        grammar.dump("test.pkl")
        grammar2 = Grammar()
        grammar2.load("test.pkl")
        self.assertEqual(grammar.symbol2number, grammar2.symbol2number)
        self.assertEqual(grammar.number2symbol, grammar2.number2symbol)
        self.assertEqual(grammar.dfas, grammar2.dfas)
        self.assertEqual(grammar.keywords, grammar2.keywords)
        self.assertEqual(grammar.tokens, grammar2.tokens)
        self.assertEqual(grammar.symbol2label, grammar2.symbol2label)
        self.assertEqual(grammar.labels, grammar2.labels)
        self.assertEqual(grammar.states, grammar2.states)
        self.assertEqual(grammar.start, grammar2.start)
        self.assertEqual(grammar.async_keywords, grammar2.async_keywords)

    def test_loads(self):
        grammar = Grammar()
        grammar.dump("test.pkl")
        with open("test.pkl", "rb") as f:
            data = f.read()
        grammar2 = Grammar()
        grammar2.loads(data)
        self.assertEqual(grammar.symbol2number, grammar2.symbol2number)
        self.assertEqual(grammar.number2symbol, grammar2.number2symbol)
        self.assertEqual(grammar.dfas, grammar2.dfas)
        self.assertEqual(grammar.keywords, grammar2.keywords)
        self.assertEqual(grammar.tokens, grammar2.tokens)
        self.assertEqual(grammar.symbol2label, grammar2.symbol2label)
        self.assertEqual(grammar.labels, grammar2.labels)
        self.assertEqual(grammar.states, grammar2.states)
        self.assertEqual(grammar.start, grammar2.start)
        self.assertEqual(grammar.async_keywords, grammar2.async_keywords)

    def test_copy(self):
        grammar = Grammar()
        grammar2 = grammar.copy()
        self.assertEqual(grammar.symbol2number, grammar2.symbol2number)
        self.assertEqual(grammar.number2symbol, grammar2.number2symbol)
        self.assertEqual(grammar.dfas, grammar2.dfas)
        self.assertEqual(grammar.keywords, grammar2.keywords)
        self.assertEqual(grammar.tokens, grammar2.tokens)
        self.assertEqual(grammar.symbol2label, grammar2.symbol2label)
        self.assertEqual(grammar.labels, grammar2.labels)
        self.assertEqual(grammar.states, grammar2.states)
        self.assertEqual(grammar.start, grammar2.start)
        self.assertEqual(grammar.async_keywords, grammar2.async_keywords)

if __name__ == '__main__':
    unittest.main()