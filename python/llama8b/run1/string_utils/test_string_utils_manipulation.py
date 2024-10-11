import unittest
from string_utils import manipulatio


class TestStringUtils(unittest.TestCase):
    def test_camel_case_to_snake(self):
        result = camel_case_to_snake('helloWorld')
        self.assertEqual(result, 'hello_world')

    def test_snake_case_to_camel(self):
        result = snake_case_to_camel('hello_world')
        self.assertEqual(result, 'helloWorld')

    def test_reverse(self):
        result = reverse('hello')
        self.assertEqual(result, 'olleh')

    def test_shuffle(self):
        result = shuffle('hello')
        self.assertNotEqual(result, 'hello')

    def test_strip_html(self):
        result = strip_html('<p>hello</p>')
        self.assertEqual(result, 'hello')

    def test_prettify(self):
        result = prettify('hello')
        self.assertEqual(result, 'hello')

    def test_asciify(self):
        result = asciify('hello')
        self.assertEqual(result, 'hello')

    def test_slugify(self):
        result = slugify('hello world')
        self.assertEqual(result, 'hello-world')

    def test_booleanize(self):
        result = booleanize('true')
        self.assertTrue(result)

    def test_strip_margin(self):
        result = strip_margin('  hello  ')
        self.assertEqual(result, 'hello')

    def test_compress(self):
        result = compress('hello')
        self.assertIsInstance(result, bytes)

    def test_decompress(self):
        result = decompress(b'hello')
        self.assertEqual(result, 'hello')

    def test_roman_encode(self):
        result = roman_encode(1)
        self.assertEqual(result, 'I')

    def test_roman_decode(self):
        result = roman_decode('I')
        self.assertEqual(result, 1)

    def test_is_snake_case(self):
        self.assertTrue(is_snake_case('hello_world'))
        self.assertFalse(is_snake_case('helloWorld'))

    def test_is_full_string(self):
        self.assertTrue(is_full_string('hello'))
        self.assertFalse(is_full_string(123))

    def test_is_camel_case(self):
        self.assertTrue(is_camel_case('helloWorld'))
        self.assertFalse(is_camel_case('hello_world'))

    def test_is_integer(self):
        self.assertTrue(is_integer(123))
        self.assertFalse(is_integer('123'))

    def test_is_string(self):
        self.assertTrue(is_string('hello'))
        self.assertFalse(is_string(123))

if __name__ == '__main__':
    unittest.main()