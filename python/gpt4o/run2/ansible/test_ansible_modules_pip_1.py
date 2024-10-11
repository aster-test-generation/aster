import unittest
from ansible.modules.pip import Package


class TestPackage(unittest.TestCase):
    def test_init_with_version(self):
        pkg = Package("bottle", "0.11")
        self.assertEqual(pkg.package_name, "bottle")

    def test_init_without_version(self):
        pkg = Package("bottle")
        self.assertEqual(pkg.package_name, "bottle")

    def test_init_with_invalid_version(self):
        pkg = Package("bottle", "invalid_version")
        self.assertEqual(pkg.package_name, "bottle")

    def test_str_with_plain_package(self):
        pkg = Package("bottle", "0.11")
        self.assertEqual(str(pkg), "bottle==0.11")

    def test_str_without_plain_package(self):
        pkg = Package("bottle")
        self.assertEqual(str(pkg), "bottle")

    def test_private_method_canonicalize_name(self):
        result = Package.canonicalize_name("Bottle")
        self.assertEqual(result, "bottle")

if __name__ == '__main__':
    unittest.main()