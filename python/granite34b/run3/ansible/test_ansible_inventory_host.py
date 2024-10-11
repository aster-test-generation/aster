from ansible.inventory.host import Group
import unittest
from ansible.inventory.host import Host


class TestHost(unittest.TestCase):
    def test_init(self):
        host = Host('example.com')
        self.assertEqual(host.name, 'example.com')
        self.assertEqual(host.address, 'example.com')
        self.assertEqual(host.vars, {})
        self.assertEqual(host.groups, [])
        self.assertTrue(host._uuid)
        self.assertFalse(host.implicit)

    def test_get_name(self):
        host = Host('example.com')
        self.assertEqual(host.get_name(), 'example.com')

    def test_populate_ancestors(self):
        group1 = Group('group1')
        group2 = Group('group2')
        host = Host('example.com')
        host.add_group(group1)
        host.add_group(group2)
        host.populate_ancestors()
        self.assertEqual(host.groups, [group1, group2])

    def test_add_group(self):
        group = Group('group')
        host = Host('example.com')
        host.add_group(group)
        self.assertEqual(host.groups, [group])

    def test_remove_group(self):
        group = Group('group')
        host = Host('example.com')
        host.add_group(group)
        host.remove_group(group)
        self.assertEqual(host.groups, [])

    def test_set_variable(self):
        host = Host('example.com')
        host.set_variable('key', 'value')
        self.assertEqual(host.vars, {'key': 'value'})

    def test_get_groups(self):
        group = Group('group')
        host = Host('example.com')
        host.add_group(group)
        self.assertEqual(host.get_groups(), [group])

    def test_get_magic_vars(self):
        group = Group('group')
        host = Host('example.com')
        host.add_group(group)
        self.assertEqual(host.get_magic_vars(), {
            'inventory_hostname': 'example.com',
            'inventory_hostname_short': 'example.com',
            'group_names': ['group']
        })

    def test_get_vars(self):
        group = Group('group')
        host = Host('example.com')
        host.add_group(group)
        host.set_variable('key', 'value')
        self.assertEqual(host.get_vars(), {
            'key': 'value',
            'inventory_hostname': 'example.com',
            'inventory_hostname_short': 'example.com',
            'group_names': ['group']
        })

if __name__ == '__main__':
    unittest.main()