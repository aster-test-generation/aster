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
        result = self.dist_files._get_file_content("/path/to/file")
        self.assertEqual(result, "file content")

    @patch('ansible.module_utils.facts.system.distribution._file_exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_dist_file_content(self, mock_get_file_content, mock_file_exists):
        mock_file_exists.return_value = True
        mock_get_file_content.return_value = "file content"
        result = self.dist_files._get_dist_file_content("/path/to/file")
        self.assertEqual(result, (True, "file content"))

    def test_parse_dist_file(self):
        self.dist_files.SEARCH_STRING = {'name': 'search_string'}
        self.dist_files.OS_RELEASE_ALIAS = {'name': 'alias'}
        self.dist_files._get_file_content = MagicMock(return_value="search_string")
        collected_facts = {}
        result = self.dist_files._parse_dist_file('name', 'search_string', '/path/to/file', collected_facts)
        self.assertEqual(result, (True, {'distribution': 'name', 'distribution_file_search_string': 'search_string'}))

    @patch('ansible.module_utils.common.sys_info.get_distribution')
    @patch('ansible.module_utils.common.sys_info.get_distribution_version')
    @patch('ansible.module_utils.common.sys_info.get_distribution_codename')
    def test_guess_distribution(self, mock_get_distribution, mock_get_distribution_version, mock_get_distribution_codename):
        mock_get_distribution.return_value = 'dist'
        mock_get_distribution_version.return_value = '1.0'
        mock_get_distribution_codename.return_value = 'codename'
        result = self.dist_files._guess_distribution()
        self.assertEqual(result, {
            'distribution': 'dist',
            'distribution_version': '1.0',
            'distribution_release': 'codename',
            'distribution_major_version': '1'
        })

    @patch.object(DistributionFiles, '_get_dist_file_content')
    @patch.object(DistributionFiles, '_parse_dist_file')
    @patch.object(DistributionFiles, '_guess_distribution')
    def test_process_dist_files(self, mock_guess_distribution, mock_parse_dist_file, mock_get_dist_file_content):
        mock_guess_distribution.return_value = {'distribution': 'dist', 'distribution_version': '1.0', 'distribution_release': 'codename'}
        mock_get_dist_file_content.return_value = (True, 'file content')
        mock_parse_dist_file.return_value = (True, {'distribution': 'dist'})
        self.dist_files.OSDIST_LIST = [{'name': 'dist', 'path': '/path/to/file', 'allowempty': True}]
        result = self.dist_files.process_dist_files()
        self.assertEqual(result, {
            'distribution': 'dist',
            'distribution_version': '1.0',
            'distribution_release': 'codename',
            'distribution_file_path': '/path/to/file',
            'distribution_file_variety': 'dist',
            'distribution_file_parsed': True
        })

    def test_parse_distribution_file_Slackware(self):
        collected_facts = {}
        result = self.dist_files.parse_distribution_file_Slackware('Slackware', 'Slackware 14.2', '/path/to/file', collected_facts)
        self.assertEqual(result, (True, {'distribution': 'Slackware', 'distribution_version': '14.2'}))

    def test_parse_distribution_file_Amazon(self):
        collected_facts = {}
        result = self.dist_files.parse_distribution_file_Amazon('Amazon', 'Amazon Linux 2', '/etc/os-release', collected_facts)
        self.assertEqual(result, (True, {'distribution': 'Amazon', 'distribution_version': '2', 'distribution_major_version': '2', 'distribution_minor_version': 'NA'}))

    def test_parse_distribution_file_OpenWrt(self):
        collected_facts = {}
        result = self.dist_files.parse_distribution_file_OpenWrt('OpenWrt', 'DISTRIB_RELEASE="19.07.3"', '/path/to/file', collected_facts)
        self.assertEqual(result, (True, {'distribution': 'OpenWrt', 'distribution_version': '19.07.3'}))

    def test_parse_distribution_file_Alpine(self):
        collected_facts = {}
        result = self.dist_files.parse_distribution_file_Alpine('Alpine', '3.12.0', '/path/to/file', collected_facts)
        self.assertEqual(result, (True, {'distribution': 'Alpine', 'distribution_version': '3.12.0'}))

    def test_parse_distribution_file_SUSE(self):
        collected_facts = {}
        result = self.dist_files.parse_distribution_file_SUSE('SUSE', 'NAME="openSUSE Leap" VERSION_ID="15.2"', '/etc/os-release', collected_facts)
        self.assertEqual(result, (True, {'distribution': 'openSUSE Leap', 'distribution_version': '15.2', 'distribution_major_version': '15', 'distribution_release': '2'}))

    def test_parse_distribution_file_Debian(self):
        collected_facts = {'distribution_release': 'NA'}
        result = self.dist_files.parse_distribution_file_Debian('Debian', 'PRETTY_NAME="Debian GNU/Linux 10 (buster)"', '/path/to/file', collected_facts)
        self.assertEqual(result, (True, {'distribution': 'Debian', 'distribution_release': 'buster'}))

if __name__ == '__main__':
    unittest.main()