import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_aes_encrypt(self):
        data = [0] * BLOCK_SIZE_BYTES
        expanded_key = [0] * (BLOCK_SIZE_BYTES * 11)
        expected_result = [154, 175, 223, 152, 22, 166, 157, 174, 110, 228, 133, 156, 160, 130, 161, 172]
        result = aes_encrypt(data, expanded_key)
        self.assertEqual(result, expected_result)

    def test_sub_bytes(self):
        data = [0] * BLOCK_SIZE_BYTES
        expected_result = [99, 124, 119, 123, 242, 107, 111, 197, 48, 1, 103, 43, 254, 215, 171, 118]
        result = sub_bytes(data)
        self.assertEqual(result, expected_result)

    def test_shift_rows(self):
        data = [0] * BLOCK_SIZE_BYTES
        expected_result = [0, 5, 10, 15, 4, 9, 14, 3, 8, 13, 2, 7, 12, 1, 6, 11]
        result = shift_rows(data)
        self.assertEqual(result, expected_result)

    def test_mix_columns(self):
        data = [0] * BLOCK_SIZE_BYTES
        expected_result = [2, 3, 1, 1, 1, 2, 3, 1, 1, 1, 2, 3, 3, 1, 1, 2]
        result = mix_columns(data)
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()