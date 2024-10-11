import codecs
import unittest
from flutils.codecs.b64 import encode, decode, _get_codec_info, register, NAME


class TestEncodeFunction(unittest.TestCase):
    def test_encode(self):
        result, _ = encode("Hello, World!")
        self.assertIsInstance(result, bytes)

    def test_encode_errors(self):
        with self.assertRaises(UnicodeEncodeError):
            encode("Invalid b64 string")

class TestDecodeFunction(unittest.TestCase):
    def test_decode(self):
        result, _ = decode(b"SGVsbG8sIFdvcmxkIQ==")
        self.assertEqual(result, "Hello, World!")

class TestGetCodecInfoFunction(unittest.TestCase):
    def test_get_codec_info(self):
        result = _get_codec_info(NAME)
        self.assertIsInstance(result, codecs.CodecInfo)

    def test_get_codec_info_none(self):
        result = _get_codec_info("Invalid name")
        self.assertIsNone(result)

class TestRegisterFunction(unittest.TestCase):
    def test_register(self):
        register()
        self.assertTrue(hasattr(codecs, NAME))

class TestMagicMethods(unittest.TestCase):
    def test_module_name(self):
        self.assertEqual(NAME, "b64")

if __name__ == '__main__':
    unittest.main()