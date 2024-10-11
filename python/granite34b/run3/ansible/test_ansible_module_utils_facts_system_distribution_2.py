import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def test_parse_distribution_file_Mandriva(self):
        name = 'Mandriva'
        data = 'DISTRIB_RELEASE="1.2.3"\nDISTRIB_CODENAME="example"'
        path = '/etc/mandrake-release'
        collected_facts = {}
        df = DistributionFiles(None)
        result, facts = df.parse_distribution_file_Mandriva(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts, {'distribution': 'Mandriva', 'distribution_version': '1.2.3', 'distribution_release': 'example'})

    def test_parse_distribution_file_NA(self):
        name = 'NA'
        data = 'NAME="Example"\nVERSION="1.2.3"'
        path = '/etc/os-release'
        collected_facts = {'distribution_version': 'NA'}
        df = DistributionFiles(None)
        result, facts = df.parse_distribution_file_NA(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts, {'distribution': 'Example', 'distribution_version': '1.2.3'})

    def test_parse_distribution_file_Coreos(self):
        name = 'Coreos'
        data = 'GROUP="example"'
        path = '/etc/os-release'
        collected_facts = {}
        df = DistributionFiles(None)
        result, facts = df.parse_distribution_file_Coreos(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts, {'distribution_release': 'example'})

    def test_parse_distribution_file_Flatcar(self):
        name = 'Flatcar'
        data = 'GROUP="example"'
        path = '/etc/os-release'
        collected_facts = {}
        df = DistributionFiles(None)
        result, facts = df.parse_distribution_file_Flatcar(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts, {'distribution_release': 'example'})

    def test_parse_distribution_file_ClearLinux(self):
        name = 'Clear Linux'
        data = 'NAME="Clear Linux"\nVERSION_ID="1.2.3"\nID="clearlinux"'
        path = '/etc/os-release'
        collected_facts = {}
        df = DistributionFiles(None)
        result, facts = df.parse_distribution_file_ClearLinux(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts, {'distribution': 'Clear Linux', 'distribution_major_version': '1.2.3', 'distribution_version': '1.2.3', 'distribution_release': 'clearlinux'})

    def test_parse_distribution_file_CentOS(self):
        name = 'CentOS Stream'
        data = ''
        path = '/etc/os-release'
        collected_facts = {}
        df = DistributionFiles(None)
        result, facts = df.parse_distribution_file_CentOS(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts, {'distribution_release': 'Stream'})

if __name__ == '__main__':
    unittest.main()