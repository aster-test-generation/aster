import unittest
from ansible.module_utils.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        dnf_module = DnfModule(None)
        self.assertIsNotNone(dnf_module)

    def test_ensure_dnf(self):
        dnf_module = DnfModule(None)
        dnf_module._ensure_dnf()

    def test_with_modules(self):
        dnf_module = DnfModule(None)
        self.assertIsNotNone(dnf_module.with_modules)

    def test_allowerasing(self):
        dnf_module = DnfModule(None)
        self.assertIsNotNone(dnf_module.allowerasing)

    def test_nobest(self):
        dnf_module = DnfModule(None)
        self.assertIsNotNone(dnf_module.nobest)

    def test_is_newer_version_installed(self):
        dnf_module = DnfModule(None)
        self.assertIsNotNone(dnf_module._is_newer_version_installed(""))

if __name__ == '__main__':
    unittest.main()