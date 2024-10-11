import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_inc(self):
        data = [0, 0, 0, 0]
        result = inc(data)
        self.assertEqual(result, [0, 0, 0, 1])

    def test_aes_encrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        plaintext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_encrypt(key, plaintext)
        self.assertEqual(len(result), len(plaintext))

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_ctr_decrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_ctr_decrypt(key, ciphertext)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_aes_cbc_decrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_cbc_decrypt(key, ciphertext)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_aes_decrypt_text(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_decrypt_text(key, ciphertext)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6, 7, 8])

    def test_private_method(self):
        instance = AES()
        with self.assertRaises(AttributeError):
            instance.__private_method()

    def test_protected_method(self):
        instance = AES()
        with self.assertRaises(AttributeError):
            instance._protected_method()

    def test_magic_methods(self):
        instance = AES()
        self.assertEqual(instance.__str__(), "AES")
        self.assertEqual(instance.__repr__(), "AES()")
        self.assertEqual(instance.__eq__(AES()), True)

if __name__ == '__main__':
    unittest.main()