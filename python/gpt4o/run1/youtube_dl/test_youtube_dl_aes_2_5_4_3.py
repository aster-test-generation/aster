import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_rotate(self):
        data = [1, 2, 3, 4]
        result = rotate(data)
        self.assertEqual(result, [2, 3, 4, 1])

    def test_key_expansion(self):
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9d\x4f\x3c\x2e\x2e'
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 176)

    def test_aes_encrypt(self):
        plaintext = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9d\x4f\x3c\x2e\x2e'
        ciphertext = aes_encrypt(plaintext, key)
        self.assertEqual(len(ciphertext), 16)

    def test_aes_ctr_decrypt(self):
        ciphertext = b'\x69\xc4\xe0\xd8\x6a\x7b\x04\x30\xd8\xcd\xb7\x80\x70\xb4\xc5\x5a'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9d\x4f\x3c\x2e\x2e'
        nonce = b'\x00\x00\x00\x00\x00\x00\x00\x00'
        plaintext = aes_ctr_decrypt(ciphertext, key, nonce)
        self.assertEqual(len(plaintext), 16)

    def test_aes_cbc_decrypt(self):
        ciphertext = b'\x69\xc4\xe0\xd8\x6a\x7b\x04\x30\xd8\xcd\xb7\x80\x70\xb4\xc5\x5a'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9d\x4f\x3c\x2e\x2e'
        iv = b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'
        plaintext = aes_cbc_decrypt(ciphertext, key, iv)
        self.assertEqual(len(plaintext), 16)

    def test_aes_decrypt_text(self):
        ciphertext = '69c4e0d86a7b0430d8cdb78070b4c55a'
        key = '2b7e151628aed2a6abf7158809cf4f3c'
        plaintext = aes_decrypt_text(ciphertext, key)
        self.assertEqual(len(plaintext), 16)

if __name__ == '__main__':
    unittest.main()