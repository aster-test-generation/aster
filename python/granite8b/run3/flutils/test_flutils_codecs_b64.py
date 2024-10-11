import unittest
from flutils.codecs.b64 import encode, decode


class TestB64(unittest.TestCase):
    def test_encode(self):
        text = 'Hello, world!'
        encoded_bytes, length = encode(text.encode('utf-8'))
        encoded_str = encoded_bytes.decode('utf-8')
        self.assertEqual(encoded_str, 'SGVsbG8sIHdvcmxkIQ==')
        self.assertEqual(length, len(text))

    def test_decode(self):
        encoded_str = 'SGVsbG8sIHdvcmxkIQ=='
        decoded_bytes, length = decode(encoded_str.encode('utf-8'))
        decoded_str = decoded_bytes.decode('utf-8')
        self.assertEqual(decoded_str, 'Hello, world!')
        self.assertEqual(length, len(encoded_str))

    def test_encode_decode_roundtrip(self):
        text = 'Hello, world!'
        encoded_bytes, _ = encode(text.encode())
        decoded_bytes, _ = decode(encoded_bytes)
        decoded_str = decoded_bytes.decode('utf-8')
        self.assertEqual(decoded_str, text)

    def test_encode_errors(self):
        text = 'Hello, world!'
        with self.assertRaises(UnicodeEncodeError):
            encode(text, errors='ignore')

    def test_decode_errors(self):
        encoded_str = 'SGVsbG8sIHdvcmxkIQ=='
        with self.assertRaises(UnicodeDecodeError):
            decode(encoded_str, errors='replace')

if __name__ == '__main__':
    unittest.main()