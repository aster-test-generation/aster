import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestKeyScheduleCore(unittest.TestCase):
    def test_key_schedule_core(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 0
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_key_schedule_core_rotate(self):
        data = [1, 2, 3, 4]
        result = rotate(data)
        self.assertEqual(result, [4, 1, 2, 3])

    def test_key_schedule_core_sub_bytes(self):
        data = [1, 2, 3, 4]
        result = sub_bytes(data)
        self.assertEqual(result, [x for x in data])

    def test_key_schedule_core_rcon(self):
        rcon_iteration = 0
        result = RCON[rcon_iteration]
        self.assertEqual(result, 141)

class TestKeyExpansion(unittest.TestCase):
    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

class TestAesEncrypt(unittest.TestCase):
    def test_aes_encrypt(self):
        plaintext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_encrypt(plaintext, key)
        self.assertEqual(len(result), 16)

class TestAesCbcDecrypt(unittest.TestCase):
    def test_aes_cbc_decrypt(self):
        ciphertext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        iv = [1, 2, 3, 4]
        result = aes_cbc_decrypt(ciphertext, key, iv)
        self.assertEqual(len(result), 16)

class TestAesCtrDecrypt(unittest.TestCase):
    def test_aes_ctr_decrypt(self):
        ciphertext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        nonce = [1, 2, 3, 4]
        result = aes_ctr_decrypt(ciphertext, key, nonce)
        self.assertEqual(len(result), 16)

if __name__ == '__main__':
    unittest.main()