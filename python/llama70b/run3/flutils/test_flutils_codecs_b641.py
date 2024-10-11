import unittest
from flutils.codecs.b64 import *

class TestB64Codec(unittest.TestCase):
    def test_encode(self):
        result, _ = encode("Hello, World!")
        self.assertEqual(result, b' SGVsbG8sIFdvcmxkIQ==')

    def test_decode(self):
        result, _ = decode(b'SGVsbG8sIFdvcmxkIQ==')
        self.assertEqual(result, "Hello, World!")

    def test_encode_errors(self):
        with self.assertRaises(UnicodeEncodeError):
            encode("Invalid b64 string")

    def test_get_codec_info(self):
        codec_info = _get_codec_info(NAME)
        self.assertIsInstance(codec_info, codecs.CodecInfo)

    def test_register(self):
        register()
        self.assertTrue(codecs.getdecoder(NAME) is not None)

    def test_register_already_registered(self):
        register()
        with self.assertRaises(LookupError):
            register()

if __name__ == '__main__':
    unittest.main()