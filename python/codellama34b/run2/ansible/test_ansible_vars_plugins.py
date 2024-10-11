import unittest
from ansible.vars.plugins import *


class TestGetPluginVars(unittest.TestCase):
    def test_get_plugin_vars(self):
        loader = None
        plugin = None
        path = None
        entities = None
        result = get_plugin_vars(loader, plugin, path, entities)
        self.assertEqual(result, {})

class TestGetVarsFromPath(unittest.TestCase):
    def test_get_vars_from_path(self):
        loader = None
        path = None
        entities = None
        stage = None
        result = get_vars_from_path(loader, path, entities, stage)
        self.assertEqual(result, {})

class TestGetVarsFromInventorySources(unittest.TestCase):
    def test_get_vars_from_inventory_sources(self):
        loader = None
        sources = None
        entities = None
        stage = None
        result = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()