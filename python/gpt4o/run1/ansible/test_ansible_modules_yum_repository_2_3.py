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
        self.repo.repofile = MagicMock()

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_init(self, mock_isfile, mock_isdir):
        repo = YumRepo(self.module)
        repo.repofile = MagicMock()
        self.assertEqual(repo.section, 'testrepo')

    @patch('os.path.isdir', return_value=False)
    def test_init_repo_dir_not_exist(self, mock_isdir):
        with self.assertRaises(AttributeError):
            YumRepo(self.module)
        self.module.fail_json.assert_called_with(msg="Repo directory '/etc/yum.repos.d' does not exist.")

    @patch('os.path.isfile', return_value=True)
    @patch('os.path.isdir', return_value=True)
    @patch.object(YumRepo, 'repofile', new_callable=MagicMock)
    def test_init_repo_file_exists(self, mock_repofile, mock_isdir, mock_isfile):
        repo = YumRepo(self.module)
        repo.repofile = mock_repofile
        mock_repofile.read.assert_called_with('/etc/yum.repos.d/testrepo.repo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('builtins.open', new_callable=MagicMock)
    def test_save_with_sections(self, mock_open, mock_isfile, mock_isdir):
        self.repo.repofile.sections = MagicMock(return_value=['section1'])
        self.repo.save()
        mock_open.assert_called_with('/etc/yum.repos.d/testrepo.repo', 'w')
        self.repo.repofile.write.assert_called()

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('os.remove')
    def test_save_without_sections(self, mock_remove, mock_isfile, mock_isdir):
        self.repo.repofile.sections = MagicMock(return_value=[])
        self.repo.save()
        mock_remove.assert_called_with('/etc/yum.repos.d/testrepo.repo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('os.remove', side_effect=OSError('Error'))
    def test_save_remove_oserror(self, mock_remove, mock_isfile, mock_isdir):
        self.repo.repofile.sections = MagicMock(return_value=[])
        with self.assertRaises(SystemExit):
            self.repo.save()
        self.module.fail_json.assert_called_with(msg='Cannot remove empty repo file /etc/yum.repos.d/testrepo.repo.', details='Error')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('builtins.open', side_effect=IOError('Error'))
    def test_save_ioerror(self, mock_open, mock_isfile, mock_isdir):
        self.repo.repofile.sections = MagicMock(return_value=['section1'])
        with self.assertRaises(SystemExit):
            self.repo.save()
        self.module.fail_json.assert_called_with(msg='Problems handling file /etc/yum.repos.d/testrepo.repo.', details='Error')

if __name__ == '__main__':
    unittest.main()