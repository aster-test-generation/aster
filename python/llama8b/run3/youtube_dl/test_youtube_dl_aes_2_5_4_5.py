import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_xor(self):
        data1 = [1, 2, 3, 4]
        data2 = [5, 6, 7, 8]
        result = xor(data1, data2)
        self.assertEqual(result, [6, 8, 10, 12])

    def test_aes_encrypt(self):
        # Test AES encryption
        plaintext = b'Hello, World!'
        key = b'0123456789abcdef'
        result = aes_encrypt(plaintext, key)
        self.assertIsInstance(result, bytes)

    def test_key_expansion(self):
        # Test key expansion
        key = b'0123456789abcdef'
        result = key_expansion(key)
        self.assertIsInstance(result, list)

    def test_aes_ctr_decrypt(self):
        # Test AES CTR decryption
        ciphertext = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f'
        key = b'0123456789abcdef'
        result = aes_ctr_decrypt(ciphertext, key)
        self.assertEqual(result, b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f')

    def test_aes_cbc_decrypt(self):
        # Test AES CBC decryption
        ciphertext = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f'
        key = b'0123456789abcdef'
        result = aes_cbc_decrypt(ciphertext, key)
        self.assertEqual(result, b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f')

    def test_aes_decrypt_text(self):
        # Test AES decryption of text
        ciphertext = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f'
        key = b'0123456789abcdef'
        result = aes_decrypt_text(ciphertext, key)
        self.assertEqual(result, b'Hello, World!')

if __name__ == '__main__':
    unittest.main()