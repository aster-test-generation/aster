import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_sub_bytes(self):
        data = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        result = sub_bytes(data)
        expected = [SBOX[x] for x in data]
        self.assertEqual(result, expected)

    def test_aes_encrypt(self):
        key = b'1234567890123456'
        data = b'1234567890123456'
        result = aes_encrypt(data, key)
        self.assertIsInstance(result, bytes)

    def test_key_expansion(self):
        key = b'1234567890123456'
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_ctr_decrypt(self):
        key = b'1234567890123456'
        data = b'1234567890123456'
        nonce = b'12345678'
        result = aes_ctr_decrypt(data, key, nonce)
        self.assertIsInstance(result, bytes)

    def test_aes_cbc_decrypt(self):
        key = b'1234567890123456'
        data = b'1234567890123456'
        iv = b'1234567890123456'
        result = aes_cbc_decrypt(data, key, iv)
        self.assertIsInstance(result, bytes)

    def test_aes_decrypt_text(self):
        key = b'1234567890123456'
        data = b'1234567890123456'
        result = aes_decrypt_text(data, key)
        self.assertIsInstance(result, str)

    def test_private_method(self):
        instance = ExampleClass()
        result = instance._ExampleClass__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        instance = ExampleClass()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_str_method(self):
        instance = ExampleClass()
        result = instance.__str__()
        self.assertEqual(result, "ExampleClass")

    def test_repr_method(self):
        instance = ExampleClass()
        result = instance.__repr__()
        self.assertEqual(result, "ExampleClass(1)")

if __name__ == '__main__':
    unittest.main()