import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_inc(self):
        data = [255, 255, 255, 255]
        result = inc(data)
        self.assertEqual(result, [0, 0, 0, 0])

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_encrypt(self):
        plaintext = [1, 2, 3, 4, 5, 6, 7, 8]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_encrypt(plaintext, key)
        self.assertEqual(len(result), 16)

    def test_aes_decrypt_text(self):
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_decrypt_text(ciphertext, key)
        self.assertEqual(len(result), 8)

    def test_aes_ctr_decrypt(self):
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_ctr_decrypt(ciphertext, key)
        self.assertEqual(len(result), 8)

    def test_aes_cbc_decrypt(self):
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_cbc_decrypt(ciphertext, key)
        self.assertEqual(len(result), 8)

    def test__init__(self):
        instance = AES()
        self.assertEqual(instance.key, [0] * 16)

    def test__str__(self):
        instance = AES()
        result = str(instance)
        self.assertEqual(result, "AES")

    def test__repr__(self):
        instance = AES()
        result = repr(instance)
        self.assertEqual(result, "AES()")

    def test__eq__(self):
        instance1 = AES()
        instance2 = AES()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()