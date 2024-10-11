import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringManipulation(unittest.TestCase):
    def test_camel_case_to_snake(self):
        self.assertEqual(camel_case_to_snake('ThisIsCamelCase'), 'this_is_camel_case')
        self.assertEqual(camel_case_to_snake('ThisIsAlsoCamelCase'), 'this_is_also_camel_case')
        self.assertEqual(camel_case_to_snake('ThisIs snake_case'), 'this_is_snake_case')
        self.assertEqual(camel_case_to_snake('ThisIsAlsoSnake_case'), 'this_is_also_snake_case')

    def test_snake_case_to_camel(self):
        self.assertEqual(snake_case_to_camel('this_is_snake_case'), 'ThisIsSnakeCase')
        self.assertEqual(snake_case_to_camel('this_is_also_snake_case'), 'ThisIsAlsoSnakeCase')
        self.assertEqual(snake_case_to_camel('this_is_snake_case_with_numbers123'), 'ThisIsSnakeCaseWithNumbers123')
        self.assertEqual(snake_case_to_camel('this_is_also_snake_case_with_numbers123'), 'ThisIsAlsoSnakeCaseWithNumbers123')

    def test_reverse(self):
        self.assertEqual(reverse(''), '')
        self.assertEqual(reverse('a'), 'a')
        self.assertEqual(reverse('abc'), 'cba')
        self.assertEqual(reverse('123'), '321')

    def test_shuffle(self):
        self.assertNotEqual(shuffle('abc'), 'abc')
        self.assertNotEqual(shuffle('123'), '123')
        self.assertEqual(shuffle('abc'), shuffle('abc'))
        self.assertEqual(shuffle('123'), shuffle('123'))

    def test_strip_html(self):
        self.assertEqual(strip_html('<p>This is a <strong>test</strong> string.</p>'), 'This is a test string.')
        self.assertEqual(strip_html('<p>This is another <em>test</em> string.</p>'), 'This is another test string.')
        self.assertEqual(strip_html('<p>This is yet another <u>test</u> string.</p>'), 'This is yet another test string.')

    def test_prettify(self):
        self.assertEqual(prettify('This is a test string.'), 'This is a test string.')
        self.assertEqual(prettify('This is another test string.'), 'This is another test string.')
        self.assertEqual(prettify('This is yet another test string.'), 'This is yet another test string.')

    def test_asciify(self):
        self.assertEqual(asciify('This is a test string.'), 'This is a test string.')
        self.assertEqual(asciify('This is another test string.'), 'This is another test string.')
        self.assertEqual(asciify('This is yet another test string.'), 'This is yet another test string.')

    def test_slugify(self):
        self.assertEqual(slugify('This is a test string.'), 'this-is-a-test-string')
        self.assertEqual(slugify('This is another test string.'), 'this-is-another-test-string')
        self.assertEqual(slugify('This is yet another test string.'), 'this-is-yet-another-test-string')

if __name__ == '__main__':
    unittest.main()