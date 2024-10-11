import codecs
import unittest
from flutils.codecs.b64 import encode, decode, _get_codec_info, register


class TestB64(unittest.TestCase):
    def test_encode(self):
        result = encode("Hello, World!", errors='strict')
        self.assertIsInstance(result, tuple)
        self.assertIsInstance(result[0], bytes)
        self.assertIsInstance(result[1], int)

    def test_encode_errors(self):
        with self.assertRaises(UnicodeEncodeError):
            encode("Hello, World!", errors='replace')

    def test_decode(self):
        result = decode(b"SGVsbG8sIFdvcmxkIQ==", errors='strict')
        self.assertIsInstance(result, tuple)
        self.assertIsInstance(result[0], str)
        self.assertIsInstance(result[1], int)

    def test_decode_errors(self):
        with self.assertRaises(UnicodeDecodeError):
            decode(b"SGVsbG8sIFdvcmxkIQ", errors='replace')

    def test_get_codec_info(self):
        result = _get_codec_info("b64")
        self.assertIsInstance(result, codecs.CodecInfo)

    def test_register(self):
        register()
        self.assertIn("b64", codecs.lookup)

if __name__ == '__main__':
    unittest.main()