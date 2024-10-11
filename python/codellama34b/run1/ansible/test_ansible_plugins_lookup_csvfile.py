import unittest
from ansible.plugins.lookup.yaml import *



class TestCSVRecoder(unittest.TestCase):
    def test_init(self):
        instance = CSVRecoder(None, None)
        self.assertIsInstance(instance, CSVRecoder)

    def test_iter(self):
        instance = CSVRecoder(None, None)
        result = instance.__iter__()
        self.assertEqual(result, instance)

    def test_next(self):
        instance = CSVRecoder(None, None)
        result = instance.__next__()
        self.assertEqual(result, None)

class TestCSVReader(unittest.TestCase):
    def test_init(self):
        instance = CSVReader(None, None, None, None)
        self.assertIsInstance(instance, CSVReader)

    def test_iter(self):
        instance = CSVReader(None, None, None, None)
        result = instance.__iter__()
        self.assertEqual(result, instance)

    def test_next(self):
        instance = CSVReader(None, None, None, None)
        result = instance.__next__()
        self.assertEqual(result, None)

class TestLookupModule(unittest.TestCase):
    def test_read_csv(self):
        instance = LookupModule()
        result = instance.read_csv(None, None, None, None, None, None)
        self.assertEqual(result, None)

    def test_run(self):
        instance = LookupModule()
        result = instance.run(None, None, None)
        self.assertEqual(result, None)

    def test_set_options(self):
        instance = LookupModule()
        result = instance.set_options(None, None)
        self.assertEqual(result, None)

    def test_get_options(self):
        instance = LookupModule()
        result = instance.get_options()
        self.assertEqual(result, None)

    def test_find_file_in_search_path(self):
        instance = LookupModule()
        result = instance.find_file_in_search_path(None, None, None)
        self.assertEqual(result, None)

    def test_set_options(self):
        instance = LookupModule()
        result = instance.set_options(None, None)
        self.assertEqual(result, None)

    def test_get_options(self):
        instance = LookupModule()
        result = instance.get_options()
        self.assertEqual(result, None)

    def test_find_file_in_search_path(self):
        instance = LookupModule()
        result = instance.find_file_in_search_path(None, None, None)
        self.assertEqual(result, None)

    def test_set_options(self):
        instance = LookupModule()
        result = instance.set_options(None, None)
        self.assertEqual(result, None)

    def test_get_options(self):
        instance = LookupModule()
        result = instance.get_options()
        self.assertEqual(result, None)

    def test_find_file_in_search_path(self):
        instance = LookupModule()
        result = instance.find_file_in_search_path(None, None, None)
        self.assertEqual(result, None)

    def test_set_options(self):
        instance = LookupModule()
        result = instance.set_options(None, None)
        self.assertEqual(result, None)

    def test_get_options(self):
        instance = LookupModule()
        result = instance.get_options()
        self.assertEqual(result, None)

    def test_find_file_in_search_path(self):
        instance = LookupModule()
        result = instance.find_file_in_search_path(None, None, None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()