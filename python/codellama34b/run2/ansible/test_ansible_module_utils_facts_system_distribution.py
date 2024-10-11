import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector



class TestGetUname(unittest.TestCase):
    def test_get_uname(self):
        module = None
        flags = '-v'
        result = get_uname(module, flags)
        self.assertIsNotNone(result)

    def test_get_uname_with_flags_as_list(self):
        module = None
        flags = ['-v']
        result = get_uname(module, flags)
        self.assertIsNotNone(result)

    def test_get_uname_with_flags_as_str(self):
        module = None
        flags = '-v'
        result = get_uname(module, flags)
        self.assertIsNotNone(result)

    def test_get_uname_with_rc_not_equal_to_zero(self):
        module = None
        flags = '-v'
        result = get_uname(module, flags)
        self.assertIsNone(result)


class TestFileExists(unittest.TestCase):
    def test_file_exists(self):
        path = ''
        allow_empty = False
        result = _file_exists(path, allow_empty)
        self.assertFalse(result)

    def test_file_exists_with_allow_empty_as_true(self):
        path = ''
        allow_empty = True
        result = _file_exists(path, allow_empty)
        self.assertFalse(result)

    def test_file_exists_with_path_as_none(self):
        path = None
        allow_empty = False
        result = _file_exists(path, allow_empty)
        self.assertFalse(result)

    def test_file_exists_with_path_as_none_and_allow_empty_as_true(self):
        path = None
        allow_empty = True
        result = _file_exists(path, allow_empty)
        self.assertFalse(result)


class TestGetDistribution(unittest.TestCase):
    def test_get_distribution(self):
        result = get_distribution()
        self.assertIsNotNone(result)

    def test_get_distribution_with_platform_dist_as_none(self):
        platform_dist = None
        result = get_distribution(platform_dist)
        self.assertIsNone(result)

    def test_get_distribution_with_platform_dist_as_empty_list(self):
        platform_dist = []
        result = get_distribution(platform_dist)
        self.assertIsNone(result)

    def test_get_distribution_with_platform_dist_as_list_with_one_element(self):
        platform_dist = ['']
        result = get_distribution(platform_dist)
        self.assertIsNotNone(result)

    def test_get_distribution_with_platform_dist_as_list_with_two_elements(self):
        platform_dist = ['', '']
        result = get_distribution(platform_dist)
        self.assertIsNotNone(result)


class TestGetDistributionVersion(unittest.TestCase):
    def test_get_distribution_version(self):
        result = get_distribution_version()
        self.assertIsNotNone(result)

    def test_get_distribution_version_with_platform_dist_as_none(self):
        platform_dist = None
        result = get_distribution_version(platform_dist)
        self.assertIsNone(result)

    def test_get_distribution_version_with_platform_dist_as_empty_list(self):
        platform_dist = []
        result = get_distribution_version(platform_dist)
        self.assertIsNone(result)

    def test_get_distribution_version_with_platform_dist_as_list_with_one_element(self):
        platform_dist = ['']
        result = get_distribution_version(platform_dist)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()