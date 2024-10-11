import unittest
from ansible.vars.hostvars import hostvars



class TestHostVars(unittest.TestCase):
    def test_raw_get(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        host_name = None
        result = hostvars.raw_get(host_name)
        self.assertEqual(result, AnsibleUndefined(name="hostvars['%s']" % host_name))

    def test_set_variable_manager(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        variable_manager = None
        hostvars.set_variable_manager(variable_manager)

    def test_set_inventory(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        inventory = None
        hostvars.set_inventory(inventory)

    def test_find_host(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        host_name = None
        result = hostvars._find_host(host_name)
        self.assertEqual(result, None)

    def test_getitem(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        host_name = None
        result = hostvars[host_name]
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

    def test_contains(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        host_name = None
        result = host_name in hostvars
        self.assertEqual(result, False)

    def test_iter(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        result = iter(hostvars)
        self.assertEqual(result, None)

    def test_len(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        result = len(hostvars)
        self.assertEqual(result, 0)

    def test_repr(self):
        inventory = None
        variable_manager = None
        loader = None
        hostvars = HostVars(inventory, variable_manager, loader)
        result = repr(hostvars)
        self.assertEqual(result, '{}')

if __name__ == '__main__':
    unittest.main()