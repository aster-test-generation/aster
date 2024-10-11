import unittest
from unittest.mock import MagicMock, patch
from ansible.vars.plugins import get_plugin_vars, get_vars_from_path, get_vars_from_inventory_sources
from ansible.errors import AnsibleError
from ansible.inventory.host import Host
from ansible.plugins.loader import vars_loader
from ansible.utils.vars import combine_vars

class TestGetPluginVars(unittest.TestCase):
    def setUp(self):
        self.loader = MagicMock()
        self.plugin = MagicMock()
        self.path = "some_path"
        self.entities = [Host(name="host1"), Host(name="host2")]

    def test_get_plugin_vars_success(self):
        self.plugin.get_vars.return_value = {"var1": "value1"}
        result = get_plugin_vars(self.loader, self.plugin, self.path, self.entities)
        self.assertEqual(result, {"var1": "value1"})

    def test_get_plugin_vars_host_vars(self):
        del self.plugin.get_vars
        self.plugin.get_host_vars.return_value = {"host_var": "value2"}
        result = get_plugin_vars(self.loader, self.plugin, self.path, self.entities)
        self.assertEqual(result, {"host_var": "value2"})

    def test_get_plugin_vars_group_vars(self):
        del self.plugin.get_vars
        del self.plugin.get_host_vars
        self.plugin.get_group_vars.return_value = {"group_var": "value3"}
        result = get_plugin_vars(self.loader, self.plugin, self.path, self.entities)
        self.assertEqual(result, {"group_var": "value3"})

    def test_get_plugin_vars_invalid_plugin(self):
        del self.plugin.get_vars
        del self.plugin.get_host_vars
        del self.plugin.get_group_vars
        self.plugin.run = True
        with self.assertRaises(AnsibleError):
            get_plugin_vars(self.loader, self.plugin, self.path, self.entities)

class TestGetVarsFromPath(unittest.TestCase):
    @patch('ansible.vars.plugins.vars_loader')
    @patch('ansible.vars.plugins.combine_vars')
    def test_get_vars_from_path(self, mock_combine_vars, mock_vars_loader):
        loader = MagicMock()
        path = "some_path"
        entities = [Host(name="host1")]
        stage = "inventory"
        plugin = MagicMock()
        plugin.get_vars.return_value = {"var1": "value1"}
        mock_vars_loader.all.return_value = [plugin]
        mock_combine_vars.return_value = {"var1": "value1"}

        result = get_vars_from_path(loader, path, entities, stage)
        self.assertEqual(result, {"var1": "value1"})

class TestGetVarsFromInventorySources(unittest.TestCase):
    @patch('ansible.vars.plugins.get_vars_from_path')
    @patch('ansible.vars.plugins.combine_vars')
    def test_get_vars_from_inventory_sources(self, mock_combine_vars, mock_get_vars_from_path):
        loader = MagicMock()
        sources = ["source1", "source2"]
        entities = [Host(name="host1")]
        stage = "inventory"
        mock_get_vars_from_path.return_value = {"var1": "value1"}
        mock_combine_vars.return_value = {"var1": "value1"}

        result = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertEqual(result, {"var1": "value1"})

if __name__ == '__main__':
    unittest.main()