import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_aes_ctr_decrypt(self):
        data = b'example data'
        key = b'example key'
        counter = Counter(b'example counter')
        decrypted_data = aes_ctr_decrypt(data, key, counter)
        self.assertEqual(decrypted_data, b'example data')

if __name__ == '__main__':
    unittest.main()