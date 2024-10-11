import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_key_schedule_core(self):
        data = [1, 2, 3, 4]
        rcon_iteration = 1
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, [141, 2, 3, 4])  # expected result

    def test_rotate(self):
        data = [1, 2, 3, 4]
        result = rotate(data)
        self.assertEqual(result, [2, 3, 4, 1])  # expected result

    def test_sub_bytes(self):
        data = [1, 2, 3, 4]
        result = sub_bytes(data)
        self.assertEqual(result, [SBOX[1], SBOX[2], SBOX[3], SBOX[4]])  # expected result

    def test_aes_encrypt(self):
        # implement test for aes_encrypt function
        pass

    def test_key_expansion(self):
        # implement test for key_expansion function
        pass

    def test_aes_ctr_decrypt(self):
        # implement test for aes_ctr_decrypt function
        pass

    def test_aes_cbc_decrypt(self):
        # implement test for aes_cbc_decrypt function
        pass

    def test_aes_decrypt_text(self):
        # implement test for aes_decrypt_text function
        pass

if __name__ == '__main__':
    unittest.main()