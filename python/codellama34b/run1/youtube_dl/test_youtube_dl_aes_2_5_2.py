import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAes(unittest.TestCase):
    def test_aes_decrypt(self):
        data = b'data'
        expanded_key = b'expanded_key'
        result = aes_decrypt(data, expanded_key)
        self.assertEqual(result, b'result')

    def test_key_expansion(self):
        key = b'key'
        result = key_expansion(key)
        self.assertEqual(result, b'result')

    def test_aes_ctr_decrypt(self):
        data = b'data'
        expanded_key = b'expanded_key'
        nonce = b'nonce'
        result = aes_ctr_decrypt(data, expanded_key, nonce)
        self.assertEqual(result, b'result')

    def test_aes_cbc_decrypt(self):
        data = b'data'
        expanded_key = b'expanded_key'
        iv = b'iv'
        result = aes_cbc_decrypt(data, expanded_key, iv)
        self.assertEqual(result, b'result')

    def test_aes_decrypt_text(self):
        data = b'data'
        expanded_key = b'expanded_key'
        nonce = b'nonce'
        result = aes_decrypt_text(data, expanded_key, nonce)
        self.assertEqual(result, b'result')

    def test_xor(self):
        data = b'data'
        expanded_key = b'expanded_key'
        result = xor(data, expanded_key)
        self.assertEqual(result, b'result')

    def test_mix_columns_inv(self):
        data = b'data'
        result = mix_columns_inv(data)
        self.assertEqual(result, b'result')

    def test_shift_rows_inv(self):
        data = b'data'
        result = shift_rows_inv(data)
        self.assertEqual(result, b'result')

    def test_sub_bytes_inv(self):
        data = b'data'
        result = sub_bytes_inv(data)
        self.assertEqual(result, b'result')

if __name__ == '__main__':
    unittest.main()