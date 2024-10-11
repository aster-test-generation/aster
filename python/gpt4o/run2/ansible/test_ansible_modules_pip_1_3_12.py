import unittest
from ansible.modules.pip import Package


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

    def test_has_version_specifier_true(self):
        pkg = Package("example", ">=1.0.0")
        self.assertTrue(pkg.has_version_specifier)

    def test_has_version_specifier_false(self):
        pkg = Package("example")
        self.assertFalse(pkg.has_version_specifier)

    def test_canonicalize_name(self):
        result = Package.canonicalize_name("Example-Package")
        self.assertEqual(result, "example-package")

    def test_private_method(self):
        pkg = Package("example")
        result = pkg._Package__private_method()
        self.assertEqual(result, "expected_result")

if __name__ == '__main__':
    unittest.main()