import unittest
from ansible.module_utils.facts.system.distribution import get_distribution, get_distribution_version, get_distribution_codename, get_uname, DistributionFactCollector


class TestDistribution(unittest.TestCase):
    def test_get_distribution(self):
        self.assertEqual(get_distribution(), 'Debian')

    def test_get_distribution_version(self):
        self.assertEqual(get_distribution_version(), '11.0')

    def test_get_distribution_codename(self):
        self.assertEqual(get_distribution_codename(), 'bullseye')

    def test_get_uname(self):
        self.assertEqual(get_uname(), 'Linux')

    def test__file_exists(self):
        self.assertTrue(_file_exists('/etc/os-release'))
        self.assertFalse(_file_exists('/nonexistent/file', allow_empty=True))

if __name__ == '__main__':
    unittest.main()