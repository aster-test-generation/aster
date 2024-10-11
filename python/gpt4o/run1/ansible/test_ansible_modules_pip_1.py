import unittest
from ansible.modules.pip import Package


class TestPackage(unittest.TestCase):
    def test_init_with_version(self):
        package = Package("bottle", "0.12")
        self.assertEqual(package.package_name, "bottle")

    def test_init_without_version(self):
        package = Package("bottle")
        self.assertEqual(package.package_name, "bottle")

    def test_init_with_setuptools(self):
        package = Package("distribute", "0.12")
        self.assertEqual(package.package_name, "setuptools")

    def test_str_with_plain_package(self):
        package = Package("bottle", "0.12")
        result = str(package)
        self.assertTrue(result.startswith("bottle==0.12"))

    def test_str_without_plain_package(self):
        package = Package("bottle")
        result = str(package)
        self.assertEqual(result, "bottle")

    def test_private_method(self):
        package = Package("bottle", "0.12")
        result = package._Package__str__()
        self.assertTrue(result.startswith("bottle==0.12"))

    def test_protected_method(self):
        package = Package("bottle", "0.12")
        result = package._plain_package
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()