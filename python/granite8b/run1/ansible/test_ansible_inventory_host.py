from ansible.inventory.host import Host
import unittest


class TestHost(unittest.TestCase):
    def test_get_name(self):
        host = Host(name='testhost')
        self.assertEqual(host.get_name(), 'testhost')

    def test_populate_ancestors(self):
        group1 = Group(name='group1')
        group2 = Group(name='group2')
        host = Host(name='testhost')
        host.add_group(group1)
        host.add_group(group2)
        host.populate_ancestors()
        self.assertEqual(host.get_groups(), [group1, group2])

    def test_set_variable(self):
        host = Host(name='testhost')
        host.set_variable('ansible_port', 22)
        self.assertEqual(host.get_vars()['ansible_port'], 22)

    def test_get_magic_vars(self):
        host = Host(name='testhost')
        magic_vars = host.get_magic_vars()
        self.assertEqual(magic_vars['inventory_hostname'], 'testhost')
        self.assertEqual(magic_vars['inventory_hostname_short'], 'testhost')
        self.assertEqual(magic_vars['group_names'], [])

if __name__ == '__main__':
    unittest.main()