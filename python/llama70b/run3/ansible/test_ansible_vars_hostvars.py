import unittest
from ansible.vars.hostvars import HostVars, HostVarsVars, STATIC_VARS


class TestHostVars(unittest.TestCase):
    def test_init(self):
        inventory = object()
        variable_manager = object()
        loader = object()
        instance = HostVars(inventory, variable_manager, loader)
        self.assertEqual(instance._inventory, inventory)
        self.assertEqual(instance._loader, loader)
        self.assertEqual(instance._variable_manager, variable_manager)

    def test_set_variable_manager(self):
        instance = HostVars(object(), object(), object())
        new_variable_manager = object()
        instance.set_variable_manager(new_variable_manager)
        self.assertEqual(instance._variable_manager, new_variable_manager)

    def test_set_inventory(self):
        instance = HostVars(object(), object(), object())
        new_inventory = object()
        instance.set_inventory(new_inventory)
        self.assertEqual(instance._inventory, new_inventory)

    def test_find_host(self):
        instance = HostVars(object(), object(), object())
        host_name = 'example_host'
        host = object()
        instance._inventory.get_host = lambda x: host if x == host_name else None
        result = instance._find_host(host_name)
        self.assertEqual(result, host)

    def test_raw_get(self):
        instance = HostVars(object(), object(), object())
        host_name = 'example_host'
        host = object()
        instance._find_host = lambda x: host if x == host_name else None
        instance._variable_manager.get_vars = lambda x, y: {'foo': 'bar'}
        result = instance.raw_get(host_name)
        self.assertEqual(result, {'foo': 'bar'})

    def test_getitem(self):
        instance = HostVars(object(), object(), object())
        host_name = 'example_host'
        host = object()
        instance._find_host = lambda x: host if x == host_name else None
        instance._variable_manager.get_vars = lambda x, y: {'foo': 'bar'}
        result = instance[host_name]
        self.assertIsInstance(result, HostVarsVars)

    def test_set_host_variable(self):
        instance = HostVars(object(), object(), object())
        host = object()
        varname = 'example_var'
        value = 'example_value'
        instance._variable_manager.set_host_variable = lambda x, y, z: None
        instance.set_host_variable(host, varname, value)
        self.assertIsNone(instance._variable_manager.set_host_variable(host, varname, value))

    def test_set_nonpersistent_facts(self):
        instance = HostVars(object(), object(), object())
        host = object()
        facts = {'foo': 'bar'}
        instance._variable_manager.set_nonpersistent_facts = lambda x, y: None
        instance.set_nonpersistent_facts(host, facts)
        self.assertIsNone(instance._variable_manager.set_nonpersistent_facts(host, facts))

    def test_set_host_facts(self):
        instance = HostVars(object(), object(), object())
        host = object()
        facts = {'foo': 'bar'}
        instance._variable_manager.set_host_facts = lambda x, y: None
        instance.set_host_facts(host, facts)
        self.assertIsNone(instance._variable_manager.set_host_facts(host, facts))

    def test_contains(self):
        instance = HostVars(object(), object(), object())
        host_name = 'example_host'
        instance._find_host = lambda x: object() if x == host_name else None
        self.assertIn(host_name, instance)

    def test_iter(self):
        instance = HostVars(object(), object(), object())
        hosts = [object(), object(), object()]
        instance._inventory.hosts = hosts
        result = list(instance)
        self.assertEqual(result, hosts)

    def test_len(self):
        instance = HostVars(object(), object(), object())
        hosts = [object(), object(), object()]
        instance._inventory.hosts = hosts
        self.assertEqual(len(instance), len(hosts))

    def test_repr(self):
        instance = HostVars(object(), object(), object())
        hosts = [object(), object(), object()]
        instance._inventory.hosts = hosts
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test_setstate(self):
        instance = HostVars(object(), object(), object())
        state = {'foo': 'bar'}
        instance.__setstate__(state)
        self.assertEqual(instance.__dict__, state)

class TestHostVarsVars(unittest.TestCase):
    def test_init(self):
        variables = {'foo': 'bar'}
        loader = object()
        instance = HostVarsVars(variables, loader)
        self.assertEqual(instance._vars, variables)
        self.assertEqual(instance._loader, loader)

if __name__ == '__main__':
    unittest.main()