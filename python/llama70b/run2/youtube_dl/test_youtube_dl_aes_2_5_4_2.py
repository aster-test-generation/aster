import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_sub_bytes_inv(self):
        data = [0x12, 0x34, 0x56, 0x78]
        result = sub_bytes_inv(data)
        self.assertEqual(result, [SBOX_INV[x] for x in data])

    def test_key_expansion(self):
        key = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        result = key_expansion(key)
        self.assertIsNotNone(result)

    def test_aes_encrypt(self):
        data = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        key = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        result = aes_encrypt(data, key)
        self.assertIsNotNone(result)

    def test_aes_ctr_decrypt(self):
        data = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        key = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        nonce = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        result = aes_ctr_decrypt(data, key, nonce)
        self.assertIsNotNone(result)

    def test_aes_cbc_decrypt(self):
        data = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        key = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        iv = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        result = aes_cbc_decrypt(data, key, iv)
        self.assertIsNotNone(result)

    def test_aes_decrypt_text(self):
        data = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        key = b'\x00\x01\x02\x03\x04\x05\x06\x07\x08\x09\x10\x11\x12\x13\x14\x15'
        result = aes_decrypt_text(data, key)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()