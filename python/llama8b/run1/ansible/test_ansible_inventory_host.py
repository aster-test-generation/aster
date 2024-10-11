from ansible.inventory.host import Hos
import unittest
from ansible.inventory.host import Host


class TestHost(unittest.TestCase):
    def test_init(self):
        host = Host(name='test_host')
        self.assertEqual(host.name, 'test_host')
        self.assertEqual(host.vars, {})
        self.assertEqual(host.groups, [])
        self.assertEqual(host._uuid, None)
        self.assertFalse(host.implicit)

    def test_serialize(self):
        host = Host(name='test_host')
        host.vars = {'key': 'value'}
        host.groups = [Group(name='group1'), Group(name='group2')]
        serialized_host = host.serialize()
        self.assertEqual(serialized_host['name'], 'test_host')
        self.assertEqual(serialized_host['vars'], {'key': 'value'})
        self.assertEqual(len(serialized_host['groups']), 2)

    def test_deserialize(self):
        host = Host()
        data = {'name': 'test_host', 'vars': {'key': 'value'}, 'groups': [{'name': 'group1'}, {'name': 'group2'}]}
        host.deserialize(data)
        self.assertEqual(host.name, 'test_host')
        self.assertEqual(host.vars, {'key': 'value'})
        self.assertEqual(len(host.groups), 2)

    def test_eq(self):
        host1 = Host(name='test_host1')
        host2 = Host(name='test_host2')
        self.assertFalse(host1 == host2)
        host1._uuid = host2._uuid
        self.assertTrue(host1 == host2)

    def test_ne(self):
        host1 = Host(name='test_host1')
        host2 = Host(name='test_host2')
        self.assertTrue(host1 != host2)

    def test_hash(self):
        host = Host(name='test_host')
        self.assertEqual(hash(host), hash(host.name))

    def test_str(self):
        host = Host(name='test_host')
        self.assertEqual(str(host), 'test_host')

    def test_repr(self):
        host = Host(name='test_host')
        self.assertEqual(repr(host), 'test_host')

    def test_get_name(self):
        host = Host(name='test_host')
        self.assertEqual(host.get_name(), 'test_host')

    def test_populate_ancestors(self):
        host = Host(name='test_host')
        group1 = Group(name='group1')
        group2 = Group(name='group2')
        host.populate_ancestors([group1, group2])
        self.assertIn(group1, host.groups)
        self.assertIn(group2, host.groups)

    def test_add_group(self):
        host = Host(name='test_host')
        group1 = Group(name='group1')
        host.add_group(group1)
        self.assertIn(group1, host.groups)

    def test_remove_group(self):
        host = Host(name='test_host')
        group1 = Group(name='group1')
        host.groups.append(group1)
        host.remove_group(group1)
        self.assertNotIn(group1, host.groups)

    def test_set_variable(self):
        host = Host(name='test_host')
        host.set_variable('key', 'value')
        self.assertEqual(host.vars, {'key': 'value'})

    def test_get_groups(self):
        host = Host(name='test_host')
        group1 = Group(name='group1')
        host.groups.append(group1)
        self.assertEqual(host.get_groups(), [group1])

    def test_get_magic_vars(self):
        host = Host(name='test_host')
        self.assertEqual(host.get_magic_vars(), {'inventory_hostname': 'test_host', 'inventory_hostname_short': 'test_host', 'group_names': []})

    def test_get_vars(self):
        host = Host(name='test_host')
        self.assertEqual(host.get_vars(), {})

if __name__ == '__main__':
    unittest.main()