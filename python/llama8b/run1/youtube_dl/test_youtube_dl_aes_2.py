import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAes(unittest.TestCase):
    def test_shift_rows_inv(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = shift_rows_inv(data)
        expected_result = [16, 7, 4, 1, 15, 12, 9, 6, 13, 10, 3, 0, 14, 11, 8, 5]
        self.assertEqual(result, expected_result)

    def test_shift_rows(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = shift_rows(data)
        expected_result = [2, 14, 7, 0, 9, 10, 13, 5, 3, 16, 8, 15, 1, 12, 11, 4]
        self.assertEqual(result, expected_result)

    def test_mix_column_matrix(self):
        data = [1, 2, 3, 4]
        result = mix_column_matrix(data)
        expected_result = [(2, 3, 1, 1), (1, 2, 3, 1), (1, 1, 2, 3), (3, 1, 1, 2)]
        self.assertEqual(result, expected_result)

    def test_mix_column_matrix_inv(self):
        data = [1, 2, 3, 4]
        result = mix_column_matrix_inv(data)
        expected_result = [(14, 11, 13, 9), (9, 14, 11, 13), (13, 9, 14, 11), (11, 13, 9, 14)]
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()