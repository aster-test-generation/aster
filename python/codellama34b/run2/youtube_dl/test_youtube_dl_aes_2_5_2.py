import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAes(unittest.TestCase):
    def test_aes_decrypt(self):
        data = bytes_to_intlist(b'test')
        expanded_key = bytes_to_intlist(b'test')
        result = aes_decrypt(data, expanded_key)
        self.assertEqual(result, data)

    def test_key_expansion(self):
        key = bytes_to_intlist(b'test')
        result = key_expansion(key)
        self.assertEqual(result, key)

    def test_mix_columns_inv(self):
        data = bytes_to_intlist(b'test')
        result = mix_columns_inv(data)
        self.assertEqual(result, data)

    def test_shift_rows_inv(self):
        data = bytes_to_intlist(b'test')
        result = shift_rows_inv(data)
        self.assertEqual(result, data)

    def test_sub_bytes_inv(self):
        data = bytes_to_intlist(b'test')
        result = sub_bytes_inv(data)
        self.assertEqual(result, data)

    def test_xor(self):
        data = bytes_to_intlist(b'test')
        expanded_key = bytes_to_intlist(b'test')
        result = xor(data, expanded_key)
        self.assertEqual(result, data)

if __name__ == '__main__':
    unittest.main()