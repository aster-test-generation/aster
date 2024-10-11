import unittest
from string_utils.manipulation import slugify


class TestStringUtilsManipulation(unittest.TestCase):
    def test_reverse(self):
        self.assertEqual(reverse(''), '')
        self.assertEqual(reverse('abc'), 'cba')
        self.assertEqual(reverse('123'), '321')

    def test_camel_case_to_snake(self):
        self.assertEqual(camel_case_to_snake(''), '')
        self.assertEqual(camel_case_to_snake('abc'), 'abc')
        self.assertEqual(camel_case_to_snake('AbcDef'), 'abc_def')
        self.assertEqual(camel_case_to_snake('ABCDef'), 'a_b_c_def')

    def test_snake_case_to_camel(self):
        self.assertEqual(snake_case_to_camel(''), '')
        self.assertEqual(snake_case_to_camel('abc'), 'Abc')
        self.assertEqual(snake_case_to_camel('abc_def'), 'AbcDef')
        self.assertEqual(snake_case_to_camel('a_b_c_def'), 'ABCDef')

    def test_shuffle(self):
        self.assertEqual(shuffle(''), '')
        self.assertEqual(shuffle('abc'), ''.join(sorted('abc')))
        self.assertEqual(shuffle('123'), ''.join(sorted('123')))

    def test_strip_html(self):
        self.assertEqual(strip_html(''), '')
        self.assertEqual(strip_html('<p>abc</p>'), 'abc')
        self.assertEqual(strip_html('<p>123</p>'), '123')
        self.assertEqual(strip_html('<p>abc</p>', keep_tag_content=True), '<p>abc</p>')

    def test_prettify(self):
        self.assertEqual(prettify(''), '')
        self.assertEqual(prettify('abc'), 'abc')
        self.assertEqual(prettify('123'), '123')
        self.assertEqual(prettify('  abc  '), 'abc')
        self.assertEqual(prettify('  <p>  abc  </p>  '), '<p>abc</p>')

    def test_asciify(self):
        self.assertEqual(asciify(''), '')
        self.assertEqual(asciify('abc'), 'abc')
        self.assertEqual(asciify('123'), '123')
        self.assertEqual(asciify('áéíóú'), 'aeiou')
        self.assertEqual(asciify('Ññ'), 'Nn')

if __name__ == '__main__':
    unittest.main()