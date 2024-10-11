import unittest
from ansible.module_utils.facts.system.chroot import is_chroot
from ansible.module_utils.service import sysv_exists, sysv_is_enabled, fail_if_missing
from ansible.module_utils._text import to_native


class TestSystemdModule(unittest.TestCase):
    def test_is_chroot(self):
        self.assertFalse(is_chroot())

    def test_sysv_exists(self):
        self.assertFalse(sysv_exists('test'))

    def test_sysv_is_enabled(self):
        self.assertFalse(sysv_is_enabled('test'))

    def test_fail_if_missing(self):
        self.assertRaises(Exception, fail_if_missing, 'test')

    def test_to_native(self):
        self.assertEqual(to_native('test'), 'test')

if __name__ == '__main__':
    unittest.main()