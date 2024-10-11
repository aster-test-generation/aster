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
    @patch('builtins.open', new_callable=unittest.mock.mock_open)
    def test_save(self, mock_open, mock_isfile, mock_isdir):
        mock_isdir.return_value = True
        mock_isfile.return_value = False
        self.repo.repofile = MagicMock()
        self.repo.repofile.sections.return_value = ['section1']
        self.repo.save()
        mock_open.assert_called_with('/etc/yum.repos.d/testrepo.repo', 'w')
        self.repo.repofile.write.assert_called()

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    @patch('os.remove')
    def test_save_remove(self, mock_remove, mock_isfile, mock_isdir):
        mock_isdir.return_value = True
        mock_isfile.return_value = False
        self.repo.repofile = MagicMock()
        self.repo.repofile.sections.return_value = []
        self.repo.save()
        mock_remove.assert_called_with('/etc/yum.repos.d/testrepo.repo')

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    @patch('os.remove')
    def test_save_remove_fail(self, mock_remove, mock_isfile, mock_isdir):
        mock_isdir.return_value = True
        mock_isfile.return_value = False
        self.repo.repofile = MagicMock()
        self.repo.repofile.sections.return_value = []
        mock_remove.side_effect = OSError('Error')
        with self.assertRaises(SystemExit):
            self.repo.save()
        self.module.fail_json.assert_called_with(msg='Cannot remove empty repo file /etc/yum.repos.d/testrepo.repo.', details='Error')

    @patch('os.path.isdir')
    @patch('os.path.isfile')
    @patch('builtins.open', new_callable=unittest.mock.mock_open)
    def test_save_fail(self, mock_open, mock_isfile, mock_isdir):
        mock_isdir.return_value = True
        mock_isfile.return_value = False
        self.repo.repofile = MagicMock()
        self.repo.repofile.sections.return_value = ['section1']
        mock_open.side_effect = IOError('Error')
        with self.assertRaises(SystemExit):
            self.repo.save()
        self.module.fail_json.assert_called_with(msg='Problems handling file /etc/yum.repos.d/testrepo.repo.', details='Error')

if __name__ == '__main__':
    unittest.main()