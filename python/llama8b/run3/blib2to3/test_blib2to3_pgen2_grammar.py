import pickle
import os
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
        self.assertFalse(grammar.async_keywords)

    def test_dump(self):
        grammar = Grammar()
        with tempfile.NamedTemporaryFile(dir=os.path.dirname('test_file'), delete=False) as f:
            grammar.dump(f.name)
            self.assertTrue(os.path.exists(f.name))

    def test_load(self):
        grammar = Grammar()
        with open('test_file', 'wb') as f:
            pickle.dump(grammar.__dict__, f)
        grammar.load('test_file')
        self.assertEqual(grammar.symbol2number, grammar.__dict__['symbol2number'])
        self.assertEqual(grammar.number2symbol, grammar.__dict__['number2symbol'])
        self.assertEqual(grammar.states, grammar.__dict__['states'])
        self.assertEqual(grammar.dfas, grammar.__dict__['dfas'])
        self.assertEqual(grammar.labels, grammar.__dict__['labels'])
        self.assertEqual(grammar.keywords, grammar.__dict__['keywords'])
        self.assertEqual(grammar.tokens, grammar.__dict__['tokens'])
        self.assertEqual(grammar.symbol2label, grammar.__dict__['symbol2label'])
        self.assertEqual(grammar.start, grammar.__dict__['start'])
        self.assertEqual(grammar.async_keywords, grammar.__dict__['async_keywords'])
        os.remove('test_file')

    def test_loads(self):
        grammar = Grammar()
        pkl = pickle.dumps(grammar.__dict__)
        grammar.loads(pkl)
        self.assertEqual(grammar.symbol2number, grammar.__dict__['symbol2number'])
        self.assertEqual(grammar.number2symbol, grammar.__dict__['number2symbol'])
        self.assertEqual(grammar.states, grammar.__dict__['states'])
        self.assertEqual(grammar.dfas, grammar.__dict__['dfas'])
        self.assertEqual(grammar.labels, grammar.__dict__['labels'])
        self.assertEqual(grammar.keywords, grammar.__dict__['keywords'])
        self.assertEqual(grammar.tokens, grammar.__dict__['tokens'])
        self.assertEqual(grammar.symbol2label, grammar.__dict__['symbol2label'])
        self.assertEqual(grammar.start, grammar.__dict__['start'])
        self.assertEqual(grammar.async_keywords, grammar.__dict__['async_keywords'])

    def test_copy(self):
        grammar = Grammar()
        new_grammar = grammar.copy()
        self.assertEqual(new_grammar.symbol2number, grammar.symbol2number)
        self.assertEqual(new_grammar.number2symbol, grammar.number2symbol)
        self.assertEqual(new_grammar.states, grammar.states)
        self.assertEqual(new_grammar.dfas, grammar.dfas)
        self.assertEqual(new_grammar.labels, grammar.labels)
        self.assertEqual(new_grammar.keywords, grammar.keywords)
        self.assertEqual(new_grammar.tokens, grammar.tokens)
        self.assertEqual(new_grammar.symbol2label, grammar.symbol2label)
        self.assertEqual(new_grammar.start, grammar.start)
        self.assertEqual(new_grammar.async_keywords, grammar.async_keywords)

    def test_report(self):
        grammar = Grammar()
        grammar.report()
        self.assertTrue(True)

if __name__ == '__main__':
    unittest.main()