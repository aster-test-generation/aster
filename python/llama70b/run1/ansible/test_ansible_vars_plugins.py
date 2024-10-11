import unittest
from ansible.vars.plugins import get_plugin_vars, get_vars_from_path, get_vars_from_inventory_sources, Display


class TestGetPluginVars(unittest.TestCase):
    def test_get_plugin_vars(self):
        loader = object()
        plugin = object()
        path = 'path'
        entities = ['entity1', 'entity2']
        result = get_plugin_vars(loader, plugin, path, entities)
        self.assertIsInstance(result, dict)

    def test_get_plugin_vars_attribute_error(self):
        loader = object()
        plugin = object()
        path = 'path'
        entities = ['entity1', 'entity2']
        plugin.get_vars = lambda *args: None
        with self.assertRaises(AnsibleError):
            get_plugin_vars(loader, plugin, path, entities)

class TestGetVarsFromPath(unittest.TestCase):
    def test_get_vars_from_path(self):
        loader = object()
        path = 'path'
        entities = ['entity1', 'entity2']
        stage = 'stage'
        result = get_vars_from_path(loader, path, entities, stage)
        self.assertIsInstance(result, dict)

    def test_get_vars_from_path_plugin_list(self):
        loader = object()
        path = 'path'
        entities = ['entity1', 'entity2']
        stage = 'stage'
        vars_plugin_list = [object()]
        vars_loader.all = lambda: vars_plugin_list
        result = get_vars_from_path(loader, path, entities, stage)
        self.assertIsInstance(result, dict)

class TestGetVarsFromInventorySources(unittest.TestCase):
    def test_get_vars_from_inventory_sources(self):
        loader = object()
        sources = ['source1', 'source2']
        entities = ['entity1', 'entity2']
        stage = 'stage'
        result = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertIsInstance(result, dict)

    def test_get_vars_from_inventory_sources_path_none(self):
        loader = object()
        sources = [None, 'source2']
        entities = ['entity1', 'entity2']
        stage = 'stage'
        result = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertIsInstance(result, dict)

class TestDisplay(unittest.TestCase):
    def test_display_str(self):
        display = Display()
        result = display.__str__()
        self.assertIsInstance(result, str)

    def test_display_repr(self):
        display = Display()
        result = display.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()