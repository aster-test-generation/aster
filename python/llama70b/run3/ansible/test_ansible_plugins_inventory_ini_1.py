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
        line = '[group1]'
        result = instance._parse_group_name(line)
        self.assertEqual(result, 'group1')

    def test__parse_variable_definition(self):
        instance = InventoryModule()
        line = 'key=value'
        result = instance._parse_variable_definition(line)
        self.assertEqual(result, ('key', 'value'))

    def test__parse_host_definition(self):
        instance = InventoryModule()
        line = 'host1:22 key=value'
        result = instance._parse_host_definition(line)
        self.assertEqual(result, (['host1'], '22', {'key': 'value'}))

    def test__expand_hostpattern(self):
        instance = InventoryModule()
        hostpattern = 'host1:22'
        result = instance._expand_hostpattern(hostpattern)
        self.assertEqual(result, (['host1'], '22'))

    def test__parse_value(self):
        instance = InventoryModule()
        v = '1'
        result = instance._parse_value(v)
        self.assertEqual(result, 1)

    def test___str__(self):
        instance = InventoryModule()
        result = instance.__str__()
        self.assertEqual(result, 'InventoryModule')

    def test___repr__(self):
        instance = InventoryModule()
        result = instance.__repr__()
        self.assertEqual(result, 'InventoryModule()')

class TestDocumentation(unittest.TestCase):
    def test_documentation(self):
        self.assertIsNotNone(DOCUMENTATION)

class TestExamples(unittest.TestCase):
    def test_examples(self):
        self.assertIsNotNone(EXAMPLES)

if __name__ == '__main__':
    unittest.main()