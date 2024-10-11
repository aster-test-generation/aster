import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_shift_rows_inv(self):
        data = list(range(16))
        result = shift_rows_inv(data)
        self.assertEqual(result, [0, 13, 10, 7, 4, 1, 14, 11, 8, 5, 2, 15, 12, 9, 6, 3])

    def test_key_expansion(self):
        # todo: implement test for key_expansion
        pass

    def test_aes_encrypt(self):
        # todo: implement test for aes_encrypt
        pass

    def test_aes_ctr_decrypt(self):
        # todo: implement test for aes_ctr_decrypt
        pass

    def test_aes_cbc_decrypt(self):
        # todo: implement test for aes_cbc_decrypt
        pass

    def test_aes_decrypt_text(self):
        # todo: implement test for aes_decrypt_text
        pass

if __name__ == '__main__':
    unittest.main()