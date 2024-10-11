import unittest
from ansible.vars.hostvars import HostVars, HostVarsVars
from ansible.inventory.manager import InventoryManager
from ansible.module_utils.common._collections_compat import Mapping
from ansible.template import Templar, AnsibleUndefined
from ansible.module_utils.common.collections import ImmutableDict
from ansible.parsing.dataloader import DataLoader
from ansible.vars.manager import VariableManager


class TestHostVars(unittest.TestCase):
    def test_init(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, host)
        self.assertEqual(host_vars._inventory, inventory)
        self.assertEqual(host_vars._variable_manager, variable_manager)
        self.assertEqual(host_vars._loader, loader)

    def test_set_variable_manager(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, cache=None)
        new_variable_manager = ...
        host_vars.set_variable_manager(new_variable_manager)
        self.assertEqual(host_vars._variable_manager, new_variable_manager)

    def test_set_inventory(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, cache=None)
        new_inventory = ...
        host_vars.set_inventory(new_inventory)
        self.assertEqual(host_vars._inventory, new_inventory)

    def test_find_host(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, host)
        host_name = ...
        host = host_vars._find_host(host_name)
        self.assertEqual(host, ...)

    def test_raw_get(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, cache=None)
        host_name = ...
        data = host_vars.raw_get(host_name)
        self.assertEqual(data, ...)

    def test_set_host_variable(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, cache=None)
        host = ...
        varname = ...
        value = ...
        host_vars.set_host_variable(host, varname, value)
        self.assertEqual(host_vars._variable_manager.get_vars(host=host)[varname], value)

    def test_set_nonpersistent_facts(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, cache=None)
        host = ...
        facts = ...
        host_vars.set_nonpersistent_facts(host, facts)
        self.assertEqual(host_vars._variable_manager.get_nonpersistent_facts(host), facts)

    def test_set_host_facts(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, cache=None)
        host = ...
        facts = ...
        host_vars.set_host_facts(host, facts)
        self.assertEqual(host_vars._variable_manager.get_facts(host), facts)

    def test_contains(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, cache=None)
        host_name = ...
        self.assertEqual(host_name in host_vars, ...)

    def test_iter(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, cache=None)
        self.assertEqual(list(host_vars), ...)

    def test_len(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader)
        self.assertEqual(len(host_vars), ...)

    def test_repr(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, None)
        self.assertEqual(repr(host_vars), ...)

    def test_deepcopy(self):
        inventory = ...
        variable_manager = ...
        loader = ...
        host_vars = HostVars(inventory, variable_manager, loader, cache=None)
        self.assertEqual(host_vars, ...)


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