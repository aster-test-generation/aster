import unittest
from ansible.module_utils.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance.ensure_dnf()

    def test_with_modules(self):
        instance = DnfModule(None)
        result = instance.with_modules
        self.assertIsNotNone(result)

    def test_lockfile(self):
        instance = DnfModule(None)
        result = instance.lockfile
        self.assertIsNotNone(result)

    def test_pkg_mgr_name(self):
        instance = DnfModule(None)
        result = instance.pkg_mgr_name
        self.assertIsNotNone(result)

    def test_allowerasing(self):
        instance = DnfModule(None)
        result = instance.allowerasing
        self.assertIsNotNone(result)

    def test_nobest(self):
        instance = DnfModule(None)
        result = instance.nobest
        self.assertIsNotNone(result)

    def test_split_package_arch(self):
        instance = DnfModule(None)
        result = instance.split_package_arch('test')
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()