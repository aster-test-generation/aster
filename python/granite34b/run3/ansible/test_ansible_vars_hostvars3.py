import unittest
from ansible.vars.hostvars import HostVars, HostVarsVars
from ansible.inventory.manager import InventoryManager
from ansible.parsing.dataloader import DataLoader
from ansible.vars.manager import VariableManager
from ansible.module_utils.common._collections_compat import Mapping
from ansible.template import Templar, AnsibleUndefined

class TestHostVars(unittest.TestCase):
    def setUp(self):
        self.inventory = InventoryManager(loader=DataLoader(), sources=['localhost'])
        self.variable_manager = VariableManager(loader=DataLoader(), inventory=self.inventory)
        self.host_vars = HostVars(inventory=self.inventory, variable_manager=self.variable_manager, loader=DataLoader())

    def test_raw_get(self):
        host = self.inventory.get_host('localhost')
        result = self.host_vars.raw_get('localhost')
        self.assertEqual(result, self.variable_manager.get_vars(host=host, include_hostvars=False))

    def test_set_variable_manager(self):
        new_variable_manager = VariableManager(loader=DataLoader(), inventory=self.inventory)
        self.host_vars.set_variable_manager(new_variable_manager)
        self.assertEqual(self.host_vars._variable_manager, new_variable_manager)

    def test_set_inventory(self):
        new_inventory = InventoryManager(loader=DataLoader(), sources=['localhost'])
        self.host_vars.set_inventory(new_inventory)
        self.assertEqual(self.host_vars._inventory, new_inventory)

    def test_find_host(self):
        host = self.inventory.get_host('localhost')
        result = self.host_vars._find_host('localhost')
        self.assertEqual(result, host)

    def test_set_host_variable(self):
        host = self.inventory.get_host('localhost')
        self.host_vars.set_host_variable(host, 'varname', 'value')
        self.assertEqual(self.host_vars._variable_manager.get_vars(host=host)['varname'], 'value')

    def test_set_nonpersistent_facts(self):
        host = self.inventory.get_host('localhost')
        self.host_vars.set_nonpersistent_facts(host, {'facts': 'value'})
        self.assertEqual(self.host_vars._variable_manager.get_vars(host=host)['facts'], 'value')

    def test_set_host_facts(self):
        host = self.inventory.get_host('localhost')
        self.host_vars.set_host_facts(host, {'facts': 'value'})
        self.assertEqual(self.host_vars._variable_manager.get_vars(host=host)['facts'], 'value')

    def test_contains(self):
        self.assertTrue('localhost' in self.host_vars)

    def test_iter(self):
        for host in self.host_vars:
            self.assertEqual(host, 'localhost')

    def test_len(self):
        self.assertEqual(len(self.host_vars), 1)

    def test_repr(self):
        self.assertEqual(repr(self.host_vars), "{'localhost': {}}")

    def test_deepcopy(self):
        self.assertEqual(self.host_vars, self.host_vars)

class TestHostVarsVars(unittest.TestCase):
    def setUp(self):
        self.variables = {'var': 'value'}
        self.loader = DataLoader()
        self.host_vars_vars = HostVarsVars(variables=self.variables, loader=self.loader)

    def test_getitem(self):
        templar = Templar(variables=self.variables, loader=self.loader)
        result = self.host_vars_vars['var']
        self.assertEqual(result, templar.template(self.variables['var'], fail_on_undefined=False, static_vars=[]))

    def test_contains(self):
        self.assertTrue('var' in self.host_vars_vars)

    def test_iter(self):
        for var in self.host_vars_vars:
            self.assertEqual(var, 'var')

    def test_len(self):
        self.assertEqual(len(self.host_vars_vars), 1)

if __name__ == '__main__':
    unittest.main()