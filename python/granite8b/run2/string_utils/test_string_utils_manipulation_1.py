import unittest
from string_utils.manipulation import reverse, slugify, camel_case_to_snake, snake_case_to_camel, shuffle, strip_html, prettify, asciify


class TestManipulation(unittest.TestCase):
    def test_reverse(self):
        self.assertEqual(reverse('hello'), 'olleh')
        self.assertEqual(reverse('12345'), '54321')
        self.assertEqual(reverse(''), '')

    def test_camel_case_to_snake(self):
        self.assertEqual(camel_case_to_snake('helloWorld'), 'hello_world')
        self.assertEqual(camel_case_to_snake('helloWorld123'), 'hello_world123')
        self.assertEqual(camel_case_to_snake('HelloWorld'), 'hello_world')

    def test_snake_case_to_camel(self):
        self.assertEqual(snake_case_to_camel('hello_world'), 'HelloWorld')
        self.assertEqual(snake_case_to_camel('hello_world123'), 'HelloWorld123')
        self.assertEqual(snake_case_to_camel('hello_world', upper_case_first=False), 'helloWorld')

    def test_shuffle(self):
        self.assertNotEqual(shuffle('hello'), 'hello')
        self.assertNotEqual(shuffle('12345'), '12345')
        self.assertEqual(shuffle(''), '')

    def test_strip_html(self):
        self.assertEqual(strip_html('<p>Hello, world!</p>'), 'Hello, world!')
        self.assertEqual(strip_html('<p>Hello, <strong>world!</strong></p>'), 'Hello, world!')
        self.assertEqual(strip_html('<p>Hello, <em>world!</em></p>'), 'Hello, world!')
        self.assertEqual(strip_html('<p>Hello, <a href="https://www.example.com">world!</a></p>'), 'Hello, world!')
        self.assertEqual(strip_html('<p>Hello, <a href="https://www.example.com">world!</a></p>', keep_tag_content=True), 'Hello, world!')

    def test_prettify(self):
        self.assertEqual(prettify('hello world'), 'hello world')
        self.assertEqual(prettify('hello_world'), 'hello world')
        self.assertEqual(prettify('hello_world123'), 'hello world 123')
        self.assertEqual(prettify('HelloWorld'), 'hello world')
        self.assertEqual(prettify('HelloWorld123'), 'hello world 123')

    def test_asciify(self):
        self.assertEqual(asciify('Hello, world!'), 'Hello, world!')
        self.assertEqual(asciify('Hello, world!'), 'Hello, world!')
        self.assertEqual(asciify('Hello, world!'), 'Hello, world!')
        self.assertEqual(asciify('Hello, world!'), 'Hello, world!')
        self.assertEqual(asciify('Hello, world!'), 'Hello, world!')

if __name__ == '__main__':
    unittest.main()