import unittest
from ansible.modules.rpm_key import RpmKey


class TestRpmKey(unittest.TestCase):
    def test_is_pubkey(self):
        self.assertTrue(RpmKey.is_pubkey("-----BEGIN PGP PUBLIC KEY BLOCK-----\n\n-----END PGP PUBLIC KEY BLOCK-----"))
        self.assertFalse(RpmKey.is_pubkey("not a pgp key"))

    def test_normalize_keyid(self):
        self.assertEqual(RpmKey.normalize_keyid("0xABCDEF"), "ABCDEF")
        self.assertEqual(RpmKey.normalize_keyid("0xabcdef"), "ABCDEF")
        self.assertEqual(RpmKey.normalize_keyid("ABCDEF"), "ABCDEF")
        self.assertEqual(RpmKey.normalize_keyid("abcdef"), "ABCDEF")

    def test_getkeyid(self):
        keyfile = "path/to/keyfile"
        with open(keyfile, "w") as f:
            f.write("-----BEGIN PGP PUBLIC KEY BLOCK-----\n\n-----END PGP PUBLIC KEY BLOCK-----")
        with self.assertRaises(RpmKey.AnsibleModuleExitJson):
            RpmKey(None).getkeyid(keyfile)

    def test_getfingerprint(self):
        keyfile = "path/to/keyfile"
        with open(keyfile, "w") as f:
            f.write("-----BEGIN PGP PUBLIC KEY BLOCK-----\n\n-----END PGP PUBLIC KEY BLOCK-----")
        with self.assertRaises(RpmKey.AnsibleModuleExitJson):
            RpmKey(None).getfingerprint(keyfile)

    def test_is_keyid(self):
        self.assertTrue(RpmKey.is_keyid("0xABCDEF"))
        self.assertTrue(RpmKey.is_keyid("0xabcdef"))
        self.assertTrue(RpmKey.is_keyid("ABCDEF"))
        self.assertTrue(RpmKey.is_keyid("abcdef"))
        self.assertFalse(RpmKey.is_keyid("not a keyid"))

    def test_execute_command(self):
        with self.assertRaises(RpmKey.AnsibleModuleExitJson):
            RpmKey(None).execute_command(["ls", "-l"])

    def test_is_key_imported(self):
        with self.assertRaises(RpmKey.AnsibleModuleExitJson):
            RpmKey(None).is_key_imported("ABCDEF")

    def test_import_key(self):
        with self.assertRaises(RpmKey.AnsibleModuleExitJson):
            RpmKey(None).import_key("path/to/keyfile")

    def test_drop_key(self):
        with self.assertRaises(RpmKey.AnsibleModuleExitJson):
            RpmKey(None).drop_key("ABCDEF")

class TestRpmKey(unittest.TestCase):
    def test_is_pubkey(self):
        self.assertTrue(RpmKey.is_pubkey("-----BEGIN PGP PUBLIC KEY BLOCK-----\n\n-----END PGP PUBLIC KEY BLOCK-----"))
        self.assertFalse(RpmKey.is_pubkey("not a pgp key"))

    def test_normalize_keyid(self):
        self.assertEqual(RpmKey.normalize_keyid("0xABCDEF"), "ABCDEF")
        self.assertEqual(RpmKey.normalize_keyid("ABCDEF"), "ABCDEF")
        self.assertEqual(RpmKey.normalize_keyid("0xabcdef"), "ABCDEF")
        self.assertEqual(RpmKey.normalize_keyid("abcdef"), "ABCDEF")

    def test_getkeyid(self):
        keyfile = "path/to/keyfile"
        with open(keyfile, "w") as f:
            f.write("-----BEGIN PGP PUBLIC KEY BLOCK-----\n\n-----END PGP PUBLIC KEY BLOCK-----")
        with self.assertRaises(SystemExit) as cm:
            RpmKey(None).getkeyid(keyfile)
        self.assertEqual(cm.exception.code, 0)

    def test_getfingerprint(self):
        keyfile = "path/to/keyfile"
        with open(keyfile, "w") as f:
            f.write("-----BEGIN PGP PUBLIC KEY BLOCK-----\n\n-----END PGP PUBLIC KEY BLOCK-----")
        with self.assertRaises(SystemExit) as cm:
            RpmKey(None).getfingerprint(keyfile)
        self.assertEqual(cm.exception.code, 0)

    def test_is_keyid(self):
        self.assertTrue(RpmKey.is_keyid("0xABCDEF"))
        self.assertTrue(RpmKey.is_keyid("ABCDEF"))
        self.assertFalse(RpmKey.is_keyid("not a keyid"))

    def test_execute_command(self):
        with self.assertRaises(SystemExit) as cm:
            RpmKey(None).execute_command(["ls", "-l"])
        self.assertEqual(cm.exception.code, 0)

    def test_is_key_imported(self):
        with self.assertRaises(SystemExit) as cm:
            RpmKey(None).is_key_imported("ABCDEF")
        self.assertEqual(cm.exception.code, 0)

    def test_import_key(self):
        with self.assertRaises(SystemExit) as cm:
            RpmKey(None).import_key("path/to/keyfile")
        self.assertEqual(cm.exception.code, 0)

    def test_drop_key(self):
        with self.assertRaises(SystemExit) as cm:
            RpmKey(None).drop_key("ABCDEF")
        self.assertEqual(cm.exception.code, 0)

if __name__ == '__main__':
    unittest.main()