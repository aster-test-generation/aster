import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def setUp(self):
        self.module = None  # Mock or create a suitable module object if needed
        self.distribution_files = DistributionFiles(self.module)

    def test_parse_distribution_file_Mandriva(self):
        name = "Mandriva"
        data = 'DISTRIB_RELEASE="2021"\nDISTRIB_CODENAME="Mandriva2021"'
        path = "/etc/mandriva-release"
        collected_facts = {}
        result, facts = self.distribution_files.parse_distribution_file_Mandriva(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts['distribution'], 'Mandriva')
        self.assertEqual(facts['distribution_version'], '2021')
        self.assertEqual(facts['distribution_release'], 'Mandriva2021')

    def test_parse_distribution_file_Mandriva_no_match(self):
        name = "NotMandriva"
        data = 'DISTRIB_RELEASE="2021"\nDISTRIB_CODENAME="Mandriva2021"'
        path = "/etc/mandriva-release"
        collected_facts = {}
        result, facts = self.distribution_files.parse_distribution_file_Mandriva(name, data, path, collected_facts)
        self.assertFalse(result)
        self.assertEqual(facts, {})

    def test_parse_distribution_file_NA(self):
        name = "NA"
        data = 'NAME="NA"\nVERSION="1.0"'
        path = "/etc/na-release"
        collected_facts = {'distribution_version': 'NA'}
        result, facts = self.distribution_files.parse_distribution_file_NA(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts['distribution'], 'NA')
        self.assertEqual(facts['distribution_version'], '1.0')

    def test_parse_distribution_file_Coreos(self):
        name = "CoreOS"
        data = 'GROUP="stable"'
        path = "/etc/coreos-release"
        collected_facts = {}
        result, facts = self.distribution_files.parse_distribution_file_Coreos(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts['distribution_release'], 'stable')

    def test_parse_distribution_file_Coreos_no_match(self):
        name = "NotCoreOS"
        data = 'GROUP="stable"'
        path = "/etc/coreos-release"
        collected_facts = {}
        result, facts = self.distribution_files.parse_distribution_file_Coreos(name, data, path, collected_facts)
        self.assertFalse(result)
        self.assertEqual(facts, {})

    def test_parse_distribution_file_Flatcar(self):
        name = "Flatcar"
        data = 'GROUP="stable"'
        path = "/etc/flatcar-release"
        collected_facts = {}
        result, facts = self.distribution_files.parse_distribution_file_Flatcar(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts['distribution_release'], 'stable')

    def test_parse_distribution_file_Flatcar_no_match(self):
        name = "NotFlatcar"
        data = 'GROUP="stable"'
        path = "/etc/flatcar-release"
        collected_facts = {}
        result, facts = self.distribution_files.parse_distribution_file_Flatcar(name, data, path, collected_facts)
        self.assertFalse(result)
        self.assertEqual(facts, {})

    def test_parse_distribution_file_ClearLinux(self):
        name = "ClearLinux"
        data = 'NAME="Clear Linux OS"\nVERSION_ID=12345\nID=clearlinux'
        path = "/etc/clearlinux-release"
        collected_facts = {}
        result, facts = self.distribution_files.parse_distribution_file_ClearLinux(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts['distribution'], 'Clear Linux OS')
        self.assertEqual(facts['distribution_major_version'], '12345')
        self.assertEqual(facts['distribution_version'], '12345')
        self.assertEqual(facts['distribution_release'], 'clearlinux')

    def test_parse_distribution_file_ClearLinux_no_match(self):
        name = "NotClearLinux"
        data = 'NAME="Not Clear Linux OS"\nVERSION_ID=12345\nID=notclearlinux'
        path = "/etc/notclearlinux-release"
        collected_facts = {}
        result, facts = self.distribution_files.parse_distribution_file_ClearLinux(name, data, path, collected_facts)
        self.assertFalse(result)
        self.assertEqual(facts, {})

    def test_parse_distribution_file_CentOS(self):
        name = "CentOS"
        data = 'CentOS Stream release 8'
        path = "/etc/centos-release"
        collected_facts = {}
        result, facts = self.distribution_files.parse_distribution_file_CentOS(name, data, path, collected_facts)
        self.assertTrue(result)
        self.assertEqual(facts['distribution_release'], 'Stream')

    def test_parse_distribution_file_CentOS_no_match(self):
        name = "NotCentOS"
        data = 'Not CentOS Stream release 8'
        path = "/etc/notcentos-release"
        collected_facts = {}
        result, facts = self.distribution_files.parse_distribution_file_CentOS(name, data, path, collected_facts)
        self.assertFalse(result)
        self.assertEqual(facts, {})

if __name__ == '__main__':
    unittest.main()