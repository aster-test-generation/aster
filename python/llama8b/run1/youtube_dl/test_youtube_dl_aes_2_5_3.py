import unittest
from youtube_dl import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_decrypt_text(self):
        password = "password"
        key_size_bytes = 16
        data = "some_data"
        result = aes_decrypt_text(data, password, key_size_bytes)
        self.assertIsInstance(result, bytes)

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = key_expansion(key)
        self.assertIsInstance(result, list)

    def test_aes_encrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        plaintext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_encrypt(plaintext, key)
        self.assertIsInstance(result, list)

    def test_aes_ctr_decrypt(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        ciphertext = [1, 2, 3, 4, 5, 6, 7, 8]
        result = aes_ctr_decrypt(ciphertext, key, Counter())
        self.assertIsInstance(result, list)

    def test_counter(self):
        counter = Counter()
        result = counter.next_value()
        self.assertIsInstance(result, list)

if __name__ == '__main__':
    unittest.main()