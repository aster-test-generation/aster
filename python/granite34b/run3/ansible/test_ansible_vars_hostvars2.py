import unittest
from ansible.vars.hostvars import HostVars, HostVarsVars
from ansible.module_utils.common._collections_compat import Mapping
from ansible.template import Templar, AnsibleUndefined
from ansible.inventory.manager import InventoryManager
from ansible.parsing.dataloader import DataLoader
from ansible.vars.manager import VariableManager

class TestHostVars(unittest.TestCase):
    def setUp(self):
        self.inventory = InventoryManager(loader=DataLoader(), sources=['/path/to/inventory'])
        self.variable_manager = VariableManager(loader=DataLoader(), inventory=self.inventory)
        self.host_vars = HostVars(inventory=self.inventory, variable_manager=self.variable_manager, loader=DataLoader())

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
        self.assertEqual(self.host_vars._variable_manager.get_vars(host='example_host')['varname'], 'value')

    def test_set_nonpersistent_facts(self):
        self.host_vars.set_nonpersistent_facts('example_host', {'key': 'value'})
        self.assertEqual(self.host_vars._variable_manager.get_nonpersistent_facts(host='example_host')['key'], 'value')

    def test_set_host_facts(self):
        self.host_vars.set_host_facts('example_host', {'key': 'value'})
        self.assertEqual(self.host_vars._variable_manager.get_facts(host='example_host')['key'], 'value')

    def test_contains(self):
        self.assertTrue('example_host' in self.host_vars)

    def test_iter(self):
        for host in self.host_vars:
            self.assertIsInstance(host, str)

    def test_len(self):
        self.assertEqual(len(self.host_vars), len(self.inventory.hosts))

    def test_repr(self):
        out = self.host_vars.__repr__()
        self.assertIsInstance(out, str)

    def test_deepcopy(self):
        self.assertEqual(self.host_vars.__deepcopy__({}), self.host_vars)

class TestHostVarsVars(unittest.TestCase):
    def setUp(self):
        self.variables = {'key': 'value'}
        self.loader = DataLoader()
        self.host_vars_vars = HostVarsVars(variables=self.variables, loader=self.loader)

    def test_getitem(self):
        templar = Templar(variables=self.variables, loader=self.loader)
        foo = templar.template(self.variables['key'], fail_on_undefined=False, static_vars=STATIC_VARS)
        self.assertEqual(self.host_vars_vars['key'], foo)

    def test_contains(self):
        self.assertTrue('key' in self.host_vars_vars)

    def test_iter(self):
        for var in self.host_vars_vars:
            self.assertIsInstance(var, str)

    def test_len(self):
        self.assertEqual(len(self.host_vars_vars), len(self.variables.keys()))

    def test_repr(self):
        templar = Templar(variables=self.variables, loader=self.loader)
        foo = templar.template(self.variables, fail_on_undefined=False, static_vars=STATIC_VARS)
        self.assertEqual(self.host_vars_vars.__repr__(), repr(foo))

if __name__ == '__main__':
    unittest.main()