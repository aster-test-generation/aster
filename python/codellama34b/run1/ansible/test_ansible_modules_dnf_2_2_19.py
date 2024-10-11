import unittest
from ansible.modules.dnf import *


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_ensure_dnf(self):
        instance = DnfModule(None, None)
        instance._ensure_dnf()

    def test_install_remote_rpms(self):
        instance = DnfModule(None)
        instance._install_remote_rpms(None)

    def test_update_only(self):
        instance = DnfModule(None)
        instance._update_only(None)

    def test_is_newer_version_installed(self):
        instance = DnfModule(None)
        instance._is_newer_version_installed(None)

    def test_package_dict(self):
        instance = DnfModule(None)
        instance._package_dict(None)

if __name__ == '__main__':
    unittest.main()