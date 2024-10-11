import unittest
from youtube_dl.aes import *


class TestAES(unittest.TestCase):
    def test_aes_cbc_decrypt(self):
        key = bytes_to_intlist(b'00000000000000000000000000000000')
        iv = bytes_to_intlist(b'00000000000000000000000000000000')
        data = bytes_to_intlist(b'00000000000000000000000000000000')
        result = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(result, data)

    def test_key_expansion(self):
        key = bytes_to_intlist(b'00000000000000000000000000000000')
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_decrypt(self):
        key = bytes_to_intlist(b'00000000000000000000000000000000')
        data = bytes_to_intlist(b'00000000000000000000000000000000')
        result = aes_decrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_xor(self):
        a = bytes_to_intlist(b'00000000000000000000000000000000')
        b = bytes_to_intlist(b'00000000000000000000000000000000')
        result = xor(a, b)
        self.assertEqual(len(result), 16)

    def test_bytes_to_intlist(self):
        data = b'00000000000000000000000000000000'
        result = bytes_to_intlist(data)
        self.assertEqual(len(result), 16)

    def test_intlist_to_bytes(self):
        data = [0] * 16
        result = intlist_to_bytes(data)
        self.assertEqual(result, b'\x00' * 16)

    def test_block_size_bytes(self):
        self.assertEqual(BLOCK_SIZE_BYTES, 16)

    def test_rcon(self):
        self.assertEqual(len(RCON), 10)

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

if __name__ == '__main__':
    unittest.main()