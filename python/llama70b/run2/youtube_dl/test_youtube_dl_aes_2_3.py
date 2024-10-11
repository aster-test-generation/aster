import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_aes_cbc_encrypt(self):
        data = b'Hello, World!'
        key = b'\x00' * 16
        iv = b'\x00' * 16
        encrypted_data = aes_cbc_encrypt(data, key, iv)
        self.assertIsNotNone(encrypted_data)

    def test_key_expansion(self):
        key = b'\x00' * 16
        expanded_key = key_expansion(key)
        self.assertIsNotNone(expanded_key)

    def test_aes_encrypt(self):
        block = [0] * 16
        key = b'\x00' * 16
        encrypted_block = aes_encrypt(block, key)
        self.assertIsNotNone(encrypted_block)

    def test_xor(self):
        block1 = [0] * 16
        block2 = [1] * 16
        result = xor(block1, block2)
        self.assertEqual(result, [1] * 16)

    def test_bytes_to_intlist(self):
        data = b'\x00\x01\x02\x03'
        intlist = bytes_to_intlist(data)
        self.assertEqual(intlist, [0, 1, 2, 3])

    def test_intlist_to_bytes(self):
        intlist = [0, 1, 2, 3]
        data = intlist_to_bytes(intlist)
        self.assertEqual(data, b'\x00\x01\x02\x03')

    def test_compat_b64decode(self):
        encoded_data = b'VGhlIHN0cmluZw=='
        decoded_data = compat_b64decode(encoded_data)
        self.assertEqual(decoded_data, b'The string')

    def test_RIJNDAEL_EXP_TABLE(self):
        self.assertEqual(RIJNDAEL_EXP_TABLE[0], 1)

    def test_RIJNDAEL_LOG_TABLE(self):
        self.assertEqual(RIJNDAEL_LOG_TABLE[0], 0)

    def test_MIX_COLUMN_MATRIX(self):
        self.assertEqual(MIX_COLUMN_MATRIX[0][0], 2)

    def test_MIX_COLUMN_MATRIX_INV(self):
        self.assertEqual(MIX_COLUMN_MATRIX_INV[0][0], 14)

    def test_SBOX(self):
        self.assertEqual(SBOX[0], 99)

    def test_SBOX_INV(self):
        self.assertEqual(SBOX_INV[0], 82)

if __name__ == '__main__':
    unittest.main()