import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def test_get_file_content(self):
        instance = DistributionFiles(None)
        result = instance._get_file_content(None)
        self.assertEqual(result, None)

    def test_get_dist_file_content(self):
        instance = DistributionFiles(None)
        result = instance._get_dist_file_content(None, None)
        self.assertEqual(result, (False, None))

    def test_parse_dist_file(self):
        instance = DistributionFiles(None)
        result = instance._parse_dist_file(None, None, None, None)
        self.assertEqual(result, (False, {}))

    def test_guess_distribution(self):
        instance = DistributionFiles(None)
        result = instance._guess_distribution()
        self.assertEqual(result, {'distribution': None, 'distribution_file_path': None, 'distribution_file_variety': None, 'distribution_file_parsed': None, 'distribution_version': None, 'distribution_major_version': None, 'distribution_release': None})

    def test_process_dist_files(self):
        instance = DistributionFiles(None)
        result = instance.process_dist_files()
        self.assertEqual(result, {'distribution': None, 'distribution_file_path': None, 'distribution_file_variety': None, 'distribution_file_parsed': None, 'distribution_version': None, 'distribution_major_version': None, 'distribution_release': None})

    def test_parse_distribution_file_Slackware(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_Slackware(None, None, None, None)
        self.assertEqual(result, (False, {}))

    def test_parse_distribution_file_Amazon(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_Amazon(None, None, None, None)
        self.assertEqual(result, (False, {}))

    def test_parse_distribution_file_OpenWrt(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_OpenWrt(None, None, None, None)
        self.assertEqual(result, (False, {}))

    def test_parse_distribution_file_Alpine(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_Alpine(None, None, None, None)
        self.assertEqual(result, (False, {}))

    def test_parse_distribution_file_SUSE(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_SUSE(None, None, None, None)
        self.assertEqual(result, (False, {}))

    def test_parse_distribution_file_Debian(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_Debian(None, None, None, None)
        self.assertEqual(result, (False, {}))

if __name__ == '__main__':
    unittest.main()