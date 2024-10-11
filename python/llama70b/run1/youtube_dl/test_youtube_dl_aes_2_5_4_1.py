import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_sub_bytes(self):
        data = [0, 1, 2, 3]
        result = sub_bytes(data)
        self.assertEqual(result, [99, 124, 119, 123])

    def test_key_expansion(self):
        # implement test for key_expansion method
        pass

    def test_aes_encrypt(self):
        # implement test for aes_encrypt method
        pass

    def test_aes_ctr_decrypt(self):
        # implement test for aes_ctr_decrypt method
        pass

    def test_aes_cbc_decrypt(self):
        # implement test for aes_cbc_decrypt method
        pass

    def test_aes_decrypt_text(self):
        # implement test for aes_decrypt_text method
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