import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_key_schedule_core(self):
        data = [0x2b, 0x7e, 0x15, 0x16]
        rcon_iteration = 1
        result = key_schedule_core(data, rcon_iteration)
        expected = [0x2b ^ RCON[1], 0x7e, 0x15, 0x16]  # Expected result after sub_bytes and rotate
        self.assertEqual(result, expected)

    def test_rotate(self):
        data = [0x2b, 0x7e, 0x15, 0x16]
        result = rotate(data)
        expected = [0x7e, 0x15, 0x16, 0x2b]  # Expected result after rotation
        self.assertEqual(result, expected)

    def test_sub_bytes(self):
        data = [0x2b, 0x7e, 0x15, 0x16]
        result = sub_bytes(data)
        expected = [SBOX[0x2b], SBOX[0x7e], SBOX[0x15], SBOX[0x16]]  # Expected result after sub_bytes
        self.assertEqual(result, expected)

    def test_aes_encrypt(self):
        plaintext = b'This is a test.'
        key = b'This is a key123'
        result = aes_encrypt(plaintext, key)
        self.assertIsInstance(result, bytes)

    def test_aes_ctr_decrypt(self):
        ciphertext = b'\x00' * 16
        key = b'This is a key123'
        result = aes_ctr_decrypt(ciphertext, key)
        self.assertIsInstance(result, bytes)

    def test_aes_cbc_decrypt(self):
        ciphertext = b'\x00' * 16
        key = b'This is a key123'
        iv = b'\x00' * 16
        result = aes_cbc_decrypt(ciphertext, key, iv)
        self.assertIsInstance(result, bytes)

    def test_aes_decrypt_text(self):
        ciphertext = b'\x00' * 16
        key = b'This is a key123'
        result = aes_decrypt_text(ciphertext, key)
        self.assertIsInstance(result, str)

    def test_key_expansion(self):
        key = b'This is a key123'
        result = key_expansion(key)
        self.assertIsInstance(result, list)

if __name__ == '__main__':
    unittest.main()