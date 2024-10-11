import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_sub_bytes_inv(self):
        data = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        result = sub_bytes_inv(data)
        expected = [82, 9, 106, 213, 48, 54, 165, 56, 191, 64, 163, 158, 129, 243, 215, 251]
        self.assertEqual(result, expected)

    def test_aes_encrypt(self):
        key = b'1234567890123456'
        data = b'hello world 1234'
        result = aes_encrypt(data, key)
        self.assertIsInstance(result, bytes)

    def test_key_expansion(self):
        key = b'1234567890123456'
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_ctr_decrypt(self):
        key = b'1234567890123456'
        data = b'hello world 1234'
        encrypted_data = aes_encrypt(data, key)
        result = aes_ctr_decrypt(encrypted_data, key)
        self.assertEqual(result, data)

    def test_aes_cbc_decrypt(self):
        key = b'1234567890123456'
        data = b'hello world 1234'
        encrypted_data = aes_encrypt(data, key)
        result = aes_cbc_decrypt(encrypted_data, key)
        self.assertEqual(result, data)

    def test_aes_decrypt_text(self):
        key = b'1234567890123456'
        data = b'hello world 1234'
        encrypted_data = aes_encrypt(data, key)
        result = aes_decrypt_text(encrypted_data, key)
        self.assertEqual(result, data.decode('utf-8'))

if __name__ == '__main__':
    unittest.main()