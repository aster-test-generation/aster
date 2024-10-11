import unittest
from string_utils import manipulatio


class TestRomanNumbers(unittest.TestCase):
    def test_init(self):
        instance = __RomanNumbers()
        self.assertIsInstance(instance, __RomanNumbers)

    def test_encode_digit(self):
        result = __RomanNumbers()._RomanNumbers__encode_digit(0, 3)
        self.assertEqual(result, 'III')

    def test_encode(self):
        result = __RomanNumbers().encode(123)
        self.assertEqual(result, 'CXXIII')

    def test_index_for_sign(self):
        result = __RomanNumbers()._RomanNumbers__index_for_sign('I')
        self.assertEqual(result, 0)

    def test_decode(self):
        result = __RomanNumbers().decode('CXXIII')
        self.assertEqual(result, 123)

class TestFunctions(unittest.TestCase):
    def test_camel_case_to_snake(self):
        result = camel_case_to_snake('HelloWorld')
        self.assertEqual(result, 'hello_world')

    def test_snake_case_to_camel(self):
        result = snake_case_to_camel('hello_world')
        self.assertEqual(result, 'HelloWorld')

    def test_reverse(self):
        result = reverse('hello')
        self.assertEqual(result, 'olleh')

    def test_shuffle(self):
        result = shuffle('hello')
        self.assertNotEqual(result, 'hello')

    def test_strip_html(self):
        result = strip_html('<p>Hello World!</p>')
        self.assertEqual(result, 'Hello World!')

    def test_prettify(self):
        result = prettify('hello world')
        self.assertEqual(result, 'Hello World')

    def test_asciify(self):
        result = asciify('hello world')
        self.assertEqual(result, 'hello world')

    def test_slugify(self):
        result = slugify('Hello World!')
        self.assertEqual(result, 'hello-world')

    def test_booleanize(self):
        result = booleanize('true')
        self.assertTrue(result)

    def test_strip_margin(self):
        result = strip_margin('  hello world  ')
        self.assertEqual(result, 'hello world')

    def test_compress(self):
        result = compress('hello world')
        self.assertIsInstance(result, bytes)

    def test_decompress(self):
        compressed = compress('hello world')
        result = decompress(compressed)
        self.assertEqual(result, 'hello world')

    def test_roman_encode(self):
        result = roman_encode(123)
        self.assertEqual(result, 'CXXIII')

    def test_roman_decode(self):
        result = roman_decode('CXXIII')
        self.assertEqual(result, 123)

if __name__ == '__main__':
    unittest.main()