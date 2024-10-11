import unittest
from ansible.module_utils.common.process import get_bin_path


class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path_found(self):
        result = get_bin_path('arg', opt_dirs=['/opt/dirs'], required=True)
        self.assertIsNotNone(result)

    def test_get_bin_path_not_found(self):
        with self.assertRaises(ValueError):
            get_bin_path('arg', opt_dirs=['/opt/dirs'], required=True)

    def test_get_bin_path_required_deprecated(self):
        with self.assertRaises(ValueError):
            get_bin_path('arg', opt_dirs=['/opt/dirs'], required=True)

    def test_get_bin_path_required_removed(self):
        with self.assertRaises(ValueError):
            get_bin_path('arg', opt_dirs=['/opt/dirs'], required=True)

    def test_get_bin_path_empty_path(self):
        with self.assertRaises(ValueError):
            get_bin_path('arg', opt_dirs=['/opt/dirs'], required=True)

    def test_get_bin_path_non_existent_dir(self):
        with self.assertRaises(ValueError):
            get_bin_path('arg', opt_dirs=['/non/existent/dir'], required=True)

    def test_get_bin_path_non_executable(self):
        with self.assertRaises(ValueError):
            get_bin_path('arg', opt_dirs=['/opt/dirs'], required=True)

    def test_get_bin_path_multiple_paths(self):
        result = get_bin_path('arg', opt_dirs=['/opt/dirs', '/opt/dirs2'], required=True)
        self.assertIsNotNone(result)

    def test_get_bin_path_sbin_paths(self):
        result = get_bin_path('arg', opt_dirs=['/opt/dirs'], required=True)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()