import unittest
from youtube_dl.aes import *


class TestAES(unittest.TestCase):
    def test_aes_cbc_encrypt(self):
        key = bytes_to_intlist(b'1234567890123456')
        iv = bytes_to_intlist(b'1234567890123456')
        data = bytes_to_intlist(b'Hello, World!')
        encrypted_data = aes_cbc_encrypt(data, key, iv)
        self.assertEqual(len(encrypted_data), len(data) + BLOCK_SIZE_BYTES)

    def test_key_expansion(self):
        key = bytes_to_intlist(b'1234567890123456')
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 44)

    def test_aes_encrypt(self):
        key = bytes_to_intlist(b'1234567890123456')
        data = bytes_to_intlist(b'Hello, World!')
        encrypted_data = aes_encrypt(data, key)
        self.assertEqual(len(encrypted_data), len(data))

    def test_xor(self):
        data = bytes_to_intlist(b'Hello, World!')
        iv = bytes_to_intlist(b'1234567890123456')
        mixed_block = xor(data, iv)
        self.assertEqual(len(mixed_block), len(data))

    def test_bytes_to_intlist(self):
        data = b'Hello, World!'
        intlist = bytes_to_intlist(data)
        self.assertEqual(len(intlist), len(data))

    def test_intlist_to_bytes(self):
        intlist = [0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x2c, 0x20, 0x57, 0x6f, 0x72, 0x6c, 0x64]
        data = intlist_to_bytes(intlist)
        self.assertEqual(data, b'Hello, World!')

    def test_aes_cbc_decrypt(self):
        key = bytes_to_intlist(b'1234567890123456')
        iv = bytes_to_intlist(b'1234567890123456')
        encrypted_data = aes_cbc_encrypt(b'Hello, World!', key, iv)
        decrypted_data = aes_cbc_decrypt(encrypted_data, key, iv)
        self.assertEqual(decrypted_data, b'Hello, World!')

    def test_aes_ctr_decrypt(self):
        key = bytes_to_intlist(b'1234567890123456')
        iv = bytes_to_intlist(b'1234567890123456')
        encrypted_data = aes_ctr_encrypt(b'Hello, World!', key, iv)
        decrypted_data = aes_ctr_decrypt(encrypted_data, key, iv)
        self.assertEqual(decrypted_data, b'Hello, World!')

    def test_aes_decrypt_text(self):
        key = bytes_to_intlist(b'1234567890123456')
        encrypted_data = aes_encrypt(b'Hello, World!', key)
        decrypted_data = aes_decrypt_text(encrypted_data, key)
        self.assertEqual(decrypted_data, b'Hello, World!')

if __name__ == '__main__':
    unittest.main()