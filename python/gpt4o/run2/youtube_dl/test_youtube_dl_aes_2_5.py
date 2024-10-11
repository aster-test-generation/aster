import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_shift_rows(self):
        data = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        expected = [0, 5, 10, 15, 4, 9, 14, 3, 8, 13, 2, 7, 12, 1, 6, 11]
        result = shift_rows(data)
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