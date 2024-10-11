import unittest
from dnf import *


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule()
        self.assertEqual(instance.pkg_mgr_name, "dnf")

    def test_ensure_dnf(self):
        instance = DnfModule()
        instance._ensure_dnf()
        self.assertEqual(instance.pkg_mgr_name, "dnf")

    def test_with_modules(self):
        instance = DnfModule()
        self.assertEqual(instance.with_modules, False)

    def test_allowerasing(self):
        instance = DnfModule()
        self.assertEqual(instance.allowerasing, False)

    def test_nobest(self):
        instance = DnfModule()
        self.assertEqual(instance.nobest, False)

if __name__ == '__main__':
    unittest.main()