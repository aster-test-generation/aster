import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_key_expansion(self):
        key = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_encrypt(self):
        key = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        plaintext = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = aes_encrypt(key, plaintext)
        self.assertEqual(len(result), 32)

    def test_aes_decrypt_text(self):
        key = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        ciphertext = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = aes_decrypt_text(key, ciphertext)
        self.assertEqual(result, b'000102030405060708090a0b0c0d0e0f')

    def test_aes_ctr_decrypt(self):
        key = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        ciphertext = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = aes_ctr_decrypt(key, ciphertext)
        self.assertEqual(result, b'000102030405060708090a0b0c0d0e0f')

    def test_aes_cbc_decrypt(self):
        key = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        ciphertext = bytes.fromhex('000102030405060708090a0b0c0d0e0f')
        result = aes_cbc_decrypt(key, ciphertext)
        self.assertEqual(result, b'000102030405060708090a0b0c0d0e0f')

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