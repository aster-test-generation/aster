import unittest
from ansible.plugins.inventory.ini import InventoryModule


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory = InventoryModule()

    def test_parse_group_name(self):
        line = '[group_1]'
        result = self.inventory._parse_group_name(line)
        self.assertEqual(result, 'group_1')

    def test_parse_variable_definition(self):
        line = 'key=value'
        result = self.inventory._parse_variable_definition(line)
        self.assertEqual(result, ('key', 'value'))

    def test_parse_host_definition(self):
        line = 'host1 key1=value1 key2=value2'
        result = self.inventory._parse_host_definition(line)
        self.assertEqual(result, (['host1'], None, {'key1': 'value1', 'key2': 'value2'}))

    def test_expand_hostpattern(self):
        hostpattern = 'host1:80'
        result = self.inventory._expand_hostpattern(hostpattern)
        self.assertEqual(result, (['host1'], 80))

    def test_parse_value(self):
        v = '123'
        result = self.inventory._parse_value(v)
        self.assertEqual(str(result), '123')

if __name__ == '__main__':
    unittest.main()