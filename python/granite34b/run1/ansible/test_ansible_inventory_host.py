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
        self.assertIsNotNone(host._uuid)
        self.assertFalse(host.implicit)

    def test_get_name(self):
        host = Host('example.com')
        self.assertEqual(host.get_name(), 'example.com')

    def test_populate_ancestors(self):
        host = Host('example.com')
        group1 = Group('group1')
        group2 = Group('group2')
        host.add_group(group1)
        host.add_group(group2)
        host.populate_ancestors()
        self.assertEqual(host.groups, [group1, group2])

    def test_add_group(self):
        host = Host('example.com')
        group = Group('group1')
        host.add_group(group)
        self.assertEqual(host.groups, [group])

    def test_remove_group(self):
        host = Host('example.com')
        group = Group('group1')
        host.add_group(group)
        host.remove_group(group)
        self.assertEqual(host.groups, [])

    def test_set_variable(self):
        host = Host('example.com')
        host.set_variable('key1', 'value1')
        self.assertEqual(host.vars, {'key1': 'value1'})

    def test_get_groups(self):
        host = Host('example.com')
        group = Group('group1')
        host.add_group(group)
        self.assertEqual(host.get_groups(), [group])

    def test_get_magic_vars(self):
        host = Host('example.com')
        group = Group('group1')
        host.add_group(group)
        self.assertEqual(host.get_magic_vars(), {
            'inventory_hostname': 'example.com',
            'inventory_hostname_short': 'example.com',
            'group_names': ['group1']
        })

    def test_get_vars(self):
        host = Host('example.com')
        host.set_variable('key1', 'value1')
        group = Group('group1')
        host.add_group(group)
        self.assertEqual(host.get_vars(), {
            'key1': 'value1',
            'inventory_hostname': 'example.com',
            'inventory_hostname_short': 'example.com',
            'group_names': ['group1']
        })

if __name__ == '__main__':
    unittest.main()