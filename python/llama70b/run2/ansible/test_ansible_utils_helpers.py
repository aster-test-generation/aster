import unittest
from ansible.utils.helpers import pct_to_int, object_to_dict, deduplicate_list


class TestPctToIntFunction(unittest.TestCase):
    def test_pct_to_int_percentage(self):
        result = pct_to_int("50%", 100)
        self.assertEqual(result, 50)

    def test_pct_to_int_integer(self):
        result = pct_to_int("50", 100)
        self.assertEqual(result, 50)

    def test_pct_to_int_min_value(self):
        result = pct_to_int("0%", 100, min_value=1)
        self.assertEqual(result, 1)

class TestObjectToDictFunction(unittest.TestCase):
    class ExampleObject:
        def __init__(self):
            self.public_attr = "public"
            self._protected_attr = "protected"
            self.__private_attr = "private"

    def test_object_to_dict(self):
        obj = self.ExampleObject()
        result = object_to_dict(obj)
        self.assertEqual(result, {"public_attr": "public"})

    def test_object_to_dict_exclude(self):
        obj = self.ExampleObject()
        result = object_to_dict(obj, exclude=["public_attr"])
        self.assertEqual(result, {})

class TestDeduplicateListFunction(unittest.TestCase):
    def test_deduplicate_list(self):
        original_list = [1, 2, 2, 3, 4, 4, 5]
        result = deduplicate_list(original_list)
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_deduplicate_list_empty(self):
        original_list = []
        result = deduplicate_list(original_list)
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()