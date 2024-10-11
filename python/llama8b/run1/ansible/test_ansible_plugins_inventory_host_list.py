import unittest
from unittest.mock import patch
from ansible.inventory.host_list import InventoryModul


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory_module = InventoryModule()

    def test_verify_file(self):
        self.assertTrue(self.inventory_module.verify_file('host1,host2'))
        self.assertFalse(self.inventory_module.verify_file('host1'))
        self.assertFalse(self.inventory_module.verify_file('host1,host2,host3'))

    @patch('ansible.plugins.inventory.host_list.os.path.exists')
    def test_verify_file_path(self, mock_exists):
        mock_exists.return_value = True
        self.assertTrue(self.inventory_module.verify_file('path/to/host1,host2'))
        mock_exists.assert_called_once_with('path/to/host1,host2')

    def test_parse(self):
        host_list = 'host1,host2'
        self.inventory_module.parse(None, None, host_list)
        self.assertIn('host1', self.inventory_module.inventory.hosts)
        self.assertIn('host2', self.inventory_module.inventory.hosts)

    def test_parse_empty_host_list(self):
        host_list = ''
        self.inventory_module.parse(None, None, host_list)
        self.assertEqual(len(self.inventory_module.inventory.hosts), 0)

    def test_parse_invalid_host_list(self):
        host_list = 'host1'
        self.assertRaises(AnsibleParserError, self.inventory_module.parse, None, None, host_list)

    def test_parse_multiple_hosts(self):
        host_list = 'host1,host2,host3'
        self.inventory_module.parse(None, None, host_list)
        self.assertIn('host1', self.inventory_module.inventory.hosts)
        self.assertIn('host2', self.inventory_module.inventory.hosts)
        self.assertIn('host3', self.inventory_module.inventory.hosts)

    def test_parse_host_with_port(self):
        host_list = 'host1:22,host2:80'
        self.inventory_module.parse(None, None, host_list)
        self.assertIn('host1', self.inventory_module.inventory.hosts)
        self.assertIn('host2', self.inventory_module.inventory.hosts)
        self.assertEqual(self.inventory_module.inventory.hosts['host1']['port'], 22)
        self.assertEqual(self.inventory_module.inventory.hosts['host2']['port'], 80)

    def test_parse_host_with_range(self):
        host_list = 'host1:22-25,host2:80'
        self.inventory_module.parse(None, None, host_list)
        self.assertIn('host1', self.inventory_module.inventory.hosts)
        self.assertIn('host2', self.inventory_module.inventory.hosts)
        self.assertEqual(self.inventory_module.inventory.hosts['host1']['port'], 22)
        self.assertEqual(self.inventory_module.inventory.hosts['host2']['port'], 80)

    def test_parse_host_with_invalid_port(self):
        host_list = 'host1:abc,host2:80'
        self.assertRaises(AnsibleError, self.inventory_module.parse, None, None, host_list)

    def test_parse_host_with_invalid_range(self):
        host_list = 'host1:22-abc,host2:80'
        self.assertRaises(AnsibleError, self.inventory_module.parse, None, None, host_list)

if __name__ == '__main__':
    unittest.main()