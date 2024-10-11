import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_rotate(self):
        data = [1, 2, 3, 4]
        result = rotate(data)
        self.assertEqual(result, [2, 3, 4, 1])

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

class TestAesConstants(unittest.TestCase):
    def test_BLOCK_SIZE_BYTES(self):
        self.assertEqual(BLOCK_SIZE_BYTES, 16)

    def test_RCON(self):
        self.assertEqual(RCON, (141, 1, 2, 4, 8, 16, 32, 64, 128, 27, 54))

if __name__ == '__main__':
    unittest.main()