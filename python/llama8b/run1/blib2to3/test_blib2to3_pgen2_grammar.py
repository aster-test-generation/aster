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
        self.assertEqual(loaded_grammar.symbol2number, grammar.symbol2number)
        self.assertEqual(loaded_grammar.number2symbol, grammar.number2symbol)
        self.assertEqual(loaded_grammar.states, grammar.states)
        self.assertEqual(loaded_grammar.dfas, grammar.dfas)
        self.assertEqual(loaded_grammar.labels, grammar.labels)
        self.assertEqual(loaded_grammar.keywords, grammar.keywords)
        self.assertEqual(loaded_grammar.tokens, grammar.tokens)
        self.assertEqual(loaded_grammar.symbol2label, grammar.symbol2label)
        self.assertEqual(loaded_grammar.start, grammar.start)
        self.assertEqual(loaded_grammar.async_keywords, grammar.async_keywords)

    def test_load(self):
        grammar = Grammar()
        with tempfile.NamedTemporaryFile() as f:
            grammar.dump(f.name)
            with open(f.name, 'rb') as f2:
                loaded_grammar = pickle.load(f2)
                loaded_grammar.load(f.name)
        self.assertEqual(loaded_grammar.symbol2number, grammar.symbol2number)
        self.assertEqual(loaded_grammar.number2symbol, grammar.number2symbol)
        self.assertEqual(loaded_grammar.states, grammar.states)
        self.assertEqual(loaded_grammar.dfas, grammar.dfas)
        self.assertEqual(loaded_grammar.labels, grammar.labels)
        self.assertEqual(loaded_grammar.keywords, grammar.keywords)
        self.assertEqual(loaded_grammar.tokens, grammar.tokens)
        self.assertEqual(loaded_grammar.symbol2label, grammar.symbol2label)
        self.assertEqual(loaded_grammar.start, grammar.start)
        self.assertEqual(loaded_grammar.async_keywords, grammar.async_keywords)

    def test_loads(self):
        grammar = Grammar()
        with tempfile.NamedTemporaryFile() as f:
            grammar.dump(f.name)
            with open(f.name, 'rb') as f2:
                loaded_grammar = pickle.load(f2)
                loaded_grammar.loads(pickle.dumps(grammar.__dict__))
        self.assertEqual(loaded_grammar.symbol2number, grammar.symbol2number)
        self.assertEqual(loaded_grammar.number2symbol, grammar.number2symbol)
        self.assertEqual(loaded_grammar.states, grammar.states)
        self.assertEqual(loaded_grammar.dfas, grammar.dfas)
        self.assertEqual(loaded_grammar.labels, grammar.labels)
        self.assertEqual(loaded_grammar.keywords, grammar.keywords)
        self.assertEqual(loaded_grammar.tokens, grammar.tokens)
        self.assertEqual(loaded_grammar.symbol2label, grammar.symbol2label)
        self.assertEqual(loaded_grammar.start, grammar.start)
        self.assertEqual(loaded_grammar.async_keywords, grammar.async_keywords)

    def test_copy(self):
        grammar = Grammar()
        copied_grammar = grammar.copy()
        self.assertEqual(copied_grammar.symbol2number, grammar.symbol2number)
        self.assertEqual(copied_grammar.number2symbol, grammar.number2symbol)
        self.assertEqual(copied_grammar.states, grammar.states)
        self.assertEqual(copied_grammar.dfas, grammar.dfas)
        self.assertEqual(copied_grammar.labels, grammar.labels)
        self.assertEqual(copied_grammar.keywords, grammar.keywords)
        self.assertEqual(copied_grammar.tokens, grammar.tokens)
        self.assertEqual(copied_grammar.symbol2label, grammar.symbol2label)
        self.assertEqual(copied_grammar.start, grammar.start)
        self.assertEqual(copied_grammar.async_keywords, grammar.async_keywords)

    def test_report(self):
        grammar = Grammar()
        with unittest.mock.patch('pprint.pprint') as mock_pprint:
            grammar.report()
        mock_pprint.assert_called_once()

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
        self.assertEqual(grammar.symbol2number, loaded_grammar.symbol2number)
        self.assertEqual(grammar.number2symbol, loaded_grammar.number2symbol)
        self.assertEqual(grammar.states, loaded_grammar.states)
        self.assertEqual(grammar.dfas, loaded_grammar.dfas)
        self.assertEqual(grammar.labels, loaded_grammar.labels)
        self.assertEqual(grammar.keywords, loaded_grammar.keywords)
        self.assertEqual(grammar.tokens, loaded_grammar.tokens)
        self.assertEqual(grammar.symbol2label, loaded_grammar.symbol2label)
        self.assertEqual(grammar.start, loaded_grammar.start)
        self.assertEqual(grammar.async_keywords, loaded_grammar.async_keywords)

    def test_load(self):
        grammar = Grammar()
        with tempfile.NamedTemporaryFile() as f:
            grammar.dump(f.name)
            with open(f.name, 'rb') as f2:
                pickle.dump(grammar.__dict__, f2)
        loaded_grammar = Grammar()
        loaded_grammar.load(f.name)
        self.assertEqual(grammar.symbol2number, loaded_grammar.symbol2number)
        self.assertEqual(grammar.number2symbol, loaded_grammar.number2symbol)
        self.assertEqual(grammar.states, loaded_grammar.states)
        self.assertEqual(grammar.dfas, loaded_grammar.dfas)
        self.assertEqual(grammar.labels, loaded_grammar.labels)
        self.assertEqual(grammar.keywords, loaded_grammar.keywords)
        self.assertEqual(grammar.tokens, loaded_grammar.tokens)
        self.assertEqual(grammar.symbol2label, loaded_grammar.symbol2label)
        self.assertEqual(grammar.start, loaded_grammar.start)
        self.assertEqual(grammar.async_keywords, loaded_grammar.async_keywords)

    def test_loads(self):
        grammar = Grammar()
        with tempfile.NamedTemporaryFile() as f:
            grammar.dump(f.name)
            with open(f.name, 'rb') as f2:
                pickle.dump(grammar.__dict__, f2)
        loaded_grammar = Grammar()
        loaded_grammar.loads(pickle.load(f2))
        self.assertEqual(grammar.symbol2number, loaded_grammar.symbol2number)
        self.assertEqual(grammar.number2symbol, loaded_grammar.number2symbol)
        self.assertEqual(grammar.states, loaded_grammar.states)
        self.assertEqual(grammar.dfas, loaded_grammar.dfas)
        self.assertEqual(grammar.labels, loaded_grammar.labels)
        self.assertEqual(grammar.keywords, loaded_grammar.keywords)
        self.assertEqual(grammar.tokens, loaded_grammar.tokens)
        self.assertEqual(grammar.symbol2label, loaded_grammar.symbol2label)
        self.assertEqual(grammar.start, loaded_grammar.start)
        self.assertEqual(grammar.async_keywords, loaded_grammar.async_keywords)

    def test_copy(self):
        grammar = Grammar()
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

if __name__ == '__main__':
    unittest.main()