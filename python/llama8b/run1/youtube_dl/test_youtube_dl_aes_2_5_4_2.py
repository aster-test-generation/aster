import unittest
from youtube_dl.aes import *


class TestAES(unittest.TestCase):
    def test_sub_bytes_inv(self):
        data = [1, 2, 3, 4]
        result = sub_bytes_inv(data)
        self.assertEqual(result, [82, 9, 106, 213])

    def test_sub_bytes(self):
        data = [1, 2, 3, 4]
        result = [SBOX[x] for x in data]
        self.assertEqual(result, [99, 124, 119, 123])

    def test_mix_column_matrix(self):
        data = [[2, 3, 1, 1], [1, 2, 3, 1], [1, 1, 2, 3], [3, 1, 1, 2]]
        result = [[14, 11, 13, 9], [9, 14, 11, 13], [13, 9, 14, 11], [11, 13, 9, 14]]
        self.assertEqual(result, MIX_COLUMN_MATRIX_INV)

    def test_mix_column_matrix_inv(self):
        data = [[14, 11, 13, 9], [9, 14, 11, 13], [13, 9, 14, 11], [11, 13, 9, 14]]
        result = [[2, 3, 1, 1], [1, 2, 3, 1], [1, 1, 2, 3], [3, 1, 1, 2]]
        self.assertEqual(result, MIX_COLUMN_MATRIX)

    def test_aes_encrypt(self):
        # TO DO: Implement the test case for aes_encrypt function
        pass

    def test_key_expansion(self):
        # TO DO: Implement the test case for key_expansion function
        pass

    def test_aes_ctr_decrypt(self):
        # TO DO: Implement the test case for aes_ctr_decrypt function
        pass

    def test_aes_cbc_decrypt(self):
        # TO DO: Implement the test case for aes_cbc_decrypt function
        pass

    def test_aes_decrypt_text(self):
        # TO DO: Implement the test case for aes_decrypt_text function
        pass

if __name__ == '__main__':
    unittest.main()