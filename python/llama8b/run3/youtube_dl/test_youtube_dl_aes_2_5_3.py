import unittest
from youtube_dl import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_decrypt_text(self):
        # Test with valid input
        data = "some_data"
        password = "some_password"
        key_size_bytes = 16
        result = aes_decrypt_text(data, password, key_size_bytes)
        self.assertIsInstance(result, bytes)

        # Test with invalid input
        with self.assertRaises(ValueError):
            aes_decrypt_text("", password, key_size_bytes)
        with self.assertRaises(ValueError):
            aes_decrypt_text(data, "", key_size_bytes)
        with self.assertRaises(ValueError):
            aes_decrypt_text(data, password, 0)

    def test_key_expansion(self):
        # Test with valid input
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = key_expansion(key)
        self.assertIsInstance(result, list)

        # Test with invalid input
        with self.assertRaises(ValueError):
            key_expansion([])

    def test_aes_encrypt(self):
        # Test with valid input
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        plaintext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_encrypt(plaintext, key)
        self.assertIsInstance(result, list)

        # Test with invalid input
        with self.assertRaises(ValueError):
            aes_encrypt([], key)
        with self.assertRaises(ValueError):
            aes_encrypt(plaintext, [])

    def test_aes_ctr_decrypt(self):
        # Test with valid input
        cipher = [1, 2, 3, 4, 5, 6, 7, 8]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_ctr_decrypt(cipher, key)
        self.assertIsInstance(result, list)

        # Test with invalid input
        with self.assertRaises(ValueError):
            aes_ctr_decrypt([], key)
        with self.assertRaises(ValueError):
            aes_ctr_decrypt(cipher, [])

    def test_aes_cbc_decrypt(self):
        # Test with valid input
        cipher = [1, 2, 3, 4, 5, 6, 7, 8]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_cbc_decrypt(cipher, key)
        self.assertIsInstance(result, list)

        # Test with invalid input
        with self.assertRaises(ValueError):
            aes_cbc_decrypt([], key)
        with self.assertRaises(ValueError):
            aes_cbc_decrypt(cipher, [])

if __name__ == '__main__':
    unittest.main()