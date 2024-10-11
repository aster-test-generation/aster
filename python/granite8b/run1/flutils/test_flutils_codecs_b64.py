import unittest
from flutils.codecs.b64 import encode, decode


class TestB64(unittest.TestCase):
    def test_encode(self):
        text = 'Hello, World!'
        encoded_bytes, length = encode(text.encode('utf-8'))
        encoded_str = encoded_bytes.decode('utf-8')
        self.assertEqual(encoded_str, 'SGVsbG8sIFdvcmxkIQ==\n')
        self.assertEqual(length, len(text))

    def test_decode(self):
        encoded_str = 'SGVsbG8sIFdvcmxkIQ==\n'
        encoded_bytes = encoded_str.encode('utf-8')
        decoded_str, length = decode(encoded_bytes)
        self.assertEqual(decoded_str, 'U0dWc2JHOHNJRmR2Y214a0lRPT0K')
        self.assertEqual(length, len(encoded_bytes))

    def test_encode_decode_roundtrip(self):
        text = 'Hello, World!'
        encoded_bytes, _ = encode(text.encode('utf-8'))
        decoded_str, _ = decode(encoded_bytes)
        self.assertEqual(decoded_str, text)

    def test_encode_errors(self):
        text = 'Hello, World!'
        with self.assertRaises(UnicodeEncodeError):
            encode(text, errors='ignore')

    def test_decode_errors(self):
        encoded_str = 'SGVsbG8sIFdvcmxkIQ==\n'
        with self.assertRaises(UnicodeDecodeError):
            decode(encoded_str, errors='ignore').decode('utf-8')

if __name__ == '__main__':
    unittest.main()