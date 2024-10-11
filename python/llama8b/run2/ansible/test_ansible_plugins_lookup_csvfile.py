import unittest
from ansible.module_utils.basic import AnsibleModule


class TestCSVRecoder(unittest.TestCase):
    def test_csv_recoder_init(self):
        recoder = CSVRecoder(open('test.csv', 'rb'))
        self.assertIsInstance(recoder, CSVRecoder)

    def test_csv_recoder_iter(self):
        recoder = CSVRecoder(open('test.csv', 'rb'))
        for row in recoder:
            self.assertIsInstance(row, bytes)

    def test_csv_recoder_next(self):
        recoder = CSVRecoder(open('test.csv', 'rb'))
        row = next(recoder)
        self.assertIsInstance(row, bytes)

class TestCSVReader(unittest.TestCase):
    def test_csv_reader_init(self):
        reader = CSVReader(open('test.csv', 'rb'))
        self.assertIsInstance(reader, CSVReader)

    def test_csv_reader_iter(self):
        reader = CSVReader(open('test.csv', 'rb'))
        for row in reader:
            self.assertIsInstance(row, list)

    def test_csv_reader_next(self):
        reader = CSVReader(open('test.csv', 'rb'))
        row = next(reader)
        self.assertIsInstance(row, list)

class TestLookupModule(unittest.TestCase):
    def test_lookup_module_read_csv(self):
        lookup = LookupModule()
        result = lookup.read_csv('test.csv', 'key', delimiter=',', encoding='utf-8', dflt=None, col=1)
        self.assertIsInstance(result, str)

    def test_lookup_module_run(self):
        lookup = LookupModule()
        terms = ['key=value']
        variables = {}
        result = lookup.run(terms, variables)
        self.assertIsInstance(result, list)

    def test_lookup_module_deprecate_inline_kv(self):
        lookup = LookupModule()
        lookup._deprecate_inline_kv()
        self.assertIsNone(lookup._deprecate_inline_kv())

if __name__ == '__main__':
    unittest.main()