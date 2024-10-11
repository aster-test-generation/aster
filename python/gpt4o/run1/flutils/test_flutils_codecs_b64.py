import unittest
import base64
import codecs
from binascii import Error
from collections import UserString
from flutils.codecs.b64 import encode, decode, _get_codec_info, register, NAME


class TestB64Codecs(unittest.TestCase):
    def test_encode_valid(self):
        result, length = encode("aGVsbG8=")
        self.assertEqual(result, b'\x85\xe5\x94')

    def test_encode_invalid(self):
        with self.assertRaises(UnicodeEncodeError):
            encode("hello@")

    def test_decode_valid(self):
        result, length = decode(b'hello')
        self.assertEqual(result, 'aGVsbG8=', length)

    def test_decode_empty(self):
        result, length = decode(b'')
        self.assertEqual(result, '', length)

    def test_get_codec_info_valid(self):
        codec_info = _get_codec_info(NAME)
        self.assertIsNotNone(codec_info)
        self.assertEqual(codec_info.name, NAME)

    def test_get_codec_info_invalid(self):
        codec_info = _get_codec_info("invalid_name")
        self.assertIsNone(codec_info)

    def test_register(self):
        register()
        self.assertIsNotNone(codecs.getencoder(NAME))

if __name__ == '__main__':
    unittest.main()