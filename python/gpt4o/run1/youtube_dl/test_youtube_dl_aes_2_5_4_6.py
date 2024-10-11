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
        expected = RIJNDAEL_EXP_TABLE[(RIJNDAEL_LOG_TABLE[3] + RIJNDAEL_LOG_TABLE[4]) % 255]
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()