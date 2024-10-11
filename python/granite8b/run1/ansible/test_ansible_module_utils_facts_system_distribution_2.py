import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def test_parse_distribution_file_Mandriva(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_Mandriva('Mandriva', 'Mandriva', '/etc/mandrake-release', {})
        self.assertEqual(result, (True, {'distribution': 'Mandriva'}))

    def test_parse_distribution_file_NA(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_NA('NA', 'NAME="NA"\nVERSION="NA"', '/etc/os-release', {'distribution_version': 'NA'})
        self.assertEqual(result, (True, {'distribution': 'NA', 'distribution_version': 'NA'}))

    def test_parse_distribution_file_Coreos(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_Coreos('Coreos', 'GROUP="Coreos"', '/etc/coreos/update.conf', {})
        self.assertEqual(result, (True, {'distribution_release': 'Coreos'}))

    def test_parse_distribution_file_Flatcar(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_Flatcar('Flatcar', 'GROUP="Flatcar"', '/etc/flatcar-release', {})
        self.assertEqual(result, (True, {'distribution_release': 'Flatcar'}))

    def test_parse_distribution_file_ClearLinux(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_ClearLinux('Clear Linux', 'NAME="Clear Linux"\nVERSION_ID="35161"\nID="clearlinux"', '/etc/os-release', {})
        self.assertEqual(result, (True, {'distribution': 'Clear Linux', 'distribution_major_version': '35161', 'distribution_version': '35161', 'distribution_release': 'clearlinux'}))

    def test_parse_distribution_file_CentOS(self):
        instance = DistributionFiles(None)
        result = instance.parse_distribution_file_CentOS('CentOS Stream', 'CentOS Stream', '/etc/centos-release', {})
        self.assertEqual(result, (True, {'distribution_release': 'Stream'}))

if __name__ == '__main__':
    unittest.main()