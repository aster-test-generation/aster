import unittest
from ansible.module_utils.common.process import get_bin_path


class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path_found(self):
        result = get_bin_path('ls')
        self.assertIsNotNone(result)

    def test_get_bin_path_not_found(self):
        with self.assertRaises(ValueError):
            get_bin_path('non-existent-command')

    def test_get_bin_path_opt_dirs(self):
        result = get_bin_path('ls', opt_dirs=['/usr/bin'])
        self.assertIsNotNone(result)

    def test_get_bin_path_required(self):
        with self.assertRaises(ValueError):
            get_bin_path('non-existent-command', required=True)

if __name__ == '__main__':
    unittest.main()