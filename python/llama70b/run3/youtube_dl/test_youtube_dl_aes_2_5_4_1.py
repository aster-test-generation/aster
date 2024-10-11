import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_sub_bytes(self):
        data = [0, 1, 2, 3]
        result = sub_bytes(data)
        self.assertEqual(result, [99, 124, 119, 123])

    def test_key_expansion(self):
        # implement test for key_expansion function
        pass

    def test_aes_encrypt(self):
        # implement test for aes_encrypt function
        pass

    def test_aes_ctr_decrypt(self):
        # implement test for aes_ctr_decrypt function
        pass

    def test_aes_cbc_decrypt(self):
        # implement test for aes_cbc_decrypt function
        pass

    def test_aes_decrypt_text(self):
        # implement test for aes_decrypt_text function
        pass

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

class TestMixColumnMatrix(unittest.TestCase):
    def test_mix_column_matrix(self):
        self.assertEqual(MIX_COLUMN_MATRIX[0][0], 2)
        self.assertEqual(MIX_COLUMN_MATRIX[1][1], 2)
        self.assertEqual(MIX_COLUMN_MATRIX[2][2], 2)

class TestMixColumnMatrixInv(unittest.TestCase):
    def test_mix_column_matrix_inv(self):
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][0], 14)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[1][1], 14)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[2][2], 14)

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

if __name__ == '__main__':
    unittest.main()