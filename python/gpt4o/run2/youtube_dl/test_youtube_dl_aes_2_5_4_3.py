import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_rotate(self):
        data = [1, 2, 3, 4]
        result = rotate(data)
        self.assertEqual(result, [2, 3, 4, 1])

    def test_aes_encrypt(self):
        # Assuming aes_encrypt is a function in the module
        key = b'1234567890123456'
        data = b'example data 1234'
        result = aes_encrypt(data, key)
        self.assertIsInstance(result, bytes)

    def test_key_expansion(self):
        # Assuming key_expansion is a function in the module
        key = b'1234567890123456'
        result = key_expansion(key)
        self.assertIsInstance(result, list)

    def test_aes_ctr_decrypt(self):
        # Assuming aes_ctr_decrypt is a function in the module
        key = b'1234567890123456'
        data = b'example data 1234'
        result = aes_ctr_decrypt(data, key)
        self.assertIsInstance(result, bytes)

    def test_aes_cbc_decrypt(self):
        # Assuming aes_cbc_decrypt is a function in the module
        key = b'1234567890123456'
        data = b'example data 1234'
        result = aes_cbc_decrypt(data, key)
        self.assertIsInstance(result, bytes)

    def test_aes_decrypt_text(self):
        # Assuming aes_decrypt_text is a function in the module
        key = b'1234567890123456'
        data = b'example data 1234'
        result = aes_decrypt_text(data, key)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()