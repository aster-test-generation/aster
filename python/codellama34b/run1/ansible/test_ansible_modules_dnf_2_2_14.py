import unittest
from ansible.module_utils.dnf import *


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertEqual(instance.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(instance.pkg_mgr_name, 'dnf')
        self.assertEqual(instance.allowerasing, None)
        self.assertEqual(instance.nobest, None)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        self.assertEqual(instance.ensure_dnf(), None)

    def test_is_newer_version_installed(self):
        instance = DnfModule(None)
        self.assertEqual(instance._is_newer_version_installed('pkg_name'), False)

if __name__ == '__main__':
    unittest.main()