import unittest
from ansible.vars.hostvars import HostVars, HostVarsVars
from ansible.inventory.manager import InventoryManager
from ansible.module_utils.common._collections_compat import Mapping
from ansible.template import Templar, AnsibleUndefined
from ansible.module_utils.common.collections import ImmutableDict

class TestHostVars(unittest.TestCase):
    def setUp(self):
        self.inventory = InventoryManager(loader=None, sources=['/path/to/inventory'])
        self.variable_manager = MockVariableManager()
        self.host_vars = HostVars(self.inventory, self.variable_manager, None)

    def test_init(self):
        self.assertEqual(self.host_vars._inventory, self.inventory)
        self.assertEqual(self.host_vars._variable_manager, self.variable_manager)
        self.assertEqual(self.host_vars._loader, None)

    def test_set_variable_manager(self):
        new_variable_manager = MockVariableManager()
        self.host_vars.set_variable_manager(new_variable_manager)
        self.assertEqual(self.host_vars._variable_manager, new_variable_manager)

    def test_set_inventory(self):
        new_inventory = InventoryManager(loader=None, sources=['/path/to/new_inventory'])
        self.host_vars.set_inventory(new_inventory)
        self.assertEqual(self.host_vars._inventory, new_inventory)

    def test_find_host(self):
        host = self.host_vars._find_host('example_host')
        self.assertEqual(host.name, 'example_host')

    def test_raw_get(self):
        data = self.host_vars.raw_get('example_host')
        self.assertEqual(data, {'example_var': 'example_value'})

    def test_set_host_variable(self):
        self.host_vars.set_host_variable('example_host', 'new_var', 'new_value')
        data = self.host_vars.raw_get('example_host')
        self.assertEqual(data, {'example_var': 'example_value', 'new_var': 'new_value'})

    def test_set_nonpersistent_facts(self):
        self.host_vars.set_nonpersistent_facts('example_host', {'new_fact': 'new_value'})
        data = self.host_vars.raw_get('example_host')
        self.assertEqual(data, {'example_var': 'example_value', 'new_fact': 'new_value'})

    def test_set_host_facts(self):
        self.host_vars.set_host_facts('example_host', {'new_fact': 'new_value'})
        data = self.host_vars.raw_get('example_host')
        self.assertEqual(data, {'example_var': 'example_value', 'new_fact': 'new_value'})

    def test_contains(self):
        self.assertTrue('example_host' in self.host_vars)

    def test_iter(self):
        for host in self.host_vars:
            self.assertEqual(host.name, 'example_host')

    def test_len(self):
        self.assertEqual(len(self.host_vars), 1)

    def test_repr(self):
        self.assertEqual(repr(self.host_vars), "{'example_host': {'example_var': 'example_value'}}")

    def test_deepcopy(self):
        self.assertEqual(self.host_vars, self.host_vars)

class TestHostVarsVars(unittest.TestCase):
    def setUp(self):
        self.variables = {'example_var': 'example_value'}
        self.loader = None
        self.host_vars_vars = HostVarsVars(self.variables, self.loader)

    def test_getitem(self):
        templar = Templar(variables=self.variables, loader=self.loader)
        foo = templar.template(self.variables['example_var'], fail_on_undefined=False, static_vars=STATIC_VARS)
        self.assertEqual(foo, 'example_value')

    def test_contains(self):
        self.assertTrue('example_var' in self.host_vars_vars)

    def test_iter(self):
        for var in self.host_vars_vars:
            self.assertEqual(var, 'example_var')

if __name__ == '__main__':
    unittest.main()