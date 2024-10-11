import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_sub_bytes(self):
        data = [1, 2, 3, 4]
        result = sub_bytes(data)
        self.assertEqual(result, [99, 124, 119, 123])

    def test_key_expansion(self):
        pass

    def test_aes_ctr_decrypt(self):
        pass

    def test_aes_cbc_decrypt(self):
        pass

    def test_aes_decrypt_text(self):
        pass

if __name__ == '__main__':
    unittest.main()