import unittest
from ansible.module_utils.common.collections import ImmutableDict


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        self.assertTrue(inventory.verify_file('test.yml'))
        self.assertTrue(inventory.verify_file('test.yaml'))
        self.assertTrue(inventory.verify_file('test.config'))
        self.assertFalse(inventory.verify_file('test.txt'))

    def test_template(self):
        inventory = InventoryModule()
        self.assertEqual(inventory.template('Hello {{ name }}!', {'name': 'World'}), 'Hello World!')

    def test_add_parents(self):
        inventory = InventoryModule()
        inventory.groups = {}
        inventory.add_group('parent1')
        inventory.add_group('parent2')
        inventory.add_group('child')
        inventory.add_child('parent1', 'child')
        inventory.add_child('parent2', 'child')
        inventory.add_parents(inventory.groups['child'], ['parent1', 'parent2'])
        self.assertEqual(inventory.groups['child']._parents, ['parent1', 'parent2'])

    def test_parse(self):
        inventory = InventoryModule()
        inventory.groups = {}
        inventory.add_group('parent1')
        inventory.add_group('parent2')
        inventory.add_group('child')
        inventory.add_child('parent1', 'child')
        inventory.add_child('parent2', 'child')
        inventory.parse(None, None, None)
        self.assertEqual(inventory.groups['child']._parents, ['parent1', 'parent2'])

if __name__ == '__main__':
    unittest.main()