import os
import unittest
from ansible.module_utils.common.file import is_executable
from ansible.module_utils.common.process import get_bin_path

class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path_found(self):
        bin_path = get_bin_path('echo')
        self.assertEqual(bin_path, '/bin/echo')

    def test_get_bin_path_not_found(self):
        with self.assertRaises(ValueError) as context:
            get_bin_path('does-not-exist')
        self.assertIn('Failed to find required executable', str(context.exception))

    def test_get_bin_path_opt_dirs(self):
        bin_path = get_bin_path('echo', opt_dirs=['/bin'])
        self.assertEqual(bin_path, '/bin/echo')

    def test_get_bin_path_required(self):
        with self.assertRaises(ValueError) as context:
            get_bin_path('does-not-exist', required=True)
        self.assertIn('Failed to find required executable', str(context.exception))

if __name__ == '__main__':
    unittest.main()