import unittest
from ansible.vars.plugins import get_plugin_vars, get_vars_from_path, get_vars_from_inventory_sources, Display


class TestGetPluginVars(unittest.TestCase):
    def test_get_plugin_vars(self):
        loader = object()
        plugin = object()
        path = 'path'
        entities = [object()]
        result = get_plugin_vars(loader, plugin, path, entities)
        self.assertIsInstance(result, dict)

    def test_get_plugin_vars_attribute_error(self):
        loader = object()
        plugin = object()
        path = 'path'
        entities = [object()]
        plugin.get_vars = lambda *args: None
        with self.assertRaises(AnsibleError):
            get_plugin_vars(loader, plugin, path, entities)

    def test_get_plugin_vars_attribute_error_host(self):
        loader = object()
        plugin = object()
        path = 'path'
        entities = [Host('host')]
        plugin.get_host_vars = lambda *args: None
        with self.assertRaises(AnsibleError):
            get_plugin_vars(loader, plugin, path, entities)

    def test_get_plugin_vars_attribute_error_group(self):
        loader = object()
        plugin = object()
        path = 'path'
        entities = [object()]
        plugin.get_group_vars = lambda *args: None
        with self.assertRaises(AnsibleError):
            get_plugin_vars(loader, plugin, path, entities)

class TestGetVarsFromPath(unittest.TestCase):
    def test_get_vars_from_path(self):
        loader = object()
        path = 'path'
        entities = [object()]
        stage = 'stage'
        result = get_vars_from_path(loader, path, entities, stage)
        self.assertIsInstance(result, dict)

    def test_get_vars_from_path_plugin_list(self):
        loader = object()
        path = 'path'
        entities = [object()]
        stage = 'stage'
        vars_plugin_list = [object()]
        vars_loader.all = lambda: vars_plugin_list
        result = get_vars_from_path(loader, path, entities, stage)
        self.assertIsInstance(result, dict)

class TestGetVarsFromInventorySources(unittest.TestCase):
    def test_get_vars_from_inventory_sources(self):
        loader = object()
        sources = ['source']
        entities = [object()]
        stage = 'stage'
        result = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertIsInstance(result, dict)

    def test_get_vars_from_inventory_sources_none(self):
        loader = object()
        sources = [None]
        entities = [object()]
        stage = 'stage'
        result = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertIsInstance(result, dict)

    def test_get_vars_from_inventory_sources_not_exists(self):
        loader = object()
        sources = ['source']
        entities = [object()]
        stage = 'stage'
        os.path.exists = lambda *args: False
        result = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertIsInstance(result, dict)

class TestDisplay(unittest.TestCase):
    def test_display_str(self):
        display = Display()
        result = str(display)
        self.assertIsInstance(result, str)

    def test_display_repr(self):
        display = Display()
        result = repr(display)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()