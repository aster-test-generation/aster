import unittest
from ansible.module_utils.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)
        instance._ensure_dnf()

    def test_with_modules(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)
        self.assertIsNotNone(instance.with_modules)

    def test_lockfile(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)
        self.assertEqual(instance.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)
        self.assertEqual(instance.pkg_mgr_name, 'dnf')

    def test_allowerasing(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)
        self.assertEqual(instance.allowerasing, False)

    def test_nobest(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)
        self.assertEqual(instance.nobest, False)

    def test_sanitize_dnf_error_msg_remove(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)
        spec = 'test'
        error = 'test'
        result = instance._sanitize_dnf_error_msg_remove(spec, error)
        self.assertEqual(result, (True, 'test'))

if __name__ == '__main__':
    unittest.main()