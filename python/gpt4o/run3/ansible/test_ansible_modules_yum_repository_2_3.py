import unittest
from unittest.mock import MagicMock, patch
import os
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native
from ansible.modules.yum_repository import YumRepo


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock(spec=AnsibleModule)
        self.module.params = {
            'repoid': 'testrepo',
            'reposdir': '/etc/yum.repos.d',
            'file': 'testrepo'
        }
        self.repo = YumRepo(self.module)
        self.repo.repofile = MagicMock()  # Mock the repofile attribute

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_init(self, mock_isfile, mock_isdir):
        repo = YumRepo(self.module)
        repo.repofile = MagicMock()  # Mock the repofile attribute
        self.assertEqual(repo.params['dest'], '/etc/yum.repos.d/testrepo.repo')

    @patch('os.path.isdir', return_value=False)
    def test_init_fail(self, mock_isdir):
        with self.assertRaises(SystemExit):
            YumRepo(self.module)
        self.module.fail_json.assert_called_with(msg="Repo directory '/etc/yum.repos.d' does not exist.")

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=True)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.read')
    def test_init_read_file(self, mock_read, mock_isfile, mock_isdir):
        repo = YumRepo(self.module)
        repo.repofile = MagicMock()  # Mock the repofile attribute
        mock_read.assert_called_with('/etc/yum.repos.d/testrepo.repo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('builtins.open', new_callable=unittest.mock.mock_open)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.write')
    def test_save(self, mock_write, mock_open, mock_isfile, mock_isdir):
        self.repo.repofile.sections = MagicMock(return_value=['section1'])
        self.repo.save()
        mock_open.assert_called_with('/etc/yum.repos.d/testrepo.repo', 'w')
        mock_write.assert_called()

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('os.remove')
    def test_save_remove_file(self, mock_remove, mock_isfile, mock_isdir):
        self.repo.repofile.sections = MagicMock(return_value=[])
        self.repo.save()
        mock_remove.assert_called_with('/etc/yum.repos.d/testrepo.repo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('os.remove', side_effect=OSError('Error'))
    def test_save_remove_file_fail(self, mock_remove, mock_isfile, mock_isdir):
        self.repo.repofile.sections = MagicMock(return_value=[])
        with self.assertRaises(SystemExit):
            self.repo.save()
        self.module.fail_json.assert_called_with(msg='Cannot remove empty repo file /etc/yum.repos.d/testrepo.repo.', details='Error')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('builtins.open', new_callable=unittest.mock.mock_open)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.write', side_effect=IOError('Error'))
    def test_save_write_fail(self, mock_write, mock_open, mock_isfile, mock_isdir):
        self.repo.repofile.sections = MagicMock(return_value=['section1'])
        with self.assertRaises(SystemExit):
            self.repo.save()
        self.module.fail_json.assert_called_with(msg='Problems handling file /etc/yum.repos.d/testrepo.repo.', details='Error')

if __name__ == '__main__':
    unittest.main()