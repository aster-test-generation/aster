import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_key_expansion(self):
        data = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])
        result = key_expansion(data)
        self.assertEqual(len(result), 48)

    def test_key_schedule_core(self):
        data = bytes([1, 2, 3, 4])
        result = key_schedule_core(data, 1)
        self.assertEqual(len(result), 4)

    def test_sub_bytes(self):
        data = bytes([1, 2, 3, 4])
        result = sub_bytes(data)
        self.assertEqual(len(result), 4)

    def test_xor(self):
        data1 = bytes([1, 2, 3, 4])
        data2 = bytes([5, 6, 7, 8])
        result = xor(data1, data2)
        self.assertEqual(len(result), 4)

    def test_aes_encrypt(self):
        data = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])
        result = aes_encrypt(data, bytes([1, 2, 3, 4, 5, 6, 7, 8]))
        self.assertEqual(len(result), 32)

    def test_aes_decrypt_text(self):
        data = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])
        result = aes_decrypt_text(data, bytes([1, 2, 3, 4, 5, 6, 7, 8]))
        self.assertEqual(len(result), 16)

    def test_aes_cbc_decrypt(self):
        data = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])
        result = aes_cbc_decrypt(data, bytes([1, 2, 3, 4, 5, 6, 7, 8]))
        self.assertEqual(len(result), 16)

    def test_aes_ctr_decrypt(self):
        data = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])
        result = aes_ctr_decrypt(data, bytes([1, 2, 3, 4, 5, 6, 7, 8]))
        self.assertEqual(len(result), 16)

if __name__ == '__main__':
    unittest.main()