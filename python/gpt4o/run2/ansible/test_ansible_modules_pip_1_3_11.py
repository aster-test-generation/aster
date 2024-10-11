import unittest
from ansible.modules.pip import Package


class TestPackage(unittest.TestCase):
    def test_init_with_version(self):
        pkg = Package("example", "1.0.0")
        self.assertEqual(pkg.package_name, "example")

    def test_init_without_version(self):
        pkg = Package("example")
        self.assertEqual(pkg.package_name, "example")

    def test_plain_package_with_version(self):
        pkg = Package("example", "1.0.0")
        self.assertTrue(pkg._plain_package)

    def test_plain_package_without_version(self):
        pkg = Package("example")
        self.assertFalse(pkg._plain_package)

    def test_requirement_with_version(self):
        pkg = Package("example", "1.0.0")
        self.assertIsNotNone(pkg._requirement)

    def test_requirement_without_version(self):
        pkg = Package("example")
        self.assertIsNone(pkg._requirement)

    def test_canonicalize_name(self):
        result = Package.canonicalize_name("Example-Package")
        self.assertEqual(result, "example-package")

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