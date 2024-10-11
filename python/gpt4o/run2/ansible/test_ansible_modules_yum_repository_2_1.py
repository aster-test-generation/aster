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
        self.yum_repo = YumRepo(self.module)

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    def test_init(self, mock_isfile, mock_isdir):
        mock_isdir.return_value = True
        mock_isfile.return_value = False
        instance = YumRepo(self.module)
        self.assertEqual(instance.params['dest'], '/etc/yum.repos.d/testrepo.repo')

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    def test_init_fail_directory(self, mock_isfile, mock_isdir):
        mock_isdir.return_value = False
        with self.assertRaises(SystemExit):
            YumRepo(self.module)
        self.module.fail_json.assert_called_with(msg="Repo directory '/etc/yum.repos.d' does not exist.")

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.read')
    def test_init_existing_file(self, mock_read, mock_isfile, mock_isdir):
        mock_isdir.return_value = True
        mock_isfile.return_value = True
        instance = YumRepo(self.module)
        mock_read.assert_called_with('/etc/yum.repos.d/testrepo.repo')

if __name__ == '__main__':
    unittest.main()