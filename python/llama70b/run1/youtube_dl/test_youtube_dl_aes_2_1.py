import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesCtrDecrypt(unittest.TestCase):
    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        counter = lambda: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = aes_ctr_decrypt(data, key, counter)
        self.assertEqual(result, data)

class TestKeyExpansion(unittest.TestCase):
    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = key_expansion(key)
        self.assertIsNotNone(result)

class TestAesEncrypt(unittest.TestCase):
    def test_aes_encrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = aes_encrypt(data, key)
        self.assertIsNotNone(result)

class TestXor(unittest.TestCase):
    def test_xor(self):
        a = [1, 2, 3, 4]
        b = [5, 6, 7, 8]
        result = xor(a, b)
        self.assertEqual(result, [6, 4, 2, 12])

class TestCompatB64Decode(unittest.TestCase):
    def test_compat_b64decode(self):
        encoded = 'SGVsbG8gd29ybGQh'
        result = compat_b64decode(encoded)
        self.assertEqual(result, b'Hello world!')

class TestBytesToIntlist(unittest.TestCase):
    def test_bytes_to_intlist(self):
        bytes_data = b'\x01\x02\x03\x04'
        result = bytes_to_intlist(bytes_data)
        self.assertEqual(result, [1, 2, 3, 4])

class TestIntlistToBytes(unittest.TestCase):
    def test_intlist_to_bytes(self):
        intlist = [1, 2, 3, 4]
        result = intlist_to_bytes(intlist)
        self.assertEqual(result, b'\x01\x02\x03\x04')

if __name__ == '__main__':
    unittest.main()