import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_xor(self):
        result = xor([1, 2, 3], [4, 5, 6])
        self.assertEqual(result, [5, 7, 3])

    def test_key_expansion(self):
        result = key_expansion([1, 2, 3, 4, 5, 6, 7, 8])
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_aes_encrypt(self):
        result = aes_encrypt([1, 2, 3, 4, 5, 6, 7, 8], [1, 2, 3, 4, 5, 6, 7, 8])
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_aes_ctr_decrypt(self):
        result = aes_ctr_decrypt([1, 2, 3, 4, 5, 6, 7, 8], [1, 2, 3, 4, 5, 6, 7, 8])
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_aes_cbc_decrypt(self):
        result = aes_cbc_decrypt([1, 2, 3, 4, 5, 6, 7, 8], [1, 2, 3, 4, 5, 6, 7, 8])
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_aes_decrypt_text(self):
        result = aes_decrypt_text([1, 2, 3, 4, 5, 6, 7, 8], [1, 2, 3, 4, 5, 6, 7, 8])
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

if __name__ == '__main__':
    unittest.main()