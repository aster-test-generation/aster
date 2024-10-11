import unittest
from ansible.utils.helpers import pct_to_int, object_to_dict, deduplicate_list


class TestPctToInt(unittest.TestCase):
    def test_pct_to_int_with_percentage(self):
        result = pct_to_int("50%", 100)
        self.assertEqual(result, 50)

    def test_pct_to_int_with_percentage_min_value(self):
        result = pct_to_int("0%", 100)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_integer(self):
        result = pct_to_int(10, 100)
        self.assertEqual(result, 10)

    def test_pct_to_int_with_string_integer(self):
        result = pct_to_int("10", 100)
        self.assertEqual(result, 10)

class TestObjectToDict(unittest.TestCase):
    class DummyObject:
        def __init__(self):
            self.a = 1
            self._b = 2
            self.__c = 3

    def test_object_to_dict_no_exclude(self):
        obj = self.DummyObject()
        result = object_to_dict(obj)
        self.assertEqual(result, {'a': 1})

    def test_object_to_dict_with_exclude(self):
        obj = self.DummyObject()
        result = object_to_dict(obj, exclude=['a'])
        self.assertEqual(result, {})

class TestDeduplicateList(unittest.TestCase):
    def test_deduplicate_list_with_duplicates(self):
        result = deduplicate_list([1, 2, 2, 3, 3, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_deduplicate_list_no_duplicates(self):
        result = deduplicate_list([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_deduplicate_list_empty(self):
        result = deduplicate_list([])
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()