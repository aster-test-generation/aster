import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4, 5]
        key = [1, 2, 3, 4, 5]
        counter = 1
        result = aes_ctr_decrypt(data, key, counter)
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5]
        result = key_expansion(key)
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_aes_encrypt(self):
        data = [1, 2, 3, 4, 5]
        key = [1, 2, 3, 4, 5]
        result = aes_encrypt(data, key)
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_aes_decrypt_text(self):
        data = [1, 2, 3, 4, 5]
        key = [1, 2, 3, 4, 5]
        result = aes_decrypt_text(data, key)
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_aes_cbc_decrypt(self):
        data = [1, 2, 3, 4, 5]
        key = [1, 2, 3, 4, 5]
        result = aes_cbc_decrypt(data, key)
        self.assertEqual(result, [1, 2, 3, 4, 5])

if __name__ == '__main__':
    unittest.main()