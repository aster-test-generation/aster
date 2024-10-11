import unittest
from ansible.module_utils.common.process import get_bin_path

class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path(self):
        result = get_bin_path("arg")
        self.assertEqual(result, "arg")

    def test_get_bin_path_with_opt_dirs(self):
        result = get_bin_path("arg", opt_dirs=["/sbin", "/usr/sbin", "/usr/local/sbin"])
        self.assertEqual(result, "arg")

    def test_get_bin_path_with_required(self):
        result = get_bin_path("arg", required=True)
        self.assertEqual(result, "arg")

    def test_get_bin_path_with_opt_dirs_and_required(self):
        result = get_bin_path("arg", opt_dirs=["/sbin", "/usr/sbin", "/usr/local/sbin"], required=True)
        self.assertEqual(result, "arg")

if __name__ == '__main__':
    unittest.main()