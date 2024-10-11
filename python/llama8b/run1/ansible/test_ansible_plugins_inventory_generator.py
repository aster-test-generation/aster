import unittest
from ansible.inventory import Inventory, InventoryErro


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        self.assertTrue(inventory.verify_file('test.yml'))
        self.assertFalse(inventory.verify_file('test.txt'))

    def test_template(self):
        inventory = InventoryModule()
        pattern = 'Hello {{ name }}!'
        variables = {'name': 'John'}
        result = inventory.template(pattern, variables)
        self.assertEqual(result, 'Hello John!')

    def test_add_parents(self):
        inventory = InventoryModule()
        child = {'name': 'child'}
        parents = [{'name': 'parent1'}, {'name': 'parent2'}]
        template_vars = {'var1': 'value1', 'var2': 'value2'}
        inventory.add_parents(inventory, child, parents, template_vars)
        self.assertIn('parent1', inventory.groups)
        self.assertIn('parent2', inventory.groups)
        self.assertIn('child', inventory.children['parent1'])
        self.assertIn('child', inventory.children['parent2'])

    def test_parse(self):
        inventory = InventoryModule()
        config = {
            'hosts': {'name': 'host {{ operation }}_{{ application }}_{{ environment }}_runner'},
            'layers': {'operation': ['build', 'launch'], 'environment': ['dev', 'test', 'prod'], 'application': ['web', 'api']}
        }
        inventory.parse(inventory, None, None, False)
        self.assertIn('host build_web_dev_runner', inventory.hosts)
        self.assertIn('host launch_web_dev_runner', inventory.hosts)
        self.assertIn('host build_api_dev_runner', inventory.hosts)
        self.assertIn('host launch_api_dev_runner', inventory.hosts)
        self.assertIn('host build_web_test_runner', inventory.hosts)
        self.assertIn('host launch_web_test_runner', inventory.hosts)
        self.assertIn('host build_api_test_runner', inventory.hosts)
        self.assertIn('host launch_api_test_runner', inventory.hosts)
        self.assertIn('host build_web_prod_runner', inventory.hosts)
        self.assertIn('host launch_web_prod_runner', inventory.hosts)
        self.assertIn('host build_api_prod_runner', inventory.hosts)
        self.assertIn('host launch_api_prod_runner', inventory.hosts)

    def test_verify_file_invalid(self):
        inventory = InventoryModule()
        self.assertFalse(inventory.verify_file('test'))

    def test_template_invalid(self):
        inventory = InventoryModule()
        pattern = 'Hello {{ name }}!'
        variables = {'name': 'John'}
        result = inventory.template(pattern, variables)
        self.assertEqual(result, 'Hello John!')

    def test_add_parents_invalid(self):
        inventory = InventoryModule()
        child = {'name': 'child'}
        parents = [{'name': 'parent1'}, {'name': 'parent2'}]
        template_vars = {'var1': 'value1', 'var2': 'value2'}
        inventory.add_parents(inventory, child, parents, template_vars)
        self.assertIn('parent1', inventory.groups)
        self.assertIn('parent2', inventory.groups)
        self.assertIn('child', inventory.children['parent1'])
        self.assertIn('child', inventory.children['parent2'])

    def test_parse_invalid(self):
        inventory = InventoryModule()
        config = {
            'hosts': {'name': 'host {{ operation }}_{{ application }}_{{ environment }}_runner'},
            'layers': {'operation': ['build', 'launch'], 'environment': ['dev', 'test', 'prod'], 'application': ['web', 'api']}
        }
        inventory.parse(inventory, None, None, False)
        self.assertIn('host build_web_dev_runner', inventory.hosts)
        self.assertIn('host launch_web_dev_runner', inventory.hosts)
        self.assertIn('host build_api_dev_runner', inventory.hosts)
        self.assertIn('host launch_api_dev_runner', inventory.hosts)
        self.assertIn('host build_web_test_runner', inventory.hosts)
        self.assertIn('host launch_web_test_runner', inventory.hosts)
        self.assertIn('host build_api_test_runner', inventory.hosts)
        self.assertIn('host launch_api_test_runner', inventory.hosts)
        self.assertIn('host build_web_prod_runner', inventory.hosts)
        self.assertIn('host launch_web_prod_runner', inventory.hosts)
        self.assertIn('host build_api_prod_runner', inventory.hosts)
        self.assertIn('host launch_api_prod_runner', inventory.hosts)

if __name__ == '__main__':
    unittest.main()