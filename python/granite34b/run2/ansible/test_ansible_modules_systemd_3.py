import unittest
from ansible.module_utils.facts.system.chroot import is_chroot
from ansible.module_utils.service import sysv_exists, sysv_is_enabled, fail_if_missing
from ansible.module_utils._text import to_native


class TestChroot(unittest.TestCase):
    def test_is_chroot_true(self):
        self.assertFalse(is_chroot())

    def test_is_chroot_false(self):
        self.assertFalse(is_chroot())

class TestSysvExists(unittest.TestCase):
    def test_sysv_exists_true(self):
        self.assertTrue(sysv_exists('httpd'))

    def test_sysv_exists_false(self):
        self.assertFalse(sysv_exists('does_not_exist'))

class TestSysvIsEnabled(unittest.TestCase):
    def test_sysv_is_enabled_true(self):
        self.assertTrue(sysv_is_enabled('httpd'))

    def test_sysv_is_enabled_false(self):
        self.assertFalse(sysv_is_enabled('does_not_exist'))

class TestFailIfMissing(unittest.TestCase):
    def test_fail_if_missing_true(self):
        self.assertTrue(fail_if_missing('httpd', 'httpd'))

    def test_fail_if_missing_false(self):
        self.assertFalse(fail_if_missing('does_not_exist', 'service'))

class TestToNative(unittest.TestCase):
    def test_to_native_str(self):
        self.assertEqual(to_native('hello'), 'hello')

    def test_to_native_bytes(self):
        self.assertEqual(to_native(b'hello'), 'hello')

if __name__ == '__main__':
    unittest.main()