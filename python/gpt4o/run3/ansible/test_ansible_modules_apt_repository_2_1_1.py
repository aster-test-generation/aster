import unittest
from unittest.mock import MagicMock, patch, mock_open
from ansible.modules.apt_repository import SourcesList, DEFAULT_SOURCES_PERM


class TestSourcesList(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.sources_list = SourcesList(self.module)

    @patch('ansible.modules.apt_repository.os.path.isfile', return_value=True)
    @patch('ansible.modules.apt_repository.glob.iglob', return_value=[])
    @patch('ansible.modules.apt_repository.SourcesList.load')
    def test_init(self, mock_load, mock_iglob, mock_isfile):
        instance = SourcesList(self.module)
        self.assertEqual(instance.module, self.module)
        self.assertTrue(mock_load.called)

    @patch('ansible.modules.apt_repository.apt_pkg.config.find_dir', return_value='/etc/apt')
    def test_apt_cfg_dir(self, mock_find_dir):
        result = self.sources_list._apt_cfg_dir('Dir::Etc::sourceparts')
        self.assertEqual(result, '/etc/apt')

    @patch('ansible.modules.apt_repository.open', new_callable=mock_open, read_data='deb http://example.com/ stable main\n')
    def test_load(self, mock_open):
        self.sources_list.load('/etc/apt/sources.list')
        self.assertIn('/etc/apt/sources.list', self.sources_list.files)

    @patch('ansible.modules.apt_repository.os.makedirs')
    @patch('ansible.modules.apt_repository.tempfile.mkstemp', return_value=(1, '/tmp/tempfile'))
    @patch('ansible.modules.apt_repository.os.fdopen', new_callable=mock_open)
    @patch('ansible.modules.apt_repository.os.path.split', return_value=('/etc/apt', 'sources.list'))
    @patch('ansible.modules.apt_repository.os.path.isdir', return_value=True)
    def test_save(self, mock_isdir, mock_split, mock_fdopen, mock_mkstemp, mock_makedirs):
        self.sources_list.files = {'/etc/apt/sources.list': [(0, True, 'deb http://example.com/ stable main', '')]}
        self.sources_list.save()
        self.assertTrue(mock_fdopen.called)

    def test_dump(self):
        self.sources_list.files = {'/etc/apt/sources.list': [(0, True, 'deb http://example.com/ stable main', '')]}
        result = self.sources_list.dump()
        self.assertIn('/etc/apt/sources.list', result)

    def test_choice(self):
        result = self.sources_list._choice(None, 'old')
        self.assertEqual(result, 'old')
        result = self.sources_list._choice('new', 'old')
        self.assertEqual(result, 'new')

if __name__ == '__main__':
    unittest.main()