import unittest
from ansible.module_utils.common.process import get_bin_path


class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path_found(self):
        result = get_bin_path('bash')
        self.assertIsNotNone(result)

    def test_get_bin_path_not_found(self):
        with self.assertRaises(ValueError):
            get_bin_path('non-existent-executable')

    def test_get_bin_path_required_deprecated(self):
        with self.assertRaises(DeprecationWarning):
            get_bin_path('bash', required=True)

    def test_get_bin_path_opt_dirs(self):
        result = get_bin_path('bash', opt_dirs=['/custom/bin'])
        self.assertIsNotNone(result)

    def test_get_bin_path_sbin_paths(self):
        result = get_bin_path('bash', opt_dirs=['/sbin'])
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()