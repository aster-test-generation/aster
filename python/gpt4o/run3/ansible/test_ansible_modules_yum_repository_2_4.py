import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.yum_repository import YumRepo


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'repoid': 'testrepo',
            'reposdir': '/etc/yum.repos.d',
            'file': 'testfile'
        }
        self.repo = YumRepo(self.module)

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_init(self, mock_isfile, mock_isdir):
        repo = YumRepo(self.module)
        self.assertEqual(repo.params['dest'], '/etc/yum.repos.d/testfile.repo')

    @patch('os.path.isdir', return_value=False)
    def test_init_fail(self, mock_isdir):
        with self.assertRaises(SystemExit):
            YumRepo(self.module)
        self.module.fail_json.assert_called_with(msg="Repo directory '/etc/yum.repos.d' does not exist.")

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=True)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.read')
    def test_init_with_existing_file(self, mock_read, mock_isfile, mock_isdir):
        repo = YumRepo(self.module)
        mock_read.assert_called_with('/etc/yum.repos.d/testfile.repo')

    @patch('ansible.modules.yum_repository.configparser.ConfigParser.has_section', return_value=True)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.remove_section')
    def test_remove(self, mock_remove_section, mock_has_section):
        self.repo.remove()
        mock_remove_section.assert_called_with('testrepo')

    @patch('ansible.modules.yum_repository.configparser.ConfigParser.has_section', return_value=False)
    def test_remove_no_section(self, mock_has_section):
        self.repo.remove()
        mock_has_section.assert_called_with('testrepo')

class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'repoid': 'testrepo',
            'reposdir': '/etc/yum.repos.d',
            'file': 'testfile'
        }
        self.repo = YumRepo(self.module)

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_init_directory_exists(self, mock_isfile, mock_isdir):
        repo = YumRepo(self.module)
        self.assertEqual(repo.params['dest'], '/etc/yum.repos.d/testfile.repo')

    @patch('os.path.isdir', return_value=False)
    def test_init_directory_does_not_exist(self, mock_isdir):
        with self.assertRaises(SystemExit):
            YumRepo(self.module)
        self.module.fail_json.assert_called_with(msg="Repo directory '/etc/yum.repos.d' does not exist.")

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=True)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.read')
    def test_init_file_exists(self, mock_read, mock_isfile, mock_isdir):
        repo = YumRepo(self.module)
        mock_read.assert_called_with('/etc/yum.repos.d/testfile.repo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_remove_section_exists(self, mock_isfile, mock_isdir):
        self.repo.repofile = MagicMock()
        self.repo.repofile.has_section.return_value = True
        self.repo.remove()
        self.repo.repofile.remove_section.assert_called_with('testrepo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_remove_section_does_not_exist(self, mock_isfile, mock_isdir):
        self.repo.repofile = MagicMock()
        self.repo.repofile.has_section.return_value = False
        self.repo.remove()
        self.repo.repofile.remove_section.assert_not_called()

if __name__ == '__main__':
    unittest.main()