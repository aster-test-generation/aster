import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_mix_column(self):
        data = [1, 2, 3, 4]
        matrix = ((2, 3, 1, 1), (1, 2, 3, 1), (1, 1, 2, 3), (3, 1, 1, 2))
        result = mix_column(data, matrix)
        self.assertEqual(result, [10, 7, 5, 15])

    def test_rijndael_mul(self):
        a = 2
        b = 3
        result = rijndael_mul(a, b)
        self.assertEqual(result, 6)

    def test_rijndael_exp_table(self):
        self.assertEqual(RIJNDAEL_EXP_TABLE[0], 1)
        self.assertEqual(RIJNDAEL_EXP_TABLE[1], 3)
        self.assertEqual(RIJNDAEL_EXP_TABLE[2], 5)

    def test_rijndael_log_table(self):
        self.assertEqual(RIJNDAEL_LOG_TABLE[0], 0)
        self.assertEqual(RIJNDAEL_LOG_TABLE[1], 0)
        self.assertEqual(RIJNDAEL_LOG_TABLE[2], 25)

    def test_SBOX(self):
        self.assertEqual(SBOX[0], 99)
        self.assertEqual(SBOX[1], 124)
        self.assertEqual(SBOX[2], 119)

    def test_SBOX_INV(self):
        self.assertEqual(SBOX_INV[0], 82)
        self.assertEqual(SBOX_INV[1], 9)
        self.assertEqual(SBOX_INV[2], 106)

    def test_MIX_COLUMN_MATRIX(self):
        self.assertEqual(MIX_COLUMN_MATRIX[0][0], 2)
        self.assertEqual(MIX_COLUMN_MATRIX[1][1], 2)
        self.assertEqual(MIX_COLUMN_MATRIX[2][2], 2)

    def test_MIX_COLUMN_MATRIX_INV(self):
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][0], 14)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[1][1], 14)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[2][2], 14)

if __name__ == '__main__':
    unittest.main()