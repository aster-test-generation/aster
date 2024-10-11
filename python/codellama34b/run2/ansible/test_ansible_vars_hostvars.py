import unittest
from ansible.vars.hostvars import *



class TestHostVars(unittest.TestCase):
    def test_set_variable_manager(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        variable_manager = None
        hostvars.set_variable_manager(variable_manager)
        self.assertEqual(hostvars._variable_manager, variable_manager)

    def test_set_inventory(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        inventory = None
        hostvars.set_inventory(inventory)
        self.assertEqual(hostvars._inventory, inventory)

    def test_raw_get(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        host_name = None
        result = hostvars.raw_get(host_name)
        self.assertEqual(result, AnsibleUndefined(name="hostvars['%s']" % host_name))

    def test_set_host_variable(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        host = None
        varname = None
        value = None
        hostvars.set_host_variable(host, varname, value)

    def test_set_nonpersistent_facts(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        host = None
        facts = None
        hostvars.set_nonpersistent_facts(host, facts)

    def test_set_host_facts(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        host = None
        facts = None
        hostvars.set_host_facts(host, facts)

    def test___contains__(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        host_name = None
        result = host_name in hostvars
        self.assertEqual(result, False)

    def test___iter__(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        result = hostvars.__iter__()
        self.assertEqual(result, None)

    def test___len__(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        result = len(hostvars)
        self.assertEqual(result, 0)

    def test___repr__(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        result = repr(hostvars)
        self.assertEqual(result, '{}')

    def test___deepcopy__(self, memo):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        result = hostvars.__deepcopy__(memo)
        self.assertEqual(result, None)

class TestHostVarsVars(unittest.TestCase):
    def test___getitem__(self):
        variables = None
        loader = None
        hostvarsvars = HostVarsVars(variables, loader)
        var = None
        result = hostvarsvars[var]
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()