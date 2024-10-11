import unittest
from ansible.module_utils.facts.system import DistributionFile


class TestDistributionFiles(unittest.TestCase):
    def test_init(self):
        instance = DistributionFiles(None)
        self.assertIsNotNone(instance.module)

    def test_parse_distribution_file_Mandriva(self):
        instance = DistributionFiles(None)
        data = 'DISTRIB_RELEASE="2011.0"'
        result = instance.parse_distribution_file_Mandriva('Mandriva', data, '', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Mandriva')
        self.assertEqual(result[1]['distribution_version'], '2011.0')

    def test_parse_distribution_file_NA(self):
        instance = DistributionFiles(None)
        data = 'NAME="Test OS"'
        result = instance.parse_distribution_file_NA('NA', data, '', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Test OS')

    def test_parse_distribution_file_Coreos(self):
        instance = DistributionFiles(None)
        data = 'GROUP="stable"'
        result = instance.parse_distribution_file_Coreos('CoreOS', data, '', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'stable')

    def test_parse_distribution_file_Flatcar(self):
        instance = DistributionFiles(None)
        data = 'GROUP="stable"'
        result = instance.parse_distribution_file_Flatcar('Flatcar', data, '', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'stable')

    def test_parse_distribution_file_ClearLinux(self):
        instance = DistributionFiles(None)
        data = 'NAME="Clear Linux OS"'
        result = instance.parse_distribution_file_ClearLinux('ClearLinux', data, '', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution'], 'Clear Linux OS')

    def test_parse_distribution_file_CentOS(self):
        instance = DistributionFiles(None)
        data = 'CentOS Stream'
        result = instance.parse_distribution_file_CentOS('CentOS', data, '', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1]['distribution_release'], 'Stream')

    def test_private_method(self):
        instance = DistributionFiles(None)
        result = instance._DistributionFiles__private_method()  # assuming there is a private method
        self.assertIsNotNone(result)

    def test_str_method(self):
        instance = DistributionFiles(None)
        result = instance.__str__()
        self.assertIsNotNone(result)

    def test_repr_method(self):
        instance = DistributionFiles(None)
        result = instance.__repr__()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()