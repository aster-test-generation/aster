import unittest
from ansible.inventory.host import Host


class TestHost(unittest.TestCase):
    def test_serialize(self):
        host = Host()
        result = host.serialize()
        self.assertEqual(result, dict(
            name=None,
            vars={},
            address=None,
            uuid=None,
            groups=[],
            implicit=False,
        ))

    def test_deserialize(self):
        host = Host()
        data = dict(
            name='test',
            vars={},
            address='test',
            uuid='test',
            groups=[],
            implicit=False,
        )
        host.deserialize(data)
        self.assertEqual(host.name, 'test')
        self.assertEqual(host.address, 'test')
        self.assertEqual(host._uuid, 'test')
        self.assertEqual(host.implicit, False)

    def test_eq(self):
        host1 = Host()
        host2 = Host()
        result = host1 == host2
        self.assertEqual(result, False)

    def test_ne(self):
        host1 = Host()
        host2 = Host()
        result = host1 != host2
        self.assertEqual(result, True)

    def test_hash(self):
        host = Host()
        result = hash(host)
        self.assertEqual(result, hash(None))

    def test_str(self):
        host = Host()
        result = str(host)
        self.assertEqual(result, None)

    def test_repr(self):
        host = Host()
        result = repr(host)
        self.assertEqual(result, None)

    def test_get_name(self):
        host = Host()
        result = host.get_name()
        self.assertEqual(result, None)

    def test_populate_ancestors(self):
        host = Host()
        result = host.populate_ancestors()
        self.assertEqual(result, None)

    def test_add_group(self):
        host = Host()
        group = Group()
        result = host.add_group(group)
        self.assertEqual(result, False)

    def test_remove_group(self):
        host = Host()
        group = Group()
        result = host.remove_group(group)
        self.assertEqual(result, False)

    def test_set_variable(self):
        host = Host()
        key = 'test'
        value = 'test'
        host.set_variable(key, value)
        self.assertEqual(host.vars, {key: value})

    def test_get_groups(self):
        host = Host()
        result = host.get_groups()
        self.assertEqual(result, [])

    def test_get_magic_vars(self):
        host = Host()
        result = host.get_magic_vars()
        self.assertEqual(result, {
            'inventory_hostname': None,
            'inventory_hostname_short': None,
            'group_names': [],
        })

    def test_get_vars(self):
        host = Host()
        result = host.get_vars()
        self.assertEqual(result, {
            'inventory_hostname': None,
            'inventory_hostname_short': None,
            'group_names': [],
        })

if __name__ == '__main__':
    unittest.main()