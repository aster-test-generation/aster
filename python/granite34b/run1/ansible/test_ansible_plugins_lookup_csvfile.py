import unittest
from ansible.plugins.lookup.csvfile import CSVRecoder, CSVReader, LookupModule


class TestCSVRecoder(unittest.TestCase):
    def test_read_csv(self):
        # Test the read_csv method of the LookupModule class
        lookup_module = LookupModule()
        filename = "test.csv"
        key = "test_key"
        delimiter = ","
        encoding = "utf-8"
        default = None
        col = 1
        result = lookup_module.read_csv(filename, key, delimiter, encoding, default, col)
        self.assertEqual(result, "test_value")

class TestCSVReader(unittest.TestCase):
    def test_read_csv(self):
        # Test the read_csv method of the LookupModule class
        lookup_module = LookupModule()
        filename = "test.csv"
        key = "test_key"
        delimiter = ","
        encoding = "utf-8"
        default = None
        col = 1
        result = lookup_module.read_csv(filename, key, delimiter, encoding, default, col)
        self.assertEqual(result, "test_value")

class TestLookupModule(unittest.TestCase):
    def test_read_csv(self):
        # Test the read_csv method of the LookupModule class
        lookup_module = LookupModule()
        filename = "test.csv"
        key = "test_key"
        delimiter = ","
        encoding = "utf-8"
        default = None
        col = 1
        result = lookup_module.read_csv(filename, key, delimiter, encoding, default, col)
        self.assertEqual(result, "test_value")

if __name__ == '__main__':
    unittest.main()