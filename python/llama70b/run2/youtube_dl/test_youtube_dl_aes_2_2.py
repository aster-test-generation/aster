import unittest
from youtube_dl.utils import aes_cbc_decrypt, key_expansion, BLOCK_SIZE_BYTES, RCON, SBOX, SBOX_INV, MIX_COLUMN_MATRIX, MIX_COLUMN_MATRIX_INV, RIJNDAEL_EXP_TABLE, RIJNDAEL_LOG_TABL


class TestAesCbcDecrypt(unittest.TestCase):
    def test_aes_cbc_decrypt(self):
        data = b'Hello, World!'
        key = b'secretkey123'
        iv = b'initializationvector'
        decrypted_data = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(decrypted_data, [72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33])

    def test_key_expansion(self):
        key = b'secretkey123'
        expanded_key = key_expansion(key)
        self.assertIsInstance(expanded_key, list)

class TestConstants(unittest.TestCase):
    def test_block_size_bytes(self):
        self.assertEqual(BLOCK_SIZE_BYTES, 16)

    def test_rcon(self):
        self.assertEqual(RCON, (141, 1, 2, 4, 8, 16, 32, 64, 128, 27, 54))

if __name__ == '__main__':
    unittest.main()