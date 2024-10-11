import unittest
from string_utils.manipulation import slugify


class ManipulationTestCase(unittest.TestCase):
    def test_reverse(self):
        self.assertEqual(reverse(''), '')
        self.assertEqual(reverse('abc'), 'cba')
        self.assertEqual(reverse('123'), '321')

    def test_camel_case_to_snake(self):
        self.assertEqual(camel_case_to_snake(''), '')
        self.assertEqual(camel_case_to_snake('abc'), 'abc')
        self.assertEqual(camel_case_to_snake('Abc'), 'abc')
        self.assertEqual(camel_case_to_snake('aBc'), 'a_bc')
        self.assertEqual(camel_case_to_snake('aBC'), 'a_b_c')

    def test_snake_case_to_camel(self):
        self.assertEqual(snake_case_to_camel(''), '')
        self.assertEqual(snake_case_to_camel('abc'), 'abc')
        self.assertEqual(snake_case_to_camel('a_bc'), 'aBc')
        self.assertEqual(snake_case_to_camel('a_b_c'), 'aBC')
        self.assertEqual(snake_case_to_camel('a_b_c', False), 'aBC')

    def test_shuffle(self):
        self.assertEqual(shuffle(''), '')
        self.assertEqual(shuffle('abc'), ' cab')
        self.assertEqual(shuffle('123'), '213')

    def test_strip_html(self):
        self.assertEqual(strip_html(''), '')
        self.assertEqual(strip_html('<p>abc</p>'), 'abc')
        self.assertEqual(strip_html('<p>123</p>'), '123')
        self.assertEqual(strip_html('<p>123</p>', True), '<p>123</p>')

    def test_prettify(self):
        self.assertEqual(prettify(''), '')
        self.assertEqual(prettify('abc'), 'abc')
        self.assertEqual(prettify('123'), '123')
        self.assertEqual(prettify('  abc  '), 'abc')
        self.assertEqual(prettify('  a  b  c  '), 'a b c')

    def test_asciify(self):
        self.assertEqual(asciify(''), '')
        self.assertEqual(asciify('abc'), 'abc')
        self.assertEqual(asciify('123'), '123')
        self.assertEqual(asciify('áéíóú'), 'aeiou')
        self.assertEqual(asciify('Ññ'), 'Nn')

if __name__ == '__main__':
    unittest.main()