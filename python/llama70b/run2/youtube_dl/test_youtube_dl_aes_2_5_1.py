import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_aes_encrypt(self):
        data = b'\x00' * 16
        expanded_key = b'\x01' * 176
        result = aes_encrypt(data, expanded_key)
        self.assertEqual(len(result), 16)

    def test_key_expansion(self):
        key = b'\x00' * 16
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_ctr_decrypt(self):
        data = b'\x00' * 16
        key = b'\x01' * 16
        nonce = b'\x02' * 16
        result = aes_ctr_decrypt(data, key, nonce)
        self.assertEqual(len(result), 16)

    def test_aes_cbc_decrypt(self):
        data = b'\x00' * 16
        key = b'\x01' * 16
        iv = b'\x02' * 16
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

    def test_bytes_to_intlist(self):
        data = b'\x00' * 16
        result = bytes_to_intlist(data)
        self.assertEqual(len(result), 16)

    def test_intlist_to_bytes(self):
        data = [0] * 16
        result = intlist_to_bytes(data)
        self.assertEqual(len(result), 16)

    def test_compat_b64decode(self):
        data = b'AAAA'
        result = compat_b64decode(data)
        self.assertEqual(len(result), 3)

if __name__ == '__main__':
    unittest.main()