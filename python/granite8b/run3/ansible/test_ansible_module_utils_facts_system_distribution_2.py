import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def test_parse_distribution_file_Mandriva(self):
        df = DistributionFiles(None)
        name = 'Mandriva'
        data = 'DISTRIB_RELEASE="2.1"'
        path = '/etc/mandrake-release'
        collected_facts = {'distribution': 'Mandriva', 'distribution_version': '2.1', 'distribution_release': '2.1'}
        result = df.parse_distribution_file_Mandriva(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Mandriva')
        self.assertEqual(result[1]['distribution_version'], '2.1')
        self.assertEqual(result[1]['distribution_release'], '2.1')

    def test_parse_distribution_file_NA(self):
        df = DistributionFiles(None)
        name = 'NA'
        data = 'NAME="NA"\nVERSION="NA"'
        path = '/etc/os-release'
        collected_facts = {'distribution': 'NA', 'distribution_version': 'NA'}
        result = df.parse_distribution_file_NA(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'NA')
        self.assertEqual(result[1]['distribution_version'], 'NA')

    def test_parse_distribution_file_Coreos(self):
        df = DistributionFiles(None)
        name = 'Coreos'
        data = 'GROUP="Coreos"'
        path = '/etc/coreos/update.conf'
        collected_facts = {'distribution': 'Coreos', 'distribution_version': 'NA', 'distribution_release': 'NA'}
        result = df.parse_distribution_file_Coreos(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'Coreos')

    def test_parse_distribution_file_Flatcar(self):
        df = DistributionFiles(None)
        name = 'Flatcar'
        data = 'GROUP="Flatcar"'
        path = '/etc/coreos/update.conf'
        collected_facts = {'distribution': 'Flatcar', 'distribution_version': 'NA', 'distribution_release': 'NA'}
        result = df.parse_distribution_file_Flatcar(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'Flatcar')

    def test_parse_distribution_file_ClearLinux(self):
        df = DistributionFiles(None)
        name = 'clearlinux'
        data = 'NAME="Clear Linux"\nVERSION_ID="3456.7.8"\nID="clearlinux"'
        path = '/etc/os-release'
        collected_facts = {'distribution': 'clearlinux', 'distribution_version': 'NA', 'distribution_release': 'NA'}
        result = df.parse_distribution_file_ClearLinux(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Clear Linux')
        self.assertEqual(result[1]['distribution_major_version'], '3456')
        self.assertEqual(result[1]['distribution_version'], '3456.7.8')
        self.assertEqual(result[1]['distribution_release'], 'clearlinux')

    def test_parse_distribution_file_CentOS(self):
        df = DistributionFiles(None)
        name = 'CentOS Stream'
        data = 'CentOS Stream release 8'
        path = '/etc/centos-release'
        collected_facts = {'distribution': 'CentOS Stream', 'distribution_version': 'NA', 'distribution_release': 'NA'}
        result = df.parse_distribution_file_CentOS(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'Stream')

if __name__ == '__main__':
    unittest.main()