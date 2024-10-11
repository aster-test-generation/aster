import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_key_expansion(self):
        data = b'\x00' * 16
        expanded_key = key_expansion(data)
        self.assertEqual(len(expanded_key), 176)

    def test_key_schedule_core(self):
        temp = b'\x00' * 4
        rcon_iteration = 1
        result = key_schedule_core(temp, rcon_iteration)
        self.assertEqual(result, b'\x00\x00\x00\x00')

    def test_sub_bytes(self):
        temp = b'\x00' * 4
        result = sub_bytes(temp)
        self.assertEqual(result, b'\x63\x63\x63\x63')

    def test_xor(self):
        a = b'\x00' * 4
        b = b'\x01' * 4
        result = xor(a, b)
        self.assertEqual(result, b'\x01' * 4)

    def test_RIJNDAEL_EXP_TABLE(self):
        self.assertEqual(RIJNDAEL_EXP_TABLE[0], 1)
        self.assertEqual(RIJNDAEL_EXP_TABLE[1], 3)

    def test_RIJNDAEL_LOG_TABLE(self):
        self.assertEqual(RIJNDAEL_LOG_TABLE[0], 0)
        self.assertEqual(RIJNDAEL_LOG_TABLE[1], 0)

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