import unittest
from youtube_dl.aes import *


class TestAES(unittest.TestCase):
    def test_aes_cbc_decrypt(self):
        key = bytes_to_intlist(b'\x00' * 16)
        iv = bytes_to_intlist(b'\x00' * 16)
        data = bytes_to_intlist(b'\x01' * 16)
        result = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(len(result), 16)
        for i in range(16):
            self.assertEqual(result[i], 1)

    def test_key_expansion(self):
        key = bytes_to_intlist(b'\x00' * 16)
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_decrypt(self):
        key = bytes_to_intlist(b'\x00' * 16)
        data = bytes_to_intlist(b'\x01' * 16)
        result = aes_decrypt(data, key)
        self.assertEqual(len(result), 16)
        for i in range(16):
            self.assertEqual(result[i], 1)

    def test_xor(self):
        data1 = bytes_to_intlist(b'\x01' * 16)
        data2 = bytes_to_intlist(b'\x02' * 16)
        result = xor(data1, data2)
        self.assertEqual(len(result), 16)
        for i in range(16):
            self.assertEqual(result[i], 3)

    def test_bytes_to_intlist(self):
        data = b'\x01\x02\x03\x04\x05\x06\x07\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f'
        result = bytes_to_intlist(data)
        self.assertEqual(len(result), 16)
        for i in range(16):
            self.assertEqual(result[i], int.from_bytes(data[i:i+1], 'big'))

    def test_intlist_to_bytes(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = intlist_to_bytes(data)
        self.assertEqual(len(result), 16)
        for i in range(16):
            self.assertEqual(result[i:i+1], bytes([data[i]]))

if __name__ == '__main__':
    unittest.main()