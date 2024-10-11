import unittest
from blib2to3.pgen2.grammar import *

class TestGrammar(unittest.TestCase):
    def test_init(self):
        instance = Grammar()
        self.assertEqual(instance.symbol2number, {})
        self.assertEqual(instance.number2symbol, {})
        self.assertEqual(instance.states, [])
        self.assertEqual(instance.dfas, {})
        self.assertEqual(instance.labels, [(0, "EMPTY")])
        self.assertEqual(instance.keywords, {})
        self.assertEqual(instance.tokens, {})
        self.assertEqual(instance.symbol2label, {})
        self.assertEqual(instance.start, 256)
        self.assertEqual(instance.async_keywords, False)

    def test_dump(self):
        instance = Grammar()
        filename = "test.txt"
        instance.dump(filename)
        self.assertTrue(os.path.exists(filename))

    def test_load(self):
        instance = Grammar()
        filename = "test.txt"
        instance.dump(filename)
        instance.load(filename)
        self.assertEqual(instance.symbol2number, {})
        self.assertEqual(instance.number2symbol, {})
        self.assertEqual(instance.states, [])
        self.assertEqual(instance.dfas, {})
        self.assertEqual(instance.labels, [(0, "EMPTY")])
        self.assertEqual(instance.keywords, {})
        self.assertEqual(instance.tokens, {})
        self.assertEqual(instance.symbol2label, {})
        self.assertEqual(instance.start, 256)
        self.assertEqual(instance.async_keywords, False)

    def test_loads(self):
        instance = Grammar()
        pkl = b"test"
        instance.loads(pkl)
        self.assertEqual(instance.symbol2number, {})
        self.assertEqual(instance.number2symbol, {})
        self.assertEqual(instance.states, [])
        self.assertEqual(instance.dfas, {})
        self.assertEqual(instance.labels, [(0, "EMPTY")])
        self.assertEqual(instance.keywords, {})
        self.assertEqual(instance.tokens, {})
        self.assertEqual(instance.symbol2label, {})
        self.assertEqual(instance.start, 256)
        self.assertEqual(instance.async_keywords, False)

    def test_copy(self):
        instance = Grammar()
        new = instance.copy()
        self.assertEqual(new.symbol2number, {})
        self.assertEqual(new.number2symbol, {})
        self.assertEqual(new.states, [])
        self.assertEqual(new.dfas, {})
        self.assertEqual(new.labels, [(0, "EMPTY")])
        self.assertEqual(new.keywords, {})
        self.assertEqual(new.tokens, {})
        self.assertEqual(new.symbol2label, {})
        self.assertEqual(new.start, 256)
        self.assertEqual(new.async_keywords, False)

    def test_report(self):
        instance = Grammar()
        instance.report()

if __name__ == '__main__':
    unittest.main()