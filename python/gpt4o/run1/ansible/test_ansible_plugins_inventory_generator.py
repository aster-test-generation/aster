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

    def test_verify_file_valid_extension(self):
        with patch('os.path.splitext', return_value=('file', '.config')):
            with patch.object(BaseInventoryPlugin, 'verify_file', return_value=True):
                result = self.inventory_module.verify_file('test_path')
                self.assertTrue(result)

    def test_verify_file_invalid_extension(self):
        with patch('os.path.splitext', return_value=('file', '.txt')):
            with patch.object(BaseInventoryPlugin, 'verify_file', return_value=True):
                result = self.inventory_module.verify_file('test_path')
                self.assertFalse(result)

    def test_template(self):
        self.inventory_module.templar = MagicMock()
        self.inventory_module.templar.do_template = MagicMock(return_value="templated_value")
        result = self.inventory_module.template("pattern", {"var": "value"})
        self.assertEqual(result, "templated_value")

    def test_add_parents(self):
        self.inventory_module.templar = MagicMock()
        self.inventory_module.templar.do_template = MagicMock(side_effect=lambda x: x)
        self.inventory.groups = {}
        self.inventory.add_group = MagicMock()
        self.inventory.add_child = MagicMock()
        child = "child"
        parents = [{"name": "parent", "vars": {"var": "value"}}]
        template_vars = {"var": "value"}
        self.inventory_module.add_parents(self.inventory, child, parents, template_vars={})
        self.inventory.add_group.assert_called_with("parent")
        self.inventory.add_child.assert_called_with("parent", child)

    def test_add_parents_raises_error(self):
        self.inventory_module.templar = MagicMock()
        self.inventory_module.templar.do_template = MagicMock(side_effect=AttributeError)
        child = {"name": "child"}
        parents = [{"name": "parent"}]
        template_vars = {"var": "value"}
        with self.assertRaises(AnsibleParserError):
            self.inventory_module.add_parents(self.inventory, child, parents, template_vars)

    def test_parse(self):
        config = {
            'layers': {
                'operation': ['build', 'launch'],
                'environment': ['dev', 'test', 'prod'],
                'application': ['web', 'api']
            },
            'hosts': {
                'name': "{{ operation }}_{{ application }}_{{ environment }}_runner",
                'parents': []
            }
        }
        self.inventory_module._read_config_data = MagicMock(return_value=config)
        self.inventory_module.templar = MagicMock()
        self.inventory_module.templar.do_template = MagicMock(side_effect=lambda x: x)
        self.inventory.add_host = MagicMock()
        self.inventory_module.add_parents = MagicMock()
        self.inventory_module.parse(self.inventory, self.loader, self.path, self.cache)
        self.inventory.add_host.assert_called()

    def test_read_config_data(self):
        with patch('ansible.plugins.inventory.generator.InventoryModule._read_config_data', return_value={'key': 'value'}):
            result = self.inventory_module._read_config_data('test_path')
            self.assertEqual(result, {'key': 'value'})

if __name__ == '__main__':
    unittest.main()