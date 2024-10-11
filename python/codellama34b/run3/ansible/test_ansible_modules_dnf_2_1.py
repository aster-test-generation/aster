import unittest
from ansible.modules.dnf import *



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

if __name__ == '__main__':
    unittest.main()