import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.yum_repository import YumRepo


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'repoid': 'testrepo',
            'reposdir': '/etc/yum.repos.d',
            'file': 'testrepo'
        }

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_init(self, mock_isfile, mock_isdir):
        instance = YumRepo(self.module)
        self.assertEqual(instance.section, 'testrepo')

    @patch('os.path.isdir', return_value=False)
    def test_init_fail(self, mock_isdir):
        with self.assertRaises(SystemExit):
            YumRepo(self.module)
        self.module.fail_json.assert_called_with(msg="Repo directory '/etc/yum.repos.d' does not exist.")

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=True)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.read')
    def test_init_with_existing_file(self, mock_read, mock_isfile, mock_isdir):
        instance = YumRepo(self.module)
        mock_read.assert_called_with('/etc/yum.repos.d/testrepo.repo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_dump(self, mock_isfile, mock_isdir):
        instance = YumRepo(self.module)
        instance.repofile = MagicMock()
        instance.repofile.sections.return_value = ['testrepo']
        instance.repofile.items.return_value = [('key', 'value')]
        result = instance.dump()
        expected_result = '[testrepo]\nkey = value\n\n'
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()