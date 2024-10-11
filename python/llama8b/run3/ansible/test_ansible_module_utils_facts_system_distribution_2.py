import unittest
from ansible.module_utils.facts.system import DistributionFactCollecto


class TestDistributionFiles(unittest.TestCase):
    def test_parse_distribution_file_Mandriva(self):
        instance = DistributionFiles(None)
        data = "DISTRIB_RELEASE=\"2.1.0\"\nDISTRIB_CODENAME=\"test\"\n"
        name = "Mandriva"
        path = ""
        collected_facts = {}
        result = instance.parse_distribution_file_Mandriva(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Mandriva')
        self.assertEqual(result[1]['distribution_version'], '2.1.0')
        self.assertEqual(result[1]['distribution_release'], 'test')

    def test_parse_distribution_file_NA(self):
        instance = DistributionFiles(None)
        data = "NAME=\"test\"\nVERSION=\"2.1.0\"\n"
        name = "NA"
        path = ""
        collected_facts = {}
        result = instance.parse_distribution_file_NA(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'test')
        self.assertEqual(result[1]['distribution_version'], '2.1.0')

    def test_parse_distribution_file_Coreos(self):
        instance = DistributionFiles(None)
        data = "GROUP=\"test\"\n"
        name = "Coreos"
        path = ""
        collected_facts = {}
        result = instance.parse_distribution_file_Coreos(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'test')

    def test_parse_distribution_file_Flatcar(self):
        instance = DistributionFiles(None)
        data = "GROUP=\"test\"\n"
        name = "Flatcar"
        path = ""
        collected_facts = {}
        result = instance.parse_distribution_file_Flatcar(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'test')

    def test_parse_distribution_file_ClearLinux(self):
        instance = DistributionFiles(None)
        data = "NAME=\"Clear Linux\"\nVERSION_ID=\"2.1.0\"\nID=\"test\"\n"
        name = "ClearLinux"
        path = ""
        collected_facts = {}
        result = instance.parse_distribution_file_ClearLinux(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Clear Linux')
        self.assertEqual(result[1]['distribution_major_version'], '2.1.0')
        self.assertEqual(result[1]['distribution_version'], '2.1.0')
        self.assertEqual(result[1]['distribution_release'], 'test')

    def test_parse_distribution_file_CentOS(self):
        instance = DistributionFiles(None)
        data = "CentOS Stream\n"
        name = "CentOS"
        path = ""
        collected_facts = {}
        result = instance.parse_distribution_file_CentOS(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'Stream')

    def test_parse_distribution_file_CentOS_False(self):
        instance = DistributionFiles(None)
        data = "Not CentOS\n"
        name = "CentOS"
        path = ""
        collected_facts = {}
        result = instance.parse_distribution_file_CentOS(name, data, path, collected_facts)
        self.assertFalse(result[0])

if __name__ == '__main__':
    unittest.main()