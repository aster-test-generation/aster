import unittest
from youtube_dl.aes import aes_cbc_decrypt



class TestAES(unittest.TestCase):
    def test_rijndael_mul(self):
        result = rijndael_mul(1, 1)
        self.assertEqual(result, 1)

    def test_rijndael_mul_2(self):
        result = rijndael_mul(0, 1)
        self.assertEqual(result, 0)

    def test_rijndael_mul_3(self):
        result = rijndael_mul(1, 0)
        self.assertEqual(result, 0)

    def test_rijndael_mul_4(self):
        result = rijndael_mul(0, 0)
        self.assertEqual(result, 0)

    def test_rijndael_mul_5(self):
        result = rijndael_mul(1, 2)
        self.assertEqual(result, 2)

    def test_rijndael_mul_6(self):
        result = rijndael_mul(2, 1)
        self.assertEqual(result, 2)

    def test_rijndael_mul_7(self):
        result = rijndael_mul(1, 3)
        self.assertEqual(result, 3)

    def test_rijndael_mul_8(self):
        result = rijndael_mul(3, 1)
        self.assertEqual(result, 3)

    def test_rijndael_mul_9(self):
        result = rijndael_mul(1, 4)
        self.assertEqual(result, 4)

    def test_rijndael_mul_10(self):
        result = rijndael_mul(4, 1)
        self.assertEqual(result, 4)

    def test_rijndael_mul_11(self):
        result = rijndael_mul(1, 5)
        self.assertEqual(result, 5)

    def test_rijndael_mul_12(self):
        result = rijndael_mul(5, 1)
        self.assertEqual(result, 5)

    def test_rijndael_mul_13(self):
        result = rijndael_mul(1, 6)
        self.assertEqual(result, 6)

    def test_rijndael_mul_14(self):
        result = rijndael_mul(6, 1)
        self.assertEqual(result, 6)

    def test_rijndael_mul_15(self):
        result = rijndael_mul(1, 7)
        self.assertEqual(result, 7)

    def test_rijndael_mul_16(self):
        result = rijndael_mul(7, 1)
        self.assertEqual(result, 7)

    def test_rijndael_mul_17(self):
        result = rijndael_mul(1, 8)
        self.assertEqual(result, 8)

    def test_rijndael_mul_18(self):
        result = rijndael_mul(8, 1)
        self.assertEqual(result, 8)

    def test_rijndael_mul_19(self):
        result = rijndael_mul(1, 9)
        self.assertEqual(result, 9)

    def test_rijndael_mul_20(self):
        result = rijndael_mul(9, 1)
        self.assertEqual(result, 9)

    def test_rijndael_mul_21(self):
        result = rijndael_mul(1, 10)
        self.assertEqual(result, 10)

    def test_rijndael_mul_22(self):
        result = rijndael_mul(10, 1)
        self.assertEqual(result, 10)

if __name__ == '__main__':
    unittest.main()