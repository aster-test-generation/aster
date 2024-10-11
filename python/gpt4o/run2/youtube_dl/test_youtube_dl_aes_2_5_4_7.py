import unittest
from youtube_dl.aes import aes_cbc_decrypt


class TestAESFunctions(unittest.TestCase):
    def test_mix_column(self):
        data = [0x87, 0x6E, 0x46, 0xA6]
        matrix = MIX_COLUMN_MATRIX
        result = mix_column(data, matrix)
        expected = [0x47, 0x37, 0x94, 0xED]  # Expected result based on AES mix column operation
        self.assertEqual(result, expected)

    def test_rijndael_mul(self):
        result = rijndael_mul(0x57, 0x83)
        expected = 0xC1  # Expected result based on Rijndael multiplication
        self.assertEqual(result, expected)

    def test_key_expansion(self):
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9f\x72\x4f\x8b\x2c'
        result = key_expansion(key)
        expected = [0x2b7e1516, 0x28aed2a6, 0xabf7cf9f, 0x724f8b2c, 0x3d80477d, 0x4716fe3e, 0x1e237e44, 0x6d7a883b, 0xef44a541, 0xa8525b7f, 0xb671253b, 0xdb0bad00, 0xd4d1c6f8, 0x7c839d87, 0xcaf2b8bc, 0x11f915bc, 0x6d88a37a, 0x110b3efd, 0xdbf98641, 0xca0093fd, 0x4e54f70e, 0x5f5fc9f3, 0x84a64fb2, 0x4ea6dc4f, 0xead27321, 0xb58dbad2, 0x312bf560, 0x7f8d292f, 0xac7766f3, 0x19fadc21, 0x28d12941, 0x575c006e, 0xd014f9a8, 0xc9ee2589, 0xe13f0cc8, 0xb6630ca6]
        self.assertEqual(result, expected)

    def test_aes_encrypt(self):
        plaintext = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9f\x72\x4f\x8b\x2c'
        result = aes_encrypt(plaintext, key)
        expected = b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32'
        self.assertEqual(result, expected)

    def test_aes_ctr_decrypt(self):
        ciphertext = b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9f\x72\x4f\x8b\x2c'
        nonce = b'\x00\x00\x00\x00\x00\x00\x00\x00'
        result = aes_ctr_decrypt(ciphertext, key, nonce)
        expected = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        self.assertEqual(result, expected)

    def test_aes_cbc_decrypt(self):
        ciphertext = b'\x39\x25\x84\x1d\x02\xdc\x09\xfb\xdc\x11\x85\x97\x19\x6a\x0b\x32'
        key = b'\x2b\x7e\x15\x16\x28\xae\xd2\xa6\xab\xf7\xcf\x9f\x72\x4f\x8b\x2c'
        iv = b'\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00\x00'
        result = aes_cbc_decrypt(ciphertext, key, iv)
        expected = b'\x32\x43\xf6\xa8\x88\x5a\x30\x8d\x31\x31\x98\xa2\xe0\x37\x07\x34'
        self.assertEqual(result, expected)

    def test_aes_decrypt_text(self):
        ciphertext = '3925841d02dc09fbdc118597196a0b32'
        key = '2b7e151628aed2a6abf7cf9f724f8b2c'
        result = aes_decrypt_text(ciphertext, key)
        expected = '3243f6a8885a308d313198a2e0370734'
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()