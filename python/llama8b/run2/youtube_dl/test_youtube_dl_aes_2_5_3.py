import unittest
from youtube_dl import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_decrypt_text(self):
        # Test with valid data
        data = "iVBORw0KGg..."
        password = "password"
        key_size_bytes = 16
        result = aes_decrypt_text(data, password, key_size_bytes)
        self.assertIsInstance(result, bytes)

        # Test with invalid data
        data = "invalid_data"
        password = "password"
        key_size_bytes = 16
        with self.assertRaises(ValueError):
            aes_decrypt_text(data, password, key_size_bytes)

        # Test with invalid password
        data = "iVBORw0KGg..."
        password = "invalid_password"
        key_size_bytes = 16
        with self.assertRaises(ValueError):
            aes_decrypt_text(data, password, key_size_bytes)

        # Test with invalid key size
        data = "iVBORw0KGg..."
        password = "password"
        key_size_bytes = 32
        with self.assertRaises(ValueError):
            aes_decrypt_text(data, password, key_size_bytes)

if __name__ == '__main__':
    unittest.main()