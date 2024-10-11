import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_rijndael_mul(self):
        result = rijndael_mul(1, 2)
        self.assertEqual(result, 51)

    def test_rijndael_mul_zero(self):
        result = rijndael_mul(0, 2)
        self.assertEqual(result, 0)

    def test_rijndael_mul_zero_b(self):
        result = rijndael_mul(1, 0)
        self.assertEqual(result, 0)

    def test_rijndael_mul_zero_a_b(self):
        result = rijndael_mul(0, 0)
        self.assertEqual(result, 0)

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_encrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        plaintext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_encrypt(key, plaintext)
        self.assertEqual(len(result), 16)

    def test_aes_decrypt_text(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_decrypt_text(key, ciphertext)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_aes_ctr_decrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_ctr_decrypt(key, ciphertext)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_aes_cbc_decrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_cbc_decrypt(key, ciphertext)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

if __name__ == '__main__':
    unittest.main()