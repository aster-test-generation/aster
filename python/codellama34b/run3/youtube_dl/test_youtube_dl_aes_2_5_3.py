import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAes(unittest.TestCase):
    def test_aes_decrypt_text(self):
        data = b'data'
        password = b'password'
        key_size_bytes = 16
        result = aes_decrypt_text(data, password, key_size_bytes)
        self.assertEqual(result, b'plaintext')

    def test_key_expansion(self):
        key = b'key'
        result = key_expansion(key)
        self.assertEqual(result, b'key_expansion')

    def test_aes_ctr_decrypt(self):
        cipher = b'cipher'
        key = b'key'
        counter = Counter()
        result = aes_ctr_decrypt(cipher, key, counter)
        self.assertEqual(result, b'aes_ctr_decrypt')

    def test_aes_cbc_decrypt(self):
        cipher = b'cipher'
        key = b'key'
        result = aes_cbc_decrypt(cipher, key)
        self.assertEqual(result, b'aes_cbc_decrypt')

    def test_aes_encrypt(self):
        plaintext = b'plaintext'
        key = b'key'
        result = aes_encrypt(plaintext, key)
        self.assertEqual(result, b'aes_encrypt')

    def test_Counter(self):
        nonce = b'nonce'
        result = Counter(nonce)
        self.assertEqual(result, b'Counter')

    def test_Counter_next_value(self):
        nonce = b'nonce'
        result = Counter(nonce).next_value()
        self.assertEqual(result, b'Counter_next_value')

if __name__ == '__main__':
    unittest.main()