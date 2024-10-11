import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESMethods(unittest.TestCase):
    def test_xor(self):
        data1 = [1, 2, 3]
        data2 = [4, 5, 6]
        result = xor(data1, data2)
        self.assertEqual(result, [5, 7, 5])

    def test_key_expansion(self):
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x15\x88\x09\xcf\x4f'
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 176)

    def test_aes_encrypt(self):
        plaintext = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x15\x88\x09\xcf\x4f'
        ciphertext = aes_encrypt(plaintext, key)
        self.assertEqual(ciphertext, b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32')

    def test_aes_ctr_decrypt(self):
        ciphertext = b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x15\x88\x09\xcf\x4f'
        nonce = b'\x00\x00\x00\x00\x00\x00\x00\x00'
        plaintext = aes_ctr_decrypt(ciphertext, key, nonce)
        self.assertEqual(plaintext, b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34')

    def test_aes_cbc_decrypt(self):
        ciphertext = b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x15\x88\x09\xcf\x4f'
        iv = b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'
        plaintext = aes_cbc_decrypt(ciphertext, key, iv)
        self.assertEqual(plaintext, b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34')

    def test_aes_decrypt_text(self):
        ciphertext = '3925841d02dc09fbdc118597196a0b32'
        key = '2b7e151628aed2a6abf7158809cf4f3c'
        plaintext = aes_decrypt_text(ciphertext, key)
        self.assertEqual(plaintext, '3243f6a8885a308d313198a2e0370734')

if __name__ == '__main__':
    unittest.main()