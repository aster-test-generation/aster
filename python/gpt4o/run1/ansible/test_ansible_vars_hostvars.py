from ansible.vars.hostvars import STATIC_VARS
import unittest
from unittest.mock import MagicMock, patch
from ansible.vars.hostvars import HostVars, HostVarsVars
from ansible.template import AnsibleUndefined


class TestHostVars(unittest.TestCase):
    def setUp(self):
        self.inventory = MagicMock()
        self.variable_manager = MagicMock()
        self.loader = MagicMock()
        self.hostvars = HostVars(self.inventory, self.variable_manager, self.loader)

    def test_init(self):
        self.assertEqual(self.hostvars._inventory, self.inventory)
        self.assertEqual(self.hostvars._loader, self.loader)
        self.assertEqual(self.hostvars._variable_manager, self.variable_manager)
        self.assertEqual(self.variable_manager._hostvars, self.hostvars)

    def test_set_variable_manager(self):
        new_variable_manager = MagicMock()
        self.hostvars.set_variable_manager(new_variable_manager)
        self.assertEqual(self.hostvars._variable_manager, new_variable_manager)
        self.assertEqual(new_variable_manager._hostvars, self.hostvars)

    def test_set_inventory(self):
        new_inventory = MagicMock()
        self.hostvars.set_inventory(new_inventory)
        self.assertEqual(self.hostvars._inventory, new_inventory)

    def test_find_host(self):
        host_name = 'test_host'
        self.inventory.get_host.return_value = 'host_object'
        result = self.hostvars._find_host(host_name)
        self.assertEqual(result, 'host_object')
        self.inventory.get_host.assert_called_once_with(host_name)

    def test_raw_get_host_not_found(self):
        host_name = 'test_host'
        self.inventory.get_host.return_value = None
        result = self.hostvars.raw_get(host_name)
        self.assertIsInstance(result, AnsibleUndefined)
        self.assertEqual(result._name, "hostvars['%s']" % host_name)

    def test_raw_get_host_found(self):
        host_name = 'test_host'
        host = MagicMock()
        self.inventory.get_host.return_value = host
        self.variable_manager.get_vars.return_value = 'vars'
        result = self.hostvars.raw_get(host_name)
        self.assertEqual(result, 'vars')
        self.variable_manager.get_vars.assert_called_once_with(host=host, include_hostvars=False)

    def test_setstate(self):
        state = {'_inventory': 'new_inventory', '_loader': 'new_loader', '_variable_manager': 'new_variable_manager'}
        self.hostvars.__setstate__(state)
        self.assertEqual(self.hostvars._inventory, 'new_inventory')
        self.assertEqual(self.hostvars._loader, 'new_loader')
        self.assertEqual(self.hostvars._variable_manager, 'new_variable_manager')

    def test_getitem(self):
        host_name = 'test_host'
        self.hostvars.raw_get = MagicMock(return_value='data')
        with patch('ansible.vars.hostvars.HostVarsVars') as MockHostVarsVars:
            result = self.hostvars[host_name]
            self.assertEqual(result, MockHostVarsVars.return_value)
            MockHostVarsVars.assert_called_once_with('data', loader=self.loader)

    def test_set_host_variable(self):
        host = 'test_host'
        varname = 'var_name'
        value = 'value'
        self.hostvars.set_host_variable(host, varname, value)
        self.variable_manager.set_host_variable.assert_called_once_with(host, varname, value)

    def test_set_nonpersistent_facts(self):
        host = 'test_host'
        facts = 'facts'
        self.hostvars.set_nonpersistent_facts(host, facts)
        self.variable_manager.set_nonpersistent_facts.assert_called_once_with(host, facts)

    def test_set_host_facts(self):
        host = 'test_host'
        facts = 'facts'
        self.hostvars.set_host_facts(host, facts)
        self.variable_manager.set_host_facts.assert_called_once_with(host, facts)

    def test_contains(self):
        host_name = 'test_host'
        self.hostvars._find_host = MagicMock(return_value=True)
        result = host_name in self.hostvars
        self.assertTrue(result)
        self.hostvars._find_host.assert_called_once_with(host_name)

    def test_iter(self):
        self.inventory.hosts = ['host1', 'host2']
        result = list(iter(self.hostvars))
        self.assertEqual(result, ['host1', 'host2'])

    def test_len(self):
        self.inventory.hosts = ['host1', 'host2']
        result = len(self.hostvars)
        self.assertEqual(result, 2)

    def test_repr(self):
        self.inventory.hosts = ['host1', 'host2']
        self.hostvars.get = MagicMock(side_effect=['vars1', 'vars2'])
        result = repr(self.hostvars)
        self.assertEqual(result, "{'host1': 'vars1', 'host2': 'vars2'}")

    def test_deepcopy(self):
        result = self.hostvars.__deepcopy__({})
        self.assertEqual(result, self.hostvars)

class TestHostVarsVars(unittest.TestCase):
    def setUp(self):
        self.variables = {'var1': 'value1', 'var2': 'value2'}
        self.loader = MagicMock()
        self.hostvarsvars = HostVarsVars(self.variables, self.loader)

    def test_getitem(self):
        var = 'var1'
        with patch('ansible.vars.hostvars.Templar') as MockTemplar:
            templar_instance = MockTemplar.return_value
            templar_instance.template.return_value = 'templated_value'
            result = self.hostvarsvars[var]
            self.assertEqual(result, 'templated_value')
            MockTemplar.assert_called_once_with(variables=self.variables, loader=self.loader)
            templar_instance.template.assert_called_once_with(self.variables[var], fail_on_undefined=False, static_vars=STATIC_VARS)

    def test_contains(self):
        var = 'var1'
        result = var in self.hostvarsvars
        self.assertTrue(result)

    def test_iter(self):
        result = list(iter(self.hostvarsvars))
        self.assertEqual(result, ['var1', 'var2'])

    def test_len(self):
        result = len(self.hostvarsvars)
        self.assertEqual(result, 2)

    def test_repr(self):
        with patch('ansible.vars.hostvars.Templar') as MockTemplar:
            templar_instance = MockTemplar.return_value
            templar_instance.template.return_value = 'templated_vars'
            result = repr(self.hostvarsvars)
            self.assertEqual(result, "'templated_vars'")
            MockTemplar.assert_called_once_with(variables=self.variables, loader=self.loader)
            templar_instance.template.assert_called_once_with(self.variables, fail_on_undefined=False, static_vars=STATIC_VARS)

if __name__ == '__main__':
    unittest.main()