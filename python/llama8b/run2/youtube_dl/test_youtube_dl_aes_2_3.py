import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_cbc_encrypt(self):
        key = b'key123'
        iv = b'iv123'
        data = b'hello world'
        result = aes_cbc_encrypt(data, key, iv)
        self.assertEqual(len(result), len(data) + BLOCK_SIZE_BYTES)

    def test_key_expansion(self):
        key = b'key123'
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_encrypt(self):
        key = b'key123'
        data = b'hello world'
        result = aes_encrypt(data, key)
        self.assertEqual(len(result), len(data))

    def test_xor(self):
        a = b'hello'
        b = b'world'
        result = xor(a, b)
        self.assertEqual(len(result), len(a) + len(b))

    def test_aes_cbc_decrypt(self):
        key = b'key123'
        iv = b'iv123'
        data = aes_cbc_encrypt(b'hello world', key, iv)
        result = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(result, b'hello world')

    def test_aes_decrypt_text(self):
        key = b'key123'
        data = aes_cbc_encrypt(b'hello world', key, b'iv123')
        result = aes_decrypt_text(data, key)
        self.assertEqual(result, b'hello world')

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

    def test_rijndael_exp_table(self):
        self.assertEqual(len(RIJNDAEL_EXP_TABLE), 256)

    def test_rijndael_log_table(self):
        self.assertEqual(len(RIJNDAEL_LOG_TABLE), 256)

if __name__ == '__main__':
    unittest.main()