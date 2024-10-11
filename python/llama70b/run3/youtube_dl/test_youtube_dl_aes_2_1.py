import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_aes_encrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        expanded_key = key_expansion(key)
        encrypted_data = aes_encrypt(data, expanded_key)
        self.assertEqual(len(encrypted_data), 16)

    def test_key_expansion(self):
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 176)

    def test_aes_ctr_decrypt(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        key = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        counter = lambda: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        decrypted_data = aes_ctr_decrypt(data, key, counter)
        self.assertEqual(decrypted_data, data)

    def test_aes_cbc_decrypt(self):
        # TO DO: implement test for aes_cbc_decrypt
        pass

    def test_aes_decrypt_text(self):
        # TO DO: implement test for aes_decrypt_text
        pass

    def test_xor(self):
        a = [1, 2, 3, 4]
        b = [5, 6, 7, 8]
        result = xor(a, b)
        self.assertEqual(result, [6, 4, 2, 12])

    def test_bytes_to_intlist(self):
        data = b'\x01\x02\x03\x04'
        result = bytes_to_intlist(data)
        self.assertEqual(result, [1, 2, 3, 4])

    def test_intlist_to_bytes(self):
        data = [1, 2, 3, 4]
        result = intlist_to_bytes(data)
        self.assertEqual(result, b'\x01\x02\x03\x04')

    def test_compat_b64decode(self):
        data = b'VGhlIHN0cmluZw=='
        result = compat_b64decode(data)
        self.assertEqual(result, b'The string')

if __name__ == '__main__':
    unittest.main()