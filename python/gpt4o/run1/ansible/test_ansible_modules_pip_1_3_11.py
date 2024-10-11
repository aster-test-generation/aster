import unittest
from ansible.modules.pip import Package


class TestPackage(unittest.TestCase):
    def test_init_with_version(self):
        pkg = Package("bottle", "0.12")
        self.assertEqual(pkg.package_name, "bottle")

    def test_init_without_version(self):
        pkg = Package("bottle")
        self.assertEqual(pkg.package_name, "bottle")

    def test_init_with_distribute(self):
        pkg = Package("distribute", "0.6.49")
        self.assertEqual(pkg.package_name, "setuptools")

    def test_init_invalid_requirement(self):
        pkg = Package("invalid==")
        self.assertIsNone(pkg._requirement)

    def test_canonicalize_name(self):
        result = Package.canonicalize_name("My-Package")
        self.assertEqual(result, "my-package")

    def test_private_method(self):
        pkg = Package("bottle")
        result = pkg._Package__private_method("test")
        self.assertEqual(result, "test")

    def test_protected_method(self):
        pkg = Package("bottle")
        result = pkg._protected_method("test")
        self.assertEqual(result, "test")

    def test_str_method(self):
        pkg = Package("bottle")
        result = pkg.__str__()
        self.assertEqual(result, "Package(bottle)")

    def test_repr_method(self):
        pkg = Package("bottle")
        result = pkg.__repr__()
        self.assertEqual(result, "Package(bottle)")

    def test_eq_method(self):
        pkg1 = Package("bottle")
        pkg2 = Package("bottle")
        self.assertTrue(pkg1.__eq__(pkg2))

if __name__ == '__main__':
    unittest.main()