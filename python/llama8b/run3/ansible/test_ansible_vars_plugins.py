import unittest
from ansible.vars.plugins import get_plugin_vars, get_vars_from_path, get_vars_from_inventory_sources
from ansible.vars import constants as C
from ansible.module_utils._text import to_bytes
from ansible.inventory.host import Host
from ansible.utils.collection_loader import AnsibleCollectionRef
from ansible.utils.display import Display
from ansible.utils.vars import combine_vars
from ansible.errors import AnsibleError
from ansible.module_utils import AnsibleModule
from ansible.module_utils._text import to_text
from ansible.module_utils.basic import env_fallback
from ansible.module_utils._text import to_bytes_safe


class TestAnsibleVars(unittest.TestCase):
    def test_get_plugin_vars(self):
        loader = AnsibleModule()
        plugin = AnsibleCollectionRef('ansible.builtin')
        path = 'path'
        entities = [Host('host1'), Host('host2')]
        result = get_plugin_vars(loader, plugin, path, entities)
        self.assertEqual(result, {})

    def test_get_vars_from_path(self):
        loader = AnsibleModule()
        path = 'path'
        entities = [Host('host1'), Host('host2')]
        stage = 'stage'
        result = get_vars_from_path(loader, path, entities, stage)
        self.assertEqual(result, {})

    def test_get_vars_from_inventory_sources(self):
        loader = AnsibleModule()
        sources = ['source1', 'source2']
        entities = [Host('host1'), Host('host2')]
        stage = 'stage'
        result = get_vars_from_inventory_sources(loader, sources, entities, stage)
        self.assertEqual(result, {})

    def test_get_plugin_vars_with_error(self):
        loader = AnsibleModule()
        plugin = AnsibleCollectionRef('ansible.builtin')
        path = 'path'
        entities = [Host('host1'), Host('host2')]
        with self.assertRaises(AnsibleError):
            get_plugin_vars(loader, plugin, path, entities)

    def test_get_vars_from_path_with_error(self):
        loader = AnsibleModule()
        path = 'path'
        entities = [Host('host1'), Host('host2')]
        stage = 'stage'
        with self.assertRaises(AnsibleError):
            get_vars_from_path(loader, path, entities, stage)

    def test_get_vars_from_inventory_sources_with_error(self):
        loader = AnsibleModule()
        sources = ['source1', 'source2']
        entities = [Host('host1'), Host('host2')]
        stage = 'stage'
        with self.assertRaises(AnsibleError):
            get_vars_from_inventory_sources(loader, sources, entities, stage)

if __name__ == '__main__':
    unittest.main()