import unittest
from ansible.inventory.host import Host
from ansible.inventory.group import Group
from ansible.utils.vars import get_unique_id


class TestHost(unittest.TestCase):
    def setUp(self):
        self.host = Host(name="test_host", port=22)

    def test_getstate(self):
        result = self.host.__getstate__()
        self.assertIsInstance(result, dict)

    def test_setstate(self):
        data = {
            'name': 'test_host',
            'vars': {'key': 'value'},
            'address': 'test_address',
            'uuid': get_unique_id(),
            'groups': [],
            'implicit': False
        }
        self.host.__setstate__(data)
        self.assertEqual(self.host.name, 'test_host')

    def test_eq(self):
        other_host = Host(name="test_host", port=22)
        other_host._uuid = self.host._uuid
        self.assertTrue(self.host.__eq__(other_host))

    def test_ne(self):
        other_host = Host(name="other_host", port=22)
        self.assertTrue(self.host.__ne__(other_host))

    def test_hash(self):
        result = self.host.__hash__()
        self.assertEqual(result, hash(self.host.name))

    def test_str(self):
        result = self.host.__str__()
        self.assertEqual(result, self.host.get_name())

    def test_repr(self):
        result = self.host.__repr__()
        self.assertEqual(result, self.host.get_name())

    def test_serialize(self):
        result = self.host.serialize()
        self.assertIsInstance(result, dict)

    def test_deserialize(self):
        data = {
            'name': 'test_host',
            'vars': {'key': 'value'},
            'address': 'test_address',
            'uuid': get_unique_id(),
            'groups': [],
            'implicit': False
        }
        self.host.deserialize(data)
        self.assertEqual(self.host.name, 'test_host')

    def test_init(self):
        host = Host(name="init_host", port=8080)
        self.assertEqual(host.name, "init_host")
        self.assertEqual(host.vars['ansible_port'], 8080)

    def test_get_name(self):
        result = self.host.get_name()
        self.assertEqual(result, "test_host")

    def test_populate_ancestors(self):
        group = Group(name="test_group")
        self.host.groups.append(group)
        self.host.populate_ancestors()
        self.assertIn(group, self.host.groups)

    def test_add_group(self):
        group = Group(name="test_group")
        result = self.host.add_group(group)
        self.assertTrue(result)

    def test_remove_group(self):
        group = Group(name="test_group")
        self.host.groups.append(group)
        result = self.host.remove_group(group)
        self.assertTrue(result)

    def test_set_variable(self):
        self.host.set_variable('key', 'value')
        self.assertEqual(self.host.vars['key'], 'value')

    def test_get_groups(self):
        result = self.host.get_groups()
        self.assertEqual(result, self.host.groups)

    def test_get_magic_vars(self):
        result = self.host.get_magic_vars()
        self.assertIn('inventory_hostname', result)

    def test_get_vars(self):
        result = self.host.get_vars()
        self.assertIn('inventory_hostname', result)

if __name__ == '__main__':
    unittest.main()