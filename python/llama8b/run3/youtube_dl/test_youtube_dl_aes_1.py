import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_key_expansion(self):
        key = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_encrypt(self):
        key = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
        plaintext = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
        result = aes_encrypt(key, plaintext)
        self.assertEqual(len(result), 44)

    def test_aes_decrypt_text(self):
        key = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
        ciphertext = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
        result = aes_decrypt_text(key, ciphertext)
        self.assertEqual(result, b'\x01\x02\x03\x04\x05\x06\x07\x08\t\n\x0b\x0c\r\x0e\x0f')

    def test_aes_ctr_decrypt(self):
        key = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
        ciphertext = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
        result = aes_ctr_decrypt(key, ciphertext)
        self.assertEqual(result, b'\x01\x02\x03\x04\x05\x06\x07\x08\t\n\x0b\x0c\r\x0e\x0f')

    def test_aes_cbc_decrypt(self):
        key = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
        ciphertext = bytes([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15])
        result = aes_cbc_decrypt(key, ciphertext)
        self.assertEqual(result, b'\x01\x02\x03\x04\x05\x06\x07\x08\t\n\x0b\x0c\r\x0e\x0f')

    def test__private_method(self):
        instance = AES()
        result = instance._private_method()
        self.assertEqual(result, None)

    def test__protected_method(self):
        instance = AES()
        result = instance._protected_method()
        self.assertEqual(result, None)

    def test__init__(self):
        instance = AES()
        self.assertEqual(instance.key, None)

    def test__str__(self):
        instance = AES()
        result = str(instance)
        self.assertEqual(result, 'AES')

    def test__repr__(self):
        instance = AES()
        result = repr(instance)
        self.assertEqual(result, 'AES()')

    def test__eq__(self):
        instance1 = AES()
        instance2 = AES()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()