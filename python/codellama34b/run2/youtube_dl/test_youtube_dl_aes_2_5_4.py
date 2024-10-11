import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAes(unittest.TestCase):
    def test_mix_columns_inv(self):
        result = mix_columns_inv(1)
        self.assertEqual(result, 1)

    def test_key_expansion(self):
        result = key_expansion(1)
        self.assertEqual(result, 1)

    def test_aes_ctr_decrypt(self):
        result = aes_ctr_decrypt(1)
        self.assertEqual(result, 1)

    def test_aes_cbc_decrypt(self):
        result = aes_cbc_decrypt(1)
        self.assertEqual(result, 1)

    def test_aes_decrypt_text(self):
        result = aes_decrypt_text(1)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()