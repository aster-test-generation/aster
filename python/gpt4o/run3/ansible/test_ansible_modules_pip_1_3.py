import unittest
from ansible.modules.pip import Package


class TestPackage(unittest.TestCase):
    def test_init_with_version(self):
        pkg = Package("example", "1.0.0")
        self.assertEqual(pkg.package_name, "example")

    def test_init_without_version(self):
        pkg = Package("example")
        self.assertEqual(pkg.package_name, "example")

    def test_init_with_distribute(self):
        pkg = Package("distribute", "1.0.0")
        self.assertEqual(pkg.package_name, "setuptools")

    def test_canonicalize_name(self):
        result = Package.canonicalize_name("Example-Package")
        self.assertEqual(result, "example-package")

    def test_private_plain_package(self):
        pkg = Package("example", "1.0.0")
        self.assertTrue(pkg._plain_package)

    def test_private_requirement(self):
        pkg = Package("example", "1.0.0")
        self.assertIsNotNone(pkg._requirement)

    def test_private_requirement_invalid(self):
        pkg = Package("example", "invalid_version")
        self.assertIsNone(pkg._requirement)

if __name__ == '__main__':
    unittest.main()