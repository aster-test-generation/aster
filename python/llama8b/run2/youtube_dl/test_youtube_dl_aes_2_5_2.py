import unittest
from youtube_dl import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_decrypt(self):
        # Test with a valid input
        data = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f'
        expanded_key = b'\x11\x12\x13\x14\x15\x16\x17\x18\x19\x1a\x1b\x1c\x1d\x1e\x1f'
        result = aes_decrypt(data, expanded_key)
        self.assertEqual(result, b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00')

        # Test with an invalid input
        data = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f\x10'
        expanded_key = b'\x11\x12\x13\x14\x15\x16\x17\x18\x19\x1a\x1b\x1c\x1d\x1e\x1f'
        with self.assertRaises(IndexError):
            aes_decrypt(data, expanded_key)

        # Test with an empty input
        data = b''
        expanded_key = b'\x11\x12\x13\x14\x15\x16\x17\x18\x19\x1a\x1b\x1c\x1d\x1e\x1f'
        result = aes_decrypt(data, expanded_key)
        self.assertEqual(result, b'')

        # Test with an empty key
        data = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f'
        expanded_key = b''
        with self.assertRaises(IndexError):
            aes_decrypt(data, expanded_key)

if __name__ == '__main__':
    unittest.main()