import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_key_expansion(self):
        data = b'1234567890abcdef'
        expanded_key = key_expansion(data)
        self.assertEqual(len(expanded_key), (len(data) // 4 + 7) * BLOCK_SIZE_BYTES)

    def test_key_schedule_core(self):
        temp = b'12345678'
        rcon_iteration = 1
        result = key_schedule_core(temp, rcon_iteration)
        self.assertEqual(result, b'\x01\x23\x45\x67\x89\xab\xcd\xef')

    def test_sub_bytes(self):
        temp = b'12345678'
        result = sub_bytes(temp)
        self.assertEqual(result, b'\x63\x7c\x77\x7b\xf2\xf0\xf1\xf8')

    def test_xor(self):
        a = b'12345678'
        b = b'87654321'
        result = xor(a, b)
        self.assertEqual(result, b'\x01\x02\x03\x04\x05\x06\x07\x08')

class TestRijndaelExpTable(unittest.TestCase):
    def test_rijndael_exp_table(self):
        self.assertEqual(RIJNDAEL_EXP_TABLE[0], 1)
        self.assertEqual(RIJNDAEL_EXP_TABLE[1], 3)
        self.assertEqual(RIJNDAEL_EXP_TABLE[2], 5)

class TestRijndaelLogTable(unittest.TestCase):
    def test_rijndael_log_table(self):
        self.assertEqual(RIJNDAEL_LOG_TABLE[0], 0)
        self.assertEqual(RIJNDAEL_LOG_TABLE[1], 0)
        self.assertEqual(RIJNDAEL_LOG_TABLE[2], 25)

class TestSBox(unittest.TestCase):
    def test_sbox(self):
        self.assertEqual(SBOX[0], 99)
        self.assertEqual(SBOX[1], 124)
        self.assertEqual(SBOX[2], 119)

class TestSBoxInv(unittest.TestCase):
    def test_sbox_inv(self):
        self.assertEqual(SBOX_INV[0], 82)
        self.assertEqual(SBOX_INV[1], 9)
        self.assertEqual(SBOX_INV[2], 106)

class TestMixColumnMatrix(unittest.TestCase):
    def test_mix_column_matrix(self):
        self.assertEqual(MIX_COLUMN_MATRIX[0][0], 2)
        self.assertEqual(MIX_COLUMN_MATRIX[0][1], 3)
        self.assertEqual(MIX_COLUMN_MATRIX[0][2], 1)
        self.assertEqual(MIX_COLUMN_MATRIX[0][3], 1)

class TestMixColumnMatrixInv(unittest.TestCase):
    def test_mix_column_matrix_inv(self):
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][0], 14)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][1], 11)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][2], 13)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][3], 9)

if __name__ == '__main__':
    unittest.main()