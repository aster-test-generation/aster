import unittest
from ansible.module_utils.common.process import get_bin_path


class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path_found(self):
        result = get_bin_path('arg', opt_dirs=['/path/to/directory'])
        self.assertIsNotNone(result)

    def test_get_bin_path_not_found(self):
        with self.assertRaises(ValueError):
            get_bin_path('arg')

    def test_get_bin_path_required(self):
        with self.assertRaises(ValueError):
            get_bin_path('arg', required=True)

    def test_get_bin_path_opt_dirs(self):
        result = get_bin_path('arg', opt_dirs=['/path/to/directory'])
        self.assertIn('/path/to/directory', result)

    def test_get_bin_path_sbin_paths(self):
        result = get_bin_path('arg')
        self.assertIn('/sbin', result)
        self.assertIn('/usr/sbin', result)
        self.assertIn('/usr/local/sbin', result)

    def test_get_bin_path_is_executable(self):
        result = get_bin_path('arg', opt_dirs=['/path/to/directory'])
        self.assertTrue(is_executable(result))

    def test_get_bin_path_pathsep(self):
        result = get_bin_path('arg', opt_dirs=['/path/to/directory'])
        self.assertIn(os.pathsep, result)

if __name__ == '__main__':
    unittest.main()