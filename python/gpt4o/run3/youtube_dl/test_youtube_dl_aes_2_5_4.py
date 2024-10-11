import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_mix_columns_inv(self):
        data = [
            [0x87, 0xf2, 0x4d, 0x97],
            [0x6e, 0x4c, 0x90, 0xec],
            [0x46, 0xe7, 0x4a, 0xc3],
            [0xa6, 0x8c, 0xd8, 0x95]
        ]
        expected = [
            [0x47, 0x40, 0xa3, 0x4c],
            [0x37, 0xd4, 0x70, 0x9f],
            [0x94, 0xe4, 0x3a, 0x42],
            [0xed, 0xa5, 0xa6, 0xbc]
        ]
        result = mix_columns_inv(data)
        self.assertEqual(result, expected)

    def test_key_expansion(self):
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d]
        expected = [
            [0x2b, 0x7e, 0x15, 0x16],
            [0x28, 0xae, 0xd2, 0xa6],
            [0xab, 0xf7, 0x4d, 0x4d],
            [0x4d, 0x4d, 0x4d, 0x4d],
            # ... (rest of the expanded key)
        ]
        result = key_expansion(key)
        self.assertEqual(result[:4], expected)

    def test_aes_encrypt(self):
        plaintext = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d]
        expected = [0x39, 0x25, 0x84, 0x1d, 0x02, 0xdc, 0x09, 0xfb, 0xdc, 0x11, 0x85, 0x97, 0x19, 0x6a, 0x0b, 0x32]
        result = aes_encrypt(plaintext, key)
        self.assertEqual(result, expected)

    def test_aes_ctr_decrypt(self):
        ciphertext = [0x39, 0x25, 0x84, 0x1d, 0x02, 0xdc, 0x09, 0xfb, 0xdc, 0x11, 0x85, 0x97, 0x19, 0x6a, 0x0b, 0x32]
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d]
        nonce = [0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00]
        expected = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        result = aes_ctr_decrypt(ciphertext, key, nonce)
        self.assertEqual(result, expected)

    def test_aes_cbc_decrypt(self):
        ciphertext = [0x39, 0x25, 0x84, 0x1d, 0x02, 0xdc, 0x09, 0xfb, 0xdc, 0x11, 0x85, 0x97, 0x19, 0x6a, 0x0b, 0x32]
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d]
        iv = [0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00]
        expected = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        result = aes_cbc_decrypt(ciphertext, key, iv)
        self.assertEqual(result, expected)

    def test_aes_decrypt_text(self):
        ciphertext = "3925841d02dc09fbdc118597196a0b32"
        key = "2b7e151628aed2a6abf74d4d4d4d4d4d"
        expected = "3243f6a8885a308d313198a2e0370734"
        result = aes_decrypt_text(ciphertext, key)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()