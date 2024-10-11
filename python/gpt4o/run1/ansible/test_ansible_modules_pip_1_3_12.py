import unittest
from ansible.modules.pip import Package


class TestPackage(unittest.TestCase):
    def test_init_with_version(self):
        pkg = Package("example", "1.0.0")
        self.assertEqual(pkg.package_name, "example")

    def test_init_without_version(self):
        pkg = Package("example")
        self.assertEqual(pkg.package_name, "example")

    def test_init_with_setuptools(self):
        pkg = Package("distribute", "setuptools")
        self.assertEqual(pkg.package_name, "setuptools")

    def test_has_version_specifier_true(self):
        pkg = Package("example", ">=1.0.0")
        self.assertTrue(pkg.has_version_specifier)

    def test_has_version_specifier_false(self):
        pkg = Package("example")
        self.assertFalse(pkg.has_version_specifier)

    def test_private_method(self):
        pkg = Package("example")
        result = pkg._Package__private_method()
        self.assertEqual(result, "expected_result")

    def test_protected_method(self):
        pkg = Package("example")
        result = pkg._protected_method()
        self.assertEqual(result, "expected_result")

    def test_str_method(self):
        pkg = Package("example")
        result = pkg.__str__()
        self.assertEqual(result, "Package(example)")

    def test_repr_method(self):
        pkg = Package("example")
        result = pkg.__repr__()
        self.assertEqual(result, "Package(example)")

    def test_eq_method(self):
        pkg1 = Package("example")
        pkg2 = Package("example")
        self.assertTrue(pkg1.__eq__(pkg2))

if __name__ == '__main__':
    unittest.main()