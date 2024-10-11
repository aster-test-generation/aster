import unittest
from youtube_dl.aes import aes_encrypt, key_expansion, aes_ctr_decrypt, aes_cbc_decrypt, aes_decrypt_text


class TestAES(unittest.TestCase):
    def test_aes_encrypt(self):
        key = b'0123456789abcdef'
        data = b'0123456789abcdef'
        encrypted_data = aes_encrypt(data, key)
        self.assertEqual(len(encrypted_data), len(data))

    def test_key_expansion(self):
        key = b'0123456789abcdef'
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 176)

    def test_aes_ctr_decrypt(self):
        key = b'0123456789abcdef'
        counter = b'0123456789abcdef'
        data = b'0123456789abcdef'
        decrypted_data = aes_ctr_decrypt(data, key, counter)
        self.assertEqual(decrypted_data, data)

    def test_aes_cbc_decrypt(self):
        key = b'0123456789abcdef'
        iv = b'0123456789abcdef'
        data = b'0123456789abcdef'
        decrypted_data = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(decrypted_data, data)

    def test_aes_decrypt_text(self):
        key = b'0123456789abcdef'
        data = b'0123456789abcdef'
        decrypted_data = aes_decrypt_text(data, key)
        self.assertEqual(decrypted_data, data)

if __name__ == '__main__':
    unittest.main()