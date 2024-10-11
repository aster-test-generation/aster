from flutils.codecs.b64 import _get_codec_info
import unittest
from flutils.codecs.b64 import *
from flutils.codecs.b64 import encode, decode, _get_codec_info, register


class TestB64(unittest.TestCase):
    def test_encode(self):
        text = "Hello, World!"
        result, length = encode(text)
        self.assertIsInstance(result, bytes)
        self.assertEqual(result.decode('utf-8'), text)
        self.assertEqual(length, len(text))

    def test_encode_errors(self):
        text = "Hello, World! (Invalid characters)"
        with self.assertRaises(UnicodeEncodeError):
            encode(text)

    def test_decode(self):
        data = "SGVsbG8sIFdvcmxkIQ=="
        result, length = decode(data)
        self.assertIsInstance(result, str)
        self.assertEqual(result, "Hello, World!")
        self.assertEqual(length, len(data))

    def test_decode_errors(self):
        data = "Invalid base64 data"
        with self.assertRaises(UnicodeDecodeError):
            decode(data)

    def test_get_codec_info(self):
        info = _get_codec_info(NAME)
        self.assertIsInstance(info, codecs.CodecInfo)
        self.assertEqual(info.name, NAME)
        self.assertEqual(info.decode, decode)
        self.assertEqual(info.encode, encode)

    def test_register(self):
        try:
            codecs.getdecoder(NAME)
        except LookupError:
            self.fail("Codec not registered")

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
            decode(b"SGVsbG8sIFdvcmxkIQ==", errors='replace')

    def test_get_codec_info(self):
        result = _get_codec_info("b64")
        self.assertIsInstance(result, codecs.CodecInfo)

    def test_register(self):
        register()
        self.assertIn("b64", codecs.lookup)

if __name__ == '__main__':
    unittest.main()