import unittest
from ansible.plugins.lookup import csvfile


class TestCSVRecoder(unittest.TestCase):
    def test___init__(self):
        instance = CSVRecoder("f", "encoding")
        self.assertEqual(instance.reader, codecs.getreader("encoding")("f"))

    def test___iter__(self):
        instance = CSVRecoder("f", "encoding")
        result = instance.__iter__()
        self.assertEqual(result, instance)

    def test___next__(self):
        instance = CSVRecoder("f", "encoding")
        result = instance.__next__()
        self.assertEqual(result, next(instance.reader).encode("utf-8"))

    def test_next(self):
        instance = CSVRecoder("f", "encoding")
        result = instance.next()
        self.assertEqual(result, next(instance.reader).encode("utf-8"))

class TestCSVReader(unittest.TestCase):
    def test___init__(self):
        instance = CSVReader("f", "dialect", "encoding", "kwds")
        self.assertEqual(instance.reader, csv.reader("f", dialect="dialect", **"kwds"))

    def test___iter__(self):
        instance = CSVReader("f", "dialect", "encoding", "kwds")
        result = instance.__iter__()
        self.assertEqual(result, instance)

    def test___next__(self):
        instance = CSVReader("f", "dialect", "encoding", "kwds")
        result = instance.__next__()
        self.assertEqual(result, [to_text(s) for s in next(instance.reader)])

    def test_next(self):
        instance = CSVReader("f", "dialect", "encoding", "kwds")
        result = instance.next()
        self.assertEqual(result, [to_text(s) for s in next(instance.reader)])

class TestLookupModule(unittest.TestCase):
    def test_read_csv(self):
        instance = LookupModule()
        result = instance.read_csv("filename", "key", "delimiter", "encoding", "dflt", "col")
        self.assertEqual(result, None)

    def test_run(self):
        instance = LookupModule()
        result = instance.run("terms", "variables", "kwargs")
        self.assertEqual(result, None)

    def test_set_options(self):
        instance = LookupModule()
        result = instance.set_options("var_options", "direct")
        self.assertEqual(result, None)

    def test_get_options(self):
        instance = LookupModule()
        result = instance.get_options()
        self.assertEqual(result, None)

    def test_find_file_in_search_path(self):
        instance = LookupModule()
        result = instance.find_file_in_search_path("variables", "files", "paramvals")
        self.assertEqual(result, None)

    def test__deprecate_inline_kv(self):
        instance = LookupModule()
        result = instance._deprecate_inline_kv()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()