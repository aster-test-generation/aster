import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_shift_rows_inv(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = shift_rows_inv(data)
        self.assertEqual(result, [9, 2, 15, 10, 12, 5, 3, 7, 14, 1, 11, 8, 13, 6, 4, 16])

    def test_shift_rows(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = shift_rows(data)
        self.assertEqual(result, [2, 4, 8, 16, 7, 14, 5, 11, 12, 3, 6, 9, 15, 1, 10, 13])

    def test_mix_column_matrix(self):
        data = [1, 2, 3, 4]
        result = mix_column_matrix(data)
        self.assertEqual(result, [(2, 3, 1, 1), (1, 2, 3, 1), (1, 1, 2, 3), (3, 1, 1, 2)])

    def test_mix_column_matrix_inv(self):
        data = [1, 2, 3, 4]
        result = mix_column_matrix_inv(data)
        self.assertEqual(result, [(14, 11, 13, 9), (9, 14, 11, 13), (13, 9, 14, 11), (11, 13, 9, 14)])

    def test_aes_encrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = aes_encrypt(data)
        self.assertEqual(result, [9, 2, 15, 10, 12, 5, 3, 7, 14, 1, 11, 8, 13, 6, 4, 16])

    def test_key_expansion(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = key_expansion(data)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])

    def test_aes_decrypt_text(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = aes_decrypt_text(data)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])

    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = aes_ctr_decrypt(data)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])

if __name__ == '__main__':
    unittest.main()