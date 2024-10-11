import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(unittest.TestCase):
    def test_sub_bytes_inv(self):
        result = sub_bytes_inv([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

if __name__ == '__main__':
    unittest.main()