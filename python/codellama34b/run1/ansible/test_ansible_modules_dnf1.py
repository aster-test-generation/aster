import unittest
from ansible.modules.dnf import *

class TestDnfModule(unittest.TestCase):
    def test_ensure_dnf(self):
        instance = DnfModule(None)
        result = instance._ensure_dnf()
        self.assertEqual(result, None)

    def test_with_modules(self):
        instance = DnfModule(None)
        result = instance.with_modules
        self.assertEqual(result, None)

    def test_allowerasing(self):
        instance = DnfModule(None)
        result = instance.allowerasing
        self.assertEqual(result, None)

    def test_nobest(self):
        instance = DnfModule(None)
        result = instance.nobest
        self.assertEqual(result, None)

    def test_pkg_mgr_name(self):
        instance = DnfModule(None)
        result = instance.pkg_mgr_name
        self.assertEqual(result, "dnf")

    def test_lockfile(self):
        instance = DnfModule(None)
        result = instance.lockfile
        self.assertEqual(result, "/var/cache/dnf/*_lock.pid")

    def test_update_only(self):
        instance = DnfModule(None)
        result = instance._update_only(None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()