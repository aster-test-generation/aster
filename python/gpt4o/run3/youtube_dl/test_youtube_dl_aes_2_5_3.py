import unittest
from youtube_dl.aes import aes_decrypt_text, aes_encrypt, key_expansion, aes_ctr_decrypt
from youtube_dl.utils import bytes_to_intlist, intlist_to_bytes
from youtube_dl.compat import compat_b64decode


class TestAESFunctions(unittest.TestCase):
    def test_aes_decrypt_text(self):
        data = 'U2FsdGVkX1+I8V5t8J5X8g=='
        password = 'password'
        key_size_bytes = 16
        result = aes_decrypt_text(data, password, key_size_bytes)
        self.assertEqual(result, b'example text')

    def test_aes_encrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        key = key_expansion(data)
        result = aes_encrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        key = key_expansion([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])
        class Counter:
            __value = [0] * 16
            def next_value(self):
                temp = self.__value
                self.__value = [x + 1 for x in self.__value]
                return temp
        result = aes_ctr_decrypt(data, key, Counter())
        self.assertEqual(len(result), 16)

    def test_aes_cbc_decrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        key = key_expansion([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16])
        iv = [0] * 16
        result = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(len(result), 16)

    def test_bytes_to_intlist(self):
        data = b'example text'
        result = bytes_to_intlist(data)
        self.assertEqual(result, [101, 120, 97, 109, 112, 108, 101, 32, 116, 101, 120, 116])

    def test_intlist_to_bytes(self):
        data = [101, 120, 97, 109, 112, 108, 101, 32, 116, 101, 120, 116]
        result = intlist_to_bytes(data)
        self.assertEqual(result, b'example text')

    def test_compat_b64decode(self):
        data = 'U2FsdGVkX1+I8V5t8J5X8g=='
        result = compat_b64decode(data)
        self.assertEqual(result, b'Salted__\xe2\xf1^m\xf0\x9eW\xf2')

if __name__ == '__main__':
    unittest.main()