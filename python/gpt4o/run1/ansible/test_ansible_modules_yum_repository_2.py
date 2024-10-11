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
            'file': 'testrepo'
        }
        self.repo = YumRepo(self.module)

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    def test_init(self, mock_isfile, mock_isdir):
        mock_isdir.return_value = True
        mock_isfile.return_value = False
        repo = YumRepo(self.module)
        self.assertEqual(repo.params['dest'], '/etc/yum.repos.d/testrepo.repo')

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    def test_init_fail(self, mock_isfile, mock_isdir):
        mock_isdir.return_value = False
        with self.assertRaises(SystemExit):
            YumRepo(self.module)
        self.module.fail_json.assert_called_with(msg="Repo directory '/etc/yum.repos.d' does not exist.")

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    def test_init_existing_file(self, mock_isfile, mock_isdir):
        mock_isdir.return_value = True
        mock_isfile.return_value = True
        self.repo.repofile = MagicMock()
        repo = YumRepo(self.module)
        self.repo.repofile.read.assert_called_with('/etc/yum.repos.d/testrepo.repo')

    def test_dump(self):
        self.repo.repofile = MagicMock()
        self.repo.repofile.sections.return_value = ['testrepo']
        self.repo.repofile.items.return_value = [('key', 'value')]
        result = self.repo.dump()
        expected = '[testrepo]\nkey = value\n\n'
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()