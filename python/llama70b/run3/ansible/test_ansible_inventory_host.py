import unittest
from ansible.inventory.host import Host, Group


class TestHost(unittest.TestCase):
    def test_init(self):
        host = Host("example", port=22)
        self.assertEqual(host.name, "example")
        self.assertEqual(host.address, "example")
        self.assertEqual(host.vars, {})
        self.assertEqual(host.groups, [])
        self.assertIsNotNone(host._uuid)

    def test_serialize(self):
        host = Host("example", port=22)
        data = host.serialize()
        self.assertIsInstance(data, dict)
        self.assertEqual(data["name"], "example")
        self.assertEqual(data["address"], "example")
        self.assertIsNotNone(data["uuid"])

    def test_deserialize(self):
        data = {"name": "example", "address": "example", "uuid": "123456"}
        host = Host(gen_uuid=False)
        host.deserialize(data)
        self.assertEqual(host.name, "example")
        self.assertEqual(host.address, "example")
        self.assertEqual(host._uuid, "123456")

    def test_get_name(self):
        host = Host("example", port=22)
        self.assertEqual(host.get_name(), "example")

    def test_populate_ancestors(self):
        host = Host("example", port=22)
        group = Group()
        host.add_group(group)
        self.assertIn(group, host.groups)

    def test_add_group(self):
        host = Host("example", port=22)
        group = Group()
        self.assertTrue(host.add_group(group))
        self.assertIn(group, host.groups)

    def test_remove_group(self):
        host = Host("example", port=22)
        group = Group()
        host.add_group(group)
        self.assertTrue(host.remove_group(group))
        self.assertNotIn(group, host.groups)

    def test_set_variable(self):
        host = Host("example", port=22)
        host.set_variable("ansible_port", 22)
        self.assertEqual(host.vars["ansible_port"], 22)

    def test_get_groups(self):
        host = Host("example", port=22)
        group = Group()
        host.add_group(group)
        self.assertEqual(host.get_groups(), [group])

    def test_get_magic_vars(self):
        host = Host("example", port=22)
        magic_vars = host.get_magic_vars()
        self.assertIn("inventory_hostname", magic_vars)
        self.assertIn("inventory_hostname_short", magic_vars)
        self.assertIn("group_names", magic_vars)

    def test_get_vars(self):
        host = Host("example", port=22)
        host.set_variable("ansible_port", 22)
        vars = host.get_vars()
        self.assertIn("ansible_port", vars)
        self.assertIn("inventory_hostname", vars)
        self.assertIn("inventory_hostname_short", vars)
        self.assertIn("group_names", vars)

    def test_eq(self):
        host1 = Host("example", port=22)
        host2 = Host("example", port=22)
        self.assertTrue(host1 == host2)

    def test_ne(self):
        host1 = Host("example", port=22)
        host2 = Host("other", port=22)
        self.assertTrue(host1 != host2)

    def test_hash(self):
        host = Host("example", port=22)
        self.assertEqual(hash(host), hash("example"))

    def test_str(self):
        host = Host("example", port=22)
        self.assertEqual(str(host), "example")

    def test_repr(self):
        host = Host("example", port=22)
        self.assertEqual(repr(host), "example")

    def test_getstate(self):
        host = Host("example", port=22)
        data = host.__getstate__()
        self.assertIsInstance(data, dict)

    def test_setstate(self):
        host = Host(gen_uuid=False)
        data = {"name": "example", "address": "example", "uuid": "123456"}
        host.__setstate__(data)
        self.assertEqual(host.name, "example")
        self.assertEqual(host.address, "example")
        self.assertEqual(host._uuid, "123456")

    def test_private_method(self):
        host = Host("example", port=22)
        result = host._Host__getstate__()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()