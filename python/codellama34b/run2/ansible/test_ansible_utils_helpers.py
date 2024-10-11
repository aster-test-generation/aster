import unittest
from ansible.utils.helpers import *


class TestPctToInt(unittest.TestCase):
    def test_pct_to_int(self):
        result = pct_to_int(100, 100)
        self.assertEqual(result, 100)

    def test_pct_to_int_with_percentage(self):
        result = pct_to_int("100%", 100)
        self.assertEqual(result, 100)

    def test_pct_to_int_with_percentage_and_min_value(self):
        result = pct_to_int("100%", 100, 1)
        self.assertEqual(result, 100)

    def test_pct_to_int_with_percentage_and_min_value_and_non_int_value(self):
        result = pct_to_int("100%", 100, 1.5)
        self.assertEqual(result, 100)

    def test_pct_to_int_with_non_int_value(self):
        result = pct_to_int(1.5, 100)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_non_int_value_and_min_value(self):
        result = pct_to_int(1.5, 100, 1)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_non_int_value_and_min_value_and_non_int_min_value(self):
        result = pct_to_int(1.5, 100, 1.5)
        self.assertEqual(result, 1)

class TestObjectToDict(unittest.TestCase):
    def test_object_to_dict(self):
        class ExampleClass:
            def __init__(self, x, y):
                self.x = x
                self.y = y
        instance = ExampleClass(1, 2)
        result = object_to_dict(instance)
        self.assertEqual(result, {'x': 1, 'y': 2})

    def test_object_to_dict_with_exclude(self):
        class ExampleClass:
            def __init__(self, x, y):
                self.x = x
                self.y = y
        instance = ExampleClass(1, 2)
        result = object_to_dict(instance, ["x"])
        self.assertEqual(result, {'y': 2})

class TestDeduplicateList(unittest.TestCase):
    def test_deduplicate_list(self):
        original_list = [1, 2, 3, 2, 1]
        result = deduplicate_list(original_list)
        self.assertEqual(result, [1, 2, 3])

    def test_deduplicate_list_with_non_list(self):
        original_list = 1
        result = deduplicate_list(original_list)
        self.assertEqual(result, [1])

    def test_deduplicate_list_with_empty_list(self):
        original_list = []
        result = deduplicate_list(original_list)
        self.assertEqual(result, [])

    def test_deduplicate_list_with_non_list_and_empty_list(self):
        original_list = 1
        result = deduplicate_list(original_list)
        self.assertEqual(result, [1])

if __name__ == '__main__':
    unittest.main()