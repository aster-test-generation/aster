import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_rijndael_mul_zero_a(self):
        result = rijndael_mul(0, 5)
        self.assertEqual(result, 0)

    def test_rijndael_mul_zero_b(self):
        result = rijndael_mul(5, 0)
        self.assertEqual(result, 0)

    def test_rijndael_mul_non_zero(self):
        result = rijndael_mul(3, 4)
        self.assertEqual(result, 12)  # 3 * 4 in GF(2^8) should be 12

    def test_rijndael_mul_max_values(self):
        result = rijndael_mul(255, 255)
        self.assertEqual(result, 1)  # 255 * 255 in GF(2^8) should be 1

if __name__ == '__main__':
    unittest.main()