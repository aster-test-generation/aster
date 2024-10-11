import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector



class TestDistributionFiles(unittest.TestCase):
    def test_get_file_content(self):
        instance = DistributionFiles()
        result = instance._get_file_content('path')
        self.assertEqual(result, None)

    def test_get_dist_file_content(self):
        instance = DistributionFiles()
        result = instance._get_dist_file_content('path', allow_empty=False)
        self.assertEqual(result, (False, None))

    def test_parse_dist_file(self):
        instance = DistributionFiles()
        result = instance._parse_dist_file('name', 'data', 'path', {})
        self.assertEqual(result, (False, {}))

    def test_guess_distribution(self):
        instance = DistributionFiles()
        result = instance._guess_distribution()
        self.assertEqual(result, {'distribution': 'NA', 'distribution_version': 'NA', 'distribution_release': 'NA', 'distribution_major_version': 'NA'})

    def test_process_dist_files(self):
        instance = DistributionFiles()
        result = instance.process_dist_files()
        self.assertEqual(result, {'distribution': 'NA', 'distribution_file_path': None, 'distribution_file_variety': None, 'distribution_file_parsed': False})

    def test_parse_distribution_file_Slackware(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_Slackware('name', 'data', 'path', {})
        self.assertEqual(result, (False, {}))

    def test_parse_distribution_file_Amazon(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_Amazon('name', 'data', 'path', {})
        self.assertEqual(result, (False, {}))

    def test_parse_distribution_file_OpenWrt(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_OpenWrt('name', 'data', 'path', {})
        self.assertEqual(result, (False, {}))

    def test_parse_distribution_file_Alpine(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_Alpine('name', 'data', 'path', {})
        self.assertEqual(result, (False, {}))

    def test_parse_distribution_file_SUSE(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_SUSE('name', 'data', 'path', {})
        self.assertEqual(result, (False, {}))

    def test_parse_distribution_file_Debian(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_Debian('name', 'data', 'path', {})
        self.assertEqual(result, (False, {}))

class TestBaseFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = BaseFactCollector()
        result = instance.collect()
        self.assertEqual(result, {})

    def test_collect_base_facts(self):
        instance = BaseFactCollector()
        result = instance.collect_base_facts()
        self.assertEqual(result, {})

    def test_collect_distribution_facts(self):
        instance = BaseFactCollector()
        result = instance.collect_distribution_facts()
        self.assertEqual(result, {})

    def test_collect_hardware_facts(self):
        instance = BaseFactCollector()
        result = instance.collect_hardware_facts()
        self.assertEqual(result, {})

    def test_collect_network_facts(self):
        instance = BaseFactCollector()
        result = instance.collect_network_facts()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()