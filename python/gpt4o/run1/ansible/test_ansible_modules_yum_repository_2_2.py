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
        self.repofile = MagicMock()
        self.repofile.has_section.return_value = False
        self.repofile.read = MagicMock()
        self.repofile.add_section = MagicMock()
        self.repofile.remove_section = MagicMock()
        self.repofile.set = MagicMock()

        with patch('os.path.isdir', return_value=True):
            with patch('os.path.isfile', return_value=False):
                self.yum_repo = YumRepo(self.module)
                self.yum_repo.repofile = self.repofile

    def test_init(self):
        self.assertEqual(self.yum_repo.module, self.module)
        self.assertEqual(self.yum_repo.params, self.module.params)
        self.assertEqual(self.yum_repo.section, 'testrepo')
        self.assertEqual(self.yum_repo.params['dest'], '/etc/yum.repos.d/testfile.repo')

    def test_add_existing_section(self):
        self.repofile.has_section.return_value = True
        self.yum_repo.add()
        self.repofile.remove_section.assert_called_once_with('testrepo')
        self.repofile.add_section.assert_called_once_with('testrepo')

    def test_add_new_section(self):
        self.repofile.has_section.return_value = False
        self.yum_repo.add()
        self.repofile.add_section.assert_called_once_with('testrepo')

    def test_add_missing_required_params(self):
        self.yum_repo.params['baseurl'] = None
        with self.assertRaises(SystemExit):
            self.yum_repo.add()
        self.module.fail_json.assert_called_once_with(msg="Parameter 'baseurl', 'metalink' or 'mirrorlist' is required for adding a new repo.")

    def test_add_set_params(self):
        self.yum_repo.add()
        self.repofile.set.assert_any_call('testrepo', 'baseurl', 'http://example.com/repo')

    def test_add_list_params(self):
        self.yum_repo.params['exclude'] = ['pkg1', 'pkg2']
        self.yum_repo.list_params = ['exclude']
        self.yum_repo.add()
        self.repofile.set.assert_any_call('testrepo', 'exclude', 'pkg1 pkg2')

    def test_add_bool_params(self):
        self.yum_repo.params['enabled'] = True
        self.yum_repo.allowed_params = ['enabled']
        self.yum_repo.add()
        self.repofile.set.assert_any_call('testrepo', 'enabled', 1)

    def test_add_ignored_params(self):
        self.yum_repo.params['invalid_param'] = 'value'
        self.yum_repo.allowed_params = ['baseurl']
        self.yum_repo.add()
        self.repofile.set.assert_called_once_with('testrepo', 'baseurl', 'http://example.com/repo')

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
        self.repofile = MagicMock()
        self.repofile.has_section.return_value = False
        self.repofile.read = MagicMock()
        self.repofile.add_section = MagicMock()
        self.repofile.remove_section = MagicMock()
        self.repofile.set = MagicMock()

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_init(self, mock_isfile, mock_isdir):
        instance = YumRepo(self.module)
        self.assertEqual(instance.params['dest'], '/etc/yum.repos.d/testfile.repo')

    @patch('os.path.isdir', return_value=False)
    def test_init_fail_directory(self, mock_isdir):
        with self.assertRaises(SystemExit):
            YumRepo(self.module)
        self.module.fail_json.assert_called_with(msg="Repo directory '/etc/yum.repos.d' does not exist.")

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=True)
    def test_init_read_file(self, mock_isfile, mock_isdir):
        instance = YumRepo(self.module)
        self.repofile.read.assert_called_with('/etc/yum.repos.d/testfile.repo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_add(self, mock_isfile, mock_isdir):
        instance = YumRepo(self.module)
        instance.repofile = self.repofile
        instance.add()
        self.repofile.add_section.assert_called_with('testrepo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_add_fail_no_baseurl_metalink_mirrorlist(self, mock_isfile, mock_isdir):
        self.module.params['baseurl'] = None
        instance = YumRepo(self.module)
        instance.repofile = self.repofile
        with self.assertRaises(SystemExit):
            instance.add()
        self.module.fail_json.assert_called_with(msg="Parameter 'baseurl', 'metalink' or 'mirrorlist' is required for adding a new repo.")

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_add_with_existing_section(self, mock_isfile, mock_isdir):
        self.repofile.has_section.return_value = True
        instance = YumRepo(self.module)
        instance.repofile = self.repofile
        instance.add()
        self.repofile.remove_section.assert_called_with('testrepo')
        self.repofile.add_section.assert_called_with('testrepo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_add_set_params(self, mock_isfile, mock_isdir):
        self.module.params.update({
            'baseurl': 'http://example.com/repo',
            'enabled': True,
            'gpgcheck': False
        })
        instance = YumRepo(self.module)
        instance.repofile = self.repofile
        instance.add()
        self.repofile.set.assert_any_call('testrepo', 'baseurl', 'http://example.com/repo')
        self.repofile.set.assert_any_call('testrepo', 'enabled', 1)
        self.repofile.set.assert_any_call('testrepo', 'gpgcheck', 0)

if __name__ == '__main__':
    unittest.main()