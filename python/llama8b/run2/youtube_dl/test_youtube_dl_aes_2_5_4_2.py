import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_sub_bytes_inv(self):
        data = [1, 2, 3, 4]
        result = sub_bytes_inv(data)
        self.assertEqual(result, [82, 9, 106, 213])

    def test_sub_bytes(self):
        data = [1, 2, 3, 4]
        result = [SBOX[x] for x in data]
        self.assertEqual(result, [99, 124, 119, 123])

    def test_mix_column_matrix(self):
        data = [(2, 3, 1, 1), (1, 2, 3, 1), (1, 1, 2, 3), (3, 1, 1, 2)]
        result = MIX_COLUMN_MATRIX
        self.assertEqual(result, data)

    def test_mix_column_matrix_inv(self):
        data = [(14, 11, 13, 9), (9, 14, 11, 13), (13, 9, 14, 11), (11, 13, 9, 14)]
        result = MIX_COLUMN_MATRIX_INV
        self.assertEqual(result, data)

if __name__ == '__main__':
    unittest.main()