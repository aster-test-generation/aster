import unittest
from youtube_dl.aes import *


class TestAES(unittest.TestCase):
    def test_aes_decrypt(self):
        data = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        expanded_key = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = aes_decrypt(data, expanded_key)
        self.assertEqual(result.hex(), '000102030405060708090a0b0c0d0e0f')

    def test_key_expansion(self):
        key = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_encrypt(self):
        data = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        key = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = aes_encrypt(data, key)
        self.assertEqual(len(result), 32)

    def test_shift_rows_inv(self):
        data = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = shift_rows_inv(data)
        self.assertEqual(result.hex(), '000102030405060708090a0b0c0d0e0f')

    def test_sub_bytes_inv(self):
        data = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = sub_bytes_inv(data)
        self.assertEqual(result.hex(), '000102030405060708090a0b0c0d0e0f')

    def test_mix_columns_inv(self):
        data = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = mix_columns_inv(data)
        self.assertEqual(result.hex(), '000102030405060708090a0b0c0d0e0f')

    def test_xor(self):
        data = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        key = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = xor(data, key)
        self.assertEqual(result.hex(), '000102030405060708090a0b0c0d0e0f')

if __name__ == '__main__':
    unittest.main()