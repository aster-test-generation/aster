import unittest
from youtube_dl.aes import aes_cbc_decrypt



class TestAES(unittest.TestCase):
    def test_mix_column(self):
        data = [1, 2, 3, 4]
        matrix = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
        result = mix_column(data, matrix)
        self.assertEqual(result, [14, 32, 50, 68])

    def test_rijndael_mul(self):
        a = 1
        b = 2
        result = rijndael_mul(a, b)
        self.assertEqual(result, 2)

    def test_rijndael_inv(self):
        a = 1
        result = rijndael_inv(a)
        self.assertEqual(result, 1)

    def test_rijndael_s_box(self):
        a = 1
        result = rijndael_s_box(a)
        self.assertEqual(result, 1)

    def test_rijndael_s_box_inv(self):
        a = 1
        result = rijndael_s_box_inv(a)
        self.assertEqual(result, 1)

    def test_rijndael_mix_column(self):
        a = 1
        result = rijndael_mix_column(a)
        self.assertEqual(result, 1)

    def test_rijndael_mix_column_inv(self):
        a = 1
        result = rijndael_mix_column_inv(a)
        self.assertEqual(result, 1)

    def test_rijndael_key_expansion(self):
        a = 1
        result = rijndael_key_expansion(a)
        self.assertEqual(result, 1)

    def test_rijndael_encrypt(self):
        a = 1
        result = rijndael_encrypt(a)
        self.assertEqual(result, 1)

    def test_rijndael_decrypt(self):
        a = 1
        result = rijndael_decrypt(a)
        self.assertEqual(result, 1)

    def test_rijndael_ctr_encrypt(self):
        a = 1
        result = rijndael_ctr_encrypt(a)
        self.assertEqual(result, 1)

    def test_rijndael_ctr_decrypt(self):
        a = 1
        result = rijndael_ctr_decrypt(a)
        self.assertEqual(result, 1)

    def test_rijndael_cbc_encrypt(self):
        a = 1
        result = rijndael_cbc_encrypt(a)
        self.assertEqual(result, 1)

    def test_rijndael_cbc_decrypt(self):
        a = 1
        result = rijndael_cbc_decrypt(a)
        self.assertEqual(result, 1)

    def test_rijndael_ecb_encrypt(self):
        a = 1
        result = rijndael_ecb_encrypt(a)
        self.assertEqual(result, 1)

    def test_rijndael_ecb_decrypt(self):
        a = 1
        result = rijndael_ecb_decrypt(a)
        self.assertEqual(result, 1)

    def test_rijndael_ctr_encrypt_text(self):
        a = 1
        result = rijndael_ctr_encrypt_text(a)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()