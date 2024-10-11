import unittest
from ansible.module_utils.facts.system import DistributionFile


class TestDistributionFiles(unittest.TestCase):
    def setUp(self):
        self.module = MockModule()
        self.distribution_files = DistributionFiles(self.module)

    def test___init__(self):
        self.assertIsInstance(self.distribution_files, DistributionFiles)

    def test__get_file_content(self):
        path = '/path/to/file'
        content = 'file content'
        self.module.get_file_content.return_value = content
        result = self.distribution_files._get_file_content(path)
        self.assertEqual(result, content)

    def test__get_dist_file_content(self):
        path = '/path/to/dist/file'
        allow_empty = True
        content = 'dist file content'
        self.module.get_file_content.return_value = content
        result = self.distribution_files._get_dist_file_content(path, allow_empty)
        self.assertEqual(result, (True, content))

    def test__parse_dist_file(self):
        name = 'Slackware'
        dist_file_content = 'Slackware content'
        path = '/path/to/dist/file'
        collected_facts = {}
        result = self.distribution_files._parse_dist_file(name, dist_file_content, path, collected_facts)
        self.assertEqual(result, (True, {'distribution': 'Slackware'}))

    def test__guess_distribution(self):
        dist = ('Slackware', '14.1', 'stable')
        self.module.get_distribution.return_value = dist
        result = self.distribution_files._guess_distribution()
        self.assertEqual(result, {'distribution': 'Slackware', 'distribution_version': '14.1', 'distribution_release': 'stable'})

    def test_process_dist_files(self):
        osdist_list = [{'name': 'Slackware', 'path': '/path/to/dist/file'}]
        self.distribution_files.OSDIST_LIST = osdist_list
        result = self.distribution_files.process_dist_files()
        self.assertEqual(result, {'distribution': 'Slackware', 'distribution_file_path': '/path/to/dist/file'})

    def test_parse_distribution_file_Slackware(self):
        name = 'Slackware'
        data = 'Slackware content'
        path = '/path/to/dist/file'
        collected_facts = {}
        result = self.distribution_files.parse_distribution_file_Slackware(name, data, path, collected_facts)
        self.assertEqual(result, (True, {'distribution': 'Slackware'}))

    def test_parse_distribution_file_Amazon(self):
        name = 'Amazon'
        data = 'Amazon content'
        path = '/path/to/dist/file'
        collected_facts = {}
        result = self.distribution_files.parse_distribution_file_Amazon(name, data, path, collected_facts)
        self.assertEqual(result, (True, {'distribution': 'Amazon'}))

    def test_parse_distribution_file_OpenWrt(self):
        name = 'OpenWrt'
        data = 'OpenWrt content'
        path = '/path/to/dist/file'
        collected_facts = {}
        result = self.distribution_files.parse_distribution_file_OpenWrt(name, data, path, collected_facts)
        self.assertEqual(result, (True, {'distribution': 'OpenWrt'}))

    def test_parse_distribution_file_Alpine(self):
        name = 'Alpine'
        data = 'Alpine content'
        path = '/path/to/dist/file'
        collected_facts = {}
        result = self.distribution_files.parse_distribution_file_Alpine(name, data, path, collected_facts)
        self.assertEqual(result, (True, {'distribution': 'Alpine'}))

    def test_parse_distribution_file_SUSE(self):
        name = 'SUSE'
        data = 'SUSE content'
        path = '/path/to/dist/file'
        collected_facts = {}
        result = self.distribution_files.parse_distribution_file_SUSE(name, data, path, collected_facts)
        self.assertEqual(result, (True, {'distribution': 'SUSE'}))

    def test_parse_distribution_file_Debian(self):
        name = 'Debian'
        data = 'Debian content'
        path = '/path/to/dist/file'
        collected_facts = {}
        result = self.distribution_files.parse_distribution_file_Debian(name, data, path, collected_facts)
        self.assertEqual(result, (True, {'distribution': 'Debian'}))

    def test___str__(self):
        result = str(self.distribution_files)
        self.assertEqual(result, 'DistributionFiles')

    def test___repr__(self):
        result = repr(self.distribution_files)
        self.assertEqual(result, 'DistributionFiles()')

class MockModule:
    def get_file_content(self, path):
        return 'file content'

    def get_distribution(self):
        return ('Slackware', '14.1', 'stable')

if __name__ == '__main__':
    unittest.main()