import unittest
from ansible.vars.hostvars import HostVars, HostVarsVars


class TestHostVars(unittest.TestCase):
    def test_raw_get(self):
        hostvars = HostVars(None, None, None)
        host = object()
        host.name = 'test_host'
        host.vars = {'test_var': 'test_value'}
        hostvars._inventory = object()
        hostvars._inventory.get_host = lambda name: host if name == host.name else None
        self.assertEqual(hostvars.raw_get(host.name), host.vars)

    def test_getitem(self):
        hostvars = HostVars(None, None, None)
        host = object()
        host.name = 'test_host'
        host.vars = {'test_var': 'test_value'}
        hostvars._inventory = object()
        hostvars._inventory.get_host = lambda name: host if name == host.name else None
        hostvars_vars = HostVarsVars(host.vars, None)
        self.assertEqual(hostvars[host.name], hostvars_vars)

    def test_contains(self):
        hostvars = HostVars(None, None, None)
        host = object()
        host.name = 'test_host'
        hostvars._inventory = object()
        hostvars._inventory.get_host = lambda name: host if name == host.name else None
        self.assertTrue(host.name in hostvars)

    def test_iter(self):
        hostvars = HostVars(None, None, None)
        host1 = object()
        host1.name = 'test_host1'
        host2 = object()
        host2.name = 'test_host2'
        hostvars._inventory = object()
        hostvars._inventory.hosts = [host1, host2]
        self.assertEqual(list(iter(hostvars)), [host1.name, host2.name])

    def test_len(self):
        hostvars = HostVars(None, None, None)
        host1 = object()
        host1.name = 'test_host1'
        host2 = object()
        host2.name = 'test_host2'
        hostvars._inventory = object()
        hostvars._inventory.hosts = [host1, host2]
        self.assertEqual(len(hostvars), 2)

    def test_repr(self):
        hostvars = HostVars(None, None, None)
        host = object()
        host.name = 'test_host'
        host.vars = {'test_var': 'test_value'}
        hostvars._inventory = object()
        hostvars._inventory.get_host = lambda name: host if name == host.name else None
        self.assertEqual(repr(hostvars), repr({'test_host': host.vars}))

class TestHostVarsVars(unittest.TestCase):
    def test_getitem(self):
        hostvars_vars = HostVarsVars({'test_var': 'test_value'}, None)
        self.assertEqual(hostvars_vars['test_var'], 'test_value')

    def test_contains(self):
        hostvars_vars = HostVarsVars({'test_var': 'test_value'}, None)
        self.assertTrue('test_var' in hostvars_vars)

    def test_iter(self):
        hostvars_vars = HostVarsVars({'test_var1': 'test_value1', 'test_var2': 'test_value2'}, None)
        self.assertEqual(list(iter(hostvars_vars)), ['test_var1', 'test_var2'])

    def test_len(self):
        hostvars_vars = HostVarsVars({'test_var1': 'test_value1', 'test_var2': 'test_value2'}, None)
        self.assertEqual(len(hostvars_vars), 2)

if __name__ == '__main__':
    unittest.main()