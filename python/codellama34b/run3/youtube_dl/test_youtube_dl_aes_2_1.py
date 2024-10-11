import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAes(unittest.TestCase):
    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        counter = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        result = aes_ctr_decrypt(data, key, counter)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10])

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        result = key_expansion(key)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10])

    def test_aes_encrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        result = aes_encrypt(data, key)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10])

    def test_aes_decrypt_text(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        result = aes_decrypt_text(data, key)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10])

if __name__ == '__main__':
    unittest.main()