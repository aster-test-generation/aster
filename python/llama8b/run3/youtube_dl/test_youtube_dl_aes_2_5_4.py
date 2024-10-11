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
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_encrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_aes_decrypt_text(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_decrypt_text(data, key)
        self.assertEqual(len(result), 16)

    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_ctr_decrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_aes_cbc_decrypt(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_cbc_decrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_private_method(self):
        instance = AES()
        result = instance._private_method()
        self.assertEqual(result, None)

    def test_protected_method(self):
        instance = AES()
        result = instance._protected_method()
        self.assertEqual(result, None)

    def test_magic_method_init(self):
        instance = AES()
        self.assertEqual(instance.__init__, AES.__init__)

    def test_magic_method_str(self):
        instance = AES()
        result = instance.__str__()
        self.assertEqual(result, "AES")

    def test_magic_method_repr(self):
        instance = AES()
        result = instance.__repr__()
        self.assertEqual(result, "AES()")

    def test_magic_method_eq(self):
        instance1 = AES()
        instance2 = AES()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()