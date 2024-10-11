import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_xor(self):
        data1 = [1, 2, 3]
        data2 = [4, 5, 6]
        result = xor(data1, data2)
        self.assertEqual(result, [5, 7, 5])

    def test_key_expansion(self):
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9d\x4a\x5d\x9c\x58'
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 176)

    def test_aes_encrypt(self):
        plaintext = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9d\x4a\x5d\x9c\x58'
        ciphertext = aes_encrypt(plaintext, key)
        self.assertEqual(len(ciphertext), 16)

    def test_aes_ctr_decrypt(self):
        ciphertext = b'\x69\xc4\xe0\xd8\x6a\x7b\x04\x30\xd8\xcd\xb7\x80\x70\xb4\xc5\x5a'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9d\x4a\x5d\x9c\x58'
        nonce = b'\x00\x00\x00\x00\x00\x00\x00\x00'
        plaintext = aes_ctr_decrypt(ciphertext, key, nonce)
        self.assertEqual(len(plaintext), 16)

    def test_aes_cbc_decrypt(self):
        ciphertext = b'\x69\xc4\xe0\xd8\x6a\x7b\x04\x30\xd8\xcd\xb7\x80\x70\xb4\xc5\x5a'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9d\x4a\x5d\x9c\x58'
        iv = b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'
        plaintext = aes_cbc_decrypt(ciphertext, key, iv)
        self.assertEqual(len(plaintext), 16)

    def test_aes_decrypt_text(self):
        ciphertext = b'\x69\xc4\xe0\xd8\x6a\x7b\x04\x30\xd8\xcd\xb7\x80\x70\xb4\xc5\x5a'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9d\x4a\x5d\x9c\x58'
        plaintext = aes_decrypt_text(ciphertext, key)
        self.assertEqual(len(plaintext), 16)

if __name__ == '__main__':
    unittest.main()