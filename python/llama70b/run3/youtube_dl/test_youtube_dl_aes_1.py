import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_key_expansion(self):
        key = b'\x00' * 16
        result = key_expansion(key, 128)
        self.assertIsNotNone(result)

    def test_aes_encrypt(self):
        key = b'\x00' * 16
        plaintext = b'\x00' * 16
        result = aes_encrypt(plaintext, key, 128)
        self.assertIsNotNone(result)

    def test_aes_ctr_decrypt(self):
        key = b'\x00' * 16
        ciphertext = b'\x00' * 16
        result = aes_ctr_decrypt(ciphertext, key, 128)
        self.assertIsNotNone(result)

    def test_aes_cbc_decrypt(self):
        key = b'\x00' * 16
        ciphertext = b'\x00' * 16
        iv = b'\x00' * 16
        result = aes_cbc_decrypt(ciphertext, key, 128, iv)
        self.assertIsNotNone(result)

    def test_aes_decrypt_text(self):
        key = b'\x00' * 16
        ciphertext = b'\x00' * 16
        result = aes_decrypt_text(ciphertext, key, 128)
        self.assertIsNotNone(result)

    def test_RIJNDAEL_EXP_TABLE(self):
        self.assertEqual(len(RIJNDAEL_EXP_TABLE), 256)

    def test_RIJNDAEL_LOG_TABLE(self):
        self.assertEqual(len(RIJNDAEL_LOG_TABLE), 256)

    def test_MIX_COLUMN_MATRIX(self):
        self.assertEqual(len(MIX_COLUMN_MATRIX), 4)

    def test_MIX_COLUMN_MATRIX_INV(self):
        self.assertEqual(len(MIX_COLUMN_MATRIX_INV), 4)

    def test_SBOX(self):
        self.assertEqual(len(SBOX), 256)

    def test_SBOX_INV(self):
        self.assertEqual(len(SBOX_INV), 256)

if __name__ == '__main__':
    unittest.main()