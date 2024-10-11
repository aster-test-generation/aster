import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_aes_decrypt(self):
        data = b'\x00' * 16
        expanded_key = b'\x01' * 176
        result = aes_decrypt(data, expanded_key)
        self.assertEqual(result, b'\x00' * 16)

    def test_key_expansion(self):
        key = b'\x00' * 16
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_ctr_decrypt(self):
        data = b'\x00' * 16
        key = b'\x00' * 16
        nonce = b'\x00' * 16
        result = aes_ctr_decrypt(data, key, nonce)
        self.assertEqual(result, b'\x00' * 16)

    def test_aes_cbc_decrypt(self):
        data = b'\x00' * 16
        key = b'\x00' * 16
        iv = b'\x00' * 16
        result = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(result, b'\x00' * 16)

    def test_aes_decrypt_text(self):
        data = b'\x00' * 16
        key = b'\x00' * 16
        result = aes_decrypt_text(data, key)
        self.assertEqual(result, b'\x00' * 16)

    def test_xor(self):
        a = b'\x01' * 16
        b = b'\x02' * 16
        result = xor(a, b)
        self.assertEqual(result, b'\x03' * 16)

    def test_mix_columns_inv(self):
        data = b'\x01' * 16
        result = mix_columns_inv(data)
        self.assertEqual(result, b'\x14' * 16)

    def test_shift_rows_inv(self):
        data = b'\x01' * 16
        result = shift_rows_inv(data)
        self.assertEqual(result, b'\x01' * 16)

    def test_sub_bytes_inv(self):
        data = b'\x01' * 16
        result = sub_bytes_inv(data)
        self.assertEqual(result, b'\x63' * 16)

    def test_RIJNDAEL_EXP_TABLE(self):
        self.assertEqual(RIJNDAEL_EXP_TABLE[0], 1)
        self.assertEqual(RIJNDAEL_EXP_TABLE[1], 3)

    def test_RIJNDAEL_LOG_TABLE(self):
        self.assertEqual(RIJNDAEL_LOG_TABLE[0], 0)
        self.assertEqual(RIJNDAEL_LOG_TABLE[1], 0)

    def test_SBOX_INV(self):
        self.assertEqual(SBOX_INV[0], 82)
        self.assertEqual(SBOX_INV[1], 9)

    def test_MIX_COLUMN_MATRIX_INV(self):
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][0], 14)
        self.assertEqual(MIX_COLUMN_MATRIX_INV[1][1], 14)

if __name__ == '__main__':
    unittest.main()