import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_rijndael_mul_zero(self):
        result = rijndael_mul(0, 5)
        self.assertEqual(result, 0)

    def test_rijndael_mul_non_zero(self):
        result = rijndael_mul(3, 4)
        self.assertEqual(result, 12)

    def test_rijndael_mul_exp_table(self):
        result = rijndael_mul(1, 1)
        self.assertEqual(result, 1)

    def test_rijndael_mul_log_table(self):
        result = rijndael_mul(2, 2)
        self.assertEqual(result, 4)

if __name__ == '__main__':
    unittest.main()