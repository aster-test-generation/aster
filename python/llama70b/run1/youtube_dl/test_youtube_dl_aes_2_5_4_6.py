import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestRijndaelMul(unittest.TestCase):
    def test_rijndael_mul(self):
        self.assertEqual(rijndael_mul(1, 1), 1)
        self.assertEqual(rijndael_mul(2, 3), 6)
        self.assertEqual(rijndael_mul(0, 1), 0)
        self.assertEqual(rijndael_mul(1, 0), 0)

class TestKeyExpansion(unittest.TestCase):
    def test_key_expansion(self):
        # todo: implement test for key_expansion
        pass

class TestAesEncrypt(unittest.TestCase):
    def test_aes_encrypt(self):
        # todo: implement test for aes_encrypt
        pass

class TestAesCtrDecrypt(unittest.TestCase):
    def test_aes_ctr_decrypt(self):
        # todo: implement test for aes_ctr_decrypt
        pass

class TestAesCbcDecrypt(unittest.TestCase):
    def test_aes_cbc_decrypt(self):
        # todo: implement test for aes_cbc_decrypt
        pass

class TestAesDecryptText(unittest.TestCase):
    def test_aes_decrypt_text(self):
        # todo: implement test for aes_decrypt_text
        pass

if __name__ == '__main__':
    unittest.main()