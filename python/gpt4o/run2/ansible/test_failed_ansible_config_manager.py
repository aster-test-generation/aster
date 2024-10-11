import stat
import unittest
from unittest.mock import patch, mock_open, MagicMock
from ansible.config.manager import find_ini_config_file, _add_base_defs_deprecations

class TestFindIniConfigFile(unittest.TestCase):
    @patch('os.getenv')
    @patch('os.path.isdir')
    @patch('os.path.exists')
    @patch('os.access')
    @patch('os.getcwd')
    @patch('os.stat')
    @patch('ansible.utils.path.unfrackpath')
    @patch('ansible.module_utils._text.to_bytes')
    @patch('ansible.module_utils._text.to_text')
    def test_find_ini_config_file(self, mock_to_text, mock_to_bytes, mock_unfrackpath, mock_stat, mock_getcwd, mock_access, mock_exists, mock_isdir, mock_getenv):
        mock_getenv.return_value = None
        mock_getcwd.return_value = '/mocked/path'
        mock_stat.return_value.st_mode = stat.S_IWOTH
        mock_exists.return_value = True
        mock_access.return_value = True
        mock_isdir.return_value = False
        mock_to_bytes.side_effect = lambda x: x.encode()
        mock_to_text.side_effect = lambda x, errors: x.decode()

        result = find_ini_config_file()
        self.assertEqual(result, '/mocked/path/None')

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