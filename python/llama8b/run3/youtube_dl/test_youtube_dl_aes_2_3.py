import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_cbc_encrypt(self):
        key = b'key123'
        iv = b'iv123'
        data = b'hello world'
        result = aes_cbc_encrypt(data, key, iv)
        self.assertEqual(len(result), len(data) + BLOCK_SIZE_BYTES)

    def test_key_expansion(self):
        key = b'key123'
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_encrypt(self):
        key = b'key123'
        data = b'hello world'
        result = aes_encrypt(data, key)
        self.assertEqual(len(result), len(data))

    def test_xor(self):
        a = b'hello'
        b = b'world'
        result = xor(a, b)
        self.assertEqual(len(result), len(a) + len(b))

    def test_aes_cbc_decrypt(self):
        key = b'key123'
        iv = b'iv123'
        data = aes_cbc_encrypt(b'hello world', key, iv)
        result = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(result, b'hello world')

    def test_aes_decrypt_text(self):
        key = b'key123'
        data = aes_cbc_encrypt(b'hello world', key, b'iv123')
        result = aes_decrypt_text(data, key)
        self.assertEqual(result, b'hello world')

    def test__init__(self):
        obj = aes_cbc_encrypt(b'hello world', b'key123', b'iv123')
        self.assertEqual(obj.key, b'key123')
        self.assertEqual(obj.iv, b'iv123')

    def test__str__(self):
        obj = aes_cbc_encrypt(b'hello world', b'key123', b'iv123')
        self.assertEqual(str(obj), 'AES CBC Encrypt')

    def test__repr__(self):
        obj = aes_cbc_encrypt(b'hello world', b'key123', b'iv123')
        self.assertEqual(repr(obj), 'AES CBC Encrypt(key=b\'key123\', iv=b\'iv123\')')

    def test__eq__(self):
        obj1 = aes_cbc_encrypt(b'hello world', b'key123', b'iv123')
        obj2 = aes_cbc_encrypt(b'hello world', b'key123', b'iv123')
        self.assertTrue(obj1 == obj2)

if __name__ == '__main__':
    unittest.main()