import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestMixColumns(unittest.TestCase):
    def test_mix_columns(self):
        data = [1, 2, 3, 4]
        result = mix_columns(data)
        self.assertEqual(result, [2, 3, 4, 5])

    def test_mix_columns_matrix(self):
        data = [1, 2, 3, 4]
        matrix = [2, 3, 1, 1]
        result = mix_columns(data, matrix)
        self.assertEqual(result, [2, 3, 4, 5])

class TestMixColumn(unittest.TestCase):
    def test_mix_column(self):
        column = [1, 2, 3, 4]
        result = mix_column(column)
        self.assertEqual(result, [2, 3, 4, 5])

    def test_mix_column_matrix(self):
        column = [1, 2, 3, 4]
        matrix = [2, 3, 1, 1]
        result = mix_column(column, matrix)
        self.assertEqual(result, [2, 3, 4, 5])

class TestKeyExpansion(unittest.TestCase):
    def test_key_expansion(self):
        key = [1, 2, 3, 4]
        result = key_expansion(key)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

class TestAesEncrypt(unittest.TestCase):
    def test_aes_encrypt(self):
        key = [1, 2, 3, 4]
        data = [1, 2, 3, 4]
        result = aes_encrypt(key, data)
        self.assertEqual(result, [1, 2, 3, 4])

class TestAesCtrDecrypt(unittest.TestCase):
    def test_aes_ctr_decrypt(self):
        key = [1, 2, 3, 4]
        data = [1, 2, 3, 4]
        result = aes_ctr_decrypt(key, data)
        self.assertEqual(result, [1, 2, 3, 4])

class TestAesCbcDecrypt(unittest.TestCase):
    def test_aes_cbc_decrypt(self):
        key = [1, 2, 3, 4]
        data = [1, 2, 3, 4]
        result = aes_cbc_decrypt(key, data)
        self.assertEqual(result, [1, 2, 3, 4])

class TestAesDecryptText(unittest.TestCase):
    def test_aes_decrypt_text(self):
        key = [1, 2, 3, 4]
        data = [1, 2, 3, 4]
        result = aes_decrypt_text(key, data)
        self.assertEqual(result, [1, 2, 3, 4])

if __name__ == '__main__':
    unittest.main()