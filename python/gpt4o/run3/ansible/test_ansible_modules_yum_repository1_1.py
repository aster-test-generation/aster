import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.yum_repository import YumRepo

class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'repoid': 'testrepo',
            'reposdir': '/etc/yum.repos.d',
            'file': 'testfile',
            'baseurl': 'http://example.com/repo',
            'metalink': None,
            'mirrorlist': None
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
    def test_init_read_file(self, mock_read, mock_isfile, mock_isdir):
        repo = YumRepo(self.module)
        mock_read.assert_called_with('/etc/yum.repos.d/testfile.repo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.has_section', return_value=True)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.remove_section')
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.add_section')
    def test_add_existing_section(self, mock_add_section, mock_remove_section, mock_has_section, mock_isfile, mock_isdir):
        repo = YumRepo(self.module)
        repo.add()
        mock_remove_section.assert_called_with('testrepo')
        mock_add_section.assert_called_with('testrepo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.has_section', return_value=False)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.add_section')
    def test_add_new_section(self, mock_add_section, mock_has_section, mock_isfile, mock_isdir):
        repo = YumRepo(self.module)
        repo.add()
        mock_add_section.assert_called_with('testrepo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.has_section', return_value=False)
    def test_add_fail_no_baseurl_metalink_mirrorlist(self, mock_has_section, mock_isfile, mock_isdir):
        self.module.params['baseurl'] = None
        repo = YumRepo(self.module)
        with self.assertRaises(SystemExit):
            repo.add()
        self.module.fail_json.assert_called_with(msg="Parameter 'baseurl', 'metalink' or 'mirrorlist' is required for adding a new repo.")

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    @patch('ansible.modules.yum_repository.configparser.ConfigParser.set')
    def test_add_set_params(self, mock_set, mock_isfile, mock_isdir):
        self.module.params['enabled'] = True
        self.module.params['gpgcheck'] = False
        repo = YumRepo(self.module)
        repo.add()
        mock_set.assert_any_call('testrepo', 'baseurl', 'http://example.com/repo')
        mock_set.assert_any_call('testrepo', 'enabled', '1')
        mock_set.assert_any_call('testrepo', 'gpgcheck', '0')

if __name__ == '__main__':
    unittest.main()