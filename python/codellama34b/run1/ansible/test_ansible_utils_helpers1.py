import unittest
from ansible.utils.helpers import *

class TestPctToInt(unittest.TestCase):
    def test_pct_to_int_percentage(self):
        result = pct_to_int("10%", 100)
        self.assertEqual(result, 10)

    def test_pct_to_int_integer(self):
        result = pct_to_int(10, 100)
        self.assertEqual(result, 10)

    def test_pct_to_int_min_value(self):
        result = pct_to_int("1%", 100)
        self.assertEqual(result, 1)

class TestObjectToDict(unittest.TestCase):
    def test_object_to_dict(self):
        class TestClass:
            def __init__(self):
                self.attr1 = "attr1"
                self.attr2 = "attr2"

        instance = TestClass()
        result = object_to_dict(instance)
        self.assertEqual(result, {"attr1": "attr1", "attr2": "attr2"})

    def test_object_to_dict_exclude(self):
        class TestClass:
            def __init__(self):
                self.attr1 = "attr1"
                self.attr2 = "attr2"

        instance = TestClass()
        result = object_to_dict(instance, ["attr1"])
        self.assertEqual(result, {"attr2": "attr2"})

class TestDeduplicateList(unittest.TestCase):
    def test_deduplicate_list(self):
        original_list = [1, 2, 3, 2, 1]
        result = deduplicate_list(original_list)
        self.assertEqual(result, [1, 2, 3])

if __name__ == '__main__':
    unittest.main()