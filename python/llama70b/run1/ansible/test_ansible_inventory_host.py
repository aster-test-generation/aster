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
        self.assertEqual(data["name"], "example")
        self.assertEqual(data["vars"], {})
        self.assertEqual(data["address"], "example")
        self.assertIsNotNone(data["uuid"])

    def test_deserialize(self):
        data = {"name": "example", "vars": {"foo": "bar"}, "address": "example", "uuid": "123456"}
        host = Host(gen_uuid=False)
        host.deserialize(data)
        self.assertEqual(host.name, "example")
        self.assertEqual(host.vars, {"foo": "bar"})
        self.assertEqual(host.address, "example")
        self.assertEqual(host._uuid, "123456")

    def test_get_name(self):
        host = Host("example")
        self.assertEqual(host.get_name(), "example")

    def test_populate_ancestors(self):
        host = Host("example")
        group1 = Group("group1")
        group2 = Group("group2")
        group1.add_child(group2)
        host.add_group(group1)
        host.populate_ancestors()
        self.assertIn(group1, host.groups)
        self.assertIn(group2, host.groups)

    def test_add_group(self):
        host = Host("example")
        group = Group("group1")
        self.assertTrue(host.add_group(group))
        self.assertIn(group, host.groups)

    def test_remove_group(self):
        host = Host("example")
        group = Group("group1")
        host.add_group(group)
        self.assertTrue(host.remove_group(group))
        self.assertNotIn(group, host.groups)

    def test_set_variable(self):
        host = Host("example")
        host.set_variable("foo", "bar")
        self.assertEqual(host.vars, {"foo": "bar"})

    def test_get_groups(self):
        host = Host("example")
        group = Group("group1")
        host.add_group(group)
        self.assertEqual(host.get_groups(), [group])

    def test_get_magic_vars(self):
        host = Host("example")
        self.assertEqual(host.get_magic_vars(), {
            "inventory_hostname": "example",
            "inventory_hostname_short": "example",
            "group_names": []
        })

    def test_get_vars(self):
        host = Host("example")
        host.set_variable("foo", "bar")
        self.assertEqual(host.get_vars(), {
            "foo": "bar",
            "inventory_hostname": "example",
            "inventory_hostname_short": "example",
            "group_names": []
        })

    def test_eq(self):
        host1 = Host("example")
        host2 = Host("example")
        self.assertTrue(host1 == host2)

    def test_ne(self):
        host1 = Host("example")
        host2 = Host("other")
        self.assertTrue(host1 != host2)

    def test_hash(self):
        host = Host("example")
        self.assertEqual(hash(host), hash("example"))

    def test_str(self):
        host = Host("example")
        self.assertEqual(str(host), "example")

    def test_repr(self):
        host = Host("example")
        self.assertEqual(repr(host), "example")

    def test_private_method(self):
        host = Host("example")
        result = host._Host__getstate()
        self.assertEqual(result, host.serialize())

    def test_protected_method(self):
        host = Host("example")
        result = host._serialize()
        self.assertEqual(result, host.serialize())

if __name__ == '__main__':
    unittest.main()