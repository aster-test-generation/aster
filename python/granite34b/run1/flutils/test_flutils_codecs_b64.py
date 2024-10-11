import codecs
import unittest
from flutils.codecs.b64 import encode, decode, NAME, _get_codec_info, register


class TestB64(unittest.TestCase):
    def test_encode(self):
        text = "This is a test"
        expected = b'VGhpcyBpcyBhIHRlc3QK'
        result = encode(text)
        self.assertEqual(result, expected)

    def test_decode(self):
        data = b'VGhpcyBpcyBhIHRlc3QK'
        expected = "This is a test"
        result = decode(data)
        self.assertEqual(result, expected)

    def test_get_codec_info(self):
        name = NAME
        expected = codecs.CodecInfo(name=name, decode=decode, encode=encode)
        result = _get_codec_info(name)
        self.assertEqual(result, expected)

    def test_register(self):
        name = NAME
        expected = codecs.CodecInfo(name=name, decode=decode, encode=encode)
        result = codecs.getencoder(name)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()