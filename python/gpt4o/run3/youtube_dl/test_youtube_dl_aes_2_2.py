import unittest
from youtube_dl.utils import aes_encrypt


class TestAESFunctions(unittest.TestCase):
    def test_aes_cbc_decrypt(self):
        data = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0x4d, 0x4d, 0x9a, 0x1f, 0x9b, 0x1b]
        iv = [0x00] * 16
        result = aes_cbc_decrypt(data, key, iv)
        expected = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        self.assertEqual(result, expected)

    def test_key_expansion(self):
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0x4d, 0x4d, 0x9a, 0x1f, 0x9b, 0x1b]
        result = key_expansion(key)
        expected = [
            [0x2b, 0x7e, 0x15, 0x16], [0x28, 0xae, 0xd2, 0xa6], [0xab, 0xf7, 0x4d, 0x4d], [0x9a, 0x1f, 0x9b, 0x1b],
            [0xa0, 0xfa, 0xfe, 0x17], [0x88, 0x54, 0x2c, 0xb1], [0x23, 0xa3, 0x39, 0x39], [0x2a, 0x6c, 0x76, 0x05],
            [0xf2, 0xc2, 0x95, 0xf2], [0x7a, 0x96, 0xb9, 0x43], [0x59, 0x35, 0x80, 0x7a], [0x73, 0x59, 0xf6, 0x7f],
            [0x3d, 0x80, 0x47, 0x7d], [0x47, 0x16, 0xfe, 0x3e], [0x1e, 0x23, 0x7e, 0x44], [0x6d, 0x7a, 0x88, 0x3b],
            [0xef, 0x44, 0xa5, 0x41], [0xa8, 0x52, 0x5b, 0x7f], [0xb6, 0x71, 0x25, 0x3b], [0xdb, 0x0b, 0xad, 0x00],
            [0xd4, 0xd1, 0xc6, 0xf8], [0x7c, 0x83, 0x9d, 0x87], [0xca, 0xf2, 0xb8, 0xbc], [0x11, 0xf9, 0x15, 0xbc],
            [0x6d, 0x88, 0xa3, 0x7a], [0x11, 0x0b, 0x3e, 0xfd], [0xdb, 0xf9, 0x86, 0x41], [0xca, 0x00, 0x93, 0xfd],
            [0x4e, 0x54, 0xf7, 0x0e], [0x5f, 0x5f, 0xc9, 0x87], [0x3c, 0xa0, 0xe6, 0x12], [0x3c, 0xd0, 0x68, 0x17],
            [0x6a, 0x7b, 0x87, 0x6a], [0x9d, 0x6c, 0x11, 0xd9], [0x6d, 0x88, 0xa3, 0x7a], [0x11, 0x0b, 0x3e, 0xfd],
            [0xdb, 0xf9, 0x86, 0x41], [0xca, 0x00, 0x93, 0xfd], [0x4e, 0x54, 0xf7, 0x0e], [0x5f, 0x5f, 0xc9, 0x87],
            [0x3c, 0xa0, 0xe6, 0x12], [0x3c, 0xd0, 0x68, 0x17], [0x6a, 0x7b, 0x87, 0x6a], [0x9d, 0x6c, 0x11, 0xd9]
        ]
        self.assertEqual(result, expected)

    def test_aes_ctr_decrypt(self):
        data = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0x4d, 0x4d, 0x9a, 0x1f, 0x9b, 0x1b]
        iv = [0x00] * 16
        result = aes_ctr_decrypt(data, key, iv)
        expected = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        self.assertEqual(result, expected)

    def test_aes_decrypt_text(self):
        data = "example text"
        key = "example key"
        result = aes_decrypt_text(data, key)
        expected = "example text"
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()