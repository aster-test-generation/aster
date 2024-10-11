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

    def test_get_plugin_vars_with_data(self):
        loader = None
        plugin = None
        path = None
        entities = None
        plugin.get_vars = lambda loader, path, entities: {1: 2}
        result = get_plugin_vars(loader, plugin, path, entities)
        self.assertEqual(result, {1: 2})

    def test_get_plugin_vars_with_exception(self):
        loader = None
        plugin = None
        path = None
        entities = None
        plugin.get_vars = lambda loader, path, entities: 1 / 0
        with self.assertRaises(ZeroDivisionError):
            get_plugin_vars(loader, plugin, path, entities)

    def test_get_plugin_vars_with_attribute_error(self):
        loader = None
        plugin = None
        path = None
        entities = None
        plugin.get_vars = lambda loader, path, entities: 1 / 0
        with self.assertRaises(AttributeError):
            get_plugin_vars(loader, plugin, path, entities)

    def test_get_plugin_vars_with_host(self):
        loader = None
        plugin = None
        path = None
        entities = [Host('test')]
        plugin.get_host_vars = lambda entity: {1: 2}
        result = get_plugin_vars(loader, plugin, path, entities)
        self.assertEqual(result, {1: 2})

    def test_get_plugin_vars_with_group(self):
        loader = None
        plugin = None
        path = None
        entities = [Host('test')]
        plugin.get_group_vars = lambda entity: {1: 2}
        result = get_plugin_vars(loader, plugin, path, entities)
        self.assertEqual(result, {1: 2})

    def test_get_plugin_vars_with_host_and_group(self):
        loader = None
        plugin = None
        path = None
        entities = [Host('test')]
        plugin.get_host_vars = lambda entity: {1: 2}
        plugin.get_group_vars = lambda entity: {3: 4}
        result = get_plugin_vars(loader, plugin, path, entities)
        self.assertEqual(result, {1: 2, 3: 4})

    def test_get_plugin_vars_with_host_and_group_and_exception(self):
        loader = None
        plugin = None
        path = None
        entities = [Host('test')]
        plugin.get_host_vars = lambda entity: 1 / 0
        plugin.get_group_vars = lambda entity: {3: 4}
        with self.assertRaises(ZeroDivisionError):
            get_plugin_vars(loader, plugin, path, entities)

    def test_get_plugin_vars_with_host_and_group_and_attribute_error(self):
        loader = None
        plugin = None
        path = None
        entities = [Host('test')]
        plugin.get_host_vars = lambda entity: 1 / 0
        plugin.get_group_vars = lambda entity: {3: 4}
        with self.assertRaises(AttributeError):
            get_plugin_vars(loader, plugin, path, entities)

class TestGetVarsFromPath(unittest.TestCase):
    def test_get_vars_from_path(self):
        loader = None
        path = None
        entities = None
        stage = None
        result = get_vars_from_path(loader, path, entities, stage)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()