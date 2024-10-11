import unittest
import os
import pickle
import tempfile
from blib2to3.pgen2.grammar import Grammar


class TestGrammar(unittest.TestCase):
    def setUp(self):
        self.grammar = Grammar()

    def test_init(self):
        self.assertEqual(self.grammar.symbol2number, {})
        self.assertEqual(self.grammar.number2symbol, {})
        self.assertEqual(self.grammar.states, [])
        self.assertEqual(self.grammar.dfas, {})
        self.assertEqual(self.grammar.labels, [(0, "EMPTY")])
        self.assertEqual(self.grammar.keywords, {})
        self.assertEqual(self.grammar.tokens, {})
        self.assertEqual(self.grammar.symbol2label, {})
        self.assertEqual(self.grammar.start, 256)
        self.assertFalse(self.grammar.async_keywords)

    def test_dump(self):
        with tempfile.NamedTemporaryFile(delete=False) as temp_file:
            temp_file.close()
            self.grammar.dump(temp_file.name)
            with open(temp_file.name, 'rb') as f:
                data = pickle.load(f)
            self.assertEqual(data['symbol2number'], {})
            os.remove(temp_file.name)

    def test_update(self):
        attrs = {'symbol2number': {'test': 1}}
        self.grammar._update(attrs)
        self.assertEqual(self.grammar.symbol2number, {'test': 1})

    def test_load(self):
        with tempfile.NamedTemporaryFile(delete=False) as temp_file:
            pickle.dump({'symbol2number': {'test': 1}}, temp_file)
            temp_file.close()
            self.grammar.load(temp_file.name)
            self.assertEqual(self.grammar.symbol2number, {'test': 1})
            os.remove(temp_file.name)

    def test_loads(self):
        pkl = pickle.dumps({'symbol2number': {'test': 1}})
        self.grammar.loads(pkl)
        self.assertEqual(self.grammar.symbol2number, {'test': 1})

    def test_copy(self):
        self.grammar.symbol2number = {'test': 1}
        new_grammar = self.grammar.copy()
        self.assertEqual(new_grammar.symbol2number, {'test': 1})
        self.assertIsNot(new_grammar, self.grammar)

    def test_report(self):
        with self.assertLogs(level='INFO') as log:
            self.grammar.report()
            self.assertIn('s2n', log.output[0] if log.output else '')

if __name__ == '__main__':
    unittest.main()