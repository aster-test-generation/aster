import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_mix_column(self):
        data = [1, 2, 3, 4]
        matrix = ((2, 3, 1, 1), (1, 2, 3, 1), (1, 1, 2, 3), (3, 1, 1, 2))
        result = mix_column(data, matrix)
        self.assertEqual(result, [10, 7, 12, 9])

    def test_rijndael_mul(self):
        a = 2
        b = 3
        result = rijndael_mul(a, b)
        self.assertEqual(result, 6)

    def test_key_expansion(self):
        key = b'1234567890abcdef'
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_encrypt(self):
        key = b'1234567890abcdef'
        plaintext = b'Hello, World!'
        result = aes_encrypt(plaintext, key)
        self.assertEqual(len(result), 16)

    def test_aes_ctr_decrypt(self):
        key = b'1234567890abcdef'
        ciphertext = b'\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15\x16'
        result = aes_ctr_decrypt(ciphertext, key)
        self.assertEqual(result, b'Hello, World!')

    def test_aes_cbc_decrypt(self):
        key = b'1234567890abcdef'
        ciphertext = b'\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15\x16'
        result = aes_cbc_decrypt(ciphertext, key)
        self.assertEqual(result, b'Hello, World!')

    def test_aes_decrypt_text(self):
        key = b'1234567890abcdef'
        ciphertext = b'\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15\x16'
        result = aes_decrypt_text(ciphertext, key)
        self.assertEqual(result, b'Hello, World!')

    def test_private_method(self):
        instance = AES()
        result = instance._AES__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        instance = AES()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_magic_method_init(self):
        instance = AES()
        self.assertIsNotNone(instance)

    def test_magic_method_str(self):
        instance = AES()
        result = str(instance)
        self.assertEqual(result, 'AES')

    def test_magic_method_repr(self):
        instance = AES()
        result = repr(instance)
        self.assertEqual(result, 'AES()')

    def test_magic_method_eq(self):
        instance1 = AES()
        instance2 = AES()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()