import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_rijndael_mul(self):
        self.assertEqual(rijndael_mul(2, 3), 6)
        self.assertEqual(rijndael_mul(0, 3), 0)
        self.assertEqual(rijndael_mul(2, 0), 0)

    def test_key_expansion(self):
        # TODO: implement test for key_expansion
        pass

    def test_aes_encrypt(self):
        # TODO: implement test for aes_encrypt
        pass

    def test_aes_ctr_decrypt(self):
        # TODO: implement test for aes_ctr_decrypt
        pass

    def test_aes_cbc_decrypt(self):
        # TODO: implement test for aes_cbc_decrypt
        pass

    def test_aes_decrypt_text(self):
        # TODO: implement test for aes_decrypt_text
        pass

    def test_private_methods(self):
        # Test private methods
        self.assertEqual(rijndael_mul.__code__.co_name, 'rijndael_mul')

    def test_magic_methods(self):
        # Test magic methods
        self.assertEqual(aes_encrypt.__module__, 'youtube_dl.aes')
        self.assertEqual(aes_encrypt.__name__, 'aes_encrypt')

if __name__ == '__main__':
    unittest.main()