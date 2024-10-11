import unittest
from ansible.module_utils.common.collections import ImmutableDict


class TestInventoryModule(unittest.TestCase):
    def test_verify_file(self):
        inventory = InventoryModule()
        self.assertFalse(inventory.verify_file(''))
        self.assertFalse(inventory.verify_file('path/to/file'))
        self.assertTrue(inventory.verify_file('host1,host2,host3'))

    def test_parse(self):
        inventory = InventoryModule()
        inventory.parse(None, None, 'host1,host2,host3')
        self.assertEqual(len(inventory.inventory.hosts), 3)
        self.assertEqual(inventory.inventory.hosts.keys(), ['host1', 'host2', 'host3'])

if __name__ == '__main__':
    unittest.main()