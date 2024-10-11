import unittest
from ansible_collections.core.inventory.ini import InventoryModule, DOCUMENTATION, EXAMPLE


class TestInventoryModule(unittest.TestCase):
    def test___init__(self):
        instance = InventoryModule()
        self.assertIsInstance(instance, InventoryModule)

    def test_compile_patterns(self):
        instance = InventoryModule()
        instance._compile_patterns()
        self.assertIsNotNone(instance.patterns)

    def test__filename(self):
        instance = InventoryModule()
        instance._filename = 'test.ini'
        self.assertEqual(instance._filename, 'test.ini')

    def test_pattern_section(self):
        instance = InventoryModule()
        instance._compile_patterns()
        pattern = instance.patterns['section']
        match = pattern.match('[group_name]')
        self.assertIsNotNone(match)

    def test_pattern_groupname(self):
        instance = InventoryModule()
        instance._compile_patterns()
        pattern = instance.patterns['groupname']
        match = pattern.match('group_name')
        self.assertIsNotNone(match)

    def test___str__(self):
        instance = InventoryModule()
        result = instance.__str__()
        self.assertEqual(result, 'InventoryModule')

    def test___repr__(self):
        instance = InventoryModule()
        result = instance.__repr__()
        self.assertEqual(result, 'InventoryModule()')

class TestDOCUMENTATION(unittest.TestCase):
    def test_documentation(self):
        self.assertIsNotNone(DOCUMENTATION)

class TestEXAMPLES(unittest.TestCase):
    def test_examples(self):
        self.assertIsNotNone(EXAMPLES)

if __name__ == '__main__':
    unittest.main()