import os
import unittest
from ansible.module_utils.common.file import is_executable
from ansible.module_utils.common.process import get_bin_path


class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path_found(self):
        bin_path = get_bin_path('ls')
        self.assertTrue(os.path.exists(bin_path))
        self.assertTrue(is_executable(bin_path))

    def test_get_bin_path_not_found(self):
        with self.assertRaises(ValueError):
            get_bin_path('does-not-exist')

    def test_get_bin_path_opt_dirs(self):
        bin_path = get_bin_path('ls', opt_dirs=['/bin'])
        self.assertEqual(bin_path, '/bin/ls')

    def test_get_bin_path_required(self):
        with self.assertRaises(ValueError):
            get_bin_path('does-not-exist', required=True)

if __name__ == '__main__':
    unittest.main()