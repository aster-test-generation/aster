import unittest
from string_utils import manipulatio


class TestStringFormatter(unittest.TestCase):
    def test_init(self):
        instance = __StringFormatter('test_string')
        self.assertIsInstance(instance, __StringFormatter)
        self.assertEqual(instance.input_string, 'test_string')

    def test_format(self):
        instance = __StringFormatter('Hello {name}!')
        result = instance.format()
        self.assertEqual(result, 'Hello !')

    def test_placeholder_key(self):
        result = __StringFormatter.placeholder_key()
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 36)

    def test_uppercase_first_char(self):
        instance = __StringFormatter('hello')
        result = instance.__uppercase_first_char('hello')
        self.assertEqual(result, 'Hello')

    def test_remove_duplicates(self):
        instance = __StringFormatter('hellooo')
        result = instance.__remove_duplicates('hellooo')
        self.assertEqual(result, 'h')

    def test_uppercase_first_letter_after_sign(self):
        instance = __StringFormatter('hello-world')
        result = instance.__uppercase_first_letter_after_sign('hello-world')
        self.assertEqual(result, 'hello-World')

    def test_ensure_right_space_only(self):
        instance = __StringFormatter('hello')
        result = instance.__ensure_right_space_only('hello')
        self.assertEqual(result, 'hello ')

    def test_ensure_left_space_only(self):
        instance = __StringFormatter('hello')
        result = instance.__ensure_left_space_only('hello')
        self.assertEqual(result, ' hello')

    def test_ensure_spaces_around(self):
        instance = __StringFormatter('hello')
        result = instance.__ensure_spaces_around('hello')
        self.assertEqual(result, ' hello ')

    def test_remove_internal_spaces(self):
        instance = __StringFormatter('hello world')
        result = instance.__remove_internal_spaces('hello world')
        self.assertEqual(result, 'helloworld')

    def test_fix_saxon_genitive(self):
        instance = __StringFormatter('hello world')
        result = instance.__fix_saxon_genitive('hello world')
        self.assertEqual(result, 'hello world ')

    def test_str_method(self):
        instance = __StringFormatter('test_string')
        result = str(instance)
        self.assertEqual(result, 'StringFormatter')

    def test_repr_method(self):
        instance = __StringFormatter('test_string')
        result = repr(instance)
        self.assertEqual(result, 'StringFormatter(test_string)')

if __name__ == '__main__':
    unittest.main()