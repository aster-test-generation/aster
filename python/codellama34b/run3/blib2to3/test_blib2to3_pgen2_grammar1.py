import unittest
from blib2to3.pgen2.grammar import Grammar, opmap_raw, opmap

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
        filename = "test.pkl"
        instance.dump(filename)
        self.assertEqual(os.path.exists(filename), True)
        os.remove(filename)

    def test_load(self):
        instance = Grammar()
        filename = "test.pkl"
        instance.dump(filename)
        self.assertEqual(os.path.exists(filename), True)
        instance.load(filename)
        os.remove(filename)

    def test_loads(self):
        instance = Grammar()
        pkl = pickle.dumps(instance)
        instance.loads(pkl)

    def test_copy(self):
        instance = Grammar()
        new = instance.copy()
        self.assertEqual(new.symbol2number, instance.symbol2number)
        self.assertEqual(new.number2symbol, instance.number2symbol)
        self.assertEqual(new.dfas, instance.dfas)
        self.assertEqual(new.keywords, instance.keywords)
        self.assertEqual(new.tokens, instance.tokens)
        self.assertEqual(new.symbol2label, instance.symbol2label)
        self.assertEqual(new.labels, instance.labels)
        self.assertEqual(new.states, instance.states)
        self.assertEqual(new.start, instance.start)
        self.assertEqual(new.async_keywords, instance.async_keywords)

    def test_report(self):
        instance = Grammar()
        instance.report()

if __name__ == '__main__':
    unittest.main()