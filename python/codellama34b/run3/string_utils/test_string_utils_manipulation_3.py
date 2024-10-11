import unittest
from string_utils.manipulation import camel_case_to_snake



class TestCamelCaseToSnake(unittest.TestCase):
    def test_camel_case_to_snake(self):
        result = camel_case_to_snake('camelCase')
        self.assertEqual(result, 'camel_case')

    def test_camel_case_to_snake_with_uppercase(self):
        result = camel_case_to_snake('CamelCase')
        self.assertEqual(result, 'camel_case')

    def test_camel_case_to_snake_with_number(self):
        result = camel_case_to_snake('camel123Case')
        self.assertEqual(result, 'camel123_case')

    def test_camel_case_to_snake_with_special_chars(self):
        result = camel_case_to_snake('camel$Case')
        self.assertEqual(result, 'camel_case')

    def test_camel_case_to_snake_with_multiple_uppercase(self):
        result = camel_case_to_snake('camelCASE')
        self.assertEqual(result, 'camel_case')

    def test_camel_case_to_snake_with_multiple_numbers(self):
        result = camel_case_to_snake('camel123456Case')
        self.assertEqual(result, 'camel123456_case')

    def test_camel_case_to_snake_with_multiple_special_chars(self):
        result = camel_case_to_snake('camel$%^&*()_Case')
        self.assertEqual(result, 'camel_case')

    def test_camel_case_to_snake_with_starting_uppercase(self):
        result = camel_case_to_snake('CamelCase')
        self.assertEqual(result, 'camel_case')

    def test_camel_case_to_snake_with_starting_number(self):
        result = camel_case_to_snake('123CamelCase')
        self.assertEqual(result, '123_camel_case')

    def test_camel_case_to_snake_with_starting_special_chars(self):
        result = camel_case_to_snake('$%^&*()CamelCase')
        self.assertEqual(result, 'camel_case')

    def test_camel_case_to_snake_with_ending_uppercase(self):
        result = camel_case_to_snake('camelCaseEND')
        self.assertEqual(result, 'camel_case_end')

    def test_camel_case_to_snake_with_ending_number(self):
        result = camel_case_to_snake('camelCase123')
        self.assertEqual(result, 'camel_case123')

    def test_camel_case_to_snake_with_ending_special_chars(self):
        result = camel_case_to_snake('camelCase$%^&*()')
        self.assertEqual(result, 'camel_case')

    def test_camel_case_to_snake_with_multiple_words(self):
        result = camel_case_to_snake('camelCaseAnother')
        self.assertEqual(result, 'camel_case_another')

    def test_camel_case_to_snake_with_multiple_words_and_uppercase(self):
        result = camel_case_to_snake('camelCaseANOTHER')
        self.assertEqual(result, 'camel_case_another')

if __name__ == '__main__':
    unittest.main()