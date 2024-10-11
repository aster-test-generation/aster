import unittest
from youtube_dl.aes import aes_decrypt


class TestAESDecrypt(unittest.TestCase):
    def test_aes_decrypt(self):
        data = b'example data'
        expanded_key = b'expanded key'
        expected_result = b'expected result'
        result = aes_decrypt(data, expanded_key)
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()