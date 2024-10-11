import unittest
from ansible.vars.plugins import get_plugin_vars, get_vars_from_path, get_vars_from_inventory_sources
from ansible.inventory.host import Host
from ansible.module_utils._text import to_bytes
from ansible.plugins.loader import vars_loader
from ansible.utils.collection_loader import AnsibleCollectionRef
from ansible.utils.display import Display
from ansible.utils.vars import combine_vars

display = Display()

class TestVarsPlugins(unittest.TestCase):
    def test_get_plugin_vars(self):
        plugin = vars_loader.get('example_plugin')
        path = '/path/to/plugin'
        entities = [Host('example_host')]
        result = get_plugin_vars(plugin, path, entities=entities)
        self.assertEqual(result, {'plugin_var': 'value'})

    def test_get_vars_from_path(self):
        path = '/path/to/vars'
        entities = [Host('example_host')]
        result = get_vars_from_path(path, entities, stage='task')
        self.assertEqual(result, {'var_from_path': 'value'})

    def test_get_vars_from_inventory_sources(self):
        sources = ['/path/to/inventory']
        entities = [Host('example_host')]
        result = get_vars_from_inventory_sources(sources, entities, stage='inventory')
        self.assertEqual(result, {'var_from_inventory': 'value'})

if __name__ == '__main__':
    unittest.main()