import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAesFunctions(unittest.TestCase):
    def test_aes_encrypt(self):
        data = bytes([0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34])
        expanded_key = bytes([0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d,
                              0xa0, 0xf8, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88])
        result = aes_encrypt(data, expanded_key)
        expected = bytes([0x39, 0x25, 0x84, 0x1d, 0x02, 0xdc, 0x09, 0xfb, 0xdc, 0x11, 0x85, 0x97, 0x19, 0x6a, 0x0b, 0x32])
        self.assertEqual(result, expected)

    def test_key_expansion(self):
        key = bytes([0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d])
        result = key_expansion(key)
        expected = bytes([0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d,
                          0xa0, 0xf8, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88, 0x88])
        self.assertEqual(result, expected)

    def test_aes_ctr_decrypt(self):
        data = bytes([0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34])
        key = bytes([0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d])
        iv = bytes([0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00])
        result = aes_ctr_decrypt(data, key, iv)
        expected = bytes([0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34])
        self.assertEqual(result, expected)

    def test_aes_cbc_decrypt(self):
        data = bytes([0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34])
        key = bytes([0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x4d, 0x4d, 0x4d, 0x4d, 0x4d])
        iv = bytes([0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00])
        result = aes_cbc_decrypt(data, key, iv)
        expected = bytes([0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34])
        self.assertEqual(result, expected)

    def test_aes_decrypt_text(self):
        data = "3243f6a8885a308d313198a2e0370734"
        key = "2b7e151628aed2a6abf7cf4d4d4d4d4d"
        iv = "00000000000000000000000000000000"
        result = aes_decrypt_text(data, key, iv)
        expected = "3243f6a8885a308d313198a2e0370734"
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()