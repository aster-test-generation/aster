import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_mix_column(self):
        data = [1, 2, 3, 4]
        matrix = MIX_COLUMN_MATRIX
        result = mix_column(data, matrix)
        self.assertEqual(result, [14, 11, 13, 9])

    def test_mix_column_inv(self):
        data = [1, 2, 3, 4]
        matrix = MIX_COLUMN_MATRIX_INV
        result = mix_column(data, matrix)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_rijndael_mul(self):
        a = 1
        b = 2
        result = rijndael_mul(a, b)
        self.assertEqual(result, 3)

    def test_rijndael_exp_table(self):
        a = 1
        result = RIJNDAEL_EXP_TABLE[a]
        self.assertEqual(result, 1)

    def test_rijndael_log_table(self):
        a = 1
        result = RIJNDAEL_LOG_TABLE[a]
        self.assertEqual(result, 0)

    def test_aes_encrypt(self):
        # TO DO: implement test for aes_encrypt function
        pass

    def test_key_expansion(self):
        # TO DO: implement test for key_expansion function
        pass

    def test_aes_ctr_decrypt(self):
        # TO DO: implement test for aes_ctr_decrypt function
        pass

    def test_aes_cbc_decrypt(self):
        # TO DO: implement test for aes_cbc_decrypt function
        pass

    def test_aes_decrypt_text(self):
        # TO DO: implement test for aes_decrypt_text function
        pass

if __name__ == '__main__':
    unittest.main()