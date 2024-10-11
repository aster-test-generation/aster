import unittest
from flutils.codecs.b64 import encode, decode


class TestB64(unittest.TestCase):
    def test_encode(self):
        text = 'Hello, World!'
        encoded_bytes, length = encode(text.encode('utf-8'))
        encoded_str = encoded_bytes.decode('utf-8')
        self.assertEqual(encoded_str, 'SGVsbG8sIFdvcmxkIQ==')
        self.assertEqual(length, len(text))

    def test_decode(self):
        encoded_str = 'SGVsbG8sIFdvcmxkIQ=='
        decoded_bytes, length = decode(encoded_str.encode())
        decoded_str = decoded_bytes.decode('utf-8')
        self.assertEqual(decoded_str, 'Hello, World!')
        self.assertEqual(length, len(encoded_str))

    def test_encode_decode_roundtrip(self):
        text = 'Hello, World!'
        encoded_bytes, _ = encode(text.encode('utf-8'))
        decoded_bytes, _ = decode(encoded_bytes)
        decoded_str = decoded_bytes.decode('utf-8')
        self.assertEqual(decoded_str, text)

    def test_encode_invalid_input(self):
        with self.assertRaises(UnicodeEncodeError):
            encode('123')

    def test_decode_invalid_input(self):
        with self.assertRaises(binascii.Error):
            decode(b'abc')

if __name__ == '__main__':
    unittest.main()