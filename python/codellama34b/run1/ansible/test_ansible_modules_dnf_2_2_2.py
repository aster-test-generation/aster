import unittest
from ansible.module_utils.dnf import DnfModule
from ansible.module_utils.dnf import YumDnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance, DnfModule)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_with_modules(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance.with_modules, bool)

    def test_allowerasing(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance.allowerasing, bool)

    def test_nobest(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance.nobest, bool)

    def test_lockfile(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance.lockfile, str)

    def test_pkg_mgr_name(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance.pkg_mgr_name, str)

    def test_sanitize_dnf_error_msg_install(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance._sanitize_dnf_error_msg_install('spec', 'error'), str)

if __name__ == '__main__':
    unittest.main()