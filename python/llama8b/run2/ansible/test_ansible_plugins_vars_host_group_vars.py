from ansible.module_utils import basic
import unittest
from ansible.plugins.vars.host_group_vars import VarsModule
from ansible.module_utils._text import to_bytes, to_native, to_text
from ansible.inventory.host import Host
from ansible.inventory.group import Group
from ansible.utils.vars import combine_vars
from unittest.mock import patch, Mock


class TestVarsModule(unittest.TestCase):
    @patch('ansible.module_utils._text.to_bytes')
    @patch('ansible.module_utils._text.to_native')
    @patch('ansible.module_utils._text.to_text')
    def test_get_vars(self, mock_to_text, mock_to_native, mock_to_bytes):
        instance = VarsModule()
        loader = Mock()
        path = 'path'
        entities = [Host(), Group()]
        cache = True
        result = instance.get_vars(loader, path, entities, cache)
        self.assertEqual(result, {})

    @patch('ansible.module_utils._text.to_bytes')
    @patch('ansible.module_utils._text.to_native')
    @patch('ansible.module_utils._text.to_text')
    def test_get_vars_host(self, mock_to_text, mock_to_native, mock_to_bytes):
        instance = VarsModule()
        loader = Mock()
        path = 'path'
        entities = [Host()]
        cache = True
        result = instance.get_vars(loader, path, entities, cache)
        self.assertEqual(result, {})

    @patch('ansible.module_utils._text.to_bytes')
    @patch('ansible.module_utils._text.to_native')
    @patch('ansible.module_utils._text.to_text')
    def test_get_vars_group(self, mock_to_text, mock_to_native, mock_to_bytes):
        instance = VarsModule()
        loader = Mock()
        path = 'path'
        entities = [Group()]
        cache = True
        result = instance.get_vars(loader, path, entities, cache)
        self.assertEqual(result, {})

    @patch('ansible.module_utils._text.to_bytes')
    @patch('ansible.module_utils._text.to_native')
    @patch('ansible.module_utils._text.to_text')
    def test_get_vars_exception(self, mock_to_text, mock_to_native, mock_to_bytes):
        instance = VarsModule()
        loader = Mock()
        path = 'path'
        entities = [Host()]
        cache = True
        loader.load_from_file.side_effect = Exception('Test exception')
        with self.assertRaises(AnsibleParserError):
            instance.get_vars(loader, path, entities, cache)

    @patch('ansible.module_utils._text.to_bytes')
    @patch('ansible.module_utils._text.to_native')
    @patch('ansible.module_utils._text.to_text')
    def test_get_vars_found_files(self, mock_to_text, mock_to_native, mock_to_bytes):
        instance = VarsModule()
        loader = Mock()
        path = 'path'
        entities = [Host()]
        cache = True
        loader.find_vars_files.return_value = ['file1', 'file2']
        result = instance.get_vars(loader, path, entities, cache)
        self.assertEqual(result, {})

    @patch('ansible.module_utils._text.to_bytes')
    @patch('ansible.module_utils._text.to_native')
    @patch('ansible.module_utils._text.to_text')
    def test_get_vars_combine_vars(self, mock_to_text, mock_to_native, mock_to_bytes):
        instance = VarsModule()
        loader = Mock()
        path = 'path'
        entities = [Host()]
        cache = True
        loader.load_from_file.return_value = {'var1': 'value1', 'var2': 'value2'}
        result = instance.get_vars(loader, path, entities, cache)
        self.assertEqual(result, {'var1': 'value1', 'var2': 'value2'})

if __name__ == '__main__':
    unittest.main()