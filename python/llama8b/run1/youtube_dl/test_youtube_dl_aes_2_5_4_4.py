import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAes(unittest.TestCase):
    def test_key_schedule_core(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 0
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [1, 2, 3, 4] ^ RCON[rcon_iteration])

    def test_rotate(self):
        data = [1, 2, 3, 4]
        result = rotate(data)
        self.assertEqual(result, [4, 1, 2, 3])

    def test_sub_bytes(self):
        data = [1, 2, 3, 4]
        result = sub_bytes(data)
        self.assertEqual(result, [SBOX[data[0]], SBOX[data[1]], SBOX[data[2]], SBOX[data[3]]])

    def test_aes_encrypt(self):
        data = [1, 2, 3, 4]
        result = aes_encrypt(data)
        self.assertEqual(result, [result[0], result[1], result[2], result[3]])

    def test_aes_decrypt_text(self):
        data = [1, 2, 3, 4]
        result = aes_decrypt_text(data)
        self.assertEqual(result, [result[0], result[1], result[2], result[3]])

    def test_aes_cbc_decrypt(self):
        data = [1, 2, 3, 4]
        result = aes_cbc_decrypt(data)
        self.assertEqual(result, [result[0], result[1], result[2], result[3]])

    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4]
        result = aes_ctr_decrypt(data)
        self.assertEqual(result, [result[0], result[1], result[2], result[3]])

if __name__ == '__main__':
    unittest.main()