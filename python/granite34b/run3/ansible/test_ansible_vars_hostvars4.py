import unittest
from ansible.vars.hostvars import HostVars, HostVarsVars

class TestHostVars(unittest.TestCase):
    def setUp(self):
        self.inventory = ...
        self.variable_manager = ...
        self.loader = ...
        self.host_vars = HostVars(self.inventory, self.variable_manager, self.loader)

    def test_init(self):
        self.assertEqual(self.host_vars._inventory, self.inventory)
        self.assertEqual(self.host_vars._variable_manager, self.variable_manager)
        self.assertEqual(self.host_vars._loader, self.loader)

    def test_set_variable_manager(self):
        new_variable_manager = ...
        self.host_vars.set_variable_manager(new_variable_manager)
        self.assertEqual(self.host_vars._variable_manager, new_variable_manager)

    def test_set_inventory(self):
        new_inventory = ...
        self.host_vars.set_inventory(new_inventory)
        self.assertEqual(self.host_vars._inventory, new_inventory)

    def test_find_host(self):
        host_name = ...
        host = ...
        self.assertEqual(self.host_vars._find_host(host_name), host)

    def test_raw_get(self):
        host_name = ...
        data = ...
        self.assertEqual(self.host_vars.raw_get(host_name), data)

    def test_set_host_variable(self):
        host = ...
        varname = ...
        value = ...
        self.host_vars.set_host_variable(host, varname, value)
        self.assertEqual(self.host_vars._variable_manager.get_vars(host=host)[varname], value)

    def test_set_nonpersistent_facts(self):
        host = ...
        facts = ...
        self.host_vars.set_nonpersistent_facts(host, facts)
        self.assertEqual(self.host_vars._variable_manager.get_vars(host=host)['ansible_facts'], facts)

    def test_set_host_facts(self):
        host = ...
        facts = ...
        self.host_vars.set_host_facts(host, facts)
        self.assertEqual(self.host_vars._variable_manager.get_vars(host=host)['ansible_facts'], facts)

    def test_contains(self):
        host_name = ...
        self.assertTrue(host_name in self.host_vars)

    def test_iter(self):
        for host in self.host_vars:
            self.assertTrue(host in self.inventory.hosts)

    def test_len(self):
        self.assertEqual(len(self.host_vars), len(self.inventory.hosts))

    def test_repr(self):
        self.assertEqual(repr(self.host_vars), repr({host: self.host_vars.get(host) for host in self.inventory.hosts}))

    def test_deepcopy(self):
        self.assertEqual(self.host_vars, self.host_vars)

class TestHostVarsVars(unittest.TestCase):
    def setUp(self):
        self.variables = ...
        self.loader = ...
        self.host_vars_vars = HostVarsVars(self.variables, self.loader)

    def test_getitem(self):
        var = ...
        value = ...
        self.assertEqual(self.host_vars_vars[var], value)

    def test_contains(self):
        var = ...
        self.assertTrue(var in self.host_vars_vars)

    def test_iter(self):
        for var in self.host_vars_vars:
            self.assertTrue(var in self.variables)

    def test_len(self):
        self.assertEqual(len(self.host_vars_vars), len(self.variables))

    def test_repr(self):
        self.assertEqual(repr(self.host_vars_vars), repr(self.variables))

if __name__ == '__main__':
    unittest.main()