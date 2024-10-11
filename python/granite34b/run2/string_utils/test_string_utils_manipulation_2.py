import unittest
from string_utils.manipulation import camel_case_to_snake


class TestStringUtilsManipulation(unittest.TestCase):
    def test_slugify(self):
        self.assertEqual(slugify('This is a test'), 'this-is-a-test')
        self.assertEqual(slugify('This is another test'), 'this-is-another-test')
        self.assertEqual(slugify('This is a test'), 'this-is-a-test')

    def test_booleanize(self):
        self.assertTrue(booleanize('true'))
        self.assertTrue(booleanize('1'))
        self.assertTrue(booleanize('yes'))
        self.assertTrue(booleanize('y'))
        self.assertFalse(booleanize('false'))
        self.assertFalse(booleanize('0'))
        self.assertFalse(booleanize('no'))
        self.assertFalse(booleanize('n'))

    def test_strip_margin(self):
        input_string = """
        |This is a test
        |This is another test
        """
        expected_output = """This is a test
        This is another test"""
        self.assertEqual(strip_margin(input_string), expected_output)

    def test_compress(self):
        input_string = "This is a test"
        compressed_string = compress(input_string)
        self.assertLess(len(compressed_string), len(input_string))

    def test_decompress(self):
        input_string = "This is a test"
        compressed_string = compress(input_string)
        decompressed_string = decompress(compressed_string)
        self.assertEqual(decompressed_string, input_string)

if __name__ == '__main__':
    unittest.main()