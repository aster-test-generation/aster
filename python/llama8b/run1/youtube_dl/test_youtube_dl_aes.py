import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_encrypt(self):
        # Test AES encryption
        plaintext = b'Hello, World!'
        key = b'1234567890123456'
        ciphertext = aes_encrypt(plaintext, key)
        self.assertEqual(len(ciphertext), len(plaintext) + 16)  # Add 16 bytes for the IV

    def test_key_expansion(self):
        # Test key expansion
        key = b'1234567890123456'
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 176)  # 176 bytes for the expanded key

    def test_aes_ctr_decrypt(self):
        # Test AES CTR decryption
        ciphertext = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f'
        key = b'1234567890123456'
        plaintext = aes_ctr_decrypt(ciphertext, key)
        self.assertEqual(plaintext, b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f')

    def test_aes_cbc_decrypt(self):
        # Test AES CBC decryption
        ciphertext = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f'
        key = b'1234567890123456'
        plaintext = aes_cbc_decrypt(ciphertext, key)
        self.assertEqual(plaintext, b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f')

    def test_aes_decrypt_text(self):
        # Test AES decryption of text
        text = 'Hello, World!'
        key = b'1234567890123456'
        decrypted_text = aes_decrypt_text(text.encode(), key)
        self.assertEqual(decrypted_text.decode(), text)

    def test_inc(self):
        # Test increment function
        data = [255, 254, 253, 252, 251, 250, 249, 248, 247, 246, 245, 244, 243, 242, 241, 240]
        incremented_data = inc(data)
        self.assertEqual(incremented_data, [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1])

    def test_private_method(self):
        # Test private method
        instance = AES()
        result = instance.__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        # Test protected method
        instance = AES()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_magic_methods(self):
        # Test magic methods
        instance = AES()
        self.assertEqual(instance.__str__(), 'AES')
        self.assertEqual(instance.__repr__(), 'AES()')
        self.assertEqual(instance.__eq__(AES()), True)

if __name__ == '__main__':
    unittest.main()