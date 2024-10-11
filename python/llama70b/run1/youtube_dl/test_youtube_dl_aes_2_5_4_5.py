import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_xor(self):
        data1 = [1, 2, 3]
        data2 = [4, 5, 6]
        result = xor(data1, data2)
        self.assertEqual(result, [5, 7, 9])

    def test_key_expansion(self):
        # implement test for key_expansion function
        pass

    def test_aes_encrypt(self):
        # implement test for aes_encrypt function
        pass

    def test_aes_ctr_decrypt(self):
        # implement test for aes_ctr_decrypt function
        pass

    def test_aes_cbc_decrypt(self):
        # implement test for aes_cbc_decrypt function
        pass

    def test_aes_decrypt_text(self):
        # implement test for aes_decrypt_text function
        pass

if __name__ == '__main__':
    unittest.main()