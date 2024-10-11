import unittest
from ansible.module_utils.facts.system import DistributionFactCollecto


class TestDistribution(unittest.TestCase):
    def test_get_distribution(self):
        result = get_distribution()
        self.assertIsNotNone(result)

    def test_get_distribution_version(self):
        result = get_distribution_version()
        self.assertIsNotNone(result)

    def test_get_distribution_codename(self):
        result = get_distribution_codename()
        self.assertIsNotNone(result)

    def test_get_uname(self):
        result = get_uname()
        self.assertIsNotNone(result)

    def test_file_exists(self):
        result = _file_exists('/path/to/non/existent/file')
        self.assertFalse(result)

    def test_file_exists_allow_empty(self):
        result = _file_exists('/path/to/empty/file', allow_empty=True)
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()