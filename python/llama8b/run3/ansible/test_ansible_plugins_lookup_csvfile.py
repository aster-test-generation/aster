import csv
import unittest
from unittest.mock import patch
from ansible.module_utils.basic import *


class TestCSVRecoder(unittest.TestCase):
    def test_init(self):
        recoder = CSVRecoder(open('test.csv', 'rb'), encoding='utf-8')
        self.assertIsInstance(recoder, CSVRecoder)

    def test_iter(self):
        recoder = CSVRecoder(open('test.csv', 'rb'), encoding='utf-8')
        self.assertIsInstance(recoder, CSVRecoder)
        for _ in recoder:
            pass

    def test_next(self):
        recoder = CSVRecoder(open('test.csv', 'rb'), encoding='utf-8')
        self.assertIsInstance(recoder, CSVRecoder)
        next(recoder)

class TestCSVReader(unittest.TestCase):
    def test_init(self):
        reader = CSVReader(open('test.csv', 'rb'), dialect=csv.excel, encoding='utf-8')
        self.assertIsInstance(reader, CSVReader)

    def test_iter(self):
        reader = CSVReader(open('test.csv', 'rb'), dialect=csv.excel, encoding='utf-8')
        self.assertIsInstance(reader, CSVReader)
        for _ in reader:
            pass

    def test_next(self):
        reader = CSVReader(open('test.csv', 'rb'), dialect=csv.excel, encoding='utf-8')
        self.assertIsInstance(reader, CSVReader)
        next(reader)

class TestLookupModule(unittest.TestCase):
    @patch('ansible.module_utils._text.to_bytes')
    @patch('ansible.module_utils._text.to_native')
    @patch('ansible.module_utils._text.to_text')
    def test_read_csv(self, mock_to_text, mock_to_native, mock_to_bytes):
        lookup = LookupModule()
        lookup.read_csv('test.csv', 'key', delimiter=',', encoding='utf-8', dflt=None, col=1)
        mock_to_bytes.assert_called_once()
        mock_to_native.assert_called_once()
        mock_to_text.assert_called_once()

    def test_run(self):
        lookup = LookupModule()
        terms = ['term1', 'term2']
        variables = {'file': 'test.csv'}
        paramvals = {'delimiter': ',', 'encoding': 'utf-8', 'default': None, 'col': 1}
        result = lookup.run(terms, variables, **paramvals)
        self.assertEqual(result, [])

    def test_set_options(self):
        lookup = LookupModule()
        lookup.set_options(var_options={'file': 'test.csv'}, direct={'delimiter': ','})
        self.assertEqual(lookup.get_options(), {'file': 'test.csv', 'delimiter': ','})

    def test_get_options(self):
        lookup = LookupModule()
        lookup.set_options(var_options={'file': 'test.csv'}, direct={'delimiter': ','})
        self.assertEqual(lookup.get_options(), {'file': 'test.csv', 'delimiter': ','})

    def test_deprecate_inline_kv(self):
        lookup = LookupModule()
        lookup._deprecate_inline_kv()
        self.assertEqual(lookup.get_options(), {})

if __name__ == '__main__':
    unittest.main()