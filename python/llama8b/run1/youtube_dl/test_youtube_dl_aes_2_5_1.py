import unittest
from youtube_dl import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_encrypt(self):
        data = b'Hello, World!'
        expanded_key = key_expansion(b'1234567890abcdef')
        result = aes_encrypt(data, expanded_key)
        self.assertEqual(len(result), len(data))

    def test_key_expansion(self):
        key = b'1234567890abcdef'
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_decrypt_text(self):
        data = b'Hello, World!'
        expanded_key = key_expansion(b'1234567890abcdef')
        encrypted_data = aes_encrypt(data, expanded_key)
        decrypted_data = aes_decrypt_text(encrypted_data, expanded_key)
        self.assertEqual(decrypted_data, data)

    def test_sub_bytes(self):
        data = bytes([0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f])
        result = sub_bytes(data)
        self.assertEqual(len(result), len(data))

    def test_shift_rows(self):
        data = bytes([0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f])
        result = shift_rows(data)
        self.assertEqual(len(result), len(data))

    def test_mix_columns(self):
        data = bytes([0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f])
        result = mix_columns(data)
        self.assertEqual(len(result), len(data))

    def test_xor(self):
        data = bytes([0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f])
        key = bytes([0x10, 0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18, 0x19, 0x1a, 0x1b, 0x1c, 0x1d, 0x1e, 0x1f])
        result = xor(data, key)
        self.assertEqual(len(result), len(data))

if __name__ == '__main__':
    unittest.main()