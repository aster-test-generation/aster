import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.vars.host_group_vars import VarsModule
from ansible.errors import AnsibleParserError
from ansible.inventory.host import Host
from ansible.inventory.group import Group
from ansible.plugins.loader import DataLoader


class TestVarsModule(unittest.TestCase):
    def setUp(self):
        self.vars_module = VarsModule()
        self.loader = DataLoader()
        self.path = '/some/path'
        self.host = Host(name='test_host')
        self.group = Group(name='test_group')

    def test_get_vars_with_host(self):
        with patch('os.path.realpath', return_value='/real/path'), \
             patch('os.path.exists', return_value=True), \
             patch('os.path.isdir', return_value=True), \
             patch.object(self.loader, 'find_vars_files', return_value=['/real/path/vars.yml']), \
             patch.object(self.loader, 'load_from_file', return_value={'key': 'value'}):
            result = self.vars_module.get_vars(self.loader, self.path, [self.host])
            self.assertEqual(result, {'key': 'value'})

    def test_get_vars_with_group(self):
        with patch('os.path.realpath', return_value='/real/path'), \
             patch('os.path.exists', return_value=True), \
             patch('os.path.isdir', return_value=True), \
             patch.object(self.loader, 'find_vars_files', return_value=['/real/path/vars.yml']), \
             patch.object(self.loader, 'load_from_file', return_value={'key': 'value'}):
            result = self.vars_module.get_vars(self.loader, self.path, [self.group])
            self.assertEqual(result, {'key': 'value'})

    def test_get_vars_with_invalid_entity(self):
        with self.assertRaises(AnsibleParserError):
            self.vars_module.get_vars(self.loader, self.path, ['invalid_entity'])

    def test_get_vars_with_cache(self):
        with patch('os.path.realpath', return_value='/real/path'), \
             patch('os.path.exists', return_value=True), \
             patch('os.path.isdir', return_value=True), \
             patch.object(self.loader, 'find_vars_files', return_value=['/real/path/vars.yml']), \
             patch.object(self.loader, 'load_from_file', return_value={'key': 'value'}):
            self.vars_module.get_vars(self.loader, self.path, [self.host])
            result = self.vars_module.get_vars(self.loader, self.path, [self.host])
            self.assertEqual(result, {'key': 'value'})

    def test_get_vars_with_exception(self):
        with patch('os.path.realpath', return_value='/real/path'), \
             patch('os.path.exists', return_value=True), \
             patch('os.path.isdir', return_value=True), \
             patch.object(self.loader, 'find_vars_files', side_effect=Exception('Test Exception')):
            with self.assertRaises(AnsibleParserError):
                self.vars_module.get_vars(self.loader, self.path, [self.host])

if __name__ == '__main__':
    unittest.main()