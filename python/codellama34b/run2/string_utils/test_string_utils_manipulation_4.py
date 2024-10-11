from string_utils.manipulation import camel_case_to_snake
import unittest
from string_utils.manipulation import *


class TestStringFormatter(unittest.TestCase):
    def test_format(self):
        input_string = "Test String"
        instance = __StringFormatter(input_string)
        result = instance.format()
        self.assertEqual(result, "Test String")

    def test_uppercase_first_char(self):
        regex_match = "Test String"
        instance = __StringFormatter(regex_match)
        result = instance.__uppercase_first_char(regex_match)
        self.assertEqual(result, "Test String")

    def test_remove_duplicates(self):
        regex_match = "Test String"
        instance = __StringFormatter(regex_match)
        result = instance.__remove_duplicates(regex_match)
        self.assertEqual(result, "Test String")

    def test_uppercase_first_letter_after_sign(self):
        regex_match = "Test String"
        instance = __StringFormatter(regex_match)
        result = instance.__uppercase_first_letter_after_sign(regex_match)
        self.assertEqual(result, "Test String")

    def test_ensure_right_space_only(self):
        regex_match = "Test String"
        instance = __StringFormatter(regex_match)
        result = instance.__ensure_right_space_only(regex_match)
        self.assertEqual(result, "Test String")

    def test_ensure_left_space_only(self):
        regex_match = "Test String"
        instance = __StringFormatter(regex_match)
        result = instance.__ensure_left_space_only(regex_match)
        self.assertEqual(result, "Test String")

    def test_ensure_spaces_around(self):
        regex_match = "Test String"
        instance = __StringFormatter(regex_match)
        result = instance.__ensure_spaces_around(regex_match)
        self.assertEqual(result, "Test String")

    def test_remove_internal_spaces(self):
        regex_match = "Test String"
        instance = __StringFormatter(regex_match)
        result = instance.__remove_internal_spaces(regex_match)
        self.assertEqual(result, "Test String")

    def test_fix_saxon_genitive(self):
        regex_match = "Test String"
        instance = __StringFormatter(regex_match)
        result = instance.__fix_saxon_genitive(regex_match)
        self.assertEqual(result, "Test String")

    def test_placeholder_key(self):
        instance = __StringFormatter("Test String")
        result = instance.__placeholder_key()
        self.assertEqual(result, "Test String")

if __name__ == '__main__':
    unittest.main()