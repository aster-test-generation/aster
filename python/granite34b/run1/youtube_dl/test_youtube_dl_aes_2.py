import unittest
from unittest import TestCase
from youtube_dl.aes import aes_cbc_decrypt


class TestAES(TestCase):
    def test_sub_bytes(self):
        data = [0, 1, 2, 3]
        expected = [99, 124, 119, 123]
        self.assertEqual(sub_bytes(data), expected)

if __name__ == '__main__':
    unittest.main()