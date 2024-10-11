import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_rotate(self):
        data = [1, 2, 3, 4]
        result = rotate(data)
        self.assertEqual(result, [2, 3, 4, 1])

    def test_aes_encrypt(self):
        # Test with a valid key and text
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        text = [1, 2, 3, 4]
        result = aes_encrypt(key, text)
        self.assertEqual(len(result), len(text))

        # Test with an invalid key
        key = [1, 2, 3, 4]
        text = [1, 2, 3, 4]
        with self.assertRaises(IndexError):
            aes_encrypt(key, text)

    def test_key_expansion(self):
        # Test with a valid key
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

        # Test with an invalid key
        key = [1, 2, 3, 4]
        with self.assertRaises(IndexError):
            key_expansion(key)

    def test_aes_ctr_decrypt(self):
        # Test with a valid key and text
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        text = [1, 2, 3, 4]
        result = aes_ctr_decrypt(key, text)
        self.assertEqual(result, text)

        # Test with an invalid key
        key = [1, 2, 3, 4]
        text = [1, 2, 3, 4]
        with self.assertRaises(IndexError):
            aes_ctr_decrypt(key, text)

    def test_aes_cbc_decrypt(self):
        # Test with a valid key and text
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        text = [1, 2, 3, 4]
        result = aes_cbc_decrypt(key, text)
        self.assertEqual(result, text)

        # Test with an invalid key
        key = [1, 2, 3, 4]
        text = [1, 2, 3, 4]
        with self.assertRaises(IndexError):
            aes_cbc_decrypt(key, text)

    def test_aes_decrypt_text(self):
        # Test with a valid key and text
        key = [1, 2, 3, 4, 5, 6, 7, 8]
        text = [1, 2, 3, 4]
        result = aes_decrypt_text(key, text)
        self.assertEqual(result, text)

        # Test with an invalid key
        key = [1, 2, 3, 4]
        text = [1, 2, 3, 4]
        with self.assertRaises(IndexError):
            aes_decrypt_text(key, text)

if __name__ == '__main__':
    unittest.main()