import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_sub_bytes_inv(self):
        data = [1, 2, 3, 4, 5]
        result = sub_bytes_inv(data)
        self.assertEqual(result, [82, 9, 106, 213, 48])

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