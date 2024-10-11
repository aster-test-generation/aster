import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_sub_bytes(self):
        data = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
        result = sub_bytes(data)
        expected = [SBOX[x] for x in data]
        self.assertEqual(result, expected)

    def test_key_expansion(self):
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x15\x88\x09\xcf\x4f'
        result = key_expansion(key)
        self.assertEqual(len(result), 176)  # AES-128 should produce 176 bytes of expanded key

    def test_aes_encrypt(self):
        plaintext = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x15\x88\x09\xcf\x4f'
        result = aes_encrypt(plaintext, key)
        expected = b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32'
        self.assertEqual(result, expected)

    def test_aes_ctr_decrypt(self):
        ciphertext = b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x15\x88\x09\xcf\x4f'
        nonce = b'\x00\x00\x00\x00\x00\x00\x00\x00'
        result = aes_ctr_decrypt(ciphertext, key, nonce)
        expected = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        self.assertEqual(result, expected)

    def test_aes_cbc_decrypt(self):
        ciphertext = b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x15\x88\x09\xcf\x4f'
        iv = b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'
        result = aes_cbc_decrypt(ciphertext, key, iv)
        expected = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        self.assertEqual(result, expected)

    def test_aes_decrypt_text(self):
        ciphertext = '3925841d02dc09fbdc118597196a0b32'
        key = '2b7e151628aed2a6abf7158809cf4f3c'
        result = aes_decrypt_text(ciphertext, key)
        expected = '3243f6a8885a308d313198a2e0370734'
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()