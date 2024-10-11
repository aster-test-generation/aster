import unittest
from string_utils.manipulation import compress, decompres


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
            instance.___StringCompressor__require_valid_input_and_encoding('hello', None)

    def test_compress(self):
        instance = __StringCompressor()
        result = instance.compress('hello', 'utf-8')
        self.assertIsInstance(result, str)

    def test_decompress(self):
        instance = __StringCompressor()
        compressed = instance.compress('hello', 'utf-8')
        result = instance.decompress(compressed, 'utf-8')
        self.assertEqual(result, 'hello')

    def test_str_method(self):
        instance = __StringCompressor()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = __StringCompressor()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestFunctions(unittest.TestCase):
    def test_compress(self):
        result = compress('hello', 'utf-8')
        self.assertIsInstance(result, str)

    def test_decompress(self):
        compressed = compress('hello', 'utf-8')
        result = decompress(compressed, 'utf-8')
        self.assertEqual(result, 'hello')

if __name__ == '__main__':
    unittest.main()