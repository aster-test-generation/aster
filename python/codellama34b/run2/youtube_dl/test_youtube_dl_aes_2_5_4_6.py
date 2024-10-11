import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestRijndaelMul(unittest.TestCase):
    def test_rijndael_mul(self):
        result = rijndael_mul(1, 2)
        self.assertEqual(result, 3)

    def test_rijndael_mul_with_zero(self):
        result = rijndael_mul(0, 2)
        self.assertEqual(result, 0)

        result = rijndael_mul(1, 0)
        self.assertEqual(result, 0)

class TestKeyExpansion(unittest.TestCase):
    def test_key_expansion(self):
        result = key_expansion(1)
        self.assertEqual(result, 1)

class TestAesCtrDecrypt(unittest.TestCase):
    def test_aes_ctr_decrypt(self):
        result = aes_ctr_decrypt(1)
        self.assertEqual(result, 1)

class TestAesCbcDecrypt(unittest.TestCase):
    def test_aes_cbc_decrypt(self):
        result = aes_cbc_decrypt(1)
        self.assertEqual(result, 1)

class TestAesDecryptText(unittest.TestCase):
    def test_aes_decrypt_text(self):
        result = aes_decrypt_text(1)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()