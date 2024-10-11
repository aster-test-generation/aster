import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_sub_bytes(self):
        data = [1, 2, 3, 4]
        result = sub_bytes(data)
        self.assertEqual(result, [99, 124, 119, 123])

    def test_sub_bytes_private(self):
        data = [1, 2, 3, 4]
        result = _sub_bytes_private(data)
        self.assertEqual(result, [99, 124, 119, 123])

    def test_sub_bytes_magic(self):
        data = [1, 2, 3, 4]
        result = __sub_bytes_magic(data)
        self.assertEqual(result, [99, 124, 119, 123])

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_encrypt(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_encrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_aes_decrypt(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_decrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_ctr_decrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_aes_cbc_decrypt(self):
        data = [1, 2, 3, 4]
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_cbc_decrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_aes_decrypt_text(self):
        text = "Hello, World!"
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_decrypt_text(text, key)
        self.assertEqual(result, "Hello, World!")

if __name__ == '__main__':
    unittest.main()