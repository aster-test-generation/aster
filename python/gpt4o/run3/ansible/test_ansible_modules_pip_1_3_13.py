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

    def test_init_with_setuptools(self):
        pkg = Package("distribute", "setuptools")
        self.assertEqual(pkg.package_name, "setuptools")
        self.assertTrue(pkg._plain_package)
        self.assertIsNotNone(pkg._requirement)

    def test_is_satisfied_by_true(self):
        pkg = Package("example", ">=1.0.0")
        self.assertTrue(pkg.is_satisfied_by("1.0.1"))

    def test_is_satisfied_by_false(self):
        pkg = Package("example", ">=1.0.0")
        self.assertFalse(pkg.is_satisfied_by("0.9.9"))

    def test_is_satisfied_by_non_plain_package(self):
        pkg = Package("example")
        self.assertFalse(pkg.is_satisfied_by("1.0.0"))

    def test_is_satisfied_by_with_loose_version(self):
        pkg = Package("example", ">=1.0.0")
        self.assertTrue(pkg.is_satisfied_by(LooseVersion("1.0.1")))

    def test_is_satisfied_by_with_invalid_version(self):
        pkg = Package("example", ">=1.0.0")
        self.assertFalse(pkg.is_satisfied_by("invalid_version"))

    def test_canonicalize_name(self):
        self.assertEqual(Package.canonicalize_name("Example-Package"), "example-package")

    def test_private_method(self):
        pkg = Package("example")
        result = pkg._Package__private_method("test")
        self.assertEqual(result, "expected_result")

if __name__ == '__main__':
    unittest.main()