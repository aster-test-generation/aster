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
        grammar._update({"symbol2number": {"a": 1}, "number2symbol": {1: "a"}})
        self.assertEqual(grammar.symbol2number, {"a": 1})
        self.assertEqual(grammar.number2symbol, {1: "a"})

    def test_load(self):
        grammar = Grammar()
        grammar.dump("test.pkl")
        grammar.load("test.pkl")
        self.assertEqual(grammar.symbol2number, {})
        self.assertEqual(grammar.number2symbol, {})
        os.remove("test.pkl")

    def test_loads(self):
        grammar = Grammar()
        grammar.dump("test.pkl")
        with open("test.pkl", "rb") as f:
            pkl = f.read()
        grammar.loads(pkl)
        self.assertEqual(grammar.symbol2number, {})
        self.assertEqual(grammar.number2symbol, {})
        os.remove("test.pkl")

    def test_copy(self):
        grammar = Grammar()
        grammar.symbol2number = {"a": 1}
        grammar.number2symbol = {1: "a"}
        grammar.dfas = {"b": ([], {})}
        grammar.keywords = {"c": 2}
        grammar.tokens = {2: "c"}
        grammar.symbol2label = {"d": 3}
        grammar.labels = [(3, "d")]
        grammar.states = [["e"]]
        grammar.start = 4
        grammar.async_keywords = True
        copied_grammar = grammar.copy()
        self.assertEqual(copied_grammar.symbol2number, {"a": 1})
        self.assertEqual(copied_grammar.number2symbol, {1: "a"})
        self.assertEqual(copied_grammar.dfas, {"b": ([], {})})
        self.assertEqual(copied_grammar.keywords, {"c": 2})
        self.assertEqual(copied_grammar.tokens, {2: "c"})
        self.assertEqual(copied_grammar.symbol2label, {"d": 3})
        self.assertEqual(copied_grammar.labels, [(3, "d")])
        self.assertEqual(copied_grammar.states, [["e"]])
        self.assertEqual(copied_grammar.start, 4)
        self.assertEqual(copied_grammar.async_keywords, True)

if __name__ == '__main__':
    unittest.main()