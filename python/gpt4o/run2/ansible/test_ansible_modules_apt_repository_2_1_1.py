import unittest
from unittest.mock import MagicMock, patch, mock_open
from ansible.modules.apt_repository import SourcesList, DEFAULT_SOURCES_PERM


class TestSourcesList(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.sources_list = SourcesList(self.module)

    @patch('ansible.modules.apt_repository.apt_pkg.config.find_dir')
    def test_apt_cfg_dir(self, mock_find_dir):
        mock_find_dir.return_value = '/etc/apt'
        result = self.sources_list._apt_cfg_dir('Dir::Etc::sourceparts')
        self.assertEqual(result, '/etc/apt')

    @patch('ansible.modules.apt_repository.apt_pkg.Config.FindDir')
    def test_apt_cfg_dir_fallback(self, mock_find_dir):
        mock_find_dir.return_value = '/etc/apt'
        result = self.sources_list._apt_cfg_dir('Dir::Etc::sourceparts')
        self.assertEqual(result, '/etc/apt')

    @patch('builtins.open', new_callable=mock_open, read_data='deb http://archive.canonical.com/ubuntu hardy partner\n')
    def test_load(self, mock_file):
        self.sources_list.load('/etc/apt/sources.list')
        self.assertIn('/etc/apt/sources.list', self.sources_list.files)

    @patch('os.makedirs')
    @patch('tempfile.mkstemp', return_value=(1, '/tmp/.sources.list-XXXXXX'))
    @patch('os.fdopen', new_callable=mock_open)
    def test_save(self, mock_fdopen, mock_mkstemp, mock_makedirs):
        self.sources_list.files = {'/etc/apt/sources.list': [(0, True, 'deb http://archive.canonical.com/ubuntu hardy partner', None)]}
        self.sources_list.save()
        mock_fdopen().write.assert_called_with('deb http://archive.canonical.com/ubuntu hardy partner\n')

    @patch('os.makedirs')
    @patch('tempfile.mkstemp', return_value=(1, '/tmp/.sources.list-XXXXXX'))
    @patch('os.fdopen', new_callable=mock_open)
    def test_save_fail_create_directory(self, mock_fdopen, mock_mkstemp, mock_makedirs):
        mock_makedirs.side_effect = OSError
        self.sources_list.files = {'/etc/apt/sources.list': [(0, True, 'deb http://archive.canonical.com/ubuntu hardy partner', None)]}
        with self.assertRaises(OSError):
            self.sources_list.save()

    def test_dump(self):
        self.sources_list.files = {'/etc/apt/sources.list': [(0, True, 'deb http://archive.canonical.com/ubuntu hardy partner', None)]}
        result = self.sources_list.dump()
        self.assertIn('/etc/apt/sources.list', result)

    def test_choice_new(self):
        result = self.sources_list._choice('new', 'old')
        self.assertEqual(result, 'new')

    def test_choice_old(self):
        result = self.sources_list._choice(None, 'old')
        self.assertEqual(result, 'old')

if __name__ == '__main__':
    unittest.main()