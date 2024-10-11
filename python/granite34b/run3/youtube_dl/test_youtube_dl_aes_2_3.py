import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_aes_cbc_encrypt(self):
        data = b'This is a test'
        key = b'This is a key'
        iv = b'This is an IV'
        encrypted_data = aes_cbc_encrypt(data, key, iv)
        self.assertEqual(len(encrypted_data), BLOCK_SIZE_BYTES)

    def test_key_expansion(self):
        key = b'This is a key'
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 44)

    def test_aes_ctr_decrypt(self):
        data = b'This is a test'
        key = b'This is a key'
        iv = b'This is an IV'
        decrypted_data = aes_ctr_decrypt(data, key, iv)
        self.assertEqual(decrypted_data, b'This is a test')

    def test_aes_cbc_decrypt(self):
        data = b'This is a test'
        key = b'This is a key'
        iv = b'This is an IV'
        decrypted_data = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(decrypted_data, b'This is a test')

    def test_aes_decrypt_text(self):
        data = b'This is a test'
        key = b'This is a key'
        decrypted_data = aes_decrypt_text(data, key)
        self.assertEqual(decrypted_data, b'This is a test')

if __name__ == '__main__':
    unittest.main()