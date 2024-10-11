import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringUtilsManipulation(unittest.TestCase):
    def test_slugify(self):
        self.assertEqual(slugify('This is a test'), 'this-is-a-test')
        self.assertEqual(slugify('This is a Test'), 'this-is-a-test')
        self.assertEqual(slugify('This is a Test', '_'), 'this_is_a_test')

    def test_booleanize(self):
        self.assertTrue(booleanize('True'))
        self.assertTrue(booleanize('true'))
        self.assertTrue(booleanize('1'))
        self.assertTrue(booleanize('Yes'))
        self.assertTrue(booleanize('yes'))
        self.assertTrue(booleanize('Y'))
        self.assertFalse(booleanize('False'))
        self.assertFalse(booleanize('false'))
        self.assertFalse(booleanize('0'))
        self.assertFalse(booleanize('No'))
        self.assertFalse(booleanize('no'))
        self.assertFalse(booleanize('N'))

    def test_strip_margin(self):
        self.assertEqual(strip_margin("""
        |This is a test
        |This is another test
        """), 'This is a test\nThis is another test')
        self.assertEqual(strip_margin("""
        |This is a test
        |This is another test
        |
        """), 'This is a test\nThis is another test\n')
        self.assertEqual(strip_margin("""
        |This is a test
        |This is another test
        |
        |
        """), 'This is a test\nThis is another test\n')

    def test_compress(self):
        self.assertEqual(compress('This is a test'), 'eJxLickKgzAQRdeO')
        self.assertEqual(compress('This is a test', 'utf-8', 1), 'eJxLickKgzAQRdeO')
        self.assertEqual(compress('This is a test', 'utf-8', 9), 'eJxLickKgzAQRdeO')

    def test_decompress(self):
        self.assertEqual(decompress('eJxLickKgzAQRdeO'), 'This is a test')
        self.assertEqual(decompress('eJxLickKgzAQRdeO', 'utf-8'), 'This is a test')

if __name__ == '__main__':
    unittest.main()