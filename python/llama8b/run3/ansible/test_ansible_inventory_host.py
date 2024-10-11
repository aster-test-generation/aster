import unittest
from ansible.inventory.host import HostInventor


class TestHost(unittest.TestCase):
    def test_init(self):
        host = Host(name='example')
        self.assertEqual(host.name, 'example')
        self.assertEqual(host.vars, {})
        self.assertEqual(host.groups, [])
        self.assertEqual(host._uuid, None)
        self.assertFalse(host.implicit)

    def test_get_name(self):
        host = Host(name='example')
        self.assertEqual(host.get_name(), 'example')

    def test_serialize(self):
        host = Host(name='example', vars={'foo': 'bar'}, groups=[Group(name='group1')])
        data = host.serialize()
        self.assertEqual(data['name'], 'example')
        self.assertEqual(data['vars'], {'foo': 'bar'})
        self.assertEqual(data['groups'][0]['name'], 'group1')

    def test_deserialize(self):
        data = {'name': 'example', 'vars': {'foo': 'bar'}, 'groups': [{'name': 'group1'}]}
        host = Host()
        host.deserialize(data)
        self.assertEqual(host.name, 'example')
        self.assertEqual(host.vars, {'foo': 'bar'})
        self.assertEqual(len(host.groups), 1)
        self.assertEqual(host.groups[0].name, 'group1')

    def test_eq(self):
        host1 = Host(name='example')
        host2 = Host(name='example')
        self.assertTrue(host1 == host2)

    def test_ne(self):
        host1 = Host(name='example')
        host2 = Host(name='different')
        self.assertTrue(host1 != host2)

    def test_hash(self):
        host = Host(name='example')
        self.assertEqual(hash(host), hash('example'))

    def test_str(self):
        host = Host(name='example')
        self.assertEqual(str(host), 'example')

    def test_repr(self):
        host = Host(name='example')
        self.assertEqual(repr(host), 'example')

    def test_populate_ancestors(self):
        host = Host(name='example')
        group1 = Group(name='group1')
        group2 = Group(name='group2')
        group1.add_group(group2)
        host.populate_ancestors([group1])
        self.assertEqual(len(host.groups), 2)

    def test_add_group(self):
        host = Host(name='example')
        group = Group(name='group1')
        host.add_group(group)
        self.assertEqual(len(host.groups), 1)

    def test_remove_group(self):
        host = Host(name='example')
        group = Group(name='group1')
        host.add_group(group)
        host.remove_group(group)
        self.assertEqual(len(host.groups), 0)

    def test_set_variable(self):
        host = Host(name='example')
        host.set_variable('foo', 'bar')
        self.assertEqual(host.vars, {'foo': 'bar'})

    def test_get_groups(self):
        host = Host(name='example')
        group1 = Group(name='group1')
        host.add_group(group1)
        self.assertEqual(host.get_groups(), [group1])

    def test_get_magic_vars(self):
        host = Host(name='example')
        self.assertEqual(host.get_magic_vars(), {'inventory_hostname': 'example', 'inventory_hostname_short': 'example', 'group_names': []})

    def test_get_vars(self):
        host = Host(name='example')
        self.assertEqual(host.get_vars(), {})

    def test_serialize_private(self):
        host = Host(name='example')
        host._private_method = lambda x: x ** 2
        self.assertEqual(host._private_method(2), 4)

    def test_deserialize_private(self):
        data = {'name': 'example', '_private_key': 'private_value'}
        host = Host()
        host.deserialize(data)
        self.assertEqual(host._private_key, 'private_value')

    def test_protected_method(self):
        host = Host(name='example')
        host._protected_method = lambda x: x + 1
        self.assertEqual(host._protected_method(2), 3)

    def test_magic_methods(self):
        host = Host(name='example')
        self.assertEqual(host.__str__(), 'example')
        self.assertEqual(host.__repr__(), 'example')

if __name__ == '__main__':
    unittest.main()