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
        self.assertFalse(grammar.async_keywords)

    def test_dump(self):
        grammar = Grammar()
        with tempfile.NamedTemporaryFile() as f:
            grammar.dump(f.name)
            with open(f.name, 'rb') as f2:
                loaded_grammar = pickle.load(f2)
                self.assertEqual(loaded_grammar, grammar.__dict__)

    def test_load(self):
        grammar = Grammar()
        with tempfile.NamedTemporaryFile() as f:
            grammar.dump(f.name)
            loaded_grammar = Grammar()
            loaded_grammar.load(f.name)
            self.assertEqual(loaded_grammar, grammar)

    def test_loads(self):
        grammar = Grammar()
        pkl = pickle.dumps(grammar.__dict__)
        loaded_grammar = Grammar()
        loaded_grammar.loads(pkl)
        self.assertEqual(loaded_grammar, grammar)

    def test_copy(self):
        grammar = Grammar()
        copied_grammar = grammar.copy()
        self.assertEqual(copied_grammar, grammar)

    def test_report(self):
        grammar = Grammar()
        with unittest.mock.patch('pprint.pprint') as mock_pprint:
            grammar.report()
            mock_pprint.assert_called()

    def test_update(self):
        grammar = Grammar()
        attrs = {'symbol2number': {1: 'a'}}
        grammar._update(attrs)
        self.assertEqual(grammar.symbol2number, attrs['symbol2number'])

    def test_update_private(self):
        grammar = Grammar()
        attrs = {'__dict__': {'symbol2number': {1: 'a'}}}
        grammar._update(attrs)
        self.assertEqual(grammar.symbol2number, attrs['__dict__']['symbol2number'])

    def test_str(self):
        grammar = Grammar()
        self.assertEqual(str(grammar), 'Grammar')

    def test_repr(self):
        grammar = Grammar()
        self.assertEqual(repr(grammar), 'Grammar()')

    def test_eq(self):
        grammar1 = Grammar()
        grammar2 = Grammar()
        self.assertEqual(grammar1, grammar2)

if __name__ == '__main__':
    unittest.main()