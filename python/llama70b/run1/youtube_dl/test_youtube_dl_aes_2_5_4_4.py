import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_key_schedule_core(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 1
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [141, 2, 3, 4])  # expected result

    def test_rotate(self):
        data = [1, 2, 3, 4]
        result = rotate(data)
        self.assertEqual(result, [2, 3, 4, 1])

    def test_sub_bytes(self):
        data = [1, 2, 3, 4]
        result = sub_bytes(data)
        self.assertEqual(result, [SBOX[1], SBOX[2], SBOX[3], SBOX[4]])

    def test_RIJNDAEL_EXP_TABLE(self):
        self.assertEqual(RIJNDAEL_EXP_TABLE[0], 1)
        self.assertEqual(RIJNDAEL_EXP_TABLE[1], 3)
        self.assertEqual(RIJNDAEL_EXP_TABLE[2], 5)

    def test_RIJNDAEL_LOG_TABLE(self):
        self.assertEqual(RIJNDAEL_LOG_TABLE[0], 0)
        self.assertEqual(RIJNDAEL_LOG_TABLE[1], 0)
        self.assertEqual(RIJNDAEL_LOG_TABLE[2], 25)

    def test_MIX_COLUMN_MATRIX(self):
        self.assertEqual(MIX_COLUMN_MATRIX[0][0], 2)
        self.assertEqual(MIX_COLUMN_MATRIX[1][1], 2)
        self.assertEqual(MIX_COLUMN_MATRIX[2][2], 2)

    def test_MIX_COLUMN_MATRIX_INV(self):
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][0], 14)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[1][1], 9)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[2][2], 13)

    def test_SBOX_INV(self):
        self.assertEqual(SBOX_INV[0], 82)
        self.assertEqual(SBOX_INV[1], 9)
        self.assertEqual(SBOX_INV[2], 106)

    def test_SBOX(self):
        self.assertEqual(SBOX[0], 99)
        self.assertEqual(SBOX[1], 124)
        self.assertEqual(SBOX[2], 119)

    def test_BLOCK_SIZE_BYTES(self):
        self.assertEqual(BLOCK_SIZE_BYTES, 16)

    def test_RCON(self):
        self.assertEqual(RCON[0], 141)
        self.assertEqual(RCON[1], 1)
        self.assertEqual(RCON[2], 2)

if __name__ == '__main__':
    unittest.main()