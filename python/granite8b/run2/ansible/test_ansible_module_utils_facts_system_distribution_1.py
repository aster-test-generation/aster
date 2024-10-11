import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def test_get_file_content(self):
        instance = DistributionFiles(None)
        result = instance._get_file_content('/path/to/file')
        self.assertEqual(result, 'file content')

    def test_get_dist_file_content(self):
        instance = DistributionFiles(None)
        result = instance._get_dist_file_content('/path/to/file', allow_empty=True)
        self.assertEqual(result, (True, 'file content'))

    def test_parse_dist_file(self):
        instance = DistributionFiles(None)
        result = instance._parse_dist_file('name', 'dist_file_content', '/path/to/file', {})
        self.assertEqual(result, (True, {'distribution': 'name', 'distribution_file_search_string': 'dist_file_content'}))

    def test_guess_distribution(self):
        instance = DistributionFiles(None)
        result = instance._guess_distribution()
        self.assertEqual(result, {'distribution': 'Linux', 'distribution_version': '4.15.0-72-generic', 'distribution_release': 'NA'})

    def test_process_dist_files(self):
        instance = DistributionFiles(None)
        result = instance.process_dist_files()
        self.assertEqual(result, {'distribution': 'Linux', 'distribution_version': '4.15.0-72-generic', 'distribution_release': 'NA', 'distribution_major_version': '4'})

    def test_parse_distribution_file_Slackware(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_Slackware('Slackware', 'Slackware dist_file_content', '/path/to/file', {})
        self.assertEqual(result, (False, {}))

if __name__ == '__main__':
    unittest.main()