import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_encrypt(self):
        data = b'\x00' * 16
        expanded_key = b'\x01' * 176
        result = aes_encrypt(data, expanded_key)
        self.assertEqual(len(result), 16)

    def test_key_expansion(self):
        key = b'\x01' * 16
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 176)

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
        data = b'\x00' * 16
        result = sub_bytes(data)
        self.assertEqual(len(result), 16)

    def test_shift_rows(self):
        data = b'\x00' * 16
        result = shift_rows(data)
        self.assertEqual(len(result), 16)

    def test_mix_columns(self):
        data = b'\x00' * 16
        result = mix_columns(data)
        self.assertEqual(len(result), 16)

    def test_xor(self):
        data1 = b'\x00' * 16
        data2 = b'\x01' * 16
        result = xor(data1, data2)
        self.assertEqual(len(result), 16)

    def test___init__(self):
        aes = AES()
        self.assertIsInstance(aes, AES)

    def test___str__(self):
        aes = AES()
        result = str(aes)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        aes = AES()
        result = repr(aes)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        aes1 = AES()
        aes2 = AES()
        self.assertTrue(aes1 == aes2)

if __name__ == '__main__':
    unittest.main()