import unittest
from youtube_dl.aes import *


class TestAes(unittest.TestCase):
    def test_shift_rows(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = shift_rows(data)
        self.assertEqual(result, [2, 4, 6, 8, 10, 12, 14, 16, 1, 3, 5, 7, 9, 11, 13, 15])

    def test_shift_rows_private(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = _aes__shift_rows(data)
        self.assertEqual(result, [2, 4, 6, 8, 10, 12, 14, 16, 1, 3, 5, 7, 9, 11, 13, 15])

    def test_shift_rows_protected(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = _aes_shift_rows(data)
        self.assertEqual(result, [2, 4, 6, 8, 10, 12, 14, 16, 1, 3, 5, 7, 9, 11, 13, 15])

    def test_magic_methods(self):
        obj = aes_encrypt()
        self.assertEqual(str(obj), "aes_encrypt")
        self.assertEqual(repr(obj), "aes_encrypt()")

    def test_magic_methods_private(self):
        obj = _aes__aes_encrypt()
        self.assertEqual(str(obj), "_aes__aes_encrypt")
        self.assertEqual(repr(obj), "_aes__aes_encrypt()")

    def test_magic_methods_protected(self):
        obj = _aes_aes_encrypt()
        self.assertEqual(str(obj), "_aes_aes_encrypt")
        self.assertEqual(repr(obj), "_aes_aes_encrypt()")

if __name__ == '__main__':
    unittest.main()