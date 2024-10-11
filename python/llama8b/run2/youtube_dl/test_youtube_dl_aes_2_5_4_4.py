import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
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
        self.assertEqual(result, [SBOX[1], SBOX[2], SBOX[3], SBOX[4]])

    def test_aes_encrypt(self):
        plaintext = [1, 2, 3, 4]
        result = aes_encrypt(plaintext)
        self.assertEqual(result, [result[0], result[1], result[2], result[3]])

    def test_aes_decrypt_text(self):
        ciphertext = [1, 2, 3, 4]
        result = aes_decrypt_text(ciphertext)
        self.assertEqual(result, [result[0], result[1], result[2], result[3]])

    def test_aes_cbc_decrypt(self):
        ciphertext = [1, 2, 3, 4]
        result = aes_cbc_decrypt(ciphertext)
        self.assertEqual(result, [result[0], result[1], result[2], result[3]])

    def test_aes_ctr_decrypt(self):
        ciphertext = [1, 2, 3, 4]
        result = aes_ctr_decrypt(ciphertext)
        self.assertEqual(result, [result[0], result[1], result[2], result[3]])

if __name__ == '__main__':
    unittest.main()