import unittest
from ansible.module_utils.facts.system import DistributionFactCollecto


class TestDistributionFiles(unittest.TestCase):
    def test_init(self):
        instance = DistributionFiles(None)
        self.assertIsNotNone(instance)

    def test_parse_distribution_file_Mandriva(self):
        instance = DistributionFiles(None)
        data = "DISTRIB_RELEASE=\"2.1\"\nDISTRIB_CODENAME=\"Test\"\n"
        name = "Mandriva"
        path = "path"
        collected_facts = {}
        result = instance.parse_distribution_file_Mandriva(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Mandriva')
        self.assertEqual(result[1]['distribution_version'], '2.1')
        self.assertEqual(result[1]['distribution_release'], 'Test')

    def test_parse_distribution_file_NA(self):
        instance = DistributionFiles(None)
        data = "NAME=\"Test\"\nVERSION=\"1.0\"\n"
        name = "NA"
        path = "path"
        collected_facts = {'distribution_version': 'NA'}
        result = instance.parse_distribution_file_NA(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Test')
        self.assertEqual(result[1]['distribution_version'], '1.0')

    def test_parse_distribution_file_Coreos(self):
        instance = DistributionFiles(None)
        data = "GROUP=\"Test\"\n"
        name = "Coreos"
        path = "path"
        collected_facts = {}
        result = instance.parse_distribution_file_Coreos(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'Test')

    def test_parse_distribution_file_Flatcar(self):
        instance = DistributionFiles(None)
        data = "GROUP=\"Test\"\n"
        name = "Flatcar"
        path = "path"
        collected_facts = {}
        result = instance.parse_distribution_file_Flatcar(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'Test')

    def test_parse_distribution_file_ClearLinux(self):
        instance = DistributionFiles(None)
        data = "NAME=\"Clear Linux\"\nVERSION_ID=\"1.0\"\nID=\"Test\"\n"
        name = "ClearLinux"
        path = "path"
        collected_facts = {}
        result = instance.parse_distribution_file_ClearLinux(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Clear Linux')
        self.assertEqual(result[1]['distribution_major_version'], '1.0')
        self.assertEqual(result[1]['distribution_version'], '1.0')
        self.assertEqual(result[1]['distribution_release'], 'Test')

    def test_parse_distribution_file_CentOS(self):
        instance = DistributionFiles(None)
        data = "CentOS Stream\n"
        name = "CentOS"
        path = "path"
        collected_facts = {}
        result = instance.parse_distribution_file_CentOS(name, data, path, collected_facts)
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'Stream')

if __name__ == '__main__':
    unittest.main()