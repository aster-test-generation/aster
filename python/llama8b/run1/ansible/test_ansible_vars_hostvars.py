import unittest
from ansible.vars.hostvars import HostVars, HostVarsVars


class TestHostVars(unittest.TestCase):
    def test_init(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        self.assertEqual(host_vars._inventory, inventory)
        self.assertEqual(host_vars._variable_manager, variable_manager)
        self.assertEqual(host_vars._loader, loader)

    def test_set_variable_manager(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        host_vars.set_variable_manager(variable_manager)
        self.assertEqual(host_vars._variable_manager, variable_manager)

    def test_set_inventory(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        host_vars.set_inventory(inventory)
        self.assertEqual(host_vars._inventory, inventory)

    def test_find_host(self):
        inventory = object()
        host_vars = HostVars(inventory, object(), object())
        host = object()
        self.assertEqual(host_vars._find_host('host_name'), host)

    def test_raw_get(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        host = object()
        self.assertEqual(host_vars.raw_get('host_name'), host)

    def test_get(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        host = object()
        self.assertEqual(host_vars.get('host_name'), host)

    def test_set_host_variable(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        host = object()
        host_vars.set_host_variable(host, 'varname', 'value')

    def test_set_nonpersistent_facts(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        host = object()
        host_vars.set_nonpersistent_facts(host, {'facts': 'values'})

    def test_set_host_facts(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        host = object()
        host_vars.set_host_facts(host, {'facts': 'values'})

    def test_contains(self):
        inventory = object()
        host_vars = HostVars(inventory, object(), object())
        self.assertTrue('host_name' in host_vars)

    def test_iter(self):
        inventory = object()
        host_vars = HostVars(inventory, object(), object())
        for host in host_vars:
            pass

    def test_len(self):
        inventory = object()
        host_vars = HostVars(inventory, object(), object())
        self.assertEqual(len(host_vars), len(inventory.hosts))

    def test_repr(self):
        inventory = object()
        host_vars = HostVars(inventory, object(), object())
        self.assertEqual(repr(host_vars), repr({host: host_vars.get(host) for host in inventory.hosts}))

    def test_deepcopy(self):
        inventory = object()
        host_vars = HostVars(inventory, object(), object())
        self.assertEqual(host_vars, host_vars)

class TestHostVarsVars(unittest.TestCase):
    def test_init(self):
        variables = object()
        loader = object()
        host_vars_vars = HostVarsVars(variables, loader)
        self.assertEqual(host_vars_vars._vars, variables)
        self.assertEqual(host_vars_vars._loader, loader)

    def test_getitem(self):
        variables = object()
        loader = object()
        host_vars_vars = HostVarsVars(variables, loader)
        var = object()
        self.assertEqual(host_vars_vars[var], host_vars_vars._loader.template(variables[var], fail_on_undefined=False, static_vars=variables))

    def test_contains(self):
        variables = object()
        host_vars_vars = HostVarsVars(variables, object())
        self.assertTrue('varname' in host_vars_vars)

    def test_iter(self):
        variables = object()
        host_vars_vars = HostVarsVars(variables, object())
        for var in host_vars_vars:
            pass

    def test_len(self):
        variables = object()
        host_vars_vars = HostVarsVars(variables, object())
        self.assertEqual(len(host_vars_vars), len(variables.keys()))

if __name__ == '__main__':
    unittest.main()