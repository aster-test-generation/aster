import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAes(unittest.TestCase):
    def test_sub_bytes(self):
        result = sub_bytes([1, 2, 3, 4])
        self.assertEqual(result, [99, 124, 119, 123])

    def test_key_expansion(self):
        result = key_expansion([1, 2, 3, 4])
        self.assertEqual(result, [1, 2, 3, 4])

    def test_aes_ctr_decrypt(self):
        result = aes_ctr_decrypt([1, 2, 3, 4])
        self.assertEqual(result, [1, 2, 3, 4])

    def test_aes_cbc_decrypt(self):
        result = aes_cbc_decrypt([1, 2, 3, 4])
        self.assertEqual(result, [1, 2, 3, 4])

    def test_aes_decrypt_text(self):
        result = aes_decrypt_text([1, 2, 3, 4])
        self.assertEqual(result, [1, 2, 3, 4])

if __name__ == '__main__':
    unittest.main()