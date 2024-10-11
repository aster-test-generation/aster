import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_aes_cbc_encrypt(self):
        data = b'Hello, World!'
        key = b'secretkey'
        iv = b'initializationvector'
        encrypted_data = aes_cbc_encrypt(data, key, iv)
        self.assertIsNotNone(encrypted_data)

    def test_key_expansion(self):
        key = b'secretkey'
        expanded_key = key_expansion(key)
        self.assertIsNotNone(expanded_key)

    def test_aes_encrypt(self):
        block = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        key = b'secretkey'
        encrypted_block = aes_encrypt(block, key)
        self.assertIsNotNone(encrypted_block)

    def test_aes_ctr_decrypt(self):
        # todo: implement test for aes_ctr_decrypt
        pass

    def test_aes_cbc_decrypt(self):
        # todo: implement test for aes_cbc_decrypt
        pass

    def test_aes_decrypt_text(self):
        # todo: implement test for aes_decrypt_text
        pass

    def test_xor(self):
        block1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        block2 = [16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        result = xor(block1, block2)
        self.assertEqual(result, [17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17])

    def test_bytes_to_intlist(self):
        data = b'Hello, World!'
        intlist = bytes_to_intlist(data)
        self.assertEqual(intlist, [72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33])

    def test_intlist_to_bytes(self):
        intlist = [72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33]
        data = intlist_to_bytes(intlist)
        self.assertEqual(data, b'Hello, World!')

if __name__ == '__main__':
    unittest.main()