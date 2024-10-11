import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def test_parse_distribution_file_Mandriva(self):
        name = 'Mandriva'
        data = 'DISTRIB_RELEASE="1.0"\nDISTRIB_CODENAME="test"'
        path = '/etc/mandrake-release'
        collected_facts = {}
        df = DistributionFiles(None)
        result = df.parse_distribution_file_Mandriva(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Mandriva')
        self.assertEqual(result[1]['distribution_version'], '1.0')
        self.assertEqual(result[1]['distribution_release'], 'test')

    def test_parse_distribution_file_NA(self):
        name = 'NA'
        data = 'NAME="Test"\nVERSION="1.0"'
        path = '/etc/os-release'
        collected_facts = {'distribution_version': 'NA'}
        df = DistributionFiles(None)
        result = df.parse_distribution_file_NA(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Test')
        self.assertEqual(result[1]['distribution_version'], '1.0')

    def test_parse_distribution_file_Coreos(self):
        name = 'Coreos'
        data = 'GROUP="test"'
        path = '/etc/os-release'
        collected_facts = {}
        df = DistributionFiles(None)
        result = df.parse_distribution_file_Coreos(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'test')

    def test_parse_distribution_file_Flatcar(self):
        name = 'Flatcar'
        data = 'GROUP="test"'
        path = '/etc/os-release'
        collected_facts = {}
        df = DistributionFiles(None)
        result = df.parse_distribution_file_Flatcar(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'test')

    def test_parse_distribution_file_ClearLinux(self):
        name = 'Clear Linux'
        data = 'NAME="Clear Linux"\nVERSION_ID="1.0"\nID="clearlinux"'
        path = '/etc/os-release'
        collected_facts = {}
        df = DistributionFiles(None)
        result = df.parse_distribution_file_ClearLinux(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Clear Linux')
        self.assertEqual(result[1]['distribution_major_version'], '1.0')
        self.assertEqual(result[1]['distribution_version'], '1.0')
        self.assertEqual(result[1]['distribution_release'], 'clearlinux')

    def test_parse_distribution_file_CentOS(self):
        name = 'CentOS Stream'
        data = ''
        path = '/etc/os-release'
        collected_facts = {}
        df = DistributionFiles(None)
        result = df.parse_distribution_file_CentOS(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'Stream')

if __name__ == '__main__':
    unittest.main()