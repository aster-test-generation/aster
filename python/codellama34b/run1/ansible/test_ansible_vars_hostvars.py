import unittest
from ansible.vars.hostvars import *



class TestHostVars(unittest.TestCase):
    def test_raw_get(self):
        inventory = None
        variable_manager = None
        loader = None
        host_vars = HostVars(inventory, variable_manager, loader)
        host_name = None
        result = host_vars.raw_get(host_name)
        self.assertEqual(result, AnsibleUndefined(name="hostvars['%s']" % host_name))

    def test_set_variable_manager(self):
        inventory = None
        variable_manager = None
        loader = None
        host_vars = HostVars(inventory, variable_manager, loader)
        variable_manager = None
        host_vars.set_variable_manager(variable_manager)
        self.assertEqual(host_vars._variable_manager, variable_manager)

    def test_set_inventory(self):
        inventory = None
        variable_manager = None
        loader = None
        host_vars = HostVars(inventory, variable_manager, loader)
        inventory = None
        host_vars.set_inventory(inventory)
        self.assertEqual(host_vars._inventory, inventory)

    def test_find_host(self):
        inventory = None
        variable_manager = None
        loader = None
        host_vars = HostVars(inventory, variable_manager, loader)
        host_name = None
        result = host_vars._find_host(host_name)
        self.assertEqual(result, None)

    def test_getitem(self):
        inventory = None
        variable_manager = None
        loader = None
        host_vars = HostVars(inventory, variable_manager, loader)
        host_name = None
        result = host_vars[host_name]
        self.assertEqual(result, AnsibleUndefined(name="hostvars['%s']" % host_name))

    def test_set_host_variable(self):
        inventory = None
        variable_manager = None
        loader = None
        host_vars = HostVars(inventory, variable_manager, loader)
        host = None
        varname = None
        value = None
        host_vars.set_host_variable(host, varname, value)
        self.assertEqual(host_vars._variable_manager.get_vars(host=host, include_hostvars=False), None)

    def test_set_nonpersistent_facts(self):
        inventory = None
        variable_manager = None
        loader = None
        host_vars = HostVars(inventory, variable_manager, loader)
        host = None
        facts = None
        host_vars.set_nonpersistent_facts(host, facts)
        self.assertEqual(host_vars._variable_manager.get_vars(host=host, include_hostvars=False), None)

    def test_set_host_facts(self):
        inventory = None
        variable_manager = None
        loader = None
        host_vars = HostVars(inventory, variable_manager, loader)
        host = None
        facts = None
        host_vars.set_host_facts(host, facts)
        self.assertEqual(host_vars._variable_manager.get_vars(host=host, include_hostvars=False), None)

    def test_contains(self):
        inventory = None
        variable_manager = None
        loader = None
        host_vars = HostVars(inventory, variable_manager, loader)
        host_name = None
        result = host_name in host_vars
        self.assertEqual(result, False)

    def test_iter(self):
        inventory = None
        variable_manager = None
        loader = None
        host_vars = HostVars(inventory, variable_manager, loader)
        result = iter(host_vars)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()