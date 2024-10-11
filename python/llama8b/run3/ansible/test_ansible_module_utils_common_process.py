import unittest
from ansible.module_utils.common.process import get_bin_path


class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path_found(self):
        result = get_bin_path('arg', required=True)
        self.assertIsNotNone(result)

    def test_get_bin_path_not_found(self):
        with self.assertRaises(ValueError):
            get_bin_path('non-existent', required=True)

    def test_get_bin_path_opt_dirs(self):
        result = get_bin_path('arg', opt_dirs=['/opt/bin'])
        self.assertIsNotNone(result)

    def test_get_bin_path_required_deprecated(self):
        with self.assertRaises(NotImplementedError):
            get_bin_path('arg', required=True, opt_dirs=['/opt/bin'])

    def test_get_bin_path_required_removed(self):
        with self.assertRaises(ValueError):
            get_bin_path('arg', required=True, opt_dirs=['/opt/bin'])

    def test_get_bin_path_sbin_paths(self):
        result = get_bin_path('arg', sbin_paths=['/sbin'])
        self.assertIsNotNone(result)

    def test_get_bin_path_paths(self):
        result = get_bin_path('arg', paths=['/path/to/bin'])
        self.assertIsNotNone(result)

    def test_get_bin_path_empty_paths(self):
        with self.assertRaises(ValueError):
            get_bin_path('arg', paths=[])

    def test_get_bin_path_non_executable(self):
        with self.assertRaises(ValueError):
            get_bin_path('non-executable', required=True)

    def test_get_bin_path_directory(self):
        with self.assertRaises(ValueError):
            get_bin_path('directory', required=True)

    def test_get_bin_path_magic_methods(self):
        instance = get_bin_path('arg')
        self.assertEqual(str(instance), 'get_bin_path("arg")')
        self.assertEqual(repr(instance), 'get_bin_path("arg")')

if __name__ == '__main__':
    unittest.main()