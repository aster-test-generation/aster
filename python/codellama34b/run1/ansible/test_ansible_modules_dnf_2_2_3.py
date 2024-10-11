import unittest
from ansible.module_utils.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = DnfModule(None)
        self.assertIsNotNone(module)

    def test_ensure_dnf(self):
        module = DnfModule(None)
        module.ensure_dnf()

    def test_with_modules(self):
        module = DnfModule(None)
        self.assertIsNotNone(module.with_modules)

    def test_lockfile(self):
        module = DnfModule(None)
        self.assertEqual(module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        module = DnfModule(None)
        self.assertEqual(module.pkg_mgr_name, 'dnf')

    def test_allowerasing(self):
        module = DnfModule(None)
        self.assertEqual(module.allowerasing, False)

    def test_nobest(self):
        module = DnfModule(None)
        self.assertEqual(module.nobest, False)

    def test_sanitize_dnf_error_msg_remove(self):
        module = DnfModule(None)
        spec = 'spec'
        error = 'error'
        result = module._sanitize_dnf_error_msg_remove(spec, error)
        self.assertEqual(result, (True, 'error'))

if __name__ == '__main__':
    unittest.main()