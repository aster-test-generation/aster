import unittest
from unittest.mock import Mock, patch
from ansible.vars.plugins import get_plugin_vars, get_vars_from_path, get_vars_from_inventory_sources
from ansible.errors import AnsibleError
from ansible.inventory.host import Host
from ansible.utils.vars import combine_vars
from unittest.mock import MagicMock, patch
from ansible.plugins.loader import vars_loader
from ansible.utils.collection_loader import AnsibleCollectionRef


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
        self.assertEqual(result, {'combined_key': 'combined_value'})

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
        self.entities = [MagicMock(name="group1")]
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

    @patch('ansible.vars.plugins.C')
    @patch('ansible.vars.plugins.vars_loader')
    @patch('ansible.vars.plugins.combine_vars')
    def test_get_vars_from_path_with_stage(self, mock_combine_vars, mock_vars_loader, mock_C):
        loader = MagicMock()
        path = "some_path"
        entities = [Host(name="host1")]
        stage = "task"
        plugin = MagicMock()
        plugin.get_vars.return_value = {"var1": "value1"}
        plugin.has_option.return_value = True
        plugin.get_option.return_value = "task"
        mock_vars_loader.all.return_value = [plugin]
        mock_combine_vars.return_value = {"var1": "value1"}
        mock_C.VARIABLE_PLUGINS_ENABLED = ["plugin_name"]

        result = get_vars_from_path(loader, path, entities, stage)
        self.assertEqual(result, {"var1": "value1"})

class TestGetVarsFromInventorySources(unittest.TestCase):
    @patch('ansible.vars.plugins.os.path.exists')
    @patch('ansible.vars.plugins.os.path.isdir')
    @patch('ansible.vars.plugins.to_bytes')
    @patch('ansible.vars.plugins.get_vars_from_path')
    @patch('ansible.vars.plugins.combine_vars')
    def test_get_vars_from_inventory_sources(self, mock_combine_vars, mock_get_vars_from_path, mock_to_bytes, mock_isdir, mock_exists):
        loader = MagicMock()
        sources = ["some_path"]
        entities = [Host(name="host1")]
        stage = "inventory"
        mock_exists.return_value = True
        mock_isdir.return_value = True
        mock_get_vars_from_path.return_value = {"var1": "value1"}
        mock_combine_vars.return_value = {"var1": "value1"}

        result = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertEqual(result, {"var1": "value1"})

    @patch('ansible.vars.plugins.os.path.exists')
    @patch('ansible.vars.plugins.os.path.isdir')
    @patch('ansible.vars.plugins.to_bytes')
    @patch('ansible.vars.plugins.get_vars_from_path')
    @patch('ansible.vars.plugins.combine_vars')
    def test_get_vars_from_inventory_sources_with_comma(self, mock_combine_vars, mock_get_vars_from_path, mock_to_bytes, mock_isdir, mock_exists):
        loader = MagicMock()
        sources = ["some_path,another_path"]
        entities = [Host(name="host1")]
        stage = "inventory"
        mock_exists.return_value = False
        mock_isdir.return_value = True
        mock_get_vars_from_path.return_value = {"var1": "value1"}
        mock_combine_vars.return_value = {"var1": "value1"}

        result = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertEqual(result, {"var1": "value1"})

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