import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.yum_repository import YumRepo


class TestYumRepo(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'repoid': 'testrepo',
            'reposdir': '/etc/yum.repos.d',
            'file': 'testrepo',
            'baseurl': 'http://example.com/repo',
            'metalink': None,
            'mirrorlist': None
        }
        self.repofile = MagicMock()
        self.repofile.has_section = MagicMock(return_value=False)
        self.repofile.read = MagicMock()
        self.repofile.add_section = MagicMock()
        self.repofile.remove_section = MagicMock()
        self.repofile.set = MagicMock()

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_init(self, mock_isfile, mock_isdir):
        instance = YumRepo(self.module)
        self.assertEqual(instance.params['dest'], '/etc/yum.repos.d/testrepo.repo')

    @patch('os.path.isdir', return_value=False)
    def test_init_fail(self, mock_isdir):
        with self.assertRaises(SystemExit):
            YumRepo(self.module)
        self.module.fail_json.assert_called_with(msg="Repo directory '/etc/yum.repos.d' does not exist.")

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=True)
    def test_init_read_file(self, mock_isfile, mock_isdir):
        instance = YumRepo(self.module)
        self.repofile.read.assert_called_with('/etc/yum.repos.d/testrepo.repo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_add(self, mock_isfile, mock_isdir):
        instance = YumRepo(self.module)
        instance.repofile = self.repofile
        instance.add()
        self.repofile.add_section.assert_called_with('testrepo')

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_add_fail(self, mock_isfile, mock_isdir):
        self.module.params['baseurl'] = None
        instance = YumRepo(self.module)
        instance.repofile = self.repofile
        with self.assertRaises(SystemExit):
            instance.add()
        self.module.fail_json.assert_called_with(msg="Parameter 'baseurl', 'metalink' or 'mirrorlist' is required for adding a new repo.")

    @patch('os.path.isdir', return_value=True)
    @patch('os.path.isfile', return_value=False)
    def test_add_set_params(self, mock_isfile, mock_isdir):
        self.module.params['enabled'] = True
        instance = YumRepo(self.module)
        instance.repofile = self.repofile
        instance.add()
        self.repofile.set.assert_any_call('testrepo', 'baseurl', 'http://example.com/repo')
        self.repofile.set.assert_any_call('testrepo', 'enabled', 1)

if __name__ == '__main__':
    unittest.main()