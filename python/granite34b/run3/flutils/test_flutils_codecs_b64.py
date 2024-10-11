import codecs
import unittest
from flutils.codecs.b64 import encode, decode, NAME, _get_codec_info, register


class TestB64(unittest.TestCase):
    def test_encode(self):
        text = "Hello, World!"
        expected_output = b'SGVsbG8sIFdvcmxkIQ=='
        output, length = encode(b"Hello, World!")
        self.assertEqual(output, expected_output)
        self.assertEqual(length, len(text))

    def test_decode(self):
        data = b'SGVsbG8sIFdvcmxkIQ=='
        expected_output = "Hello, World!"
        output, length = decode(data)
        self.assertEqual(output, expected_output)
        self.assertEqual(length, len(data))

    def test_get_codec_info(self):
        name = NAME
        expected_output = codecs.CodecInfo(name=name, decode=decode, encode=encode)
        output = _get_codec_info(name)
        self.assertEqual(output, expected_output)

    def test_register(self):
        name = NAME
        try:
            codecs.getdecoder(name)
        except LookupError:
            register()
            output = codecs.getdecoder(name)
            self.assertEqual(output, decode)

if __name__ == '__main__':
    unittest.main()