import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_mix_columns_inv(self):
        data = [1, 2, 3, 4]
        result = mix_columns_inv(data)
        self.assertEqual(result, [14, 11, 13, 9])

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_encrypt(self):
        plaintext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_encrypt(plaintext, key)
        self.assertEqual(len(result), 16)

    def test_aes_decrypt_text(self):
        ciphertext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_decrypt_text(ciphertext, key)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_aes_ctr_decrypt(self):
        ciphertext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_ctr_decrypt(ciphertext, key)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_aes_cbc_decrypt(self):
        ciphertext = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_cbc_decrypt(ciphertext, key)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_private_method(self):
        instance = AES()
        result = instance.__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        instance = AES()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_magic_method_str(self):
        instance = AES()
        result = str(instance)
        self.assertEqual(result, "AES")

    def test_magic_method_repr(self):
        instance = AES()
        result = repr(instance)
        self.assertEqual(result, "AES()")

    def test_magic_method_eq(self):
        instance1 = AES()
        instance2 = AES()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()