import unittest
from youtube_dl.aes import *


class TestAES(unittest.TestCase):
    def test_mix_columns(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = mix_columns(data)
        self.assertEqual(len(result), 16)
        for i in range(4):
            column = result[i * 4:(i + 1) * 4]
            self.assertEqual(len(column), 4)

    def test_mix_column(self):
        column = [1, 2, 3, 4]
        result = mix_column(column, MIX_COLUMN_MATRIX)
        self.assertEqual(len(result), 4)
        for i in range(4):
            self.assertEqual(result[i], (column[i] * 2 + column[(i + 1) % 4] * 3 + column[(i + 2) % 4] + column[(i + 3) % 4]) % 256)

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = key_expansion(key)
        self.assertEqual(len(result), 44)
        for i in range(44):
            self.assertEqual(len(result[i]), 4)

    def test_aes_encrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = aes_encrypt(data, key)
        self.assertEqual(len(result), 16)
        for i in range(16):
            self.assertEqual(result[i], (data[i] + key[i]) % 256)

    def test_aes_decrypt_text(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = aes_decrypt_text(data, key)
        self.assertEqual(len(result), 16)
        for i in range(16):
            self.assertEqual(result[i], (data[i] - key[i]) % 256)

if __name__ == '__main__':
    unittest.main()