import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_mix_columns(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = mix_columns(data)
        self.assertEqual(result, [2, 3, 1, 1, 1, 2, 3, 1, 1, 1, 2, 3, 1, 1, 1, 2])

    def test_mix_column(self):
        column = [1, 2, 3, 4]
        result = mix_column(column, MIX_COLUMN_MATRIX)
        self.assertEqual(result, [2, 3, 1, 1])

    def test_key_expansion(self):
        # todo: implement key expansion test
        pass

    def test_aes_encrypt(self):
        # todo: implement aes encrypt test
        pass

    def test_aes_ctr_decrypt(self):
        # todo: implement aes ctr decrypt test
        pass

    def test_aes_cbc_decrypt(self):
        # todo: implement aes cbc decrypt test
        pass

    def test_aes_decrypt_text(self):
        # todo: implement aes decrypt text test
        pass

if __name__ == '__main__':
    unittest.main()