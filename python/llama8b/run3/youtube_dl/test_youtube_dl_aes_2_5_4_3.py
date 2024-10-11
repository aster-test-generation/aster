import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_rotate(self):
        data = [1, 2, 3, 4]
        result = rotate(data)
        self.assertEqual(result, [2, 3, 4, 1])

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_encrypt(self):
        plaintext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_encrypt(plaintext, key)
        self.assertEqual(len(result), 16)

    def test_aes_decrypt(self):
        ciphertext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_decrypt(ciphertext, key)
        self.assertEqual(len(result), 4)

    def test_aes_ctr_decrypt(self):
        ciphertext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_ctr_decrypt(ciphertext, key)
        self.assertEqual(len(result), 4)

    def test_aes_cbc_decrypt(self):
        ciphertext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_cbc_decrypt(ciphertext, key)
        self.assertEqual(len(result), 4)

    def test_aes_decrypt_text(self):
        ciphertext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_decrypt_text(ciphertext, key)
        self.assertEqual(len(result), 4)

if __name__ == '__main__':
    unittest.main()