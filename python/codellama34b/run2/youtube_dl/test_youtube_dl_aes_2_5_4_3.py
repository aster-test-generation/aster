import unittest
from youtube_dl.aes import *


class TestKeyExpansion(unittest.TestCase):
    def test_key_expansion(self):
        result = key_expansion(1)
        self.assertEqual(result, 1)

class TestRotate(unittest.TestCase):
    def test_rotate(self):
        result = rotate(1)
        self.assertEqual(result, 1)

class TestAesEncrypt(unittest.TestCase):
    def test_aes_encrypt(self):
        result = aes_encrypt(1)
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