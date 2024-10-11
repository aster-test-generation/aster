import unittest
from youtube_dl.utils import aes_cbc_decryp


class TestAesModule(unittest.TestCase):
    def test_aes_cbc_encrypt(self):
        data = b'Hello, World!'
        key = b'\x00' * 16
        iv = b'\x00' * 16
        encrypted_data = aes_cbc_encrypt(data, key, iv)
        self.assertEqual(len(encrypted_data), 16)

    def test_key_expansion(self):
        key = b'\x00' * 16
        expanded_key = key_expansion(key)
        self.assertEqual(len(expanded_key), 176)

    def test_aes_encrypt(self):
        block = [0] * 16
        key = b'\x00' * 16
        encrypted_block = aes_encrypt(block, key)
        self.assertEqual(len(encrypted_block), 16)

    def test_aes_ctr_decrypt(self):
        data = b'Hello, World!'
        key = b'\x00' * 16
        nonce = b'\x00' * 16
        decrypted_data = aes_ctr_decrypt(data, key, nonce)
        self.assertEqual(decrypted_data, data)

    def test_aes_cbc_decrypt(self):
        data = b'Hello, World!'
        key = b'\x00' * 16
        iv = b'\x00' * 16
        decrypted_data = aes_cbc_decrypt(data, key, iv)
        self.assertEqual(decrypted_data, data)

    def test_aes_decrypt_text(self):
        data = b'Hello, World!'
        key = b'\x00' * 16
        decrypted_text = aes_decrypt_text(data, key)
        self.assertEqual(decrypted_text, 'Hello, World!')

    def test_xor(self):
        block1 = [0] * 16
        block2 = [1] * 16
        result = xor(block1, block2)
        self.assertEqual(result, [1] * 16)

    def test_sub_bytes(self):
        block = [0] * 16
        result = sub_bytes(block)
        self.assertEqual(result, [SBOX[i] for i in block])

    def test_shift_rows(self):
        block = [0] * 16
        result = shift_rows(block)
        self.assertEqual(result, block)

    def test_mix_columns(self):
        block = [0] * 16
        result = mix_columns(block)
        self.assertEqual(result, [0] * 16)

    def test_key_schedule_core(self):
        rcon = 1
        key = [0] * 4
        result = key_schedule_core(rcon, key)
        self.assertEqual(result, [1, 0, 0, 0])

    def test_key_expansion_private_method(self):
        key = b'\x00' * 16
        result = _AesKeyExpansion__expand_key(key)
        self.assertEqual(len(result), 176)

if __name__ == '__main__':
    unittest.main()