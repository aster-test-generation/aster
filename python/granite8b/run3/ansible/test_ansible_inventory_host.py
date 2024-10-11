from ansible.inventory.host import Group
import unittest
from ansible.inventory.host import Host


class TestHost(unittest.TestCase):
    def test_get_name(self):
        host = Host('example.com')
        self.assertEqual(host.get_name(), 'example.com')

    def test_populate_ancestors(self):
        host = Host('example.com')
        group = Group('group')
        host.populate_ancestors([group])
        self.assertIn(group, host.get_groups())

    def test_add_group(self):
        host = Host('example.com')
        group = Group('group')
        self.assertTrue(host.add_group(group))
        self.assertIn(group, host.get_groups())

    def test_remove_group(self):
        host = Host('example.com')
        group = Group('group')
        host.add_group(group)
        self.assertTrue(host.remove_group(group))
        self.assertNotIn(group, host.get_groups())

    def test_set_variable(self):
        host = Host('example.com')
        host.set_variable('key', 'value')
        self.assertEqual(host.get_vars()['key'], 'value')

    def test_get_magic_vars(self):
        host = Host('example.com')
        magic_vars = host.get_magic_vars()
        self.assertEqual(magic_vars['inventory_hostname'], 'example.com')
        self.assertEqual(magic_vars['inventory_hostname_short'], 'example')
        self.assertEqual(magic_vars['group_names'], [])

if __name__ == '__main__':
    unittest.main()