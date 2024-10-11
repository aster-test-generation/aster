import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_sub_bytes_inv(self):
        data = [1, 2, 3, 4]
        expected = [99, 124, 119, 123]
        result = sub_bytes_inv(data)
        self.assertEqual(result, expected)

    def test_sub_bytes_inv_private_method(self):
        data = [1, 2, 3, 4]
        expected = [82, 9, 106, 213]
        result = _sub_bytes_inv(data)
        self.assertEqual(result, expected)

    def test_sub_bytes_inv_protected_method(self):
        data = [1, 2, 3, 4]
        expected = [82, 9, 106, 213]
        result = _AES__sub_bytes_inv(data)
        self.assertEqual(result, expected)

    def test_sub_bytes_inv_magic_method(self):
        data = [1, 2, 3, 4]
        expected = [82, 9, 106, 213]
        result = _AES__sub_bytes_inv(data)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()