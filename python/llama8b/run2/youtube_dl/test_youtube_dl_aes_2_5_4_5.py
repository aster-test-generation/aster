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
        key = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        result = aes_encrypt(plaintext, key)
        self.assertEqual(len(result), len(plaintext) * 16)

    def test_key_expansion(self):
        # Test key expansion
        key = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_ctr_decrypt(self):
        # Test AES CTR decryption
        ciphertext = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        key = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        nonce = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        result = aes_ctr_decrypt(ciphertext, key, nonce)
        self.assertEqual(result, b'Hello, World!')

    def test_aes_cbc_decrypt(self):
        # Test AES CBC decryption
        ciphertext = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        key = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        iv = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        result = aes_cbc_decrypt(ciphertext, key, iv)
        self.assertEqual(result, b'Hello, World!')

    def test_aes_decrypt_text(self):
        # Test AES decryption
        ciphertext = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        key = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        result = aes_decrypt_text(ciphertext, key)
        self.assertEqual(result, b'Hello, World!')

if __name__ == '__main__':
    unittest.main()