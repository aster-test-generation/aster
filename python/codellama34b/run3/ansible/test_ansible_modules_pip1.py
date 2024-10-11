
import unittest
from ansible.modules.pip import *

class TestPip(unittest.TestCase):
    def test_canonicalize_name(self):
        result = Package.canonicalize_name("ansible")
        self.assertEqual(result, "ansible")

    def test_Package(self):
        result = Package("ansible")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools_pip_setuptools(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools_pip_setuptools_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools_pip_setuptools_pip_setuptools(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

    def test_Package_version_string_special_setuptools_pip_setuptools_pip_setuptools_pip_setuptools_pip_setuptools_pip(self):
        result = Package("ansible", "2.5.1")
        self.assertEqual(result.package_name, "ansible")

if __name__ == '__main__':
    unittest.main()