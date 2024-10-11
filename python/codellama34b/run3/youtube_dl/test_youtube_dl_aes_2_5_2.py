import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_aes_decrypt(self):
        data = b'test'
        expanded_key = b'test'
        result = aes_decrypt(data, expanded_key)
        self.assertEqual(result, b'test')

    def test_key_expansion(self):
        key = b'test'
        result = key_expansion(key)
        self.assertEqual(result, b'test')

    def test_aes_ctr_decrypt(self):
        data = b'test'
        expanded_key = b'test'
        result = aes_ctr_decrypt(data, expanded_key)
        self.assertEqual(result, b'test')

    def test_aes_cbc_decrypt(self):
        data = b'test'
        expanded_key = b'test'
        result = aes_cbc_decrypt(data, expanded_key)
        self.assertEqual(result, b'test')

    def test_aes_decrypt_text(self):
        data = b'test'
        expanded_key = b'test'
        result = aes_decrypt_text(data, expanded_key)
        self.assertEqual(result, b'test')

    def test_xor(self):
        data = b'test'
        expanded_key = b'test'
        result = xor(data, expanded_key)
        self.assertEqual(result, b'test')

    def test_mix_columns_inv(self):
        data = b'test'
        result = mix_columns_inv(data)
        self.assertEqual(result, b'test')

    def test_shift_rows_inv(self):
        data = b'test'
        result = shift_rows_inv(data)
        self.assertEqual(result, b'test')

    def test_sub_bytes_inv(self):
        data = b'test'
        result = sub_bytes_inv(data)
        self.assertEqual(result, b'test')

if __name__ == '__main__':
    unittest.main()