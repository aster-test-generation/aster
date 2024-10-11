import unittest
from string_utils.manipulation import camel_case_to_snake


class TestManipulationMethods(unittest.TestCase):
    def test_camel_case_to_snake(self):
        self.assertEqual(camel_case_to_snake('helloWorld'), 'hello_world')
        self.assertEqual(camel_case_to_snake('helloWorld123'), 'hello_world123')
        self.assertEqual(camel_case_to_snake('helloWorld_123'), 'hello_world_123')

    def test_snake_case_to_camel(self):
        self.assertEqual(snake_case_to_camel('hello_world'), 'helloWorld')
        self.assertEqual(snake_case_to_camel('hello_world123'), 'helloWorld123')
        self.assertEqual(snake_case_to_camel('hello_world_123'), 'helloWorld123')

    def test_reverse(self):
        self.assertEqual(reverse('hello'), 'olleh')
        self.assertEqual(reverse('12345'), '54321')
        self.assertEqual(reverse(''), '')

    def test_shuffle(self):
        self.assertNotEqual(shuffle('hello'), 'hello')
        self.assertNotEqual(shuffle('12345'), '12345')
        self.assertNotEqual(shuffle(''), '')

    def test_strip_html(self):
        self.assertEqual(strip_html('<p>Hello, world!</p>'), 'Hello, world!')
        self.assertEqual(strip_html('<p>Hello, <strong>world!</strong></p>'), 'Hello, world!')
        self.assertEqual(strip_html('<p>Hello, <em>world!</em></p>'), 'Hello, world!')

    def test_prettify(self):
        self.assertEqual(prettify('hello_world'), 'hello world')
        self.assertEqual(prettify('hello_world123'), 'hello world123')
        self.assertEqual(prettify('hello_world_123'), 'hello world 123')

    def test_asciify(self):
        self.assertEqual(asciify('Hello, world!'), 'Hello, world!')
        self.assertEqual(asciify('Hello, world!'), 'Hello, world!')
        self.assertEqual(asciify('Hello, world!'), 'Hello, world!')

    def test_slugify(self):
        self.assertEqual(slugify('Hello, world!'), 'hello-world')
        self.assertEqual(slugify('Hello, world!'), 'hello-world')
        self.assertEqual(slugify('Hello, world!'), 'hello-world')

    def test_booleanize(self):
        self.assertEqual(booleanize('true'), True)
        self.assertEqual(booleanize('false'), False)
        self.assertEqual(booleanize('True'), True)
        self.assertEqual(booleanize('False'), False)
        self.assertEqual(booleanize('TRUE'), True)
        self.assertEqual(booleanize('FALSE'), False)
        self.assertEqual(booleanize('1'), True)
        self.assertEqual(booleanize('0'), False)
        self.assertEqual(booleanize('yes'), True)
        self.assertEqual(booleanize('no'), False)
        self.assertEqual(booleanize('YES'), True)
        self.assertEqual(booleanize('NO'), False)
        self.assertEqual(booleanize('y'), True)
        self.assertEqual(booleanize('n'), False)
        self.assertEqual(booleanize('Y'), True)
        self.assertEqual(booleanize('N'), False)
        self.assertEqual(booleanize('on'), True)
        self.assertEqual(booleanize('off'), False)
        self.assertEqual(booleanize('ON'), True)
        self.assertEqual(booleanize('OFF'), False)

    def test_strip_margin(self):
        self.assertEqual(strip_margin('  Hello,\n  world!'), 'Hello,\nworld!')
        self.assertEqual(strip_margin('  Hello,\n  world!\n'), 'Hello,\nworld!\n')
        self.assertEqual(strip_margin('  Hello,\n  world!\n\n'), 'Hello,\nworld!\n\n')

if __name__ == '__main__':
    unittest.main()