import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestMixColumn(unittest.TestCase):
    def test_mix_column(self):
        data = [1, 2, 3, 4]
        matrix = ((1, 2, 3, 4), (5, 6, 7, 8), (9, 10, 11, 12), (13, 14, 15, 16))
        result = mix_column(data, matrix)
        self.assertEqual(result, [10, 22, 34, 46])

class TestKeyExpansion(unittest.TestCase):
    def test_key_expansion(self):
        key = [1, 2, 3, 4]
        result = key_expansion(key)
        self.assertEqual(result, [1, 2, 3, 4])

class TestAesCtrDecrypt(unittest.TestCase):
    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4]
        result = aes_ctr_decrypt(data, key)
        self.assertEqual(result, [1, 2, 3, 4])

class TestAesCbcDecrypt(unittest.TestCase):
    def test_aes_cbc_decrypt(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4]
        result = aes_cbc_decrypt(data, key)
        self.assertEqual(result, [1, 2, 3, 4])

class TestAesDecryptText(unittest.TestCase):
    def test_aes_decrypt_text(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4]
        result = aes_decrypt_text(data, key)
        self.assertEqual(result, [1, 2, 3, 4])

if __name__ == '__main__':
    unittest.main()