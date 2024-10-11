import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector



class TestGetUname(unittest.TestCase):
    def test_get_uname(self):
        module = None
        flags = '-v'
        result = get_uname(module, flags)
        self.assertEqual(result, None)

    def test_get_uname_with_flags(self):
        module = None
        flags = ['-v']
        result = get_uname(module, flags)
        self.assertEqual(result, None)


class TestFileExists(unittest.TestCase):
    def test_file_exists(self):
        path = ''
        allow_empty = False
        result = _file_exists(path, allow_empty)
        self.assertEqual(result, False)

    def test_file_exists_with_allow_empty(self):
        path = ''
        allow_empty = True
        result = _file_exists(path, allow_empty)
        self.assertEqual(result, False)


class TestDistribution(unittest.TestCase):
    def test_distribution(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution, None)

    def test_distribution_version(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_version, None)

    def test_distribution_codename(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_codename, None)

    def test_distribution_release(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_release, None)

    def test_distribution_major_version(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_major_version, None)

    def test_distribution_minor_version(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_minor_version, None)

    def test_distribution_build_number(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_build_number, None)

    def test_distribution_os_family(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_os_family, None)

    def test_distribution_release_file_supported(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_release_file_supported, None)

    def test_distribution_release_file_path(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_release_file_path, None)

    def test_distribution_release_file_var_name(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_release_file_var_name, None)

    def test_distribution_release_file_var_value(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_release_file_var_value, None)

    def test_distribution_legacy_time(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_legacy_time, None)

    def test_distribution_file_parsing(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_file_parsing, None)

    def test_distribution_version_separator(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_version_separator, None)

    def test_distribution_version_split(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_version_split, None)

    def test_distribution_version_with_code_name(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_version_with_code_name, None)

    def test_distribution_display_name(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_display_name, None)

    def test_distribution_win_version_map(self):
        distribution = Distribution()
        self.assertEqual(distribution.distribution_win_version_map, None)

if __name__ == '__main__':
    unittest.main()