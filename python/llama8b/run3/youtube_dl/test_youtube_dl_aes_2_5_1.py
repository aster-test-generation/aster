import unittest
from youtube_dl import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_encrypt(self):
        data = b'Hello, World!'
        expanded_key = key_expansion(b'1234567890abcdef')
        result = aes_encrypt(data, expanded_key)
        self.assertEqual(len(result), len(data))

    def test_key_expansion(self):
        key = b'1234567890abcdef'
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 256)

    def test_aes_decrypt_text(self):
        data = b'Hello, World!'
        expanded_key = key_expansion(b'1234567890abcdef')
        encrypted_data = aes_encrypt(data, expanded_key)
        decrypted_data = aes_decrypt_text(encrypted_data, expanded_key)
        self.assertEqual(decrypted_data, data)

    def test_aes_encrypt_private_method(self):
        data = b'Hello, World!'
        expanded_key = key_expansion(b'1234567890abcdef')
        result = aes_encrypt.__private_method__(data, expanded_key)
        self.assertEqual(len(result), len(data))

    def test_aes_encrypt_protected_method(self):
        data = b'Hello, World!'
        expanded_key = key_expansion(b'1234567890abcdef')
        result = aes_encrypt._protected_method_(data, expanded_key)
        self.assertEqual(len(result), len(data))

    def test_aes_encrypt_magic_method(self):
        data = b'Hello, World!'
        expanded_key = key_expansion(b'1234567890abcdef')
        result = aes_encrypt.__str__(data, expanded_key)
        self.assertEqual(len(result), len(data))

if __name__ == '__main__':
    unittest.main()