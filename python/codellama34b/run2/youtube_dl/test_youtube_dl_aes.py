import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_inc(self):
        data = [1, 2, 3]
        result = inc(data)
        self.assertEqual(result, [1, 2, 4])

    def test_key_expansion(self):
        key = [1, 2, 3]
        result = key_expansion(key)
        self.assertEqual(result, [1, 2, 3])

    def test_aes_encrypt(self):
        key = [1, 2, 3]
        data = [1, 2, 3]
        result = aes_encrypt(key, data)
        self.assertEqual(result, [1, 2, 3])

    def test_aes_ctr_decrypt(self):
        key = [1, 2, 3]
        data = [1, 2, 3]
        result = aes_ctr_decrypt(key, data)
        self.assertEqual(result, [1, 2, 3])

    def test_aes_cbc_decrypt(self):
        key = [1, 2, 3]
        data = [1, 2, 3]
        result = aes_cbc_decrypt(key, data)
        self.assertEqual(result, [1, 2, 3])

    def test_aes_decrypt_text(self):
        key = [1, 2, 3]
        data = [1, 2, 3]
        result = aes_decrypt_text(key, data)
        self.assertEqual(result, [1, 2, 3])

if __name__ == '__main__':
    unittest.main()