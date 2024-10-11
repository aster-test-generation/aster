import unittest
from youtube_dl.aes import aes_cbc_decryp


class TestAES(unittest.TestCase):
    def test_rijndael_mul(self):
        result = rijndael_mul(1, 2)
        self.assertEqual(result, 3)

    def test_rijndael_mul_zero(self):
        result = rijndael_mul(0, 1)
        self.assertEqual(result, 0)

    def test_rijndael_mul_zero_b(self):
        result = rijndael_mul(1, 0)
        self.assertEqual(result, 0)

    def test_rijndael_mul_zero_a_b(self):
        result = rijndael_mul(0, 0)
        self.assertEqual(result, 0)

    def test_aes_encrypt(self):
        # TO DO: implement test case for aes_encrypt
        pass

    def test_key_expansion(self):
        # TO DO: implement test case for key_expansion
        pass

    def test_aes_ctr_decrypt(self):
        # TO DO: implement test case for aes_ctr_decrypt
        pass

    def test_aes_cbc_decrypt(self):
        # TO DO: implement test case for aes_cbc_decrypt
        pass

    def test_aes_decrypt_text(self):
        # TO DO: implement test case for aes_decrypt_text
        pass

    def test__init__(self):
        # TO DO: implement test case for __init__
        pass

    def test__str__(self):
        # TO DO: implement test case for __str__
        pass

    def test__repr__(self):
        # TO DO: implement test case for __repr__
        pass

    def test__eq__(self):
        # TO DO: implement test case for __eq__
        pass

    def test_private_method(self):
        # TO DO: implement test case for private method
        pass

    def test_protected_method(self):
        # TO DO: implement test case for protected method
        pass

if __name__ == '__main__':
    unittest.main()