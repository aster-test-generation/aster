from ansible.vars.hostvars import AnsibleUndefined
import unittest
from ansible.vars.hostvars import HostVars, HostVarsVars


class TestHostVars(unittest.TestCase):
    def test_init(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        self.assertEqual(host_vars._inventory, inventory)
        self.assertEqual(host_vars._loader, loader)
        self.assertEqual(host_vars._variable_manager, variable_manager)

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
        host = host_vars._find_host('host_name')
        self.assertEqual(host, None)

    def test_raw_get(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        host = object()
        result = host_vars.raw_get('host_name')
        self.assertEqual(result, AnsibleUndefined(name="hostvars['host_name']"))

    def test_get(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        host = object()
        result = host_vars.get('host_name')
        self.assertEqual(result, HostVarsVars({}, loader))

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
        host_vars.set_nonpersistent_facts(host, {'facts': 'value'})

    def test_set_host_facts(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        host_vars = HostVars(inventory, variable_manager, loader)
        host = object()
        host_vars.set_host_facts(host, {'facts': 'value'})

    def test_contains(self):
        inventory = object()
        host_vars = HostVars(inventory, object(), object())
        self.assertFalse('host_name' in host_vars)

    def test_iter(self):
        inventory = object()
        host_vars = HostVars(inventory, object(), object())
        self.assertEqual(list(host_vars), [])

    def test_len(self):
        inventory = object()
        host_vars = HostVars(inventory, object(), object())
        self.assertEqual(len(host_vars), 0)

    def test_repr(self):
        inventory = object()
        host_vars = HostVars(inventory, object(), object())
        self.assertEqual(repr(host_vars), '{}')

    def test_deepcopy(self):
        inventory = object()
        host_vars = HostVars(inventory, object(), object())
        self.assertEqual(host_vars, HostVars(inventory, object(), object()))

class TestHostVarsVars(unittest.TestCase):
    def test_init(self):
        variables = object()
        loader = object()
        host_vars_vars = HostVarsVars(variables, loader)
        self.assertEqual(host_vars_vars._vars, variables)
        self.assertEqual(host_vars_vars._loader, loader)

    def test_getitem(self):
        variables = {'var': 'value'}
        loader = object()
        host_vars_vars = HostVarsVars(variables, loader)
        result = host_vars_vars['var']
        self.assertEqual(result, 'value')

    def test_contains(self):
        variables = {'var': 'value'}
        host_vars_vars = HostVarsVars(variables, object())
        self.assertTrue('var' in host_vars_vars)

    def test_iter(self):
        variables = {'var1': 'value1', 'var2': 'value2'}
        host_vars_vars = HostVarsVars(variables, object())
        self.assertEqual(list(host_vars_vars), ['var1', 'var2'])

    def test_len(self):
        variables = {'var1': 'value1', 'var2': 'value2'}
        host_vars_vars = HostVarsVars(variables, object())
        self.assertEqual(len(host_vars_vars), 2)

if __name__ == '__main__':
    unittest.main()