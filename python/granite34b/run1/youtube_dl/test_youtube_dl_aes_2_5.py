import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_key_expansion(self):
        key = [0] * BLOCK_SIZE_BYTES
        key_schedule = key_expansion(key)
        expected_key_schedule = [0] * 44
        self.assertEqual(key_schedule, expected_key_schedule)

    def test_aes_encrypt(self):
        plaintext = [0] * BLOCK_SIZE_BYTES
        key = [0] * BLOCK_SIZE_BYTES
        ciphertext = aes_encrypt(plaintext, key)
        expected_ciphertext = [0] * BLOCK_SIZE_BYTES
        self.assertEqual(ciphertext, expected_ciphertext)

    def test_aes_ctr_decrypt(self):
        ciphertext = [0] * BLOCK_SIZE_BYTES
        key = [0] * BLOCK_SIZE_BYTES
        counter = lambda: [0] * BLOCK_SIZE_BYTES
        decrypted_data = aes_ctr_decrypt(ciphertext, key, counter)
        expected_decrypted_data = [0] * BLOCK_SIZE_BYTES
        self.assertEqual(decrypted_data, expected_decrypted_data)

    def test_aes_cbc_decrypt(self):
        ciphertext = [0] * BLOCK_SIZE_BYTES
        key = [0] * BLOCK_SIZE_BYTES
        iv = [0] * BLOCK_SIZE_BYTES
        decrypted_data = aes_cbc_decrypt(ciphertext, key, iv)
        expected_decrypted_data = [0] * BLOCK_SIZE_BYTES
        self.assertEqual(decrypted_data, expected_decrypted_data)

    def test_aes_decrypt_text(self):
        data = 'test'
        password = 'password'
        key_size_bytes = 16
        decrypted_text = aes_decrypt_text(data, password, key_size_bytes)
        expected_decrypted_text = b'test'
        self.assertEqual(decrypted_text, expected_decrypted_text)

if __name__ == '__main__':
    unittest.main()