import unittest
from youtube_dl.aes import aes_cbc_decrypt



class TestAES(unittest.TestCase):
    def test_shift_rows_inv(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = shift_rows_inv(data)
        self.assertEqual(result, [1, 5, 9, 13, 2, 6, 10, 14, 3, 7, 11, 15, 4, 8, 12, 16])

if __name__ == '__main__':
    unittest.main()