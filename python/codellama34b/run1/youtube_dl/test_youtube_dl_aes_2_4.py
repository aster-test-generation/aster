import unittest
from youtube_dl.aes import aes_cbc_decrypt



class TestKeyExpansion(unittest.TestCase):
    def test_key_expansion(self):
        data = b'12345678901234567890123456789012'
        result = key_expansion(data)
        self.assertEqual(result, b'12345678901234567890123456789012')

    def test_key_schedule_core(self):
        data = b'12345678901234567890123456789012'
        result = key_schedule_core(data, 1)
        self.assertEqual(result, b'12345678901234567890123456789012')

    def test_sub_bytes(self):
        data = b'12345678901234567890123456789012'
        result = sub_bytes(data)
        self.assertEqual(result, b'12345678901234567890123456789012')

    def test_xor(self):
        data = b'12345678901234567890123456789012'
        result = xor(data, data)
        self.assertEqual(result, b'12345678901234567890123456789012')

    def test_key_schedule_core(self):
        data = b'12345678901234567890123456789012'
        result = key_schedule_core(data, 1)
        self.assertEqual(result, b'12345678901234567890123456789012')

    def test_sub_bytes(self):
        data = b'12345678901234567890123456789012'
        result = sub_bytes(data)
        self.assertEqual(result, b'12345678901234567890123456789012')

    def test_xor(self):
        data = b'12345678901234567890123456789012'
        result = xor(data, data)
        self.assertEqual(result, b'12345678901234567890123456789012')

    def test_key_schedule_core(self):
        data = b'12345678901234567890123456789012'
        result = key_schedule_core(data, 1)
        self.assertEqual(result, b'12345678901234567890123456789012')

    def test_sub_bytes(self):
        data = b'12345678901234567890123456789012'
        result = sub_bytes(data)
        self.assertEqual(result, b'12345678901234567890123456789012')

if __name__ == '__main__':
    unittest.main()