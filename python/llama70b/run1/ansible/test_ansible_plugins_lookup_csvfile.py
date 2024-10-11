import unittest
from ansible.module_utils._text import to_bytes


class TestCSVRecoder(unittest.TestCase):
    def test_init(self):
        recoder = CSVRecoder('dummy_file', encoding='utf-8')
        self.assertIsInstance(recoder.reader, codecs.getreader)

    def test_iter(self):
        recoder = CSVRecoder('dummy_file', encoding='utf-8')
        self.assertIsInstance(recoder, CSVRecoder)

    def test_next(self):
        recoder = CSVRecoder('dummy_file', encoding='utf-8')
        self.assertRaises(StopIteration, recoder.__next__)

class TestCSVReader(unittest.TestCase):
    def test_init(self):
        reader = CSVReader('dummy_file', dialect=csv.excel, encoding='utf-8')
        self.assertIsInstance(reader.reader, csv.reader)

    def test_iter(self):
        reader = CSVReader('dummy_file', dialect=csv.excel, encoding='utf-8')
        self.assertIsInstance(reader, CSVReader)

    def test_next(self):
        reader = CSVReader('dummy_file', dialect=csv.excel, encoding='utf-8')
        self.assertRaises(StopIteration, reader.__next__)

class TestLookupModule(unittest.TestCase):
    def test_init(self):
        lookup = LookupModule()
        self.assertIsInstance(lookup, LookupBase)

    def test_read_csv(self):
        lookup = LookupModule()
        result = lookup.read_csv('dummy_file', 'key', ',', encoding='utf-8', dflt=None, col=1)
        self.assertIsNone(result)

    def test_run(self):
        lookup = LookupModule()
        result = lookup.run(['term'], variables={'file': 'dummy_file', 'delimiter': ',', 'encoding': 'utf-8', 'default': None, 'col': 1})
        self.assertIsInstance(result, list)

    def test_set_options(self):
        lookup = LookupModule()
        lookup.set_options(var_options={'file': 'dummy_file', 'delimiter': ',', 'encoding': 'utf-8', 'default': None, 'col': 1}, direct={})
        self.assertEqual(lookup.paramvals, {'file': 'dummy_file', 'delimiter': ',', 'encoding': 'utf-8', 'default': None, 'col': 1})

    def test_get_options(self):
        lookup = LookupModule()
        lookup.set_options(var_options={'file': 'dummy_file', 'delimiter': ',', 'encoding': 'utf-8', 'default': None, 'col': 1}, direct={})
        self.assertEqual(lookup.get_options(), {'file': 'dummy_file', 'delimiter': ',', 'encoding': 'utf-8', 'default': None, 'col': 1})

    def test_deprecate_inline_kv(self):
        lookup = LookupModule()
        lookup._deprecate_inline_kv()
        # no assertion, just test that it doesn't raise an error

    def test_find_file_in_search_path(self):
        lookup = LookupModule()
        result = lookup.find_file_in_search_path({'files': ['dummy_file']}, 'files', 'dummy_file')
        self.assertEqual(result, 'dummy_file')

    def test_private_methods(self):
        lookup = LookupModule()
        self.assertRaises(AttributeError, getattr, lookup, '_LookupModule__private_method')  # test that private method doesn't exist

    def test_magic_methods(self):
        lookup = LookupModule()
        self.assertEqual(str(lookup), 'LookupModule()')  # test __str__
        self.assertEqual(repr(lookup), 'LookupModule()')  # test __repr__
        self.assertNotEqual(lookup, object())  # test __eq__

if __name__ == '__main__':
    unittest.main()