import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_aes_decrypt_text(self):
        data = 'U2FsdGVkX1+7QmQ0QmQ0QmQ0QmQ0QmQ0QmQ0QmQ0QmQ='
        password = 'password'
        key_size_bytes = 16
        result = aes_decrypt_text(data, password, key_size_bytes)
        self.assertEqual(result, b'exampleplaintext')

    def test_key_expansion(self):
        key = [0] * 16
        result = key_expansion(key)
        self.assertEqual(len(result), 176)

    def test_aes_encrypt(self):
        data = [0] * 16
        key = key_expansion([0] * 16)
        result = aes_encrypt(data, key)
        self.assertEqual(len(result), 16)

    def test_aes_ctr_decrypt(self):
        data = [0] * 16
        key = key_expansion([0] * 16)
        class Counter:
            __value = [0] * 16
            def next_value(self):
                temp = self.__value
                self.__value = inc(self.__value)
                return temp
        result = aes_ctr_decrypt(data, key, Counter())
        self.assertEqual(len(result), 16)

    def test_aes_cbc_decrypt(self):
        data = [0] * 16
        key = key_expansion([0] * 16)
        iv = [0] * 16
        result = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(len(result), 16)

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