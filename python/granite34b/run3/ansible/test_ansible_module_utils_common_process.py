import unittest
from ansible.module_utils.common.process import get_bin_path


class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path_with_required_true(self):
        with self.assertRaises(ValueError):
            get_bin_path('nonexistent_executable', required=True)

    def test_get_bin_path_with_required_false(self):
        with self.assertRaises(ValueError):
            get_bin_path('nonexistent_executable', required=False)

    def test_get_bin_path_with_opt_dirs(self):
        opt_dirs = ['/usr/bin', '/usr/local/bin']
        bin_path = get_bin_path('ls', opt_dirs=opt_dirs)
        self.assertEqual(bin_path, '/usr/bin/ls')

    def test_get_bin_path_with_opt_dirs_and_required_false(self):
        opt_dirs = ['/usr/bin', '/usr/local/bin']
        bin_path = get_bin_path('nonexistent_executable', opt_dirs=opt_dirs, required=True)
        self.assertIsNone(bin_path)

if __name__ == '__main__':
    unittest.main()