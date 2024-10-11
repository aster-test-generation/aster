import unittest
from unittest.mock import MagicMock, patch
import os
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

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    def test_init_directory_exists(self, mock_isfile, mock_isdir):
        mock_isdir.return_value = True
        mock_isfile.return_value = False
        repo = YumRepo(self.module)
        self.assertEqual(repo.params['dest'], '/etc/yum.repos.d/testfile.repo')

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    def test_init_directory_not_exists(self, mock_isfile, mock_isdir):
        mock_isdir.return_value = False
        with self.assertRaises(SystemExit):
            YumRepo(self.module).repofile
        self.module.fail_json.assert_called_with(msg="Repo directory '/etc/yum.repos.d' does not exist.")

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    def test_init_file_exists(self, mock_isfile, mock_isdir):
        mock_isdir.return_value = True
        mock_isfile.return_value = True
        self.repo.repofile = MagicMock()
        repo = YumRepo(self.module, repofile='some_repofile')
        repo.repofile.read.assert_called_with('/etc/yum.repos.d/testfile.repo')

    def test_remove_section_exists(self):
        self.repo.repofile = MagicMock()
        self.repo.repofile.has_section.return_value = True
        self.repo.remove()
        self.repo.repofile.remove_section.assert_called_with('testrepo')

    def test_remove_section_not_exists(self):
        self.repo.repofile = MagicMock()
        self.repo.repofile.has_section.return_value = False
        self.repo.remove()
        self.repo.repofile.remove_section.assert_not_called()

if __name__ == '__main__':
    unittest.main()