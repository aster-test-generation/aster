import unittest
from unittest.mock import patch, mock_open, MagicMock
from ansible.config.manager import find_ini_config_file, _add_base_defs_deprecations

class TestFindIniConfigFile(unittest.TestCase):
    @patch('ansible.config.manager.os.getenv')
    @patch('ansible.config.manager.unfrackpath')
    @patch('ansible.config.manager.os.path.isdir')
    @patch('ansible.config.manager.os.path.exists')
    @patch('ansible.config.manager.os.access')
    @patch('ansible.config.manager.os.getcwd')
    @patch('ansible.config.manager.os.stat')
    def test_find_ini_config_file(self, mock_stat, mock_getcwd, mock_access, mock_exists, mock_isdir, mock_unfrackpath, mock_getenv):
        mock_getenv.return_value = '/fake/path'
        mock_unfrackpath.return_value = '/fake/path'
        mock_isdir.return_value = False
        mock_exists.side_effect = [False, False, False, False]
        mock_access.return_value = False
        mock_getcwd.return_value = '/current/dir'
        mock_stat.return_value.st_mode = 0

        result = find_ini_config_file()
        self.assertIsNone(result)

    @patch('ansible.config.manager.os.getenv')
    @patch('ansible.config.manager.unfrackpath')
    @patch('ansible.config.manager.os.path.isdir')
    @patch('ansible.config.manager.os.path.exists')
    @patch('ansible.config.manager.os.access')
    @patch('ansible.config.manager.os.getcwd')
    @patch('ansible.config.manager.os.stat')
    def test_find_ini_config_file_with_env(self, mock_stat, mock_getcwd, mock_access, mock_exists, mock_isdir, mock_unfrackpath, mock_getenv):
        mock_getenv.return_value = '/fake/path'
        mock_unfrackpath.return_value = '/fake/path'
        mock_isdir.return_value = True
        mock_exists.side_effect = [True, False, False, False]
        mock_access.return_value = True
        mock_getcwd.return_value = '/current/dir'
        mock_stat.return_value.st_mode = 0

        result = find_ini_config_file()
        self.assertEqual(result, '/fake/path/ansible.cfg')

    @patch('ansible.config.manager.os.getenv')
    @patch('ansible.config.manager.unfrackpath')
    @patch('ansible.config.manager.os.path.isdir')
    @patch('ansible.config.manager.os.path.exists')
    @patch('ansible.config.manager.os.access')
    @patch('ansible.config.manager.os.getcwd')
    @patch('ansible.config.manager.os.stat')
    def test_find_ini_config_file_with_warnings(self, mock_stat, mock_getcwd, mock_access, mock_exists, mock_isdir, mock_unfrackpath, mock_getenv):
        mock_getenv.return_value = None
        mock_unfrackpath.side_effect = lambda x, follow: x
        mock_isdir.return_value = False
        mock_exists.side_effect = [False, False, False, True]
        mock_access.return_value = True
        mock_getcwd.return_value = '/current/dir'
        mock_stat.return_value.st_mode = stat.S_IWOTH

        warnings = set()
        result = find_ini_config_file(warnings)
        self.assertEqual(result, '/etc/ansible/ansible.cfg')
        self.assertIn('Ansible is being run in a world writable directory', next(iter(warnings)))

class TestAddBaseDefsDeprecations(unittest.TestCase):
    def test_add_base_defs_deprecations(self):
        base_defs = {
            'test': {
                'deprecated': {},
                'ini': [{'deprecated': {}}],
                'env': [{'deprecated': {}}],
                'vars': [{'deprecated': {}}]
            }
        }
        _add_base_defs_deprecations(base_defs)
        self.assertEqual(base_defs['test']['deprecated']['collection_name'], 'ansible.builtin')
        self.assertEqual(base_defs['test']['ini'][0]['deprecated']['collection_name'], 'ansible.builtin')
        self.assertEqual(base_defs['test']['env'][0]['deprecated']['collection_name'], 'ansible.builtin')
        self.assertEqual(base_defs['test']['vars'][0]['deprecated']['collection_name'], 'ansible.builtin')

if __name__ == '__main__':
    unittest.main()