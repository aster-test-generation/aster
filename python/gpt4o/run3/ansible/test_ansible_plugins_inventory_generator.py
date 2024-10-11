import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.inventory.generator import InventoryModule
from ansible.errors import AnsibleParserError
from ansible.plugins.inventory import BaseInventoryPlugin


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory_module = InventoryModule()
        self.inventory = MagicMock()
        self.loader = MagicMock()
        self.path = "test_path"
        self.cache = False

    def test_init(self):
        self.assertIsInstance(self.inventory_module, InventoryModule)
        self.assertIsInstance(self.inventory_module, BaseInventoryPlugin)

    def test_verify_file_valid(self):
        with patch('os.path.splitext', return_value=('file', '.yaml')):
            with patch.object(BaseInventoryPlugin, 'verify_file', return_value=True):
                result = self.inventory_module.verify_file('test.yaml')
                self.assertTrue(result)

    def test_verify_file_invalid(self):
        with patch('os.path.splitext', return_value=('file', '.txt')):
            with patch.object(BaseInventoryPlugin, 'verify_file', return_value=True):
                result = self.inventory_module.verify_file('test.txt')
                self.assertFalse(result)

    def test_template(self):
        self.inventory_module.templar = MagicMock()
        self.inventory_module.templar.do_template = MagicMock(return_value="templated_string")
        result = self.inventory_module.template("pattern", {"var": "value"})
        self.assertEqual(result, "templated_string")

    def test_add_parents(self):
        self.inventory_module.templar = MagicMock()
        self.inventory_module.templar.do_template = MagicMock(side_effect=lambda x: x)
        child = "child"
        parents = [{"name": "parent1"}, {"name": "parent2"}]
        template_vars = {"var": "value"}
        self.inventory_module.add_parents(self.inventory, child, parents, template_vars)
        self.inventory.add_group.assert_any_call("parent1")
        self.inventory.add_group.assert_any_call("parent2")
        self.inventory.add_child.assert_any_call("parent1", child)
        self.inventory.add_child.assert_any_call("parent2", child)

    def test_add_parents_with_vars(self):
        self.inventory_module.templar = MagicMock()
        self.inventory_module.templar.do_template = MagicMock(side_effect=lambda x: x)
        child = "child"
        parents = [{"name": "parent1", "vars": {"key": "value"}}]
        template_vars = {"var": "value"}
        self.inventory_module.add_parents(self.inventory, child, parents, template_vars)
        self.inventory.add_group.assert_called_with("parent1")
        self.inventory.groups["parent1"].set_variable.assert_called_with("key", "value")
        self.inventory.add_child.assert_called_with("parent1", child)

    def test_add_parents_raises_error(self):
        self.inventory_module.templar = MagicMock()
        self.inventory_module.templar.do_template = MagicMock(side_effect=AttributeError)
        child = "child"
        parents = [{"name": "parent1"}]
        template_vars = {"var": "value"}
        with self.assertRaises(AnsibleParserError):
            self.inventory_module.add_parents(self.inventory, child, parents, template_vars={})

    def test_parse(self):
        config = {
            'layers': {
                'operation': ['build', 'launch'],
                'environment': ['dev', 'test', 'prod'],
                'application': ['web', 'api']
            },
            'hosts': {
                'name': "{{ operation }}_{{ application }}_{{ environment }}_runner",
                'parents': [
                    {'name': "{{ operation }}_{{ application }}_{{ environment }}"}
                ]
            }
        }
        self.inventory_module._read_config_data = MagicMock(return_value=config)
        self.inventory_module.templar = MagicMock()
        self.inventory_module.templar.do_template = MagicMock(side_effect=lambda x: x)
        self.inventory_module.add_parents = MagicMock()
        self.inventory_module.parse(self.inventory, self.loader, self.path, self.cache)
        self.inventory.add_host.assert_called()
        self.inventory_module.add_parents.assert_called()

if __name__ == '__main__':
    unittest.main()