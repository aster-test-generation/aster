from ansible.plugins.lookup import csvfil
import csv
import unittest
from ansible.plugins.lookup.csvfile import LookupModule, CSVReader, CSVRecoder


class TestCSVRecoder(unittest.TestCase):
    def test_init(self):
        f = open('test.csv', 'rb')
        recoder = CSVRecoder(f, encoding='utf-8')
        self.assertIsNotNone(recoder.reader)

    def test_iter(self):
        f = open('test.csv', 'rb')
        recoder = CSVRecoder(f, encoding='utf-8')
        self.assertIsInstance(recoder, iter)

    def test_next(self):
        f = open('test.csv', 'rb')
        recoder = CSVRecoder(f, encoding='utf-8')
        self.assertIsNotNone(next(recoder))

class TestCSVReader(unittest.TestCase):
    def test_init(self):
        f = open('test.csv', 'rb')
        reader = CSVReader(f, dialect=csv.excel, encoding='utf-8')
        self.assertIsNotNone(reader.reader)

    def test_iter(self):
        f = open('test.csv', 'rb')
        reader = CSVReader(f, dialect=csv.excel, encoding='utf-8')
        self.assertIsInstance(reader, iter)

    def test_next(self):
        f = open('test.csv', 'rb')
        reader = CSVReader(f, dialect=csv.excel, encoding='utf-8')
        self.assertIsNotNone(next(reader))

class TestLookupModule(unittest.TestCase):
    def test_init(self):
        lookup = LookupModule()
        self.assertIsInstance(lookup, LookupBase)

    def test_read_csv(self):
        lookup = LookupModule()
        filename = 'test.csv'
        key = 'key'
        delimiter = ','
        encoding = 'utf-8'
        dflt = None
        col = 1
        result = lookup.read_csv(filename, key, delimiter, encoding, dflt, col)
        self.assertIsNotNone(result)

    def test_run(self):
        lookup = LookupModule()
        terms = ['term1', 'term2']
        variables = {'var1': 'val1', 'var2': 'val2'}
        kwargs = {'kwarg1': 'val1', 'kwarg2': 'val2'}
        result = lookup.run(terms, variables, **kwargs)
        self.assertIsNotNone(result)

    def test_set_options(self):
        lookup = LookupModule()
        var_options = {'var1': 'val1', 'var2': 'val2'}
        direct = {'kwarg1': 'val1', 'kwarg2': 'val2'}
        lookup.set_options(var_options=var_options, direct=direct)
        self.assertIsNotNone(lookup.get_options())

    def test_get_options(self):
        lookup = LookupModule()
        result = lookup.get_options()
        self.assertIsNotNone(result)

    def test_deprecate_inline_kv(self):
        lookup = LookupModule()
        lookup._deprecate_inline_kv()
        # No assertion, just test that it doesn't raise an error

    def test_find_file_in_search_path(self):
        lookup = LookupModule()
        variables = {'var1': 'val1', 'var2': 'val2'}
        result = lookup.find_file_in_search_path(variables, 'files', 'test.csv')
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()