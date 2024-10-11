import unittest
from ansible.utils.helpers import *


class TestPctToInt(unittest.TestCase):
    def test_pct_to_int(self):
        result = pct_to_int('50%', 100)
        self.assertEqual(result, 50)

    def test_pct_to_int_min_value(self):
        result = pct_to_int('1%', 100, min_value=5)
        self.assertEqual(result, 5)

    def test_pct_to_int_non_pct(self):
        result = pct_to_int(50, 100)
        self.assertEqual(result, 50)

    def test_pct_to_int_invalid_pct(self):
        with self.assertRaises(ValueError):
            pct_to_int('abc', 100)

class TestObjectToDict(unittest.TestCase):
    def test_object_to_dict(self):
        obj = object()
        result = object_to_dict(obj)
        self.assertIsInstance(result, dict)

    def test_object_to_dict_exclude(self):
        obj = object()
        result = object_to_dict(obj, exclude=['__dict__'])
        self.assertNotIn('__dict__', result)

class TestDeduplicateList(unittest.TestCase):
    def test_deduplicate_list(self):
        original_list = [1, 2, 2, 3, 4, 4, 5]
        result = deduplicate_list(original_list)
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_deduplicate_list_empty(self):
        original_list = []
        result = deduplicate_list(original_list)
        self.assertEqual(result, [])

    def test_deduplicate_list_single_element(self):
        original_list = [1]
        result = deduplicate_list(original_list)
        self.assertEqual(result, [1])

if __name__ == '__main__':
    unittest.main()