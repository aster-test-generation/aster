import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringUtilsManipulation(unittest.TestCase):
    def test_camel_case_to_snake(self):
        self.assertEqual(camel_case_to_snake("helloWorld"), "hello_world")
        self.assertEqual(camel_case_to_snake("helloWorld"), "hello_world")
        self.assertEqual(camel_case_to_snake("helloWorld"), "hello_world")

    def test_snake_case_to_camel(self):
        self.assertEqual(snake_case_to_camel("hello_world"), "helloWorld")
        self.assertEqual(snake_case_to_camel("hello_world"), "helloWorld")
        self.assertEqual(snake_case_to_camel("hello_world"), "helloWorld")

    def test_reverse(self):
        self.assertEqual(reverse("hello"), "olleh")
        self.assertEqual(reverse("hello"), "olleh")
        self.assertEqual(reverse("hello"), "olleh")

    def test_shuffle(self):
        self.assertEqual(shuffle("hello"), "ehllo")
        self.assertEqual(shuffle("hello"), "ehllo")
        self.assertEqual(shuffle("hello"), "ehllo")

    def test_strip_html(self):
        self.assertEqual(strip_html("<p>hello</p>"), "hello")
        self.assertEqual(strip_html("<p>hello</p>"), "hello")
        self.assertEqual(strip_html("<p>hello</p>"), "hello")

    def test_prettify(self):
        self.assertEqual(prettify("hello world"), "Hello World")
        self.assertEqual(prettify("hello world"), "Hello World")
        self.assertEqual(prettify("hello world"), "Hello World")

    def test_asciify(self):
        self.assertEqual(asciify("Hello World"), "Hello World")
        self.assertEqual(asciify("Hello World"), "Hello World")
        self.assertEqual(asciify("Hello World"), "Hello World")

    def test_slugify(self):
        self.assertEqual(slugify("Hello World"), "hello-world")
        self.assertEqual(slugify("Hello World"), "hello-world")
        self.assertEqual(slugify("Hello World"), "hello-world")

    def test_booleanize(self):
        self.assertEqual(booleanize("True"), True)
        self.assertEqual(booleanize("True"), True)
        self.assertEqual(booleanize("True"), True)

    def test_strip_margin(self):
        self.assertEqual(strip_margin("""
        |hello
        |world
        """), "hello\nworld")
        self.assertEqual(strip_margin("""
        |hello
        |world
        """), "hello\nworld")
        self.assertEqual(strip_margin("""
        |hello
        |world
        """), "hello\nworld")

    def test_compress(self):
        self.assertEqual(compress("hello world"), b"x\x9c\xf3\xff\n\x00\x00\x00\x00\x00\xff\xffhello world")
        self.assertEqual(compress("hello world"), b"x\x9c\xf3\xff\n\x00\x00\x00\x00\x00\xff\xffhello world")
        self.assertEqual(compress("hello world"), b"x\x9c\xf3\xff\n\x00\x00\x00\x00\x00\xff\xffhello world")

    def test_decompress(self):
        self.assertEqual(decompress(b"x\x9c\xf3\xff\n\x00\x00\x00\x00\x00\xff\xffhello world"), "hello world")
        self.assertEqual(decompress(b"x\x9c\xf3\xff\n\x00\x00\x00\x00\x00\xff\xffhello world"), "hello world")
        self.assertEqual(decompress(b"x\x9c\xf3\xff\n\x00\x00\x00\x00\x00\xff\xffhello world"), "hello world")

if __name__ == '__main__':
    unittest.main()