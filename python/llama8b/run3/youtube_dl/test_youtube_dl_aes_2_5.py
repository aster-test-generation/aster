import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_shift_rows(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = shift_rows(data)
        expected_result = [2, 5, 8, 11, 1, 4, 7, 10, 13, 16, 3, 6, 9, 12, 15]
        self.assertEqual(result, expected_result)

    def test_shift_rows_private(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = _shift_rows(data)
        expected_result = [2, 5, 8, 11, 1, 4, 7, 10, 13, 16, 3, 6, 9, 12, 15]
        self.assertEqual(result, expected_result)

    def test_shift_rows_protected(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = _ShiftRows(data)
        expected_result = [2, 5, 8, 11, 1, 4, 7, 10, 13, 16, 3, 6, 9, 12, 15]
        self.assertEqual(result, expected_result)

    def test_shift_rows_magic(self):
        data = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
        result = __shift_rows(data)
        expected_result = [2, 5, 8, 11, 1, 4, 7, 10, 13, 16, 3, 6, 9, 12, 15]
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()