import unittest
from ansible.modules.pip import Package


class TestPackage(unittest.TestCase):
    def test_init_with_version(self):
        pkg = Package("bottle", "0.12")
        self.assertEqual(pkg.package_name, "bottle")

    def test_init_without_version(self):
        pkg = Package("bottle")
        self.assertEqual(pkg.package_name, "bottle")

    def test_init_with_invalid_version(self):
        pkg = Package("bottle", "invalid_version")
        self.assertEqual(pkg.package_name, "bottle")

    def test_canonicalize_name(self):
        result = Package.canonicalize_name("My-Package")
        self.assertEqual(result, "my-package")

    def test_private_plain_package(self):
        pkg = Package("bottle")
        self.assertFalse(pkg._plain_package)

    def test_private_requirement(self):
        pkg = Package("bottle")
        self.assertIsNone(pkg._requirement)

if __name__ == '__main__':
    unittest.main()