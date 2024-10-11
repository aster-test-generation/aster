import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_rijndael_mul(self):
        result = rijndael_mul(1, 2)
        self.assertEqual(result, 3)

    def test_rijndael_mul_zero(self):
        result = rijndael_mul(0, 2)
        self.assertEqual(result, 0)

    def test_rijndael_mul_zero_b(self):
        result = rijndael_mul(1, 0)
        self.assertEqual(result, 0)

    def test_rijndael_mul_zero_a_b(self):
        result = rijndael_mul(0, 0)
        self.assertEqual(result, 0)

    def test_key_expansion(self):
        key = bytes_to_intlist(b'1234567890abcdef')
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_encrypt(self):
        key = bytes_to_intlist(b'1234567890abcdef')
        plaintext = bytes_to_intlist(b'Hello, World!')
        result = aes_encrypt(key, plaintext)
        self.assertEqual(len(result), 16)

    def test_aes_decrypt_text(self):
        key = bytes_to_intlist(b'1234567890abcdef')
        ciphertext = bytes_to_intlist(b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00')
        result = aes_decrypt_text(key, ciphertext)
        self.assertEqual(result, b'Hello, World!')

    def test_aes_cbc_decrypt(self):
        key = bytes_to_intlist(b'1234567890abcdef')
        ciphertext = bytes_to_intlist(b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00')
        iv = bytes_to_intlist(b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00')
        result = aes_cbc_decrypt(key, ciphertext, iv)
        self.assertEqual(result, b'Hello, World!')

    def test_aes_ctr_decrypt(self):
        key = bytes_to_intlist(b'1234567890abcdef')
        ciphertext = bytes_to_intlist(b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00')
        nonce = bytes_to_intlist(b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00')
        result = aes_ctr_decrypt(key, ciphertext, nonce)
        self.assertEqual(result, b'Hello, World!')

if __name__ == '__main__':
    unittest.main()