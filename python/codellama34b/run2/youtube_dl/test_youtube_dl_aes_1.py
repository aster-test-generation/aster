import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_aes_encrypt(self):
        result = aes_encrypt(b'test', b'test')
        self.assertEqual(result, b'test')

    def test_key_expansion(self):
        result = key_expansion(b'test')
        self.assertEqual(result, b'test')

    def test_aes_ctr_decrypt(self):
        result = aes_ctr_decrypt(b'test', b'test')
        self.assertEqual(result, b'test')

    def test_aes_cbc_decrypt(self):
        result = aes_cbc_decrypt(b'test', b'test')
        self.assertEqual(result, b'test')

    def test_aes_decrypt_text(self):
        result = aes_decrypt_text(b'test', b'test')
        self.assertEqual(result, b'test')

if __name__ == '__main__':
    unittest.main()