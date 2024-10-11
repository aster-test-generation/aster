import unittest
from ansible.utils.helpers import pct_to_int, object_to_dict, deduplicate_list


class TestPctToInt(unittest.TestCase):
    def test_pct_to_int_with_percentage(self):
        result = pct_to_int("50%", 200)
        self.assertEqual(result, 100)

    def test_pct_to_int_with_min_value(self):
        result = pct_to_int("0%", 200, min_value=10)
        self.assertEqual(result, 10)

    def test_pct_to_int_with_integer(self):
        result = pct_to_int(5, 200)
        self.assertEqual(result, 5)

    def test_pct_to_int_with_string_integer(self):
        result = pct_to_int("5", 200)
        self.assertEqual(result, 5)

class TestObjectToDict(unittest.TestCase):
    class DummyObject:
        def __init__(self):
            self.public_attr = "public"
            self._protected_attr = "protected"
            self.__private_attr = "private"

    def test_object_to_dict_without_exclude(self):
        obj = self.DummyObject()
        result = object_to_dict(obj)
        self.assertEqual(result, {'public_attr': 'public'})

    def test_object_to_dict_with_exclude(self):
        obj = self.DummyObject()
        result = object_to_dict(obj, exclude=['public_attr'])
        self.assertEqual(result, {})

class TestDeduplicateList(unittest.TestCase):
    def test_deduplicate_list_with_duplicates(self):
        result = deduplicate_list([1, 2, 2, 3, 4, 4, 5])
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_deduplicate_list_without_duplicates(self):
        result = deduplicate_list([1, 2, 3, 4, 5])
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_deduplicate_list_with_empty_list(self):
        result = deduplicate_list([])
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()