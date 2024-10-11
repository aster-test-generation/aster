import unittest
from ansible.inventory import Inventory


class TestInventoryModule(unittest.TestCase):
    def test_init(self):
        instance = InventoryModule()
        self.assertEqual(instance.patterns, {})
        self.assertIsNone(instance._filename)

    def test_compile_patterns(self):
        instance = InventoryModule()
        instance._compile_patterns()
        self.assertIsNotNone(instance.patterns.get('section'))
        self.assertIsNotNone(instance.patterns.get('groupname'))

    def test_section_pattern(self):
        instance = InventoryModule()
        pattern = instance.patterns.get('section')
        self.assertIsNotNone(pattern)
        self.assertEqual(pattern.pattern, '^\\[\n                    ([^:\\]\\s]+)')

    def test_groupname_pattern(self):
        instance = InventoryModule()
        pattern = instance.patterns.get('groupname')
        self.assertIsNotNone(pattern)
        self.assertEqual(pattern.pattern, '^\n                ([^:\\]\\s]+)\n                \\s*')

    def test_str_method(self):
        instance = InventoryModule()
        result = str(instance)
        self.assertEqual(result, '<ansible.plugins.inventory.ini.InventoryModule object at 0x...>')

    def test_repr_method(self):
        instance = InventoryModule()
        result = repr(instance)
        self.assertEqual(result, 'InventoryModule()')

    def test_eq_method(self):
        instance1 = InventoryModule()
        instance2 = InventoryModule()
        self.assertTrue(instance1 == instance2)

    def test_ne_method(self):
        instance1 = InventoryModule()
        instance2 = object()
        self.assertFalse(instance1 != instance2)

if __name__ == '__main__':
    unittest.main()