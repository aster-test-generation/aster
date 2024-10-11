import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_aes_encrypt(self):
        data = b'\x00' * 16
        expanded_key = b'\x01' * 176
        result = aes_encrypt(data, expanded_key)
        self.assertEqual(len(result), 16)

    def test_key_expansion(self):
        key = b'\x01' * 16
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_ctr_decrypt(self):
        data = b'\x00' * 16
        key = b'\x01' * 16
        nonce = b'\x00' * 16
        result = aes_ctr_decrypt(data, key, nonce)
        self.assertEqual(len(result), 16)

    def test_aes_cbc_decrypt(self):
        data = b'\x00' * 16
        key = b'\x01' * 16
        iv = b'\x00' * 16
        result = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(len(result), 16)

    def test_aes_decrypt_text(self):
        data = b'\x00' * 16
        key = b'\x01' * 16
        result = aes_decrypt_text(data, key)
        self.assertEqual(len(result), 16)

    def test_sub_bytes(self):
        data = [0x00] * 16
        result = sub_bytes(data)
        self.assertEqual(len(result), 16)

    def test_shift_rows(self):
        data = [0x00] * 16
        result = shift_rows(data)
        self.assertEqual(len(result), 16)

    def test_mix_columns(self):
        data = [0x00] * 16
        result = mix_columns(data)
        self.assertEqual(len(result), 16)

    def test_xor(self):
        data1 = [0x00] * 16
        data2 = [0x01] * 16
        result = xor(data1, data2)
        self.assertEqual(len(result), 16)

    def test__private_method(self):
        # Test a private method (starting with double underscores)
        result = _youtube_dl_aes__private_method(b'\x00' * 16)
        self.assertEqual(len(result), 16)

    def test__protected_method(self):
        # Test a protected method (starting with a single underscore)
        result = _youtube_dl_aes_protected_method(b'\x00' * 16)
        self.assertEqual(len(result), 16)

if __name__ == '__main__':
    unittest.main()