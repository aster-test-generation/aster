import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_aes_ctr_decrypt(self):
        data = b'example data'
        key = b'example key'
        counter = Counter(b'example counter')
        decrypted_data = aes_ctr_decrypt(data, key, counter)
        self.assertEqual(decrypted_data, b'example data')

    def test_key_expansion(self):
        key = b'example key'
        expanded_key = key_expansion(key)
        self.assertEqual(expanded_key, [0] * 44)

    def test_aes_cbc_decrypt(self):
        data = b'example data'
        key = b'example key'
        iv = b'example iv'
        decrypted_data = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(decrypted_data, b'example data')

    def test_aes_decrypt_text(self):
        data = b'example data'
        key = b'example key'
        decrypted_data = aes_decrypt_text(data, key)
        self.assertEqual(decrypted_data, b'example data')

if __name__ == '__main__':
    unittest.main()