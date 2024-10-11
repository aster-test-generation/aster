from ansible.inventory.host import Group
import unittest
from ansible.inventory.host import Host


class TestHost(unittest.TestCase):
    def test_get_name(self):
        host = Host(name='test_host')
        self.assertEqual(host.get_name(), 'test_host')

    def test_populate_ancestors(self):
        host = Host(name='test_host')
        group = Group(name='test_group')
        host.populate_ancestors([group])
        self.assertIn(group, host.get_groups())

    def test_add_group(self):
        host = Host(name='test_host')
        group = Group(name='test_group')
        self.assertTrue(host.add_group(group))
        self.assertIn(group, host.get_groups())

    def test_remove_group(self):
        host = Host(name='test_host')
        group = Group(name='test_group')
        host.add_group(group)
        self.assertTrue(host.remove_group(group))
        self.assertNotIn(group, host.get_groups())

    def test_set_variable(self):
        host = Host(name='test_host')
        host.set_variable('test_key', 'test_value')
        self.assertEqual(host.vars['test_key'], 'test_value')

    def test_get_groups(self):
        host = Host(name='test_host')
        group = Group(name='test_group')
        host.add_group(group)
        self.assertIn(group, host.get_groups())

    def test_get_magic_vars(self):
        host = Host(name='test_host')
        magic_vars = host.get_magic_vars()
        self.assertEqual(magic_vars['inventory_hostname'], 'test_host')
        self.assertEqual(magic_vars['inventory_hostname_short'], 'test_host')
        self.assertEqual(magic_vars['group_names'], [])

    def test_get_vars(self):
        host = Host(name='test_host')
        host.set_variable('test_key', 'test_value')
        vars = host.get_vars()
        self.assertEqual(vars['test_key'], 'test_value')
        self.assertEqual(vars['inventory_hostname'], 'test_host')
        self.assertEqual(vars['inventory_hostname_short'], 'test_host')
        self.assertEqual(vars['group_names'], [])

if __name__ == '__main__':
    unittest.main()