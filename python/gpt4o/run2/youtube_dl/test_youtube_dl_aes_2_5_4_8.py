import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_mix_columns(self):
        data = [0x87, 0x6E, 0x46, 0xA6, 0xF2, 0x4C, 0xE7, 0x8C, 0x4D, 0x90, 0x4A, 0xD8, 0x97, 0xEC, 0xC3, 0x95]
        expected = [0x47, 0x37, 0x94, 0xED, 0x40, 0xD4, 0xE4, 0xA5, 0xA3, 0x70, 0x3A, 0xA6, 0x4C, 0x9F, 0x42, 0xBC]
        result = mix_columns(data)
        self.assertEqual(result, expected)

    def test_mix_columns_with_custom_matrix(self):
        data = [0x87, 0x6E, 0x46, 0xA6, 0xF2, 0x4C, 0xE7, 0x8C, 0x4D, 0x90, 0x4A, 0xD8, 0x97, 0xEC, 0xC3, 0x95]
        custom_matrix = ((1, 1, 1, 1), (1, 1, 1, 1), (1, 1, 1, 1), (1, 1, 1, 1))
        expected = [0xE1, 0xE1, 0xE1, 0xE1, 0xE1, 0xE1, 0xE1, 0xE1, 0xE1, 0xE1, 0xE1, 0xE1, 0xE1, 0xE1, 0xE1, 0xE1]
        result = mix_columns(data, custom_matrix)
        self.assertEqual(result, expected)

    def test_key_expansion(self):
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x9f, 0x24, 0x30, 0xc0, 0x8d]
        expected = [
            [0x2b, 0x7e, 0x15, 0x16], [0x28, 0xae, 0xd2, 0xa6], [0xab, 0xf7, 0xcf, 0x9f], [0x24, 0x30, 0xc0, 0x8d],
            [0xa0, 0xfa, 0xfe, 0x17], [0x88, 0x54, 0x2c, 0xb1], [0x23, 0xa3, 0x39, 0x39], [0x2a, 0x6c, 0x76, 0x05],
            [0xf2, 0xc2, 0x95, 0xf2], [0x7a, 0x96, 0xb9, 0x43], [0x59, 0x35, 0x80, 0x7a], [0x73, 0x59, 0xf6, 0x7f],
            [0x3d, 0x80, 0x47, 0x7d], [0x47, 0x16, 0xfe, 0x3e], [0x1e, 0x23, 0x7e, 0x44], [0x6d, 0x7a, 0x88, 0x3b],
            [0xef, 0x44, 0xa5, 0x41], [0xa8, 0x52, 0x5b, 0x7f], [0xb6, 0x71, 0x25, 0x3b], [0xdb, 0x0b, 0xad, 0x00],
            [0xd4, 0xd1, 0xc6, 0xf8], [0x7c, 0x83, 0x9d, 0x87], [0xca, 0xf2, 0xb8, 0xbc], [0x11, 0xf9, 0x15, 0xbc],
            [0x6d, 0x88, 0xa3, 0x7a], [0x11, 0x0b, 0x3e, 0xfd], [0xdb, 0xf9, 0x86, 0x41], [0xca, 0x00, 0x93, 0xfd],
            [0x4e, 0x54, 0xf7, 0x0e], [0x5f, 0x5f, 0xc9, 0xf3], [0x84, 0xa6, 0x4f, 0xb2], [0x4e, 0xa6, 0xdc, 0x4f],
            [0xea, 0xd2, 0x73, 0x21], [0xb5, 0x8d, 0xba, 0xd2], [0x31, 0x2b, 0xf5, 0x60], [0x7f, 0x8d, 0x29, 0x2f],
            [0xac, 0x77, 0x66, 0xf3], [0x19, 0xfa, 0xdc, 0x21], [0x28, 0xd1, 0x29, 0x41], [0x57, 0x5c, 0x00, 0x6e],
            [0xd0, 0x14, 0xf9, 0xa8], [0xc9, 0xee, 0x25, 0x89], [0xe1, 0x3f, 0x0c, 0xc8], [0xb6, 0x63, 0x0c, 0xa6]
        ]
        result = key_expansion(key)
        self.assertEqual(result, expected)

    def test_aes_encrypt(self):
        plaintext = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x9f, 0x24, 0x30, 0xc0, 0x8d]
        expected = [0x39, 0x25, 0x84, 0x1d, 0x02, 0xdc, 0x09, 0xfb, 0xdc, 0x11, 0x85, 0x97, 0x19, 0x6a, 0x0b, 0x32]
        result = aes_encrypt(plaintext, key)
        self.assertEqual(result, expected)

    def test_aes_ctr_decrypt(self):
        ciphertext = [0x39, 0x25, 0x84, 0x1d, 0x02, 0xdc, 0x09, 0xfb, 0xdc, 0x11, 0x85, 0x97, 0x19, 0x6a, 0x0b, 0x32]
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x9f, 0x24, 0x30, 0xc0, 0x8d]
        iv = [0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00]
        expected = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        result = aes_ctr_decrypt(ciphertext, key, iv)
        self.assertEqual(result, expected)

    def test_aes_cbc_decrypt(self):
        ciphertext = [0x39, 0x25, 0x84, 0x1d, 0x02, 0xdc, 0x09, 0xfb, 0xdc, 0x11, 0x85, 0x97, 0x19, 0x6a, 0x0b, 0x32]
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x9f, 0x24, 0x30, 0xc0, 0x8d]
        iv = [0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00]
        expected = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        result = aes_cbc_decrypt(ciphertext, key, iv)
        self.assertEqual(result, expected)

    def test_aes_decrypt_text(self):
        ciphertext = "3925841d02dc09fbdc118597196a0b32"
        key = "2b7e151628aed2a6abf7cf9f2430c08d"
        iv = "00000000000000000000000000000000"
        expected = "3243f6a8885a308d313198a2e0370734"
        result = aes_decrypt_text(ciphertext, key, iv)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()