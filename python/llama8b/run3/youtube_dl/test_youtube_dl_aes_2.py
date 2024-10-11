import unittest
from youtube_dl.aes import *


class TestAES(unittest.TestCase):
    def test_shift_rows_inv(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = shift_rows_inv(data)
        self.assertEqual(result, [9, 2, 15, 10, 5, 12, 7, 14, 11, 16, 3, 8, 13, 6, 1, 4])

    def test_shift_rows(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = shift_rows(data)
        self.assertEqual(result, [2, 14, 10, 12, 6, 8, 3, 16, 13, 5, 9, 11, 15, 7, 1, 4])

    def test_mix_column_matrix(self):
        data = [1, 2, 3, 4]
        result = mix_column_matrix(data)
        self.assertEqual(result, [(2, 3, 1, 1), (1, 2, 3, 1), (1, 1, 2, 3), (3, 1, 1, 2)])

    def test_mix_column_matrix_inv(self):
        data = [1, 2, 3, 4]
        result = mix_column_matrix_inv(data)
        self.assertEqual(result, [(14, 11, 13, 9), (9, 14, 11, 13), (13, 9, 14, 11), (11, 13, 9, 14)])

    def test_rijnдаel_exp_table(self):
        data = [1, 2, 3, 4]
        result = rijndael_exp_table(data)
        self.assertEqual(result, [1, 3, 5, 15, 17, 51, 85, 255, ...])

    def test_rijnдаel_log_table(self):
        data = [1, 2, 3, 4]
        result = rijndael_log_table(data)
        self.assertEqual(result, [0, 0, 25, 1, 50, 2, 26, 198, ...])

    def test_aes_encrypt(self):
        data = [1, 2, 3, 4]
        result = aes_encrypt(data)
        self.assertEqual(result, [9, 2, 15, 10, ...])

    def test_aes_decrypt(self):
        data = [9, 2, 15, 10, ...]
        result = aes_decrypt(data)
        self.assertEqual(result, [1, 2, 3, 4, ...])

    def test_key_expansion(self):
        data = [1, 2, 3, 4]
        result = key_expansion(data)
        self.assertEqual(result, [1, 2, 3, 4, ...])

    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4]
        result = aes_ctr_decrypt(data)
        self.assertEqual(result, [1, 2, 3, 4, ...])

    def test_aes_cbc_decrypt(self):
        data = [1, 2, 3, 4]
        result = aes_cbc_decrypt(data)
        self.assertEqual(result, [1, 2, 3, 4, ...])

    def test_aes_decrypt_text(self):
        data = "Hello, World!"
        result = aes_decrypt_text(data)
        self.assertEqual(result, "Hello, World!")

if __name__ == '__main__':
    unittest.main()