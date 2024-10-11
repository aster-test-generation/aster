import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_xor(self):
        data1 = [1, 2, 3]
        data2 = [4, 5, 6]
        result = xor(data1, data2)
        self.assertEqual(result, [5, 7, 9])

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

    def test_RIJNDAEL_EXP_TABLE(self):
        self.assertEqual(RIJNDAEL_EXP_TABLE[0], 1)
        self.assertEqual(RIJNDAEL_EXP_TABLE[1], 3)

    def test_RIJNDAEL_LOG_TABLE(self):
        self.assertEqual(RIJNDAEL_LOG_TABLE[0], 0)
        self.assertEqual(RIJNDAEL_LOG_TABLE[1], 0)

    def test_MIX_COLUMN_MATRIX(self):
        self.assertEqual(MIX_COLUMN_MATRIX[0][0], 2)
        self.assertEqual(MIX_COLUMN_MATRIX[1][1], 2)

    def test_MIX_COLUMN_MATRIX_INV(self):
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][0], 14)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[1][1], 14)

    def test_SBOX(self):
        self.assertEqual(SBOX[0], 99)
        self.assertEqual(SBOX[1], 124)

    def test_SBOX_INV(self):
        self.assertEqual(SBOX_INV[0], 82)
        self.assertEqual(SBOX_INV[1], 9)

if __name__ == '__main__':
    unittest.main()