import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def test_parse_distribution_file_Mandriva(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_Mandriva('Mandriva', 'Mandriva', 'Mandriva', 'Mandriva')
        self.assertEqual(result, ('Mandriva', 'Mandriva'))

    def test_parse_distribution_file_NA(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_NA('NA', 'NA', 'NA', 'NA')
        self.assertEqual(result, ('NA', 'NA'))

    def test_parse_distribution_file_Coreos(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_Coreos('Coreos', 'Coreos', 'Coreos', 'Coreos')
        self.assertEqual(result, ('Coreos', 'Coreos'))

    def test_parse_distribution_file_Flatcar(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_Flatcar('Flatcar', 'Flatcar', 'Flatcar', 'Flatcar')
        self.assertEqual(result, ('Flatcar', 'Flatcar'))

    def test_parse_distribution_file_ClearLinux(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_ClearLinux('ClearLinux', 'ClearLinux', 'ClearLinux', 'ClearLinux')
        self.assertEqual(result, ('ClearLinux', 'ClearLinux'))

    def test_parse_distribution_file_CentOS(self):
        instance = DistributionFiles()
        result = instance.parse_distribution_file_CentOS('CentOS', 'CentOS', 'CentOS', 'CentOS')
        self.assertEqual(result, ('CentOS', 'CentOS'))

if __name__ == '__main__':
    unittest.main()