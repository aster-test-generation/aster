import unittest
from ansible.modules.pip import *



class TestPip(unittest.TestCase):
    def test_get_distribution_version(self):
        from pkg_resources import get_distribution_version
        self.assertEqual(result, "40.6.3")

    def test_get_distribution_version_with_version(self):
        result = get_distribution_version("setuptools", "40.6.3")
        self.assertEqual(result, "40.6.3")

    def test_get_distribution_version_with_version_and_op(self):
        result = get_distribution_version("setuptools", "40.6.3", ">=")
        self.assertEqual(result, "40.6.3")

    def test_get_distribution_version_with_version_and_op_and_version_spec(self):
        from pkg_resources import get_distribution_version
        self.assertEqual(result, "40.6.3")

    def test_get_distribution_version_with_version_and_op_and_version_spec_and_pkg(self):
        result = get_distribution_version("setuptools", "40.6.3", ">=", "40.6.3", "setuptools")
        self.assertEqual(result, "40.6.3")

    def test_get_distribution_version_with_version_and_op_and_version_spec_and_pkg_and_executable(self):
        result = get_distribution_version("setuptools", "40.6.3", ">=", "40.6.3", "setuptools", "pip")
        self.assertEqual(result, "40.6.3")

    def test_get_distribution_version_with_version_and_op_and_version_spec_and_pkg_and_executable_and_chdir(self):
        result = get_distribution_version("setuptools", "40.6.3", ">=", "40.6.3", "setuptools", "pip", "/tmp")
        self.assertEqual(result, "40.6.3")

    def test_get_distribution_version_with_version_and_op_and_version_spec_and_pkg_and_executable_and_chdir_and_extra_args(self):
        result = get_distribution_version("setuptools", "40.6.3", ">=", "40.6.3", "setuptools", "pip", "/tmp", "--no-cache-dir")
        self.assertEqual(result, "40.6.3")

    def test_get_distribution_version_with_version_and_op_and_version_spec_and_pkg_and_executable_and_chdir_and_extra_args_and_umask(self):
        result = get_distribution_version("setuptools", "40.6.3", ">=", "40.6.3", "setuptools", "pip", "/tmp", "--no-cache-dir", "0022")
        self.assertEqual(result, "40.6.3")

    def test_get_distribution_version_with_version_and_op_and_version_spec_and_pkg_and_executable_and_chdir_and_extra_args_and_umask_and_check_mode(self):
        result = get_distribution_version("setuptools", "40.6.3", ">=", "40.6.3", "setuptools", "pip", "/tmp", "--no-cache-dir", "0022", True)
        self.assertEqual(result, "40.6.3")

if __name__ == '__main__':
    unittest.main()