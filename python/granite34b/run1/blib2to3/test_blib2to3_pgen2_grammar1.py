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