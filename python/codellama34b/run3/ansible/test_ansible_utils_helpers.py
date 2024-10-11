import unittest
from ansible.utils.helpers import *


class TestPctToInt(unittest.TestCase):
    def test_pct_to_int(self):
        result = pct_to_int(10, 100)
        self.assertEqual(result, 10)

    def test_pct_to_int_percentage(self):
        result = pct_to_int("10%", 100)
        self.assertEqual(result, 10)

    def test_pct_to_int_min_value(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 10)

class TestObjectToDict(unittest.TestCase):
    def test_object_to_dict(self):
        class TestClass:
            def __init__(self):
                self.a = 1
                self.b = 2
        instance = TestClass()
        result = object_to_dict(instance)
        self.assertEqual(result, {"a": 1, "b": 2})

    def test_object_to_dict_exclude(self):
        class TestClass:
            def __init__(self):
                self.a = 1
                self.b = 2
        instance = TestClass()
        result = object_to_dict(instance, exclude=["b"])
        self.assertEqual(result, {"a": 1})

class TestDeduplicateList(unittest.TestCase):
    def test_deduplicate_list(self):
        original_list = [1, 2, 3, 2, 1]
        result = deduplicate_list(original_list)
        self.assertEqual(result, [1, 2, 3])

if __name__ == '__main__':
    unittest.main()