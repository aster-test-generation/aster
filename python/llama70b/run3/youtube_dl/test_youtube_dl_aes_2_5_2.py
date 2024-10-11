import unittest
from youtube_dl.utils import aes 


class TestAesDecrypt(unittest.TestCase):
    def test_aes_decrypt(self):
        data = b'\x00' * BLOCK_SIZE_BYTES
        expanded_key = b'\x01' * (BLOCK_SIZE_BYTES * 11)
        result = aes_decrypt(data, expanded_key)
        self.assertEqual(len(result), BLOCK_SIZE_BYTES)

    def test_key_expansion(self):
        key = b'\x00' * 16
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), BLOCK_SIZE_BYTES * 11)

    def test_aes_ctr_decrypt(self):
        data = b'\x00' * BLOCK_SIZE_BYTES
        key = b'\x01' * 16
        nonce = b'\x02' * 16
        result = aes_ctr_decrypt(data, key, nonce)
        self.assertEqual(len(result), BLOCK_SIZE_BYTES)

    def test_aes_cbc_decrypt(self):
        data = b'\x00' * BLOCK_SIZE_BYTES
        key = b'\x01' * 16
        iv = b'\x02' * 16
        result = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(len(result), BLOCK_SIZE_BYTES)

    def test_aes_decrypt_text(self):
        data = b'\x00' * BLOCK_SIZE_BYTES
        key = b'\x01' * 16
        result = aes_decrypt_text(data, key)
        self.assertEqual(len(result), BLOCK_SIZE_BYTES)

    def test_private_methods(self):
        self.assertRaises(NotImplementedError, aes_decrypt, b'', b'', _private_method=True)

    def test_protected_methods(self):
        self.assertRaises(NotImplementedError, aes_decrypt, b'', b'', _protected_method=True)

    def test_magic_methods(self):
        self.assertEqual(str(aes_decrypt), '<function aes_decrypt at 0x...>')
        self.assertEqual(repr(aes_decrypt), '<function aes_decrypt at 0x...>')

class TestConstants(unittest.TestCase):
    def test_BLOCK_SIZE_BYTES(self):
        self.assertEqual(BLOCK_SIZE_BYTES, 16)

    def test_RCON(self):
        self.assertEqual(len(RCON), 11)

    def test_SBOX(self):
        self.assertEqual(len(SBOX), 256)

    def test_SBOX_INV(self):
        self.assertEqual(len(SBOX_INV), 256)

    def test_MIX_COLUMN_MATRIX(self):
        self.assertEqual(len(MIX_COLUMN_MATRIX), 4)

    def test_MIX_COLUMN_MATRIX_INV(self):
        self.assertEqual(len(MIX_COLUMN_MATRIX_INV), 4)

    def test_RIJNDAEL_EXP_TABLE(self):
        self.assertEqual(len(RIJNDAEL_EXP_TABLE), 256)

    def test_RIJNDAEL_LOG_TABLE(self):
        self.assertEqual(len(RIJNDAEL_LOG_TABLE), 256)

if __name__ == '__main__':
    unittest.main()