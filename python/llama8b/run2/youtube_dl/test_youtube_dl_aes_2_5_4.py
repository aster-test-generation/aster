import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_mix_columns_inv(self):
        data = [1, 2, 3, 4]
        result = mix_columns_inv(data)
        self.assertEqual(result, [x for x in data])

    def test_key_expansion(self):
        key = [1, 2, 3, 4]
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_encrypt(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4]
        result = aes_encrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_aes_decrypt_text(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4]
        result = aes_decrypt_text(data, key)
        self.assertEqual(len(result), 16)

    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4]
        result = aes_ctr_decrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_aes_cbc_decrypt(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4]
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

    def test_magic_methods(self):
        instance = AES()
        self.assertEqual(instance.__str__(), "AES")
        self.assertEqual(instance.__repr__(), "AES()")
        self.assertEqual(instance.__eq__(AES()), True)

if __name__ == '__main__':
    unittest.main()