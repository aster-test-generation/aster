import unittest
from ansible.modules.rpm_key import *


class TestRpmKey(unittest.TestCase):
    def test_rpm_key(self):
        instance = RpmKey('module')
        result = instance.rpm_key()
        self.assertEqual(result, None)

    def test_fetch_key(self):
        instance = RpmKey(module)
        result = instance.fetch_key()
        self.assertEqual(result, None)

    def test_normalize_keyid(self):
        instance = RpmKey('test')
        result = instance.normalize_keyid()
        self.assertEqual(result, None)

    def test_getkeyid(self):
        instance = RpmKey(module)
        result = instance.getkeyid()
        self.assertEqual(result, None)

    def test_getfingerprint(self):
        instance = RpmKey('test')
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
        instance = RpmKey('test')
        result = instance.is_key_imported()
        self.assertEqual(result, None)

    def test_import_key(self):
        instance = RpmKey(module)
        result = instance.import_key()
        self.assertEqual(result, None)

    def test_drop_key(self):
        instance = RpmKey(module)
        result = instance.drop_key()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()