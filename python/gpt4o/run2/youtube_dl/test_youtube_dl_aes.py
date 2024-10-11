import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_inc(self):
        data = [0, 0, 0, 0]
        result = inc(data)
        self.assertEqual(result, [0, 0, 0, 1])

    def test_inc_with_carry(self):
        data = [0, 0, 0, 255]
        result = inc(data)
        self.assertEqual(result, [0, 0, 1, 0])

    def test_inc_all_255(self):
        data = [255, 255, 255, 255]
        result = inc(data)
        self.assertEqual(result, [0, 0, 0, 0])

    def test_inc_middle_carry(self):
        data = [0, 0, 255, 255]
        result = inc(data)
        self.assertEqual(result, [0, 1, 0, 0])

if __name__ == '__main__':
    unittest.main()