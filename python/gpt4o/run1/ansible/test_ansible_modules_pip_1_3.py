import unittest
from ansible.modules.pip import Package


class TestPackage(unittest.TestCase):
    def test_init_with_version(self):
        pkg = Package("bottle", "0.12")
        self.assertEqual(pkg.package_name, "bottle")

    def test_init_without_version(self):
        pkg = Package("bottle")
        self.assertEqual(pkg.package_name, "bottle")

    def test_init_with_setuptools(self):
        pkg = Package("distribute", "0.12")
        self.assertEqual(pkg.package_name, "setuptools")

    def test_canonicalize_name(self):
        result = Package.canonicalize_name("My-Package")
        self.assertEqual(result, "my-package")

    def test_private_method(self):
        pkg = Package("bottle")
        result = pkg._Package__private_method("test")
        self.assertEqual(result, "expected_result")

    def test_protected_method(self):
        pkg = Package("bottle")
        result = pkg._protected_method("test")
        self.assertEqual(result, "expected_result")

    def test_magic_method_str(self):
        pkg = Package("bottle")
        result = pkg.__str__()
        self.assertEqual(result, "expected_string")

    def test_magic_method_repr(self):
        pkg = Package("bottle")
        result = pkg.__repr__()
        self.assertEqual(result, "expected_repr")

    def test_magic_method_eq(self):
        pkg1 = Package("bottle")
        pkg2 = Package("bottle")
        self.assertTrue(pkg1.__eq__(pkg2))

if __name__ == '__main__':
    unittest.main()