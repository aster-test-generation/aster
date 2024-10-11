import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAes(unittest.TestCase):
    def test_sub_bytes(self):
        data = [1, 2, 3, 4]
        result = sub_bytes(data)
        self.assertEqual(result, [99, 124, 119, 123])

    def test_sub_bytes_private(self):
        data = [1, 2, 3, 4]
        result = _sub_bytes(data)
        self.assertEqual(result, [99, 124, 119, 123])

    def test_mix_column(self):
        data = [1, 2, 3, 4]
        result = mix_column(data)
        self.assertEqual(result, [14, 11, 13, 9])

    def test_mix_column_private(self):
        data = [1, 2, 3, 4]
        result = _mix_column(data)
        self.assertEqual(result, [14, 11, 13, 9])

    def test_aes_encrypt(self):
        data = [1, 2, 3, 4]
        result = aes_encrypt(data)
        self.assertEqual(result, [99, 124, 119, 123])

    def test_aes_decrypt(self):
        data = [99, 124, 119, 123]
        result = aes_decrypt(data)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_key_expansion(self):
        key = [1, 2, 3, 4]
        result = key_expansion(key)
        self.assertEqual(result, [[1, 2, 3, 4], [5, 6, 7, 8]])

    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4]
        result = aes_ctr_decrypt(data)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_aes_cbc_decrypt(self):
        data = [1, 2, 3, 4]
        result = aes_cbc_decrypt(data)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_aes_decrypt_text(self):
        data = "Hello, World!"
        result = aes_decrypt_text(data)
        self.assertEqual(result, "Hello, World!")

if __name__ == '__main__':
    unittest.main()