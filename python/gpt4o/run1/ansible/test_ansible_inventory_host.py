import unittest
from ansible.inventory.host import Host
from ansible.inventory.group import Group
from ansible.utils.vars import get_unique_id


class TestHost(unittest.TestCase):
    def setUp(self):
        self.host = Host(name="test_host", port=22)

    def test_init(self):
        self.assertEqual(self.host.name, "test_host")
        self.assertEqual(self.host.address, "test_host")
        self.assertEqual(self.host.vars, {'ansible_port': 22})
        self.assertEqual(self.host.groups, [])
        self.assertIsNotNone(self.host._uuid)
        self.assertFalse(self.host.implicit)

    def test_get_name(self):
        self.assertEqual(self.host.get_name(), "test_host")

    def test_populate_ancestors(self):
        group = Group(name="test_group")
        self.host.groups.append(group)
        self.host.populate_ancestors()
        self.assertIn(group, self.host.groups)

    def test_add_group(self):
        group = Group(name="test_group")
        result = self.host.add_group(group)
        self.assertTrue(result)
        self.assertIn(group, self.host.groups)

    def test_remove_group(self):
        group = Group(name="test_group")
        self.host.groups.append(group)
        result = self.host.remove_group(group)
        self.assertTrue(result)
        self.assertNotIn(group, self.host.groups)

    def test_set_variable(self):
        self.host.set_variable("key", "value")
        self.assertEqual(self.host.vars["key"], "value")

    def test_get_groups(self):
        self.assertEqual(self.host.get_groups(), [])

    def test_get_magic_vars(self):
        magic_vars = self.host.get_magic_vars()
        self.assertEqual(magic_vars['inventory_hostname'], "test_host")
        self.assertEqual(magic_vars['inventory_hostname_short'], "test_host")
        self.assertEqual(magic_vars['group_names'], [])

    def test_get_vars(self):
        vars_combined = self.host.get_vars()
        self.assertIn('inventory_hostname', vars_combined)
        self.assertIn('inventory_hostname_short', vars_combined)
        self.assertIn('group_names', vars_combined)

    def test_serialize(self):
        serialized = self.host.serialize()
        self.assertEqual(serialized['name'], "test_host")
        self.assertEqual(serialized['vars'], {'ansible_port': 22})
        self.assertEqual(serialized['address'], "test_host")
        self.assertEqual(serialized['uuid'], self.host._uuid)
        self.assertEqual(serialized['groups'], [])
        self.assertFalse(serialized['implicit'])

    def test_deserialize(self):
        data = {
            'name': "new_host",
            'vars': {'key': 'value'},
            'address': "new_address",
            'uuid': get_unique_id(),
            'implicit': True,
            'groups': []
        }
        self.host.deserialize(data)
        self.assertEqual(self.host.name, "new_host")
        self.assertEqual(self.host.vars, {'key': 'value'})
        self.assertEqual(self.host.address, "new_address")
        self.assertEqual(self.host._uuid, data['uuid'])
        self.assertTrue(self.host.implicit)

    def test_getstate(self):
        state = self.host.__getstate__()
        self.assertEqual(state['name'], "test_host")

    def test_setstate(self):
        data = {
            'name': "new_host",
            'vars': {'key': 'value'},
            'address': "new_address",
            'uuid': get_unique_id(),
            'implicit': True,
            'groups': []
        }
        self.host.__setstate__(data)
        self.assertEqual(self.host.name, "new_host")

    def test_eq(self):
        other_host = Host(name="test_host")
        self.assertTrue(self.host == other_host)

    def test_ne(self):
        other_host = Host(name="different_host")
        self.assertTrue(self.host.__ne__(other_host))

    def test_hash(self):
        self.assertEqual(hash(self.host), hash("test_host"))

    def test_str(self):
        self.assertEqual(str(self.host), "test_host")

    def test_repr(self):
        self.assertEqual(repr(self.host), "test_host")

if __name__ == '__main__':
    unittest.main()