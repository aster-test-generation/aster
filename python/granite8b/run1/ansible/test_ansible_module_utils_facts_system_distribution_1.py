import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def test_get_file_content(self):
        instance = DistributionFiles(None)
        result = instance._get_file_content('/path/to/file')
        self.assertIsInstance(result, str)

    def test_get_dist_file_content(self):
        instance = DistributionFiles(None)
        result = instance._get_dist_file_content('/path/to/file', allow_empty=True)
        self.assertIsInstance(result, tuple)
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], bool)
        self.assertIsInstance(result[1], str)

    def test_parse_dist_file(self):
        instance = DistributionFiles(None)
        result = instance._parse_dist_file('Slackware', 'data', '/path/to/file', {})
        self.assertIsInstance(result, tuple)
        self.assertEqual(len(result), 2)
        self.assertIsInstance(result[0], bool)
        self.assertIsInstance(result[1], dict)

    def test_guess_distribution(self):
        instance = DistributionFiles(None)
        result = instance._guess_distribution()
        self.assertIsInstance(result, dict)
        self.assertIn('distribution', result)
        self.assertIn('distribution_version', result)
        self.assertIn('distribution_release', result)

    def test_process_dist_files(self):
        instance = DistributionFiles(None)
        result = instance.process_dist_files()
        self.assertIsInstance(result, dict)
        self.assertIn('distribution', result)
        self.assertIn('distribution_version', result)
        self.assertIn('distribution_release', result)

if __name__ == '__main__':
    unittest.main()