import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestKeyExpansion(unittest.TestCase):
    def test_key_expansion(self):
        data = b'test'
        result = key_expansion(data)
        self.assertEqual(result, b'test')

    def test_key_schedule_core(self):
        data = b'test'
        rcon_iteration = 1
        result = key_schedule_core(data, rcon_iteration)
        self.assertEqual(result, b'test')

    def test_sub_bytes(self):
        data = b'test'
        result = sub_bytes(data)
        self.assertEqual(result, b'test')

    def test_xor(self):
        data = b'test'
        result = xor(data, data)
        self.assertEqual(result, b'test')

if __name__ == '__main__':
    unittest.main()