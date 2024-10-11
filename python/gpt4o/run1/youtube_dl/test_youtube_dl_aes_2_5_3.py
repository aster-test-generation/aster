import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_aes_decrypt_text(self):
        data = 'U2FsdGVkX1+I8V1z8v1+8g=='
        password = 'password'
        key_size_bytes = 16
        result = aes_decrypt_text(data, password, key_size_bytes)
        self.assertEqual(result, b'example text')

    def test_key_expansion(self):
        key = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x9f, 0x4f, 0x3c, 0x2b, 0x7e]
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 176)

    def test_aes_encrypt(self):
        data = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        key = key_expansion([0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x9f, 0x4f, 0x3c, 0x2b, 0x7e])
        encrypted_data = aes_encrypt(data, key)
        self.assertEqual(len(encrypted_data), 16)

    def test_aes_ctr_decrypt(self):
        data = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        key = key_expansion([0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x9f, 0x4f, 0x3c, 0x2b, 0x7e])
        class Counter:
            __value = [0] * 16
            def next_value(self):
                temp = self.__value
                self.__value = inc(self.__value)
                return temp
        decrypted_data = aes_ctr_decrypt(data, key, Counter())
        self.assertEqual(len(decrypted_data), 16)

    def test_aes_cbc_decrypt(self):
        data = [0x32, 0x43, 0xf6, 0xa8, 0x88, 0x5a, 0x30, 0x8d, 0x31, 0x31, 0x98, 0xa2, 0xe0, 0x37, 0x07, 0x34]
        key = key_expansion([0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x9f, 0x4f, 0x3c, 0x2b, 0x7e])
        iv = [0] * 16
        decrypted_data = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(len(decrypted_data), 16)

    def test_private_counter_next_value(self):
        class Counter:
            __value = [0] * 16
            def next_value(self):
                temp = self.__value
                self.__value = inc(self.__value)
                return temp
        counter = Counter()
        result = counter._Counter__value
        self.assertEqual(result, [0] * 16)

    def test_protected_counter_next_value(self):
        class Counter:
            __value = [0] * 16
            def next_value(self):
                temp = self.__value
                self.__value = inc(self.__value)
                return temp
        counter = Counter()
        result = counter.next_value()
        self.assertEqual(result, [0] * 16)

if __name__ == '__main__':
    unittest.main()