import unittest
from string_utils.manipulation import StringFormatter
from string_utils.errors import InvalidInputError
from string_utils.validation import is_string


class TestStringFormatter(unittest.TestCase):
    def test_init_valid_string(self):
        instance = __StringFormatter("test string")
        self.assertEqual(instance.input_string, "test string")

    def test_init_invalid_string(self):
        with self.assertRaises(InvalidInputError):
            __StringFormatter(123)

    def test_uppercase_first_char(self):
        instance = __StringFormatter("test string")
        result = instance._StringFormatter__uppercase_first_char(re.match(r'(.)', 'hello'))
        self.assertEqual(result, 'H')

    def test_remove_duplicates(self):
        instance = __StringFormatter("test string")
        result = instance._StringFormatter__remove_duplicates(re.match(r'(.)\1+', 'aa'))
        self.assertEqual(result, 'a')

    def test_uppercase_first_letter_after_sign(self):
        instance = __StringFormatter("test string")
        result = instance._StringFormatter__uppercase_first_letter_after_sign(re.match(r'(.)(.)', 'a.b'))
        self.assertEqual(result, 'a.B')

    def test_ensure_right_space_only(self):
        instance = __StringFormatter("test string")
        result = instance._StringFormatter__ensure_right_space_only(re.match(r'(.+)', 'test '))
        self.assertEqual(result, 'test ')

    def test_ensure_left_space_only(self):
        instance = __StringFormatter("test string")
        result = instance._StringFormatter__ensure_left_space_only(re.match(r'(.+)', ' test'))
        self.assertEqual(result, ' test')

    def test_ensure_spaces_around(self):
        instance = __StringFormatter("test string")
        result = instance._StringFormatter__ensure_spaces_around(re.match(r'(.+)', ' test '))
        self.assertEqual(result, ' test ')

    def test_remove_internal_spaces(self):
        instance = __StringFormatter("test string")
        result = instance._StringFormatter__remove_internal_spaces(re.match(r'(.+)', ' test '))
        self.assertEqual(result, 'test')

    def test_fix_saxon_genitive(self):
        instance = __StringFormatter("test string")
        result = instance._StringFormatter__fix_saxon_genitive(re.match(r'(.+)', "John's "))
        self.assertEqual(result, "John's ")

    def test_placeholder_key(self):
        key = __StringFormatter._StringFormatter__placeholder_key()
        self.assertTrue(key.startswith('$') and key.endswith('$') and len(key) == 34)

    def test_format(self):
        instance = __StringFormatter("hello world")
        result = instance.format()
        self.assertEqual(result, "Hello world")

if __name__ == '__main__':
    unittest.main()