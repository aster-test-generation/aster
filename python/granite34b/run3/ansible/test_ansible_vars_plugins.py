import unittest
from ansible.vars.plugins import get_plugin_vars, get_vars_from_path, get_vars_from_inventory_sources
from ansible.inventory.host import Host
from ansible.module_utils._text import to_bytes
from ansible.plugins.loader import vars_loader
from ansible.utils.collection_loader import AnsibleCollectionRef
from ansible.utils.display import Display
from ansible.utils.vars import combine_vars


class TestVarsPlugins(unittest.TestCase):
    def test_get_plugin_vars(self):
        loader = vars_loader
        plugin = vars_loader.get('example_plugin')
        path = '/path/to/plugin'
        entities = [Host('example_host')]
        data = get_plugin_vars(loader, plugin, path, entities)
        self.assertEqual(data, {'plugin_var': 'value'})

    def test_get_vars_from_path(self):
        loader = vars_loader
        path = '/path/to/vars'
        entities = [Host('example_host')]
        stage = 'example_stage'
        data = get_vars_from_path(loader, path, entities, stage)
        self.assertEqual(data, {'vars_var': 'value'})

    def test_get_vars_from_inventory_sources(self):
        loader = vars_loader
        sources = ['/path/to/inventory']
        entities = [Host('example_host')]
        stage = 'example_stage'
        data = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertEqual(data, {'inventory_var': 'value'})

if __name__ == '__main__':
    unittest.main()