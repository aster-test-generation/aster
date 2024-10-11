import unittest
from string_utils.manipulation import StringFormatter


class Test__StringFormatter(unittest.TestCase):
    def test___init__(self):
        input_string = "This is a test string"
        formatter = __StringFormatter(input_string)
        self.assertEqual(formatter.input_string, input_string)

    def test___uppercase_first_char(self):
        input_string = "this is a test string"
        expected_output = "This is a test string"
        formatter = __StringFormatter(input_string)
        output = formatter.__uppercase_first_char(input_string)
        self.assertEqual(output, expected_output)

    def test___remove_duplicates(self):
        input_string = "this is a test string"
        expected_output = "this is a test string"
        formatter = __StringFormatter(input_string)
        output = formatter.__remove_duplicates(input_string)
        self.assertEqual(output, expected_output)

    def test___uppercase_first_letter_after_sign(self):
        input_string = "this is a test string"
        expected_output = "this is a Test string"
        formatter = __StringFormatter(input_string)
        output = formatter.__uppercase_first_letter_after_sign(input_string)
        self.assertEqual(output, expected_output)

    def test___ensure_right_space_only(self):
        input_string = "this is a test string"
        expected_output = "this is a test string "
        formatter = __StringFormatter(input_string)
        output = formatter.__ensure_right_space_only(input_string)
        self.assertEqual(output, expected_output)

    def test___ensure_left_space_only(self):
        input_string = "this is a test string"
        expected_output = " this is a test string"
        formatter = __StringFormatter(input_string)
        output = formatter.__ensure_left_space_only(input_string)
        self.assertEqual(output, expected_output)

    def test___ensure_spaces_around(self):
        input_string = "this is a test string"
        expected_output = " this is a test string "
        formatter = __StringFormatter(input_string)
        output = formatter.__ensure_spaces_around(input_string)
        self.assertEqual(output, expected_output)

    def test___remove_internal_spaces(self):
        input_string = "this is a test string"
        expected_output = "thisisateststring"
        formatter = __StringFormatter(input_string)
        output = formatter.__remove_internal_spaces(input_string)
        self.assertEqual(output, expected_output)

    def test___fix_saxon_genitive(self):
        input_string = "this is a test string"
        expected_output = "thisisateststring"
        formatter = __StringFormatter(input_string)
        output = formatter.__fix_saxon_genitive(input_string)
        self.assertEqual(output, expected_output)

    def test___placeholder_key(self):
        formatter = __StringFormatter("This is a test string")
        placeholder_key = formatter.__placeholder_key()
        self.assertTrue(placeholder_key.startswith("$"))
        self.assertTrue(placeholder_key.endswith("$"))
        self.assertEqual(len(placeholder_key), 36)

    def test_format(self):
        input_string = "This is a test string"
        expected_output = "This is a test string"
        formatter = __StringFormatter(input_string)
        output = formatter.format()
        self.assertEqual(output, expected_output)

if __name__ == '__main__':
    unittest.main()