import unittest
from youtube_dl.utils import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_key_expansion(self):
        data = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x15, 0x88, 0x09, 0xcf, 0x4f]
        result = key_expansion(data)
        expected_length = (len(data) // 4 + 7) * BLOCK_SIZE_BYTES
        self.assertEqual(len(result), expected_length)

    def test_key_expansion_32_bytes(self):
        data = [0x60, 0x3d, 0xeb, 0x10, 0x15, 0xca, 0x71, 0xbe, 0x2b, 0x73, 0xae, 0xf0, 0x85, 0x7d, 0x77, 0x81,
                0x1f, 0x35, 0x2c, 0x07, 0x3b, 0x61, 0x08, 0xd7, 0x2d, 0x98, 0x10, 0xa3, 0x09, 0x14, 0xdf, 0xf4]
        result = key_expansion(data)
        expected_length = (len(data) // 4 + 7) * BLOCK_SIZE_BYTES
        self.assertEqual(len(result), expected_length)

    def test_key_expansion_24_bytes(self):
        data = [0x8e, 0x73, 0xb0, 0xf7, 0xda, 0x0e, 0x64, 0x52, 0xc8, 0x10, 0xf3, 0x2b, 0x80, 0x90, 0x79, 0xe5,
                0x62, 0xf8, 0xea, 0xd2, 0x52, 0x2c, 0x6b, 0x7b]
        result = key_expansion(data)
        expected_length = (len(data) // 4 + 7) * BLOCK_SIZE_BYTES
        self.assertEqual(len(result), expected_length)

    def test_key_expansion_16_bytes(self):
        data = [0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0xcf, 0x15, 0x88, 0x09, 0xcf, 0x4f]
        result = key_expansion(data)
        expected_length = (len(data) // 4 + 7) * BLOCK_SIZE_BYTES
        self.assertEqual(len(result), expected_length)

if __name__ == '__main__':
    unittest.main()