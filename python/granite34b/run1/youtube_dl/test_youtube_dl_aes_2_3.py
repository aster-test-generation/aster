from unittest import TestCase
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(TestCase):
    def test_aes_encrypt(self):
        key = b'0123456789abcdef'
        data = b'0123456789abcdef'
        expected = b'\x8e\xa2\xb7\x1c\x94\x7d\x55\x9b\x34\x91\x6c\x40\x80\xff\x48\x23'
        actual = aes_encrypt(data, key)
        self.assertEqual(actual, expected)

    def test_key_expansion(self):
        key = b'0123456789abcdef'
        expected = [
            b'\x01\x23\x45\x67\x89\xab\xcd\xef',
            b'\xd6\xaa\x74\xfd\xd2\xaf\x72\xf5',
            b'\x24\x3f\x6a\x88\x85\xa3\x08\xd3',
            b'\x13\x19\x8a\x2e\x03\x70\x73\x44',
            b'\xa4\x54\x99\x7e\x17\x6f\x0d\x41',
            b'\x4b\x7a\x70\xf9\x75\xe8\x5d\x33',
            b'\x4b\x7a\x70\xf9\x75\xe8\x5d\x33',
            b'\x4b\x7a\x70\xf9\x75\xe8\x5d\x33'
        ]
        actual = key_expansion(key)
        self.assertEqual(actual, expected)

    def test_aes_ctr_decrypt(self):
        key = b'0123456789abcdef'
        counter = b'\x00\x00\x00\x00\x00\x00\x00\x00'
        data = b'\x8e\xa2\xb7\x1c\x94\x7d\x55\x9b\x34\x91\x6c\x40\x80\xff\x48\x23'
        expected = b'0123456789abcdef'
        actual = aes_ctr_decrypt(data, key, counter)
        self.assertEqual(actual, expected)

    def test_aes_cbc_decrypt(self):
        key = b'0123456789abcdef'
        iv = b'0123456789abcdef'
        data = b'\x8e\xa2\xb7\x1c\x94\x7d\x55\x9b\x34\x91\x6c\x40\x80\xff\x48\x23'
        expected = b'0123456789abcdef'
        actual = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(actual, expected)

    def test_aes_decrypt_text(self):
        key = b'0123456789abcdef'
        iv = b'0123456789abcdef'
        data = b'0123456789abcdef'
        expected = b'0123456789abcdef'
        actual = aes_decrypt_text(data, key, iv)
        self.assertEqual(actual, expected)

if __name__ == '__main__':
    unittest.main()