import unittest
from ansible.module_utils.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_with_modules(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance.with_modules)

    def test_lockfile(self):
        instance = DnfModule(None)
        self.assertEqual(instance.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        instance = DnfModule(None)
        self.assertEqual(instance.pkg_mgr_name, 'dnf')

    def test_allowerasing(self):
        instance = DnfModule(None)
        self.assertEqual(instance.allowerasing, None)

    def test_nobest(self):
        instance = DnfModule(None)
        self.assertEqual(instance.nobest, None)

    def test_sanitize_dnf_error_msg_install(self):
        instance = DnfModule(None)
        spec = 'spec'
        error = 'error'
        result = instance._sanitize_dnf_error_msg_install(spec, error)
        self.assertEqual(result, 'No package spec available.')

if __name__ == '__main__':
    unittest.main()