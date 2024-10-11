import codecs
import unittest
from flutils.codecs.b64 import encode, decode, NAME, _get_codec_info, register


class TestEncode(unittest.TestCase):
    def test_encode_valid_input(self):
        text = "This is a test string"
        expected_output = b'VGhpcyBpcyBhIHRlc3Qgc3RyaW5n'
        output, length = encode(text.encode('utf-8'))
        self.assertEqual(output, expected_output)
        self.assertEqual(length, len(text))

    def test_encode_invalid_input(self):
        text = "This is a test string with invalid characters like \x80"
        with self.assertRaises(UnicodeEncodeError):
            encode(text)

class TestDecode(unittest.TestCase):
    def test_decode_valid_input(self):
        data = b'VGhpcyBpcyBhIHRlc3Qgc3RyaW5n'
        expected_output = 'This is a test string'
        output, length = decode(data)
        self.assertEqual(output, 'This is a test string')
        self.assertEqual(length, len(data))

    def test_decode_invalid_input(self):
        data = b'This is not a valid base64 string'
        with self.assertRaises(UnicodeDecodeError):
            decode(data)

class TestName(unittest.TestCase):
    def test_name(self):
        self.assertEqual(NAME, 'b64')

class TestGetCodecInfo(unittest.TestCase):
    def test_get_codec_info(self):
        obj = _get_codec_info(NAME)
        self.assertIsNotNone(obj)

class TestRegister(unittest.TestCase):
    def test_register(self):
        register()
        self.assertIsNotNone(codecs.getdecoder(NAME))

if __name__ == '__main__':
    unittest.main()