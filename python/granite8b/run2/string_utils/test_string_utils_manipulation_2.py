import unittest
from string_utils.manipulation import camel_case_to_snake


class TestSlugify(unittest.TestCase):
    def test_slugify(self):
        self.assertEqual(slugify('Hello World!'), 'hello-world')
        self.assertEqual(slugify('Hello, World!'), 'hello-world')
        self.assertEqual(slugify('Hello World! 123'), 'hello-world-123')
        self.assertEqual(slugify('Hello World!@#$%^&*()_+'), 'hello-world')
        self.assertEqual(slugify(''), '')

class TestBooleanize(unittest.TestCase):
    def test_booleanize(self):
        self.assertTrue(booleanize('true'))
        self.assertTrue(booleanize('1'))
        self.assertTrue(booleanize('yes'))
        self.assertTrue(booleanize('y'))
        self.assertFalse(booleanize('false'))
        self.assertFalse(booleanize('0'))
        self.assertFalse(booleanize('no'))
        self.assertFalse(booleanize('n'))
        self.assertRaises(InvalidInputError, booleanize, 123)
        self.assertRaises(InvalidInputError, booleanize, ['true'])

class TestStripMargin(unittest.TestCase):
    def test_strip_margin(self):
        self.assertEqual(strip_margin('Hello\n  World!'), 'Hello\nWorld!')
        self.assertEqual(strip_margin('Hello\n    World!'), 'Hello\nWorld!')
        self.assertEqual(strip_margin('Hello\n\n  World!'), 'Hello\n\nWorld!')
        self.assertEqual(strip_margin('Hello\n\n    World!'), 'Hello\n\nWorld!')
        self.assertEqual(strip_margin('Hello\n\n\n  World!'), 'Hello\n\n\nWorld!')
        self.assertEqual(strip_margin('Hello\n\n\n    World!'), 'Hello\n\n\nWorld!')

class TestCompress(unittest.TestCase):
    def test_compress(self):
        self.assertEqual(compress('Hello, World!'), 'SGVsbG8sIFdvcmxkIQ==')
        self.assertEqual(compress('Hello, World! 123'), 'SGVsbG8sIFdvcmxkIQo=')
        self.assertEqual(compress(''), '')

class TestDecompress(unittest.TestCase):
    def test_decompress(self):
        self.assertEqual(decompress('SGVsbG8sIFdvcmxkIQ=='), 'Hello, World!')
        self.assertEqual(decompress('SGVsbG8sIFdvcmxkIQo='), 'Hello, World! 123')
        self.assertEqual(decompress(''), '')

if __name__ == '__main__':
    unittest.main()