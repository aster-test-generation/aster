from ansible.vars.hostvars import STATIC_VARS
import unittest
from ansible.vars.hostvars import HostVars, HostVarsVars
from ansible.inventory.manager import InventoryManager
from ansible.parsing.dataloader import DataLoader
from ansible.vars.manager import VariableManager
from ansible.module_utils.common._collections_compat import Mapping
from ansible.template import Templar, AnsibleUndefined


class TestHostVars(unittest.TestCase):
    def setUp(self):
        self.loader = DataLoader()
        self.inventory = InventoryManager(loader=self.loader, sources=['/path/to/inventory'])
        self.variable_manager = VariableManager(loader=self.loader, inventory=self.inventory)
        self.host_vars = HostVars(inventory=self.inventory, variable_manager=self.variable_manager, loader=self.loader)

    def test_init(self):
        self.assertIsInstance(self.host_vars, Mapping)

    def test_set_variable_manager(self):
        self.host_vars.set_variable_manager(self.variable_manager)
        self.assertEqual(self.host_vars._variable_manager, self.variable_manager)

    def test_set_inventory(self):
        self.host_vars.set_inventory(self.inventory)
        self.assertEqual(self.host_vars._inventory, self.inventory)

    def test_find_host(self):
        host = self.host_vars._find_host('example_host')
        self.assertEqual(host.name, 'example_host')

    def test_raw_get(self):
        data = self.host_vars.raw_get('example_host')
        self.assertIsInstance(data, AnsibleUndefined)

    def test_set_host_variable(self):
        self.host_vars.set_host_variable('example_host', 'varname', 'value')
        self.assertEqual(self.host_vars.get('example_host')['varname'], 'value')

    def test_set_nonpersistent_facts(self):
        self.host_vars.set_nonpersistent_facts('example_host', {'key': 'value'})
        self.assertEqual(self.host_vars.get('example_host')['key'], 'value')

    def test_set_host_facts(self):
        self.host_vars.set_host_facts('example_host', {'key': 'value'})
        self.assertEqual(self.host_vars.get('example_host')['key'], 'value')

    def test_contains(self):
        self.assertTrue('example_host' in self.host_vars)

    def test_iter(self):
        for host in self.host_vars:
            self.assertIsInstance(host, str)

    def test_len(self):
        self.assertEqual(len(self.host_vars), len(self.inventory.hosts))

    def test_repr(self):
        self.assertIsInstance(repr(self.host_vars), str)

    def test_deepcopy(self):
        self.assertEqual(self.host_vars, self.host_vars)

class TestHostVarsVars(unittest.TestCase):
    def setUp(self):
        self.loader = DataLoader()
        self.inventory = InventoryManager(loader=self.loader, sources=['/path/to/inventory'])
        self.variable_manager = VariableManager(loader=self.loader, inventory=self.inventory)
        self.host_vars_vars = HostVarsVars(variables={'key': 'value'}, loader=self.loader)

    def test_init(self):
        self.assertIsInstance(self.host_vars_vars, Mapping)

    def test_getitem(self):
        templar = Templar(variables=self.host_vars_vars._vars, loader=self.loader)
        foo = templar.template(self.host_vars_vars._vars['key'], fail_on_undefined=False, static_vars=STATIC_VARS)
        self.assertEqual(foo, 'value')

    def test_contains(self):
        self.assertTrue('key' in self.host_vars_vars)

    def test_iter(self):
        for var in self.host_vars_vars:
            self.assertEqual(var, 'key')

    def test_len(self):
        self.assertEqual(len(self.host_vars_vars), 1)

if __name__ == '__main__':
    unittest.main()