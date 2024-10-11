from flutils.codecs.b64 import _get_codec_info
import unittest
from flutils.codecs.b64 import *


class TestB64(unittest.TestCase):
    def test_encode(self):
        text = "test"
        errors = "strict"
        result = encode(text, errors)
        self.assertEqual(result, (b'test', 4))

    def test_decode(self):
        data = b"test"
        errors = "strict"
        result = decode(data, errors)
        self.assertEqual(result, ('dGVzdA==\n', 4))

    def test__get_codec_info(self):
        name = "b64"
        result = _get_codec_info(name)
        self.assertEqual(result.name, "b64")

    def test_register(self):
        register()
        self.assertEqual(codecs.getdecoder("b64"), decode)

if __name__ == '__main__':
    unittest.main()