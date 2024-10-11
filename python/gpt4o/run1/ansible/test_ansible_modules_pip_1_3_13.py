import unittest
from ansible.modules.pip import Package
from ansible.module_utils.compat.version import LooseVersion
from packaging.requirements import Requirement


class TestPackage(unittest.TestCase):
    def test_init_with_version(self):
        pkg = Package("example", "1.0.0")
        self.assertEqual(pkg.package_name, "example")
        self.assertTrue(pkg._plain_package)
        self.assertIsNotNone(pkg._requirement)

    def test_init_without_version(self):
        pkg = Package("example")
        self.assertEqual(pkg.package_name, "example")
        self.assertFalse(pkg._plain_package)
        self.assertIsNone(pkg._requirement)

    def test_init_with_distribute(self):
        pkg = Package("distribute", "0.6.49")
        self.assertEqual(pkg.package_name, "setuptools")
        self.assertTrue(pkg._plain_package)
        self.assertIsNotNone(pkg._requirement)

    def test_is_satisfied_by_true(self):
        pkg = Package("example", ">=1.0.0")
        result = pkg.is_satisfied_by("1.0.1")
        self.assertTrue(result)

    def test_is_satisfied_by_false(self):
        pkg = Package("example", ">=1.0.0")
        result = pkg.is_satisfied_by("0.9.9")
        self.assertFalse(result)

    def test_is_satisfied_by_non_plain_package(self):
        pkg = Package("example")
        result = pkg.is_satisfied_by("1.0.0")
        self.assertFalse(result)

    def test_is_satisfied_by_with_loose_version(self):
        pkg = Package("example", ">=1.0.0")
        result = pkg.is_satisfied_by(LooseVersion("1.0.1"))
        self.assertTrue(result)

    def test_canonicalize_name(self):
        result = Package.canonicalize_name("Example-Package")
        self.assertEqual(result, "example-package")

if __name__ == '__main__':
    unittest.main()