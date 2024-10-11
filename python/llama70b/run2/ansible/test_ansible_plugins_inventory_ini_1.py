import unittest
from ansible_collections.core.inventory.ini import InventoryModule, DOCUMENTATION, EXAMPLE


class TestInventoryModule(unittest.TestCase):
    def test___init__(self):
        instance = InventoryModule()
        self.assertIsInstance(instance, InventoryModule)

    def test__add_pending_children(self):
        instance = InventoryModule()
        pending = {'group1': {'parents': ['parent1']}}
        instance._add_pending_children('group1', pending)
        self.assertNotIn('group1', pending)

    def test__parse_group_name(self):
        instance = InventoryModule()
        instance.patterns = {'groupname': re.compile(r'^(.+)$')}
        result = instance._parse_group_name('group1')
        self.assertEqual(result, 'group1')

    def test__parse_variable_definition(self):
        instance = InventoryModule()
        result = instance._parse_variable_definition('key=value')
        self.assertEqual(result, ('key', 'value'))

    def test__parse_host_definition(self):
        instance = InventoryModule()
        result = instance._parse_host_definition('host1:22 key=value')
        self.assertEqual(result, (['host1'], '22', {'key': 'value'}))

    def test__expand_hostpattern(self):
        instance = InventoryModule()
        result = instance._expand_hostpattern('host1:22')
        self.assertEqual(result, (['host1'], '22'))

    def test__parse_value(self):
        instance = InventoryModule()
        result = instance._parse_value('123')
        self.assertEqual(result, 123)

    def test__raise_error(self):
        instance = InventoryModule()
        with self.assertRaises(AnsibleError):
            instance._raise_error('Error message')

    def test_verify_file(self):
        instance = InventoryModule()
        instance._filename = 'test.ini'
        instance.verify_file()

    def test_parse(self):
        instance = InventoryModule()
        instance._filename = 'test.ini'
        instance.parse()

    def test_get_inventory(self):
        instance = InventoryModule()
        result = instance.get_inventory()
        self.assertIsInstance(result, dict)

    def test_str(self):
        instance = InventoryModule()
        result = str(instance)
        self.assertEqual(result, 'ini')

    def test_repr(self):
        instance = InventoryModule()
        result = repr(instance)
        self.assertEqual(result, 'ini')

class TestDOCUMENTATION(unittest.TestCase):
    def test_documentation(self):
        self.assertIsInstance(DOCUMENTATION, str)

class TestEXAMPLES(unittest.TestCase):
    def test_examples(self):
        self.assertIsInstance(EXAMPLES, str)

if __name__ == '__main__':
    unittest.main()