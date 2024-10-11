import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def test_parse_distribution_file_Mandriva(self):
        instance = DistributionFiles(None)
        data = "Distributor ID: Mandriva\nRelease: 2019.2\nCodename: NA"
        name = "Mandriva"
        path = "/etc/mandriva-release"
        collected_facts = {}
        result = instance.parse_distribution_file_Mandriva(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Mandriva')
        self.assertEqual(result[1]['distribution_version'], '2019.2')
        self.assertEqual(result[1]['distribution_release'], 'NA')

    def test_parse_distribution_file_NA(self):
        instance = DistributionFiles(None)
        data = "NAME=NA\nVERSION=NA"
        name = "NA"
        path = "/etc/os-release"
        collected_facts = {'distribution_version': 'NA'}
        result = instance.parse_distribution_file_NA(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'NA')
        self.assertEqual(result[1]['distribution_version'], 'NA')

    def test_parse_distribution_file_Coreos(self):
        instance = DistributionFiles(None)
        data = "GROUP=stable"
        name = "Coreos"
        path = "/etc/coreos/update.conf"
        collected_facts = {}
        result = instance.parse_distribution_file_Coreos(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'stable')

    def test_parse_distribution_file_Flatcar(self):
        instance = DistributionFiles(None)
        data = "GROUP=stable"
        name = "Flatcar"
        path = "/etc/coreos/update.conf"
        collected_facts = {}
        result = instance.parse_distribution_file_Flatcar(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'stable')

    def test_parse_distribution_file_ClearLinux(self):
        instance = DistributionFiles(None)
        data = "NAME=\"Clear Linux OS\"\nVERSION_ID=\"31535\"\nID=\"clear-linux-os\""
        name = "clear-linux-os"
        path = "/etc/os-release"
        collected_facts = {}
        result = instance.parse_distribution_file_ClearLinux(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Clear Linux')
        self.assertEqual(result[1]['distribution_major_version'], '31535')
        self.assertEqual(result[1]['distribution_version'], '31535')
        self.assertEqual(result[1]['distribution_release'], 'clear-linux-os')

    def test_parse_distribution_file_CentOS(self):
        instance = DistributionFiles(None)
        data = "CentOS Stream 8"
        name = "CentOS"
        path = "/etc/redhat-release"
        collected_facts = {}
        result = instance.parse_distribution_file_CentOS(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'Stream')

if __name__ == '__main__':
    unittest.main()