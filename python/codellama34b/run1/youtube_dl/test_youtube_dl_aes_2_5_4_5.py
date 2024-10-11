import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAes(unittest.TestCase):
    def test_xor(self):
        result = xor([1, 2, 3], [4, 5, 6])
        self.assertEqual(result, [5, 7, 3])

    def test_key_expansion(self):
        pass

    def test_aes_encrypt(self):
        pass

    def test_aes_ctr_decrypt(self):
        pass

    def test_aes_cbc_decrypt(self):
        pass

    def test_aes_decrypt_text(self):
        pass

if __name__ == '__main__':
    unittest.main()