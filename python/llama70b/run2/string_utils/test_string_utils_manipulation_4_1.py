import unittest
from string_utils.manipulation import StringCompressor, compress, decompres


class TestStringCompressor(unittest.TestCase):
    def test_init(self):
        instance = __StringCompressor()
        self.assertIsInstance(instance, __StringCompressor)

    def test_require_valid_input_and_encoding(self):
        instance = __StringCompressor()
        with self.assertRaises(InvalidInputError):
            instance.___StringCompressor__require_valid_input_and_encoding(None, 'utf-8')
        with self.assertRaises(ValueError):
            instance.___StringCompressor__require_valid_input_and_encoding('', 'utf-8')
        with self.assertRaises(ValueError):
            instance.___StringCompressor__require_valid_input_and_encoding('test', None)

    def test_compress(self):
        instance = __StringCompressor()
        result = instance.compress('test', 'utf-8')
        self.assertIsInstance(result, str)

    def test_decompress(self):
        instance = __StringCompressor()
        compressed = instance.compress('test', 'utf-8')
        result = instance.decompress(compressed, 'utf-8')
        self.assertEqual(result, 'test')

    def test_compress_invalid_input(self):
        instance = __StringCompressor()
        with self.assertRaises(InvalidInputError):
            instance.compress(None, 'utf-8')
        with self.assertRaises(ValueError):
            instance.compress('', 'utf-8')
        with self.assertRaises(ValueError):
            instance.compress('test', None)

    def test_decompress_invalid_input(self):
        instance = __StringCompressor()
        with self.assertRaises(InvalidInputError):
            instance.decompress(None, 'utf-8')
        with self.assertRaises(ValueError):
            instance.decompress('', 'utf-8')
        with self.assertRaises(ValueError):
            instance.decompress('test', None)

class TestFunctions(unittest.TestCase):
    def test_compress(self):
        result = compress('test', 'utf-8')
        self.assertIsInstance(result, str)

    def test_decompress(self):
        compressed = compress('test', 'utf-8')
        result = decompress(compressed, 'utf-8')
        self.assertEqual(result, 'test')

if __name__ == '__main__':
    unittest.main()