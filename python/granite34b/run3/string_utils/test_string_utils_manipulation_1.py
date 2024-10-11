import unittest
from string_utils.manipulation import slugify


class TestStringUtilsManipulation(unittest.TestCase):
    def test_reverse(self):
        self.assertEqual(reverse(''), '')
        self.assertEqual(reverse('a'), 'a')
        self.assertEqual(reverse('ab'), 'ba')
        self.assertEqual(reverse('abc'), 'cba')
        self.assertEqual(reverse('abcd'), 'dcba')

    def test_camel_case_to_snake(self):
        self.assertEqual(camel_case_to_snake(''), '')
        self.assertEqual(camel_case_to_snake('a'), 'a')
        self.assertEqual(camel_case_to_snake('ab'), 'ab')
        self.assertEqual(camel_case_to_snake('abc'), 'abc')
        self.assertEqual(camel_case_to_snake('abcd'), 'ab_cd')

    def test_snake_case_to_camel(self):
        self.assertEqual(snake_case_to_camel(''), '')
        self.assertEqual(snake_case_to_camel('a'), 'a')
        self.assertEqual(snake_case_to_camel('ab'), 'ab')
        self.assertEqual(snake_case_to_camel('abc'), 'abc')
        self.assertEqual(snake_case_to_camel('ab_cd'), 'abCd')

    def test_shuffle(self):
        self.assertEqual(shuffle(''), '')
        self.assertEqual(shuffle('a'), 'a')
        self.assertEqual(shuffle('ab'), 'ba')
        self.assertEqual(shuffle('abc'), ' cab')
        self.assertEqual(shuffle('abcd'), 'badc')

    def test_strip_html(self):
        self.assertEqual(strip_html(''), '')
        self.assertEqual(strip_html('a'), 'a')
        self.assertEqual(strip_html('ab'), 'ab')
        self.assertEqual(strip_html('abc'), 'abc')
        self.assertEqual(strip_html('abcd'), 'abcd')

    def test_prettify(self):
        self.assertEqual(prettify(''), '')
        self.assertEqual(prettify('a'), 'a')
        self.assertEqual(prettify('ab'), 'ab')
        self.assertEqual(prettify('abc'), 'abc')
        self.assertEqual(prettify('abcd'), 'abcd')

    def test_asciify(self):
        self.assertEqual(asciify(''), '')
        self.assertEqual(asciify('a'), 'a')
        self.assertEqual(asciify('ab'), 'ab')
        self.assertEqual(asciify('abc'), 'abc')
        self.assertEqual(asciify('abcd'), 'abcd')

if __name__ == '__main__':
    unittest.main()