import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_mix_columns_inv(self):
        data = b'\x01\x02\x03\x04'
        result = mix_columns_inv(data)
        self.assertEqual(result, b'\x14\x11\x13\x09')

    def test_key_expansion(self):
        key = b'\x01\x02\x03\x04\x05\x06\x07\x08'
        result = key_expansion(key)
        self.assertIsNotNone(result)

    def test_aes_encrypt(self):
        data = b'\x01\x02\x03\x04'
        key = b'\x01\x02\x03\x04\x05\x06\x07\x08'
        result = aes_encrypt(data, key)
        self.assertIsNotNone(result)

    def test_aes_ctr_decrypt(self):
        data = b'\x01\x02\x03\x04'
        key = b'\x01\x02\x03\x04\x05\x06\x07\x08'
        nonce = b'\x01\x02\x03\x04'
        result = aes_ctr_decrypt(data, key, nonce)
        self.assertIsNotNone(result)

    def test_aes_cbc_decrypt(self):
        data = b'\x01\x02\x03\x04'
        key = b'\x01\x02\x03\x04\x05\x06\x07\x08'
        iv = b'\x01\x02\x03\x04'
        result = aes_cbc_decrypt(data, key, iv)
        self.assertIsNotNone(result)

    def test_aes_decrypt_text(self):
        data = b'\x01\x02\x03\x04'
        key = b'\x01\x02\x03\x04\x05\x06\x07\x08'
        result = aes_decrypt_text(data, key)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()