import unittest
from ansible.modules.rpm_key import *

class TestRpmKey(unittest.TestCase):
    def test_is_pubkey(self):
        self.assertTrue(is_pubkey("-----BEGIN PGP PUBLIC KEY BLOCK-----"))
        self.assertFalse(is_pubkey(""))

    def test_normalize_keyid(self):
        self.assertEqual(normalize_keyid("0x12345678"), "12345678")
        self.assertEqual(normalize_keyid("0X12345678"), "12345678")
        self.assertEqual(normalize_keyid("12345678"), "12345678")

    def test_getkeyid(self):
        self.assertEqual(getkeyid("-----BEGIN PGP PUBLIC KEY BLOCK-----"), "12345678")

    def test_getfingerprint(self):
        self.assertEqual(getfingerprint("-----BEGIN PGP PUBLIC KEY BLOCK-----"), "12345678")

    def test_is_keyid(self):
        self.assertTrue(is_keyid("0x12345678"))
        self.assertTrue(is_keyid("0X12345678"))
        self.assertTrue(is_keyid("12345678"))
        self.assertFalse(is_keyid(""))

    def test_execute_command(self):
        self.assertEqual(execute_command(["ls", "-l"]), ("", ""))

    def test_is_key_imported(self):
        self.assertTrue(is_key_imported("12345678"))

    def test_import_key(self):
        import_key("-----BEGIN PGP PUBLIC KEY BLOCK-----")

    def test_drop_key(self):
        drop_key("12345678")

    def test_main(self):
        main()

if __name__ == '__main__':
    unittest.main()