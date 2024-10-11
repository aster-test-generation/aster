import unittest
from ansible.module_utils.basic import *


class TestCSVRecoder(unittest.TestCase):
    def test_init(self):
        recoder = CSVRecoder(open('test.csv', 'rb'), encoding='utf-8')
        self.assertEqual(recoder.reader, codecs.getreader('utf-8')(open('test.csv', 'rb')))

    def test_iter(self):
        recoder = CSVRecoder(open('test.csv', 'rb'), encoding='utf-8')
        self.assertEqual(next(recoder), next(recoder.reader).encode("utf-8"))

    def test_next(self):
        recoder = CSVRecoder(open('test.csv', 'rb'), encoding='utf-8')
        self.assertEqual(next(recoder), next(recoder.reader).encode("utf-8"))

class TestCSVReader(unittest.TestCase):
    def test_init(self):
        reader = CSVReader(open('test.csv', 'rb'), dialect=csv.excel, encoding='utf-8')
        self.assertEqual(reader.reader, csv.reader(open('test.csv', 'rb'), dialect=csv.excel, encoding='utf-8'))

    def test_iter(self):
        reader = CSVReader(open('test.csv', 'rb'), dialect=csv.excel, encoding='utf-8')
        self.assertEqual(next(reader), [to_text(s) for s in next(reader.reader)])

    def test_next(self):
        reader = CSVReader(open('test.csv', 'rb'), dialect=csv.excel, encoding='utf-8')
        self.assertEqual(next(reader), [to_text(s) for s in next(reader.reader)])

class TestLookupModule(unittest.TestCase):
    def test_read_csv(self):
        lookup = LookupModule()
        result = lookup.read_csv('test.csv', 'key', delimiter=',', encoding='utf-8', dflt=None, col=1)
        self.assertEqual(result, ['value'])

    def test_run(self):
        lookup = LookupModule()
        result = lookup.run(['term'], variables=None, **{'delimiter': ',', 'file': 'test.csv', 'encoding': 'utf-8', 'default': None, 'col': 1})
        self.assertEqual(result, ['value'])

    def test_deprecate_inline_kv(self):
        lookup = LookupModule()
        lookup._deprecate_inline_kv()
        self.assertEqual(lookup._deprecate_inline_kv, None)

    def test_find_file_in_search_path(self):
        lookup = LookupModule()
        result = lookup.find_file_in_search_path(variables=None, path='path', file='file')
        self.assertEqual(result, 'path/file')

    def test_set_options(self):
        lookup = LookupModule()
        lookup.set_options(var_options=None, direct={'delimiter': ',', 'file': 'test.csv', 'encoding': 'utf-8', 'default': None, 'col': 1})
        self.assertEqual(lookup.get_options(), {'delimiter': ',', 'file': 'test.csv', 'encoding': 'utf-8', 'default': None, 'col': 1})

if __name__ == '__main__':
    unittest.main()