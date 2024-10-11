import unittest
import base64
import codecs
from binascii import Error
from flutils.codecs.b64 import encode, decode, _get_codec_info, register, NAME


class TestB64Codecs(unittest.TestCase):
    def test_encode_valid(self):
        result, length = encode("aGVsbG8=")
        self.assertEqual(result, base64.decodebytes(b'hello'))
        self.assertEqual(length, 5)

    def test_encode_invalid(self):
        with self.assertRaises(UnicodeEncodeError):
            encode("hello@")

    def test_decode_valid(self):
        result, length = decode(b'hello')
        self.assertEqual(result, base64.b64encode(b'hello').decode('utf-8'))
        self.assertEqual(length, 5)

    def test_decode_empty(self):
        result, length = decode(b'')
        self.assertEqual(result, '')
        self.assertEqual(length, 0)

    def test_get_codec_info_valid(self):
        codec_info = _get_codec_info(NAME)
        self.assertIsNotNone(codec_info)
        self.assertEqual(codec_info.name, NAME)
        self.assertEqual(codec_info.encode, encode)
        self.assertEqual(codec_info.decode, decode)

    def test_get_codec_info_invalid(self):
        codec_info = _get_codec_info("invalid_name")
        self.assertIsNone(codec_info)

    def test_register(self):
        register()
        codec_info = codecs.lookup(NAME)
        self.assertIsNotNone(codec_info)
        self.assertEqual(codec_info.name, NAME)
        self.assertEqual(codec_info.encode, encode)
        self.assertEqual(codec_info.decode, decode)

if __name__ == '__main__':
    unittest.main()