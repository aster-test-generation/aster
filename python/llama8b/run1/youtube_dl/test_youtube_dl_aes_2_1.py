import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_ctr_decrypt(self):
        key = bytes_to_intlist(b'\x00' * 16)
        counter = Counter()
        data = b'\x01' * 16
        result = aes_ctr_decrypt(data, key, counter)
        self.assertEqual(len(result), len(data))
        self.assertEqual(result, data)

    def test_aes_ctr_decrypt_empty(self):
        key = bytes_to_intlist(b'\x00' * 16)
        counter = Counter()
        result = aes_ctr_decrypt(b'', key, counter)
        self.assertEqual(result, b'')

    def test_aes_ctr_decrypt_invalid_key(self):
        key = bytes_to_intlist(b'\x00' * 15)
        counter = Counter()
        data = b'\x01' * 16
        with self.assertRaises(ValueError):
            aes_ctr_decrypt(data, key, counter)

    def test_aes_ctr_decrypt_invalid_data(self):
        key = bytes_to_intlist(b'\x00' * 16)
        counter = Counter()
        data = b'\x01' * 15
        with self.assertRaises(ValueError):
            aes_ctr_decrypt(data, key, counter)

    def test_aes_ctr_decrypt_invalid_counter(self):
        key = bytes_to_intlist(b'\x00' * 16)
        counter = Counter()
        data = b'\x01' * 16
        with self.assertRaises(ValueError):
            aes_ctr_decrypt(data, key, None)

    def test_key_expansion(self):
        key = bytes_to_intlist(b'\x00' * 16)
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_key_expansion_invalid_key(self):
        key = bytes_to_intlist(b'\x00' * 15)
        with self.assertRaises(ValueError):
            key_expansion(key)

    def test_key_expansion_invalid_key_length(self):
        key = bytes_to_intlist(b'\x00' * 17)
        with self.assertRaises(ValueError):
            key_expansion(key)

    def test_aes_encrypt(self):
        key = bytes_to_intlist(b'\x00' * 16)
        data = bytes_to_intlist(b'\x01' * 16)
        result = aes_encrypt(data, key)
        self.assertEqual(len(result), len(data))

    def test_aes_encrypt_invalid_key(self):
        key = bytes_to_intlist(b'\x00' * 15)
        data = bytes_to_intlist(b'\x01' * 16)
        with self.assertRaises(ValueError):
            aes_encrypt(data, key)

    def test_aes_encrypt_invalid_data(self):
        key = bytes_to_intlist(b'\x00' * 16)
        data = bytes_to_intlist(b'\x01' * 15)
        with self.assertRaises(ValueError):
            aes_encrypt(data, key)

    def test_xor(self):
        data = bytes_to_intlist(b'\x01' * 16)
        key = bytes_to_intlist(b'\x00' * 16)
        result = xor(data, key)
        self.assertEqual(len(result), len(data))

    def test_xor_invalid_data(self):
        data = bytes_to_intlist(b'\x01' * 15)
        key = bytes_to_intlist(b'\x00' * 16)
        with self.assertRaises(ValueError):
            xor(data, key)

    def test_xor_invalid_key(self):
        data = bytes_to_intlist(b'\x01' * 16)
        key = bytes_to_intlist(b'\x00' * 15)
        with self.assertRaises(ValueError):
            xor(data, key)

if __name__ == '__main__':
    unittest.main()