import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_key_expansion(self):
        # Test key expansion with a 128-bit key
        key = bytes.fromhex("000102030405060708090a0b0c0d0e0f")
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 128 // 4 * 16)

        # Test key expansion with a 192-bit key
        key = bytes.fromhex("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f")
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 192 // 4 * 16)

        # Test key expansion with a 256-bit key
        key = bytes.fromhex("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f2021")
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 256 // 4 * 16)

    def test_key_schedule_core(self):
        # Test key schedule core with a 128-bit key
        key = bytes.fromhex("000102030405060708090a0b0c0d0e0f")
        temp = key_schedule_core(key, 1)
        self.assertEqual(len(temp), 4)

        # Test key schedule core with a 192-bit key
        key = bytes.fromhex("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f")
        temp = key_schedule_core(key, 1)
        self.assertEqual(len(temp), 4)

        # Test key schedule core with a 256-bit key
        key = bytes.fromhex("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f2021")
        temp = key_schedule_core(key, 1)
        self.assertEqual(len(temp), 4)

    def test_sub_bytes(self):
        # Test sub_bytes with a 4-byte input
        input_bytes = bytes.fromhex("000102030405")
        output_bytes = sub_bytes(input_bytes)
        self.assertEqual(len(output_bytes), 4)

        # Test sub_bytes with a 8-byte input
        input_bytes = bytes.fromhex("000102030405060708090a0b0c0d0e0f")
        output_bytes = sub_bytes(input_bytes)
        self.assertEqual(len(output_bytes), 8)

    def test_xor(self):
        # Test xor with two 4-byte inputs
        input_bytes1 = bytes.fromhex("000102030405")
        input_bytes2 = bytes.fromhex("000102030405")
        output_bytes = xor(input_bytes1, input_bytes2)
        self.assertEqual(len(output_bytes), 4)

        # Test xor with two 8-byte inputs
        input_bytes1 = bytes.fromhex("000102030405060708090a0b0c0d0e0f")
        input_bytes2 = bytes.fromhex("000102030405060708090a0b0c0d0e0f")
        output_bytes = xor(input_bytes1, input_bytes2)
        self.assertEqual(len(output_bytes), 8)

if __name__ == '__main__':
    unittest.main()