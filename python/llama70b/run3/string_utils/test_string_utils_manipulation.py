import unittest
from string_utils import manipulatio


class TestRomanNumbers(unittest.TestCase):
    def test_roman_encode(self):
        result = roman_encode(1)
        self.assertEqual(result, 'I')

    def test_roman_decode(self):
        result = roman_decode('I')
        self.assertEqual(result, 1)

    def test_roman_encode_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            roman_encode('invalid input')

    def test_roman_decode_invalid_input(self):
        with self.assertRaises(InvalidInputError):
            roman_decode('invalid input')

class TestStringManipulationFunctions(unittest.TestCase):
    def test_camel_case_to_snake(self):
        result = camel_case_to_snake('CamelCase')
        self.assertEqual(result, 'camel_case')

    def test_snake_case_to_camel(self):
        result = snake_case_to_camel('snake_case')
        self.assertEqual(result, 'SnakeCase')

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
        result = prettify('hello\nworld')
        self.assertEqual(result, 'hello\n  world')

    def test_asciify(self):
        result = asciify('hello café')
        self.assertEqual(result, 'hello cafe')

    def test_slugify(self):
        result = slugify('hello world')
        self.assertEqual(result, 'hello-world')

    def test_booleanize(self):
        result = booleanize('true')
        self.assertTrue(result)

    def test_strip_margin(self):
        result = strip_margin('  hello\n  world')
        self.assertEqual(result, 'hello\nworld')

    def test_compress(self):
        result = compress('hello')
        self.assertIsInstance(result, bytes)

    def test_decompress(self):
        compressed = compress('hello')
        result = decompress(compressed)
        self.assertEqual(result, 'hello')

if __name__ == '__main__':
    unittest.main()