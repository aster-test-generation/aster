from ansible.inventory.host import Host
import unittest



class TestHost(unittest.TestCase):
    def test_eq(self):
        host1 = Host()
        host2 = Host()
        self.assertEqual(host1, host2)

    def test_ne(self):
        host1 = Host()
        host2 = Host()
        self.assertNotEqual(host1, host2)

    def test_hash(self):
        host = Host()
        self.assertEqual(hash(host), hash(host.name))

    def test_str(self):
        host = Host()
        self.assertEqual(str(host), host.get_name())

    def test_repr(self):
        host = Host()
        self.assertEqual(repr(host), host.get_name())

    def test_serialize(self):
        host = Host()
        self.assertEqual(host.serialize(), dict(
            name=host.name,
            vars=host.vars.copy(),
            address=host.address,
            uuid=host._uuid,
            groups=[],
            implicit=host.implicit,
        ))

    def test_deserialize(self):
        host = Host()
        host.deserialize(dict(
            name=host.name,
            vars=host.vars.copy(),
            address=host.address,
            uuid=host._uuid,
            groups=[],
            implicit=host.implicit,
        ))
        self.assertEqual(host.name, host.name)
        self.assertEqual(host.vars, host.vars.copy())
        self.assertEqual(host.address, host.address)
        self.assertEqual(host._uuid, host._uuid)
        self.assertEqual(host.groups, [])
        self.assertEqual(host.implicit, host.implicit)

    def test_get_name(self):
        host = Host()
        self.assertEqual(host.get_name(), host.name)

    def test_populate_ancestors(self):
        host = Host()
        host.populate_ancestors()
        self.assertEqual(host.groups, [])

    def test_add_group(self):
        host = Host()
        group = Group()
        self.assertEqual(host.add_group(group), True)

    def test_remove_group(self):
        host = Host()
        group = Group()
        self.assertEqual(host.remove_group(group), False)

    def test_set_variable(self):
        host = Host()
        host.set_variable('key', 'value')
        self.assertEqual(host.vars, {'key': 'value'})

    def test_get_groups(self):
        host = Host()
        self.assertEqual(host.get_groups(), [])

    def test_get_magic_vars(self):
        host = Host()
        self.assertEqual(host.get_magic_vars(), {'inventory_hostname': host.name, 'inventory_hostname_short': host.name.split('.')[0], 'group_names': []})

if __name__ == '__main__':
    unittest.main()