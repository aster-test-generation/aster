import unittest
from ansible.module_utils.facts.system import DistributionFactCollecto


class TestDistributionFiles(unittest.TestCase):
    def test_init(self):
        instance = DistributionFiles(None)
        self.assertIsNotNone(instance)

    def test_get_file_content(self):
        instance = DistributionFiles(None)
        result = instance._get_file_content('path/to/file')
        self.assertIsNone(result)

    def test_get_dist_file_content(self):
        instance = DistributionFiles(None)
        result = instance._get_dist_file_content('path/to/file', allow_empty=False)
        self.assertIsNone(result)

    def test_parse_dist_file_Slackware(self):
        instance = DistributionFiles(None)
        data = 'Slackware 14.2'
        result = instance.parse_distribution_file_Slackware('Slackware', data, 'path', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1], {'distribution': 'Slackware', 'distribution_version': '14.2'})

    def test_parse_dist_file_Amazon(self):
        instance = DistributionFiles(None)
        data = 'VERSION_ID="2018.03.1"'
        result = instance.parse_distribution_file_Amazon('Amazon', data, '/etc/os-release', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1], {'distribution': 'Amazon', 'distribution_version': '2018.03.1'})

    def test_parse_dist_file_OpenWrt(self):
        instance = DistributionFiles(None)
        data = 'DISTRIB_RELEASE="18.06.2"'
        result = instance.parse_distribution_file_OpenWrt('OpenWrt', data, 'path', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1], {'distribution': 'OpenWrt', 'distribution_version': '18.06.2'})

    def test_parse_dist_file_Alpine(self):
        instance = DistributionFiles(None)
        data = '3.10.0'
        result = instance.parse_distribution_file_Alpine('Alpine', data, 'path', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1], {'distribution': 'Alpine', 'distribution_version': '3.10.0'})

    def test_parse_dist_file_SUSE(self):
        instance = DistributionFiles(None)
        data = 'NAME="SUSE Linux Enterprise Server 12"'
        result = instance.parse_distribution_file_SUSE('SUSE', data, '/etc/os-release', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1], {'distribution': 'SUSE', 'distribution_version': '12'})

    def test_parse_dist_file_Debian(self):
        instance = DistributionFiles(None)
        data = 'PRETTY_NAME="Debian GNU/Linux 10 (buster)"'
        result = instance.parse_distribution_file_Debian('Debian', data, '/etc/os-release', {})
        self.assertTrue(result[0])
        self.assertEqual(result[1], {'distribution': 'Debian', 'distribution_release': 'buster'})

    def test_process_dist_files(self):
        instance = DistributionFiles(None)
        result = instance.process_dist_files()
        self.assertEqual(result, {})

    def test_guess_distribution(self):
        instance = DistributionFiles(None)
        result = instance._guess_distribution()
        self.assertEqual(result, {'distribution': 'NA', 'distribution_version': 'NA', 'distribution_release': 'NA'})

    def test_str_method(self):
        instance = DistributionFiles(None)
        result = instance.__str__()
        self.assertEqual(result, 'DistributionFiles')

    def test_repr_method(self):
        instance = DistributionFiles(None)
        result = instance.__repr__()
        self.assertEqual(result, 'DistributionFiles(None)')

    def test_eq_method(self):
        instance1 = DistributionFiles(None)
        instance2 = DistributionFiles(None)
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()