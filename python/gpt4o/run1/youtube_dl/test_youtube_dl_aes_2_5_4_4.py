import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_key_schedule_core(self):
        data = [0x2b, 0x7e, 0x15, 0x16]
        rcon_iteration = 1
        result = key_schedule_core(data, rcon_iteration)
        expected = [0x2b ^ RCON[1], 0x7e, 0x15, 0x16]  # After rotate and sub_bytes
        self.assertEqual(result, expected)

    def test_rotate(self):
        data = [0x2b, 0x7e, 0x15, 0x16]
        result = rotate(data)
        expected = [0x7e, 0x15, 0x16, 0x2b]
        self.assertEqual(result, expected)

    def test_sub_bytes(self):
        data = [0x2b, 0x7e, 0x15, 0x16]
        result = sub_bytes(data)
        expected = [SBOX[0x2b], SBOX[0x7e], SBOX[0x15], SBOX[0x16]]
        self.assertEqual(result, expected)

    def test_aes_encrypt(self):
        plaintext = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9f\x4f\x47\xdc\x3b'
        result = aes_encrypt(plaintext, key)
        expected = b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32'
        self.assertEqual(result, expected)

    def test_aes_ctr_decrypt(self):
        ciphertext = b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9f\x4f\x47\xdc\x3b'
        counter = b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'
        result = aes_ctr_decrypt(ciphertext, key, counter)
        expected = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        self.assertEqual(result, expected)

    def test_aes_cbc_decrypt(self):
        ciphertext = b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9f\x4f\x47\xdc\x3b'
        iv = b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'
        result = aes_cbc_decrypt(ciphertext, key, iv)
        expected = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        self.assertEqual(result, expected)

    def test_aes_decrypt_text(self):
        ciphertext = '3925841d02dc09fbdc118597196a0b32'
        key = '2b7e151628aed2a6abf7cf9f4f47dc3b'
        result = aes_decrypt_text(ciphertext, key)
        expected = '3243f6a8885a308d313198a2e0370734'
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()