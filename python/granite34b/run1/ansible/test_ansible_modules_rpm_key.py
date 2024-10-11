import unittest
from ansible.modules.rpm_key import RpmKey


class TestRpmKey(unittest.TestCase):
    def test_is_pubkey(self):
        self.assertTrue(RpmKey("-----BEGIN PGP PUBLIC KEY BLOCK----- ... -----END PGP PUBLIC KEY BLOCK-----").is_pubkey())
        self.assertFalse(RpmKey.is_pubkey("not a public key"))

    def test_normalize_keyid(self):
        self.assertEqual(RpmKey.normalize_keyid("0x1234"), "1234")
        self.assertEqual(RpmKey.normalize_keyid("0X5678"), "5678")
        self.assertEqual(RpmKey.normalize_keyid("9abc"), "9abc")

    def test_getkeyid(self):
        keyfile = "path/to/keyfile"
        keyid = RpmKey.getkeyid(keyfile, None)
        self.assertEqual(keyid, "12345678")

    def test_getfingerprint(self):
        keyfile = "path/to/keyfile"
        fingerprint = RpmKey.getfingerprint(keyfile)
        self.assertEqual(fingerprint, "abcdef1234567890")

    def test_is_keyid(self):
        self.assertTrue(RpmKey.is_keyid("1234", "1234"))
        self.assertTrue(RpmKey.is_keyid("0x5678"))
        self.assertTrue(RpmKey.is_keyid("9abc"))
        self.assertFalse(RpmKey.is_keyid("not a keyid"))

    def test_is_key_imported(self):
        keyid = "12345678"
        self.assertTrue(RpmKey.is_key_imported(keyid='12345678'))
        self.assertFalse(RpmKey.is_key_imported("98765432"))

    def test_import_key(self):
        keyfile = "path/to/keyfile"
        RpmKey.import_key(keyfile, None)

    def test_drop_key(self):
        keyid = "12345678"
        RpmKey.drop_key(keyid, 'keyring')

if __name__ == '__main__':
    unittest.main()