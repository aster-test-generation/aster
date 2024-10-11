import unittest
from ansible.modules.rpm_key import *

class TestRpmKey(unittest.TestCase):
    def test_rpm_key(self):
        instance = RpmKey()
        result = instance.rpm_key()
        self.assertEqual(result, "Not a valid key %s" % key)

    def test_fetch_key(self):
        instance = RpmKey()
        result = instance.fetch_key(url)
        self.assertEqual(result, "failed to fetch key at %s , error was: %s" % (url, info['msg']))

    def test_normalize_keyid(self):
        instance = RpmKey()
        result = instance.normalize_keyid(keyid)
        self.assertEqual(result, "Unexpected gpg output")

    def test_getkeyid(self):
        instance = RpmKey()
        result = instance.getkeyid(keyfile)
        self.assertEqual(result, "Unexpected gpg output")

    def test_getfingerprint(self):
        instance = RpmKey()
        result = instance.getfingerprint(keyfile)
        self.assertEqual(result, "Unexpected gpg output")

    def test_is_keyid(self):
        instance = RpmKey()
        result = instance.is_keyid(keystr)
        self.assertEqual(result, False)

    def test_execute_command(self):
        instance = RpmKey()
        result = instance.execute_command(cmd)
        self.assertEqual(result, stderr)

    def test_is_key_imported(self):
        instance = RpmKey()
        result = instance.is_key_imported(keyid)
        self.assertEqual(result, False)

    def test_import_key(self):
        instance = RpmKey()
        result = instance.import_key(keyfile)
        self.assertEqual(result, None)

    def test_drop_key(self):
        instance = RpmKey()
        result = instance.drop_key(keyid)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()