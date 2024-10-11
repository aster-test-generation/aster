from string_utils.manipulation import camel_case_to_snake
import unittest
from string_utils.manipulation import *


class TestStringFormatter(unittest.TestCase):
    def test_format(self):
        instance = __StringFormatter("test")
        result = instance.format()
        self.assertEqual(result, "test")

    def test___uppercase_first_char(self):
        instance = __StringFormatter("test")
        result = instance.__uppercase_first_char("test")
        self.assertEqual(result, "test")

    def test___remove_duplicates(self):
        instance = __StringFormatter("test")
        result = instance.__remove_duplicates("test")
        self.assertEqual(result, "test")

    def test___uppercase_first_letter_after_sign(self):
        instance = __StringFormatter("test")
        result = instance.__uppercase_first_letter_after_sign("test")
        self.assertEqual(result, "test")

    def test___ensure_right_space_only(self):
        instance = __StringFormatter("test")
        result = instance.__ensure_right_space_only("test")
        self.assertEqual(result, "test")

    def test___ensure_left_space_only(self):
        instance = __StringFormatter("test")
        result = instance.__ensure_left_space_only("test")
        self.assertEqual(result, "test")

    def test___ensure_spaces_around(self):
        instance = __StringFormatter("test")
        result = instance.__ensure_spaces_around("test")
        self.assertEqual(result, "test")

    def test___remove_internal_spaces(self):
        instance = __StringFormatter("test")
        result = instance.__remove_internal_spaces("test")
        self.assertEqual(result, "test")

    def test___fix_saxon_genitive(self):
        instance = __StringFormatter("test")
        result = instance.__fix_saxon_genitive("test")
        self.assertEqual(result, "test")

    def test___placeholder_key(self):
        instance = __StringFormatter("test")
        result = instance.__placeholder_key()
        self.assertEqual(result, "test")

if __name__ == '__main__':
    unittest.main()