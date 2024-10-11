import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_mix_columns(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8]
        result = mix_columns(data)
        self.assertEqual(result, [14, 11, 13, 9, 15, 17, 51, 85, 255])

    def test_mix_column(self):
        column = [1, 2, 3, 4]
        result = mix_column(column, MIX_COLUMN_MATRIX)
        self.assertEqual(result, [14, 11, 13, 9])

    def test_mix_column_matrix(self):
        matrix = MIX_COLUMN_MATRIX
        result = mix_column_matrix(matrix)
        self.assertEqual(result, [(2, 3, 1, 1), (1, 2, 3, 1), (1, 1, 2, 3), (3, 1, 1, 2)])

    def test_mix_column_matrix_inv(self):
        matrix = MIX_COLUMN_MATRIX_INV
        result = mix_column_matrix_inv(matrix)
        self.assertEqual(result, [(14, 11, 13, 9), (9, 14, 11, 13), (13, 9, 14, 11), (11, 13, 9, 14)])

    def test_aes_encrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_encrypt(data)
        self.assertEqual(result, [14, 11, 13, 9, 15, 17, 51, 85, 255])

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = key_expansion(key)
        self.assertEqual(result, [14, 11, 13, 9, 15, 17, 51, 85, 255])

    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_ctr_decrypt(data)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_aes_cbc_decrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_cbc_decrypt(data)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_aes_decrypt_text(self):
        text = "Hello, World!"
        result = aes_decrypt_text(text)
        self.assertEqual(result, "Hello, World!")

if __name__ == '__main__':
    unittest.main()