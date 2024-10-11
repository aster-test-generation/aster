import unittest
from ansible.plugins.inventory.ini import *


class TestInventoryModule(unittest.TestCase):
    def test_compile_patterns(self):
        inventory = InventoryModule()
        inventory._compile_patterns()
        self.assertIsNotNone(inventory.patterns['section'])
        self.assertIsNotNone(inventory.patterns['groupname'])

    def test_parse(self):
        inventory = InventoryModule()
        inventory._filename = 'test_inventory.ini'
        inventory.parse(inventory, loader, path)
        self.assertIsNotNone(inventory.inventory)

    def test_parse_file_not_found(self):
        inventory = InventoryModule()
        inventory._filename = 'file_not_found.ini'
        with self.assertRaises(AnsibleError) as context:
            inventory.parse(inventory, loader, path)
        self.assertTrue('file_not_found.ini does not exist' in str(context.exception))

    def test_parse_invalid_ini_file(self):
        inventory = InventoryModule()
        inventory._filename = 'invalid_inventory.ini'
        with self.assertRaises(AnsibleParserError) as context:
            inventory.parse(inventory, loader, path)
        self.assertTrue('Error while parsing file' in str(context.exception))

    def test_parse_group_vars(self):
        inventory = InventoryModule()
        inventory._filename = 'test_inventory.ini'
        inventory.parse(inventory, loader, path)
        group = inventory.inventory.groups.get('group_1')
        self.assertIsNotNone(group)
        self.assertEqual(group.vars['var_1'], 'value_1')
        self.assertEqual(group.vars['var_2'], 'value_2')

    def test_parse_host_vars(self):
        inventory = InventoryModule()
        inventory._filename = 'test_inventory.ini'
        inventory.parse(inventory, loader, path)
        host = inventory.inventory.hosts.get('host_1')
        self.assertIsNotNone(host)
        self.assertEqual(host.vars['var_1'], 'value_1')
        self.assertEqual(host.vars['var_2'], 'value_2')

    def test_parse_children(self):
        inventory = InventoryModule()
        inventory._filename = 'test_inventory.ini'
        inventory.parse(inventory, loader, path)
        group = inventory.inventory.groups.get('group_1')
        self.assertIsNotNone(group)
        self.assertEqual(len(group.children), 2)
        self.assertTrue('child_1' in group.children)
        self.assertTrue('child_2' in group.children)

    def test_parse_ungrouped_hosts(self):
        inventory = InventoryModule()
        inventory._filename = 'test_inventory.ini'
        inventory.parse(inventory, loader, path)
        self.assertEqual(len(inventory.inventory.ungrouped.hosts), 2)
        self.assertTrue('host_2' in inventory.inventory.ungrouped.hosts)
        self.assertTrue('host_3' in inventory.inventory.ungrouped.hosts)

if __name__ == '__main__':
    unittest.main()