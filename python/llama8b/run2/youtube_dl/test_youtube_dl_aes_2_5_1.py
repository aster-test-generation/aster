import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_aes_encrypt(self):
        data = b'Hello, World!'
        expanded_key = bytes_to_intlist(b'\x00' * 16)
        result = aes_encrypt(data, expanded_key)
        self.assertEqual(len(result), len(data))

    def test_sub_bytes(self):
        data = bytes_to_intlist(b'\x00\x01\x02\x03')
        result = sub_bytes(data)
        self.assertEqual(result, bytes_to_intlist(b'\x11\x12\x13\x14'))

    def test_shift_rows(self):
        data = bytes_to_intlist(b'\x00\x01\x02\x03')
        result = shift_rows(data)
        self.assertEqual(result, bytes_to_intlist(b'\x03\x02\x01\x00'))

    def test_mix_columns(self):
        data = bytes_to_intlist(b'\x00\x01\x02\x03')
        result = mix_columns(data)
        self.assertEqual(result, bytes_to_intlist(b'\x11\x12\x13\x14'))

    def test_xor(self):
        data = bytes_to_intlist(b'\x00\x01\x02\x03')
        key = bytes_to_intlist(b'\x04\x05\x06\x07')
        result = xor(data, key)
        self.assertEqual(result, bytes_to_intlist(b'\x04\x05\x06\x07'))

    def test_key_expansion(self):
        key = bytes_to_intlist(b'\x00\x01\x02\x03')
        result = key_expansion(key)
        self.assertEqual(len(result), 44)

    def test_aes_ctr_decrypt(self):
        data = bytes_to_intlist(b'\x00\x01\x02\x03')
        expanded_key = bytes_to_intlist(b'\x00' * 16)
        result = aes_ctr_decrypt(data, expanded_key)
        self.assertEqual(result, bytes_to_intlist(b'\x00\x01\x02\x03'))

    def test_aes_cbc_decrypt(self):
        data = bytes_to_intlist(b'\x00\x01\x02\x03')
        expanded_key = bytes_to_intlist(b'\x00' * 16)
        result = aes_cbc_decrypt(data, expanded_key)
        self.assertEqual(result, bytes_to_intlist(b'\x00\x01\x02\x03'))

    def test_aes_decrypt_text(self):
        data = b'Hello, World!'
        expanded_key = bytes_to_intlist(b'\x00' * 16)
        result = aes_decrypt_text(data, expanded_key)
        self.assertEqual(result, data)

    def test_private_method(self):
        instance = AES()
        result = instance.__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        instance = AES()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_magic_methods(self):
        instance = AES()
        self.assertEqual(instance.__str__(), 'AES')
        self.assertEqual(instance.__repr__(), 'AES')
        self.assertEqual(instance.__eq__(AES()), True)

if __name__ == '__main__':
    unittest.main()