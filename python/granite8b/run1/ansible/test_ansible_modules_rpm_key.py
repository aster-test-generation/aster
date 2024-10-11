import unittest
from ansible.modules.rpm_key import RpmKey


class TestRpmKey(unittest.TestCase):
    def test_is_pubkey(self):
        self.assertFalse(RpmKey.is_pubkey("-----BEGIN PGP PUBLIC KEY BLOCK-----\n\n-----END PGP PUBLIC KEY BLOCK-----"))
        self.assertFalse(RpmKey.is_pubkey("not a pgp key"))

    def test_normalize_keyid(self):
        self.assertEqual(RpmKey.normalize_keyid("0xABCDEF"), "ABCDEF00")
        self.assertEqual(RpmKey.normalize_keyid("0xabcdef"), "ABCDEF")
        self.assertEqual(RpmKey.normalize_keyid("ABCDEF"), "ABCDEF")
        self.assertEqual(RpmKey.normalize_keyid("abcdef"), "ABCDEF")

    def test_getkeyid(self):
        keyfile = "path/to/keyfile"
        self.assertEqual(RpmKey.getkeyid(keyfile), "FEDCBA")

    def test_getfingerprint(self):
        keyfile = "path/to/keyfile"
        self.assertEqual(RpmKey.getfingerprint(keyfile), "0123456789ABCDEF")

    def test_is_keyid(self):
        self.assertTrue(RpmKey.is_keyid("0xABCDEF", 16))
        self.assertTrue(RpmKey.is_keyid("0xabcdef"))
        self.assertTrue(RpmKey.is_keyid("ABCDEF"))
        self.assertTrue(RpmKey.is_keyid("abcdef"))
        self.assertFalse(RpmKey.is_keyid("not a keyid"))

    def test_execute_command(self):
        cmd = "command"
        stdout, stderr = RpmKey.execute_command(cmd, privatekey=privatekey)
        self.assertEqual(stdout, "expected stdout")
        self.assertEqual(stderr, "expected stderr")

    def test_is_key_imported(self):
        keyid = "ABCDEF"
        self.assertTrue(RpmKey.is_key_imported(keyid), "Key %s is not imported" % keyid)

    def test_import_key(self):
        keyfile = "path/to/keyfile"
        RpmKey.import_key(keyfile, publickey=True)

if __name__ == '__main__':
    unittest.main()