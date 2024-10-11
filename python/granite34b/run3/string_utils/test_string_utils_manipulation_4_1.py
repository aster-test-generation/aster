import unittest
from string_utils.manipulation import camel_case_to_snake


class TestCamelCaseToSnake(unittest.TestCase):
    def test_camel_case_to_snake(self):
        self.assertEqual(camel_case_to_snake('helloWorld'), 'hello_world')
        self.assertEqual(camel_case_to_snake('helloWorld123'), 'hello_world123')
        self.assertEqual(camel_case_to_snake('HelloWorld'), 'hello_world')
        self.assertEqual(camel_case_to_snake('HelloWorld123'), 'hello_world123')
        self.assertEqual(camel_case_to_snake('hello_world'), 'hello_world')
        self.assertEqual(camel_case_to_snake('hello_world123'), 'hello_world123')
        self.assertEqual(camel_case_to_snake('Hello_world'), 'hello_world')
        self.assertEqual(camel_case_to_snake('Hello_world123'), 'hello_world123')
        self.assertEqual(camel_case_to_snake(''), '')
        self.assertEqual(camel_case_to_snake(None), '')

class TestSnakeCaseToCamel(unittest.TestCase):
    def test_snake_case_to_camel(self):
        self.assertEqual(snake_case_to_camel('hello_world'), 'helloWorld')
        self.assertEqual(snake_case_to_camel('hello_world123'), 'helloWorld123')
        self.assertEqual(snake_case_to_camel('hello_World'), 'helloWorld')
        self.assertEqual(snake_case_to_camel('hello_World123'), 'helloWorld123')
        self.assertEqual(snake_case_to_camel('hello_world'), 'helloWorld')
        self.assertEqual(snake_case_to_camel('hello_world123'), 'helloWorld123')
        self.assertEqual(snake_case_to_camel('Hello_world'), 'helloWorld')
        self.assertEqual(snake_case_to_camel('Hello_world123'), 'helloWorld123')
        self.assertEqual(snake_case_to_camel(''), '')
        self.assertEqual(snake_case_to_camel(None), '')

class TestReverse(unittest.TestCase):
    def test_reverse(self):
        self.assertEqual(reverse('hello'), 'olleh')
        self.assertEqual(reverse('hello123'), '321olleh')
        self.assertEqual(reverse(''), '')
        self.assertEqual(reverse(None), '')

class TestShuffle(unittest.TestCase):
    def test_shuffle(self):
        self.assertEqual(shuffle('hello'), ''.join(sorted('hello')))
        self.assertEqual(shuffle('hello123'), ''.join(sorted('hello123')))
        self.assertEqual(shuffle(''), '')
        self.assertEqual(shuffle(None), '')

class TestStripHtml(unittest.TestCase):
    def test_strip_html(self):
        self.assertEqual(strip_html('<p>hello</p>'), 'hello')
        self.assertEqual(strip_html('<p>hello123</p>'), 'hello123')
        self.assertEqual(strip_html(''), '')
        self.assertEqual(strip_html(None), '')

class TestPrettify(unittest.TestCase):
    def test_prettify(self):
        self.assertEqual(prettify('hello'), 'Hello')
        self.assertEqual(prettify('hello123'), 'Hello123')
        self.assertEqual(prettify(''), '')
        self.assertEqual(prettify(None), '')

class TestAsciify(unittest.TestCase):
    def test_asciify(self):
        self.assertEqual(asciify('hello'), 'hello')
        self.assertEqual(asciify('héllo123'), 'hello123')
        self.assertEqual(asciify(''), '')
        self.assertEqual(asciify(None), '')

class TestSlugify(unittest.TestCase):
    def test_slugify(self):
        self.assertEqual(slugify('hello'), 'hello')
        self.assertEqual(slugify('hello123'), 'hello123')
        self.assertEqual(slugify(''), '')
        self.assertEqual(slugify(None), '')


if __name__ == '__main__':
    unittest.main()