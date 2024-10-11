import unittest
from youtube_dl.aes import *


class TestAes(unittest.TestCase):
    def test_aes_cbc_decrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        iv = [1, 2, 3, 4, 5, 6, 7, 8]
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        decrypted_data = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(decrypted_data, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 44)

    def test_aes_decrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        decrypted_data = aes_decrypt(data, key)
        self.assertEqual(decrypted_data, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_xor(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = xor(data, key)
        self.assertEqual(result, [0, 0, 0, 0, 0, 0, 0, 0])

if __name__ == '__main__':
    unittest.main()