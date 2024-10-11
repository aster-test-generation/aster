import unittest
from ansible.modules.pip import Package
from ansible.module_utils.six import PY3


class TestPackage(unittest.TestCase):
    def test_init_with_version(self):
        pkg = Package("example", "1.0.0")
        self.assertEqual(pkg.package_name, "example")
        self.assertTrue(pkg._plain_package)

    def test_init_without_version(self):
        pkg = Package("example")
        self.assertEqual(pkg.package_name, "example")
        self.assertFalse(pkg._plain_package)

    def test_init_with_distribute(self):
        pkg = Package("distribute", "0.6.49")
        self.assertEqual(pkg.package_name, "setuptools")
        self.assertTrue(pkg._plain_package)

    def test_str_with_plain_package(self):
        pkg = Package("example", "1.0.0")
        self.assertEqual(str(pkg), "example==1.0.0")

    def test_str_without_plain_package(self):
        pkg = Package("example")
        self.assertEqual(str(pkg), "example")

    def test_private_method(self):
        pkg = Package("example")
        result = pkg._Package__str__()
        self.assertEqual(result, "example")

if __name__ == '__main__':
    unittest.main()