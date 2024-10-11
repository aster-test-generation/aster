import unittest
from ansible.module_utils.facts.system.chroot import is_chroot
from ansible.module_utils.service import sysv_exists, sysv_is_enabled, fail_if_missing
from ansible.module_utils._text import to_native


class TestSystemdModule(unittest.TestCase):
    def test_is_chroot(self):
        self.assertFalse(is_chroot())

    def test_sysv_exists(self):
        self.assertTrue(sysv_exists('httpd'))

    def test_sysv_is_enabled(self):
        self.assertTrue(sysv_is_enabled('httpd'))

    def test_fail_if_missing(self):
        self.assertTrue(fail_if_missing('httpd', 'httpd'))

    def test_to_native(self):
        self.assertEqual(to_native('Hello'), 'Hello')

if __name__ == '__main__':
    unittest.main()