import codecs
import unittest
from flutils.codecs.b64 import encode, decode, _get_codec_info, register


class TestB64Codecs(unittest.TestCase):
    def test_encode(self):
        result = encode("Hello, World!", "strict")
        self.assertEqual(result[0].decode("utf-8"), "Hello, World!")
        self.assertEqual(result[1], 13)

    def test_encode_errors(self):
        with self.assertRaises(UnicodeEncodeError):
            encode("Hello, World!", "replace")

    def test_decode(self):
        result = decode(b"SGVsbG8sIFdvcmxk!", "strict")
        self.assertEqual(result[0], "Hello, World!")
        self.assertEqual(result[1], 13)

    def test_decode_errors(self):
        with self.assertRaises(UnicodeDecodeError):
            decode(b"SGVsbG8sIFdvcmxk!", "replace")

    def test_get_codec_info(self):
        result = _get_codec_info("b64")
        self.assertIsNotNone(result)

    def test_register(self):
        register()
        self.assertIsNotNone(codecs.getdecoder("b64"))

if __name__ == '__main__':
    unittest.main()