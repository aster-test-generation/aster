import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFiles(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.dist_files = DistributionFiles(self.module)

    def test_init(self):
        self.assertEqual(self.dist_files.module, self.module)

    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_file_content(self, mock_get_file_content):
        mock_get_file_content.return_value = "file content"
        result = self.dist_files._get_file_content("dummy_path")
        self.assertEqual(result, "file content")

    @patch('ansible.module_utils.facts.system.distribution._file_exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_dist_file_content(self, mock_get_file_content, mock_file_exists):
        mock_file_exists.return_value = True
        mock_get_file_content.return_value = "file content"
        result = self.dist_files._get_dist_file_content("dummy_path")
        self.assertEqual(result, (True, "file content"))

    @patch('ansible.module_utils.facts.system.distribution._file_exists')
    def test_get_dist_file_content_no_file(self, mock_file_exists):
        mock_file_exists.return_value = False
        result = self.dist_files._get_dist_file_content("dummy_path")
        self.assertEqual(result, (False, None))

    def test_parse_dist_file(self):
        self.dist_files.SEARCH_STRING = {'test': 'search_string'}
        result = self.dist_files._parse_dist_file('test', 'search_string', 'dummy_path', {})
        self.assertEqual(result, (True, {'distribution': 'test', 'distribution_file_search_string': 'search_string'}))

    def test_parse_dist_file_no_search_string(self):
        self.dist_files.SEARCH_STRING = {'test': 'search_string'}
        result = self.dist_files._parse_dist_file('test', 'no_match', 'dummy_path', {})
        self.assertEqual(result, (True, {'distribution': 'no_match'}))

    def test_parse_dist_file_os_release_alias(self):
        self.dist_files.OS_RELEASE_ALIAS = {'test': 'alias_string'}
        result = self.dist_files._parse_dist_file('test', 'alias_string', 'dummy_path', {})
        self.assertEqual(result, (True, {'distribution': 'test'}))

    def test_parse_dist_file_no_os_release_alias(self):
        self.dist_files.OS_RELEASE_ALIAS = {'test': 'alias_string'}
        result = self.dist_files._parse_dist_file('test', 'no_match', 'dummy_path', {})
        self.assertEqual(result, (False, {}))

    def test_parse_dist_file_attribute_error(self):
        result = self.dist_files._parse_dist_file('non_existent', 'content', 'dummy_path', {})
        self.assertEqual(result, (False, {}))

    @patch('ansible.module_utils.common.sys_info.get_distribution')
    @patch('ansible.module_utils.common.sys_info.get_distribution_version')
    @patch('ansible.module_utils.common.sys_info.get_distribution_codename')
    def test_guess_distribution(self, mock_get_distribution, mock_get_distribution_version, mock_get_distribution_codename):
        mock_get_distribution.return_value = 'TestDist'
        mock_get_distribution_version.return_value = '1.0'
        mock_get_distribution_codename.return_value = 'TestCode'
        result = self.dist_files._guess_distribution()
        self.assertEqual(result, {
            'distribution': 'TestDist',
            'distribution_version': '1.0',
            'distribution_release': 'TestCode',
            'distribution_major_version': '1'
        })

    @patch.object(DistributionFiles, '_guess_distribution')
    @patch.object(DistributionFiles, '_get_dist_file_content')
    @patch.object(DistributionFiles, '_parse_dist_file')
    def test_process_dist_files(self, mock_parse_dist_file, mock_get_dist_file_content, mock_guess_distribution):
        mock_guess_distribution.return_value = {'distribution': 'TestDist', 'distribution_version': '1.0', 'distribution_release': 'TestCode', 'distribution_major_version': '1'}
        self.dist_files.OSDIST_LIST = [{'name': 'TestDist', 'path': 'dummy_path', 'allowempty': True}]
        mock_get_dist_file_content.return_value = (True, 'file content')
        mock_parse_dist_file.return_value = (True, {'distribution': 'TestDist'})
        result = self.dist_files.process_dist_files()
        self.assertEqual(result, {
            'distribution': 'TestDist',
            'distribution_version': '1.0',
            'distribution_release': 'TestCode',
            'distribution_major_version': '1',
            'distribution_file_path': 'dummy_path',
            'distribution_file_variety': 'TestDist',
            'distribution_file_parsed': True
        })

    def test_parse_distribution_file_Slackware(self):
        result = self.dist_files.parse_distribution_file_Slackware('Slackware', 'Slackware 14.2', 'dummy_path', {})
        self.assertEqual(result, (True, {'distribution': 'Slackware', 'distribution_version': '14.2'}))

    def test_parse_distribution_file_Amazon(self):
        result = self.dist_files.parse_distribution_file_Amazon('Amazon', 'Amazon Linux 2', 'dummy_path', {})
        self.assertEqual(result, (True, {'distribution': 'Amazon', 'distribution_version': '2'}))

    def test_parse_distribution_file_OpenWrt(self):
        result = self.dist_files.parse_distribution_file_OpenWrt('OpenWrt', 'DISTRIB_RELEASE="19.07.3"', 'dummy_path', {})
        self.assertEqual(result, (True, {'distribution': 'OpenWrt', 'distribution_version': '19.07.3'}))

    def test_parse_distribution_file_Alpine(self):
        result = self.dist_files.parse_distribution_file_Alpine('Alpine', '3.12.0', 'dummy_path', {})
        self.assertEqual(result, (True, {'distribution': 'Alpine', 'distribution_version': '3.12.0'}))

    def test_parse_distribution_file_SUSE(self):
        result = self.dist_files.parse_distribution_file_SUSE('SUSE', 'SUSE Linux Enterprise Server 15', 'dummy_path', {})
        self.assertEqual(result, (True, {'distribution': 'SUSE'}))

    def test_parse_distribution_file_Debian(self):
        result = self.dist_files.parse_distribution_file_Debian('Debian', 'PRETTY_NAME="Debian GNU/Linux 10 (buster)"', 'dummy_path', {})
        self.assertEqual(result, (True, {'distribution': 'Debian', 'distribution_release': 'buster'}))

if __name__ == '__main__':
    unittest.main()