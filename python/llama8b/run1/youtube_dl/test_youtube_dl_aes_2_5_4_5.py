import unittest
from youtube_dl.aes import *


class TestAES(unittest.TestCase):
    def test_xor(self):
        data1 = [1, 2, 3, 4]
        data2 = [5, 6, 7, 8]
        result = xor(data1, data2)
        self.assertEqual(result, [6, 8, 10, 12])

    def test_block_size_bytes(self):
        self.assertEqual(BLOCK_SIZE_BYTES, 16)

    def test_rcon(self):
        self.assertEqual(len(RCON), 11)

    def test_sbox(self):
        self.assertEqual(len(SBOX), 256)

    def test_sbox_inv(self):
        self.assertEqual(len(SBOX_INV), 256)

    def test_mix_column_matrix(self):
        self.assertEqual(len(MIX_COLUMN_MATRIX), 4)
        self.assertEqual(len(MIX_COLUMN_MATRIX[0]), 4)

    def test_mix_column_matrix_inv(self):
        self.assertEqual(len(MIX_COLUMN_MATRIX_INV), 4)
        self.assertEqual(len(MIX_COLUMN_MATRIX_INV[0]), 4)

    def test_rijnдаel_exp_table(self):
        self.assertEqual(len(RIJNDAEL_EXP_TABLE), 256)

    def test_rijnдаel_log_table(self):
        self.assertEqual(len(RIJNDAEL_LOG_TABLE), 256)

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_encrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        plaintext = [1, 2, 3, 4]
        result = aes_encrypt(key, plaintext)
        self.assertEqual(len(result), 16)

    def test_aes_decrypt_text(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_decrypt_text(key, ciphertext)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_aes_ctr_decrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_ctr_decrypt(key, ciphertext)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_aes_cbc_decrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_cbc_decrypt(key, ciphertext)
        self.assertEqual(result, [1, 2, 3, 4])

if __name__ == '__main__':
    unittest.main()