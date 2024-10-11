import ansible.plugins.inventory.yaml
import unittest


class TestInventoryModule(unittest.TestCase):
    def test_init(self):
        module = ansible.plugins.inventory.ini.InventoryModule()
        self.assertIsInstance(module, ansible.plugins.inventory.ini.InventoryModule)

    def test_parse_group_name(self):
        module = ansible.plugins.inventory.ini.InventoryModule()
        self.assertEqual(module._parse_group_name("[group_name]"), "group_name")

    def test_parse_variable_definition(self):
        module = ansible.plugins.inventory.ini.InventoryModule()
        self.assertEqual(module._parse_variable_definition("key=value"), ("key", "value"))

    def test_parse_host_definition(self):
        module = ansible.plugins.inventory.ini.InventoryModule()
        self.assertEqual(module._parse_host_definition("hostname var1=value1 var2=value2"), ("hostname", None, {"var1": "value1", "var2": "value2"}))

    def test_expand_hostpattern(self):
        module = ansible.plugins.inventory.ini.InventoryModule()
        self.assertEqual(module._expand_hostpattern("hostname"), ("hostname", None))

    def test_parse_value(self):
        module = ansible.plugins.inventory.ini.InventoryModule()
        self.assertEqual(module._parse_value("123"), 123)
        self.assertEqual(module._parse_value("True"), True)
        self.assertEqual(module._parse_value("False"), False)
        self.assertEqual(module._parse_value("'string'"), "string")
        self.assertEqual(module._parse_value("[1, 2, 3]"), [1, 2, 3])
        self.assertEqual(module._parse_value("{key: value}"), {"key": "value"})

if __name__ == '__main__':
    unittest.main()