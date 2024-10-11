import unittest
from ansible.inventory.host import Host


class TestHost(unittest.TestCase):
    def test_get_name(self):
        instance = Host()
        result = instance.get_name()
        self.assertEqual(result, None)

    def test_populate_ancestors(self):
        instance = Host()
        result = instance.populate_ancestors()
        self.assertEqual(result, None)

    def test_add_group(self):
        instance = Host()
        result = instance.add_group(None)
        self.assertEqual(result, None)

    def test_remove_group(self):
        instance = Host()
        result = instance.remove_group(None)
        self.assertEqual(result, None)

    def test_set_variable(self):
        instance = Host()
        result = instance.set_variable(None, None)
        self.assertEqual(result, None)

    def test_get_groups(self):
        instance = Host()
        result = instance.get_groups()
        self.assertEqual(result, [])

    def test_get_magic_vars(self):
        instance = Host()
        result = instance.get_magic_vars()
        self.assertEqual(result, {'inventory_hostname': None, 'inventory_hostname_short': None, 'group_names': []})

    def test_get_vars(self):
        instance = Host()
        result = instance.get_vars()
        self.assertEqual(result, {'inventory_hostname': None, 'inventory_hostname_short': None, 'group_names': []})

    def test_eq(self):
        instance = Host()
        result = instance.__eq__(None)
        self.assertEqual(result, False)

    def test_ne(self):
        instance = Host()
        result = instance.__ne__(None)
        self.assertEqual(result, True)

    def test_hash(self):
        instance = Host()
        result = instance.__hash__()
        self.assertEqual(result, None)

    def test_str(self):
        instance = Host()
        result = instance.__str__()
        self.assertEqual(result, None)

    def test_repr(self):
        instance = Host()
        result = instance.__repr__()
        self.assertEqual(result, None)

    def test_serialize(self):
        instance = Host()
        result = instance.serialize()
        self.assertEqual(result, {'name': None, 'vars': {}, 'address': None, 'uuid': None, 'groups': [], 'implicit': False})

    def test_deserialize(self):
        instance = Host()
        result = instance.deserialize(None)
        self.assertEqual(result, None)

    def test_init(self):
        instance = Host()
        result = instance.__init__(None, None, None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()