import unittest
from ansible.inventory.host import HostInventor


class TestHost(unittest.TestCase):
    def test_init(self):
        host = Host('test_host')
        self.assertEqual(host.name, 'test_host')
        self.assertEqual(host.vars, {})
        self.assertEqual(host.groups, [])
        self.assertEqual(host._uuid, None)
        self.assertFalse(host.implicit)

    def test_serialize(self):
        host = Host('test_host')
        host.vars = {'key': 'value'}
        host.groups = [Host('group1'), Host('group2')]
        data = host.serialize()
        self.assertEqual(data['name'], 'test_host')
        self.assertEqual(data['vars'], {'key': 'value'})
        self.assertEqual(data['groups'][0]['name'], 'group1')
        self.assertEqual(data['groups'][1]['name'], 'group2')

    def test_deserialize(self):
        host = Host('test_host')
        data = {'name': 'test_host', 'vars': {'key': 'value'}, 'groups': [{'name': 'group1'}, {'name': 'group2'}]}
        host.deserialize(data)
        self.assertEqual(host.name, 'test_host')
        self.assertEqual(host.vars, {'key': 'value'})
        self.assertEqual(len(host.groups), 2)
        self.assertEqual(host.groups[0].name, 'group1')
        self.assertEqual(host.groups[1].name, 'group2')

    def test_eq(self):
        host1 = Host('host1')
        host2 = Host('host1')
        self.assertTrue(host1 == host2)
        host3 = Host('host2')
        self.assertFalse(host1 == host3)

    def test_ne(self):
        host1 = Host('host1')
        host2 = Host('host1')
        self.assertFalse(host1 != host2)
        host3 = Host('host2')
        self.assertTrue(host1 != host3)

    def test_hash(self):
        host = Host('host1')
        self.assertEqual(hash(host), hash('host1'))

    def test_str(self):
        host = Host('test_host')
        self.assertEqual(str(host), 'test_host')

    def test_repr(self):
        host = Host('test_host')
        self.assertEqual(repr(host), 'test_host')

    def test_get_name(self):
        host = Host('test_host')
        self.assertEqual(host.get_name(), 'test_host')

    def test_populate_ancestors(self):
        host = Host('test_host')
        group1 = Host('group1')
        group2 = Host('group2')
        host.populate_ancestors([group1, group2])
        self.assertEqual(len(host.groups), 2)
        self.assertEqual(host.groups[0].name, 'group1')
        self.assertEqual(host.groups[1].name, 'group2')

    def test_add_group(self):
        host = Host('test_host')
        group1 = Host('group1')
        host.add_group(group1)
        self.assertEqual(len(host.groups), 1)
        self.assertEqual(host.groups[0].name, 'group1')

    def test_remove_group(self):
        host = Host('test_host')
        group1 = Host('group1')
        host.groups.append(group1)
        host.remove_group(group1)
        self.assertEqual(len(host.groups), 0)

    def test_set_variable(self):
        host = Host('test_host')
        host.set_variable('key', 'value')
        self.assertEqual(host.vars, {'key': 'value'})

    def test_get_groups(self):
        host = Host('test_host')
        host.groups = [Host('group1'), Host('group2')]
        self.assertEqual(host.get_groups(), [Host('group1'), Host('group2')])

    def test_get_magic_vars(self):
        host = Host('test_host')
        self.assertEqual(host.get_magic_vars(), {'inventory_hostname': 'test_host', 'inventory_hostname_short': 'test_host', 'group_names': []})

    def test_get_vars(self):
        host = Host('test_host')
        self.assertEqual(host.get_vars(), {'key': 'value', 'inventory_hostname': 'test_host', 'inventory_hostname_short': 'test_host', 'group_names': []})

if __name__ == '__main__':
    unittest.main()