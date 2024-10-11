import unittest
from unittest.mock import Mock, patch
from ansible.vars.plugins import get_plugin_vars, get_vars_from_path, get_vars_from_inventory_sources
from ansible.errors import AnsibleError
from ansible.inventory.host import Host
from ansible.utils.vars import combine_vars

class TestGetPluginVars(unittest.TestCase):
    def test_get_plugin_vars_with_valid_plugin(self):
        loader = Mock()
        plugin = Mock()
        plugin.get_vars.return_value = {'key': 'value'}
        path = 'some_path'
        entities = [Mock()]

        result = get_plugin_vars(loader, plugin, path, entities)
        self.assertEqual(result, {'key': 'value'})

    def test_get_plugin_vars_with_host_vars(self):
        loader = Mock()
        plugin = Mock()
        plugin.get_vars.side_effect = AttributeError
        plugin.get_host_vars.return_value = {'host_key': 'host_value'}
        path = 'some_path'
        entities = [Host('host1')]

        result = get_plugin_vars(loader, plugin, path, entities)
        self.assertEqual(result, {'host_key': 'host_value'})

    def test_get_plugin_vars_with_group_vars(self):
        loader = Mock()
        plugin = Mock()
        plugin.get_vars.side_effect = AttributeError
        plugin.get_group_vars.return_value = {'group_key': 'group_value'}
        path = 'some_path'
        entities = [Mock()]
        entities[0].name = 'group1'

        result = get_plugin_vars(loader, plugin, path, entities)
        self.assertEqual(result, {'group_key': 'group_value'})

    def test_get_plugin_vars_with_invalid_plugin(self):
        loader = Mock()
        plugin = Mock()
        plugin.get_vars.side_effect = AttributeError
        plugin.get_host_vars.side_effect = AttributeError
        plugin.get_group_vars.side_effect = AttributeError
        plugin._load_name = 'invalid_plugin'
        plugin._original_path = 'some_path'
        path = 'some_path'
        entities = [Mock()]

        with self.assertRaises(AnsibleError):
            get_plugin_vars(loader, plugin, path, entities)

class TestGetVarsFromPath(unittest.TestCase):
    @patch('ansible.vars.plugins.vars_loader')
    @patch('ansible.vars.plugins.combine_vars')
    def test_get_vars_from_path(self, mock_combine_vars, mock_vars_loader):
        loader = Mock()
        path = 'some_path'
        entities = [Mock()]
        stage = 'inventory'
        mock_plugin = Mock()
        mock_plugin.get_vars.return_value = {'key': 'value'}
        mock_vars_loader.all.return_value = [mock_plugin]
        mock_combine_vars.return_value = {'combined_key': 'combined_value'}

        result = get_vars_from_path(loader, path, entities, stage)
        self.assertEqual(result, {})

class TestGetVarsFromInventorySources(unittest.TestCase):
    @patch('ansible.vars.plugins.os.path.exists')
    @patch('ansible.vars.plugins.os.path.isdir')
    @patch('ansible.vars.plugins.to_bytes')
    @patch('ansible.vars.plugins.get_vars_from_path')
    @patch('ansible.vars.plugins.combine_vars')
    def test_get_vars_from_inventory_sources(self, mock_combine_vars, mock_get_vars_from_path, mock_to_bytes, mock_isdir, mock_exists):
        loader = Mock()
        sources = ['some_path']
        entities = [Mock()]
        stage = 'inventory'
        mock_get_vars_from_path.return_value = {'key': 'value'}
        mock_combine_vars.return_value = {'combined_key': 'combined_value'}
        mock_exists.return_value = True
        mock_isdir.return_value = True

        result = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertEqual(result, {'combined_key': 'combined_value'})

if __name__ == '__main__':
    unittest.main()