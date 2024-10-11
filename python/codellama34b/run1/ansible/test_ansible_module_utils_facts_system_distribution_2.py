import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def test_parse_distribution_file_Mandriva(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_Mandriva('Mandriva', 'DISTRIB_RELEASE="1" DISTRIB_CODENAME="2"', 'path', {'distribution_version': 'NA'})
        self.assertEqual(result, (True, {'distribution': 'Mandriva', 'distribution_version': '1', 'distribution_release': '2'}))

    def test_parse_distribution_file_NA(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_NA('NA', 'NAME="1" VERSION="2"', 'path', {'distribution_version': 'NA'})
        self.assertEqual(result, (True, {'distribution': '1', 'distribution_version': '2'}))

    def test_parse_distribution_file_Coreos(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_Coreos('Coreos', 'GROUP="1"', 'path', {'distribution_version': 'NA'})
        self.assertEqual(result, (True, {'distribution_release': '1'}))

    def test_parse_distribution_file_Flatcar(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_Flatcar('Flatcar', 'GROUP="1"', 'path', {'distribution_version': 'NA'})
        self.assertEqual(result, (True, {'distribution_release': '1'}))

    def test_parse_distribution_file_ClearLinux(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_ClearLinux('ClearLinux', 'NAME="Clear Linux" VERSION_ID="1" ID="2"', 'path', {'distribution_version': 'NA'})
        self.assertEqual(result, (True, {'distribution': 'Clear Linux', 'distribution_major_version': '1', 'distribution_version': '1', 'distribution_release': '2'}))

    def test_parse_distribution_file_CentOS(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_CentOS('CentOS', 'CentOS Stream', 'path', {'distribution_version': 'NA'})
        self.assertEqual(result, (True, {'distribution_release': 'Stream'}))

if __name__ == '__main__':
    unittest.main()