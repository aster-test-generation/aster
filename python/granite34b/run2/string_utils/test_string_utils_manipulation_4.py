import re
import unittest
from string_utils.manipulation import StringFormatter


class Test__StringFormatter(unittest.TestCase):
    def setUp(self):
        self.formatter = __StringFormatter("This is a test string")

    def test_uppercase_first_char(self):
        self.assertEqual(self.formatter.__uppercase_first_char(re.Match("This", 0, 4)), "This")

    def test_remove_duplicates(self):
        self.assertEqual(self.formatter.__remove_duplicates(re.Match("This is a test string", 0, 16)), "This is a test string")

    def test_uppercase_first_letter_after_sign(self):
        self.assertEqual(self.formatter.__uppercase_first_letter_after_sign(re.Match("This is a test string", 0, 16)), "This is a test string")

    def test_ensure_right_space_only(self):
        self.assertEqual(self.formatter.__ensure_right_space_only(re.Match("This is a test string", 0, 16)), "This is a test string ")

    def test_ensure_left_space_only(self):
        self.assertEqual(self.formatter.__ensure_left_space_only(re.Match("This is a test string", 0, 16)), " This is a test string")

    def test_ensure_spaces_around(self):
        self.assertEqual(self.formatter.__ensure_spaces_around(re.Match("This is a test string", 0, 16)), " This is a test string ")

    def test_remove_internal_spaces(self):
        self.assertEqual(self.formatter.__remove_internal_spaces(re.Match("This is a test string", 0, 16)), "This is a test string")

    def test_fix_saxon_genitive(self):
        self.assertEqual(self.formatter.__fix_saxon_genitive(re.Match("This is a test string", 0, 16)), "Thisis a test string")

if __name__ == '__main__':
    unittest.main()