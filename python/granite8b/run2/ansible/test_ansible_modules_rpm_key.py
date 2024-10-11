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
        self.assertEqual(RpmKey.getkeyid("keyfile"), "12345678")

    def test_getfingerprint(self):
        self.assertEqual(RpmKey.getfingerprint("keyfile"), "ABCDEF1234567890")

    def test_is_keyid(self):
        self.assertTrue(RpmKey.is_keyid("0xABCDEF"))
        self.assertTrue(RpmKey.is_keyid("0xabcdef"))
        self.assertTrue(RpmKey.is_keyid("ABCDEF"))
        self.assertTrue(RpmKey.is_keyid("abcdef"))
        self.assertFalse(RpmKey.is_keyid("not a keyid"))

    def test_execute_command(self):
        self.assertEqual(RpmKey.execute_command(["command"]), ("stdout", "stderr"))

    def test_is_key_imported(self):
        self.assertTrue(RpmKey.is_key_imported("12345678"))
        self.assertFalse(RpmKey.is_key_imported("98765432"))

    def test_import_key(self):
        RpmKey.import_key("keyfile")

    def test_drop_key(self):
        RpmKey.drop_key("12345678")

class TestRpmKey(unittest.TestCase):
    def test_is_pubkey(self):
        self.assertTrue(RpmKey.is_pubkey("-----BEGIN PGP PUBLIC KEY BLOCK-----\n\n-----END PGP PUBLIC KEY BLOCK-----"))
        self.assertFalse(RpmKey.is_pubkey("not a pubkey"))

    def test_normalize_keyid(self):
        self.assertEqual(RpmKey.normalize_keyid("0xABCDEF"), "ABCDEF")
        self.assertEqual(RpmKey.normalize_keyid("ABCDEF"), "ABCDEF")
        self.assertEqual(RpmKey.normalize_keyid("abcdef"), "ABCDEF")

    def test_getkeyid(self):
        keyfile = "/path/to/keyfile"
        with open(keyfile, "w") as f:
            f.write("-----BEGIN PGP PUBLIC KEY BLOCK-----\n\n-----END PGP PUBLIC KEY BLOCK-----")
        r = RpmKey(None)
        r.rpm = "/path/to/rpm"
        r.gpg = "/path/to/gpg"
        self.assertEqual(r.getkeyid(keyfile), "ABCDEF")

    def test_getfingerprint(self):
        keyfile = "/path/to/keyfile"
        with open(keyfile, "w") as f:
            f.write("-----BEGIN PGP PUBLIC KEY BLOCK-----\n\n-----END PGP PUBLIC KEY BLOCK-----")
        r = RpmKey(None)
        r.rpm = "/path/to/rpm"
        r.gpg = "/path/to/gpg"
        self.assertEqual(r.getfingerprint(keyfile), "ABCDEF1234567890")

    def test_is_keyid(self):
        self.assertTrue(RpmKey.is_keyid("0xABCDEF"))
        self.assertTrue(RpmKey.is_keyid("ABCDEF"))
        self.assertTrue(RpmKey.is_keyid("abcdef"))
        self.assertFalse(RpmKey.is_keyid("not a keyid"))

    def test_fetch_key(self):
        r = RpmKey(None)
        r.module = MagicMock()
        r.module.fetch_url.return_value = ("key content", {"status": 200})
        keyfile = r.fetch_key("http://example.com/key")
        self.assertEqual(keyfile, "/tmp/ansible-tmp-12345/keyfile")
        r.module.fetch_url.assert_called_once_with("http://example.com/key", None, False, False, None)

    def test_normalize_keyid(self):
        r = RpmKey(None)
        self.assertEqual(r.normalize_keyid("0xABCDEF"), "ABCDEF")
        self.assertEqual(r.normalize_keyid("ABCDEF"), "ABCDEF")
        self.assertEqual(r.normalize_keyid("abcdef"), "ABCDEF")

    def test_is_key_imported(self):
        r = RpmKey(None)
        r.rpm = "/path/to/rpm"
        r.gpg = "/path/to/gpg"
        r.execute_command.return_value = ("gpg-pubkey-ABCDEF\n", "")
        self.assertTrue(r.is_key_imported("ABCDEF"))
        r.execute_command.assert_called_once_with([r.rpm, "-q", "gpg-pubkey"])

    def test_import_key(self):
        r = RpmKey(None)
        r.module = MagicMock()
        r.module.check_mode = False
        r.rpm = "/path/to/rpm"
        r.import_key("/path/to/keyfile")
        r.module.run_command.assert_called_once_with([r.rpm, "--import", "/path/to/keyfile"])

    def test_drop_key(self):
        r = RpmKey(None)
        r.module = MagicMock()
        r.module.check_mode = False
        r.rpm = "/path/to/rpm"
        r.drop_key("ABCDEF")
        r.module.run_command.assert_called_once_with([r.rpm, "--erase", "--allmatches", "gpg-pubkey-ABCDEF"])

if __name__ == '__main__':
    unittest.main()