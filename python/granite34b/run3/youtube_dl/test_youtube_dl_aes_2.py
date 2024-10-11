import unittest
from youtube_dl.aes import *


class TestAES(unittest.TestCase):
    def test_sub_bytes(self):
        data = [0, 1, 2, 3]
        result = sub_bytes(data)
        expected = [99, 124, 119, 123]
        self.assertEqual(result, expected)

    def test_key_expansion(self):
        key = b'This is a 16-byte key'
        result = key_expansion(key)
        expected = [243, 217, 126, 193, 246, 129, 173, 228, 167, 241, 218, 116, 251, 162, 231, 139, 252, 202, 227, 248, 218, 223, 20, 235, 172, 222, 219, 117, 224, 242, 123, 170, 213, 249, 82, 233, 164, 211, 6, 138, 174, 102, 165, 156, 180, 37, 168, 253, 212, 207, 206, 240, 180, 230, 115, 150, 172, 116, 34, 231, 173, 53, 133, 226, 249, 55, 232, 28, 117, 223, 110, 71, 241, 26, 113, 29, 41, 197, 137, 111, 183, 98, 14, 170, 24, 190, 27, 252, 86, 62, 75, 198, 210, 121, 32, 154, 219, 192, 254, 120, 205, 90, 244, 31, 221, 168, 51, 136, 7, 199, 49, 177, 18, 16, 89, 39, 128, 236, 95, 96, 81, 127, 169, 25, 181, 74, 13, 45, 229, 122, 159, 147, 201, 156, 239, 160, 224, 59, 77, 174, 42, 245, 176, 200, 235, 187, 60, 131, 83, 153, 97, 23, 43, 4, 126, 186, 119, 214, 38, 225, 105, 20, 99, 85, 33, 12, 125]
        self.assertEqual(result, expected)

    def test_aes_ctr_decrypt(self):
        key = b'This is a 16-byte key'
        counter = 0
        data = b'This is a 16-byte data'
        result = aes_ctr_decrypt(key, counter, data)
        expected = b'This is a 16-byte data'
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()