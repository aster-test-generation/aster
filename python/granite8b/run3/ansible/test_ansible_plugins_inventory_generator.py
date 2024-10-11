import unittest
from ansible.plugins.inventory import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        self.assertTrue(inventory.verify_file('test.yml'))
        self.assertTrue(inventory.verify_file('test.yaml'))
        self.assertTrue(inventory.verify_file('test.config'))
        self.assertFalse(inventory.verify_file('test.txt'))

    def test_template(self):
        inventory = InventoryModule()
        self.assertEqual(inventory.template('Hello {{ name }}', {'name': 'World'}), 'Hello World')
        self.assertEqual(inventory.template('Hello {{ name }}', {'name': 'World!'}), 'Hello World!')

    def test_add_parents(self):
        inventory = InventoryModule()
        inventory.groups = {}
        inventory.add_group('group1')
        inventory.add_group('group2')
        inventory.add_group('group3')
        inventory.add_child('group1', 'child1')
        inventory.add_child('group2', 'child2')
        inventory.add_child('group3', 'child3')
        inventory.add_parents(inventory.groups['child1'], ['group2', 'group3'], {'parents': [{'name': 'group2'}, {'name': 'group3'}]})
        self.assertEqual(inventory.groups['child1'].parents, ['group2', 'group3'])
        self.assertEqual(inventory.groups['group2'].children, ['child1'])
        self.assertEqual(inventory.groups['group3'].children, ['child1'])

    def test_parse(self):
        inventory = InventoryModule()
        inventory.groups = {}
        inventory.add_group('group1')
        inventory.add_group('group2')
        inventory.add_group('group3')
        inventory.add_child('group1', 'child1')
        inventory.add_child('group2', 'child2')
        inventory.add_child('group3', 'child3')
        inventory.parse(inventory, None, 'test.yml', cache=False)
        self.assertEqual(inventory.groups['child1'].parents, ['group2', 'group3'])
        self.assertEqual(inventory.groups['group2'].children, ['child1'])
        self.assertEqual(inventory.groups['group3'].children, ['child1'])

if __name__ == '__main__':
    unittest.main()