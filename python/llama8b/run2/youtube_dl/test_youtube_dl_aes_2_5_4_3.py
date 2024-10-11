import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_rotate(self):
        data = [1, 2, 3, 4]
        result = rotate(data)
        self.assertEqual(result, [2, 3, 4, 1])

    def test_block_size_bytes(self):
        self.assertEqual(BLOCK_SIZE_BYTES, 16)

    def test_rcon(self):
        self.assertEqual(RCON[0], 141)
        self.assertEqual(RCON[1], 1)
        self.assertEqual(RCON[2], 2)
        self.assertEqual(RCON[3], 4)

    def test_sbox(self):
        self.assertEqual(SBOX[0], 99)
        self.assertEqual(SBOX[1], 124)
        self.assertEqual(SBOX[2], 119)
        self.assertEqual(SBOX[3], 123)

    def test_sbox_inv(self):
        self.assertEqual(SBOX_INV[0], 82)
        self.assertEqual(SBOX_INV[1], 9)
        self.assertEqual(SBOX_INV[2], 106)
        self.assertEqual(SBOX_INV[3], 213)

    def test_mix_column_matrix(self):
        self.assertEqual(MIX_COLUMN_MATRIX[0][0], 2)
        self.assertEqual(MIX_COLUMN_MATRIX[0][1], 3)
        self.assertEqual(MIX_COLUMN_MATRIX[0][2], 1)
        self.assertEqual(MIX_COLUMN_MATRIX[0][3], 1)

    def test_mix_column_matrix_inv(self):
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][0], 14)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][1], 11)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][2], 13)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][3], 9)

    def test_rijnдаel_exp_table(self):
        self.assertEqual(RIJNDAEL_EXP_TABLE[0], 1)
        self.assertEqual(RIJNDAEL_EXP_TABLE[1], 3)
        self.assertEqual(RIJNDAEL_EXP_TABLE[2], 5)
        self.assertEqual(RIJNDAEL_EXP_TABLE[3], 15)

    def test_rijnдаel_log_table(self):
        self.assertEqual(RIJNDAEL_LOG_TABLE[0], 0)
        self.assertEqual(RIJNDAEL_LOG_TABLE[1], 0)
        self.assertEqual(RIJNDAEL_LOG_TABLE[2], 25)
        self.assertEqual(RIJNDAEL_LOG_TABLE[3], 1)

    def test_private_method(self):
        instance = AES()
        result = instance.__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        instance = AES()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_magic_method_init(self):
        instance = AES()
        self.assertEqual(instance.__init__(0), None)

    def test_magic_method_str(self):
        instance = AES()
        result = instance.__str__()
        self.assertEqual(result, "AES")

    def test_magic_method_repr(self):
        instance = AES()
        result = instance.__repr__()
        self.assertEqual(result, "AES()")

    def test_magic_method_eq(self):
        instance1 = AES()
        instance2 = AES()
        self.assertEqual(instance1.__eq__(instance2), True)

if __name__ == '__main__':
    unittest.main()