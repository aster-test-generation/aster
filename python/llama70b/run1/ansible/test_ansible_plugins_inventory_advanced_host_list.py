import unittest
from ansible_collections.core.plugins.inventory.advanced_host_list import InventoryModule, DOCUMENTATION, EXAMPLE


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        instance = InventoryModule()
        result = instance.verify_file('hosts,example.com')
        self.assertTrue(result)

    def test_parse(self):
        instance = InventoryModule()
        inventory = object()
        loader = object()
        host_list = 'host1,host2,host3'
        instance.parse(inventory, loader, host_list)
        self.assertIn('host1', instance.inventory.hosts)
        self.assertIn('host2', instance.inventory.hosts)
        self.assertIn('host3', instance.inventory.hosts)

    def test_expand_hostpattern(self):
        instance = InventoryModule()
        hostpattern = 'host[1-3]'
        result = instance._expand_hostpattern(hostpattern)
        self.assertEqual(result, (['host1', 'host2', 'host3'], None))

    def test_init(self):
        instance = InventoryModule()
        self.assertEqual(instance.NAME, 'advanced_host_list')

    def test_str(self):
        instance = InventoryModule()
        result = str(instance)
        self.assertEqual(result, 'advanced_host_list')

    def test_repr(self):
        instance = InventoryModule()
        result = repr(instance)
        self.assertEqual(result, 'advanced_host_list()')

    def test_eq(self):
        instance1 = InventoryModule()
        instance2 = InventoryModule()
        self.assertEqual(instance1, instance2)

class TestDOCUMENTATION(unittest.TestCase):
    def test_documentation(self):
        self.assertIsInstance(DOCUMENTATION, str)

class TestEXAMPLES(unittest.TestCase):
    def test_examples(self):
        self.assertIsInstance(EXAMPLES, str)

if __name__ == '__main__':
    unittest.main()