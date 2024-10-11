import pickle
import tempfile
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
        grammar.symbol2number = {"a": 1, "b": 2}
        grammar.number2symbol = {1: "a", 2: "b"}
        grammar.states = [[(1, 2)], [(3, 4)]]
        grammar.dfas = {1: ([(1, 2)], {1: 2})}
        grammar.labels = [(1, "a"), (2, "b")]
        grammar.keywords = {"c": 3, "d": 4}
        grammar.tokens = {3: 5, 4: 6}
        grammar.symbol2label = {"e": 7, "f": 8}
        grammar.start = 9
        grammar.async_keywords = True
        with tempfile.NamedTemporaryFile() as f:
            grammar.dump(f.name)
            with open(f.name, "rb") as f2:
                d = pickle.load(f2)
        self.assertEqual(d["symbol2number"], {"a": 1, "b": 2})
        self.assertEqual(d["number2symbol"], {1: "a", 2: "b"})
        self.assertEqual(d["states"], [[(1, 2)], [(3, 4)]])
        self.assertEqual(d["dfas"], {1: ([(1, 2)], {1: 2})})
        self.assertEqual(d["labels"], [(1, "a"), (2, "b")])
        self.assertEqual(d["keywords"], {"c": 3, "d": 4})
        self.assertEqual(d["tokens"], {3: 5, 4: 6})
        self.assertEqual(d["symbol2label"], {"e": 7, "f": 8})
        self.assertEqual(d["start"], 9)
        self.assertEqual(d["async_keywords"], True)

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

    def test_load(self):
        grammar = Grammar()
        grammar.dump("test.pkl")
        grammar2 = Grammar()
        grammar2.load("test.pkl")
        self.assertEqual(grammar.__dict__, grammar2.__dict__)
        os.remove("test.pkl")

    def test_loads(self):
        grammar = Grammar()
        grammar.dump("test.pkl")
        with open("test.pkl", "rb") as f:
            pkl = f.read()
        grammar2 = Grammar()
        grammar2.loads(pkl)
        self.assertEqual(grammar.__dict__, grammar2.__dict__)
        os.remove("test.pkl")

    def test_copy(self):
        grammar = Grammar()
        grammar2 = grammar.copy()
        self.assertEqual(grammar.__dict__, grammar2.__dict__)

    def test_report(self):
        grammar = Grammar()
        grammar.report()

if __name__ == '__main__':
    unittest.main()