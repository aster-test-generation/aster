import unittest
from ansible.modules.rpm_key import *


class TestRpmKey(unittest.TestCase):
    def test_rpm_key(self):
        instance = RpmKey(module)
        result = instance.rpm_key()
        self.assertEqual(result, None)

    def test_fetch_key(self):
        instance = RpmKey('test')
        result = instance.fetch_key()
        self.assertEqual(result, None)

    def test_normalize_keyid(self):
        instance = RpmKey("test")
        result = instance.normalize_keyid()
        self.assertEqual(result, None)

    def test_getkeyid(self):
        instance = RpmKey('test')
        result = instance.getkeyid()
        self.assertEqual(result, None)

    def test_getfingerprint(self):
        instance = RpmKey(module)
        result = instance.getfingerprint()
        self.assertEqual(result, None)

    def test_is_keyid(self):
        instance = RpmKey('test')
        result = instance.is_keyid()
        self.assertEqual(result, None)

    def test_execute_command(self):
        instance = RpmKey('test')
        result = instance.execute_command()
        self.assertEqual(result, None)

    def test_is_key_imported(self):
        instance = RpmKey(module)
        result = instance.is_key_imported()
        self.assertEqual(result, None)

    def test_import_key(self):
        instance = RpmKey('test')
        result = instance.import_key()
        self.assertEqual(result, None)

    def test_drop_key(self):
        instance = RpmKey('module')
        result = instance.drop_key()
        self.assertEqual(result, None)

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