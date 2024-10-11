import unittest
from ansible.vars.hostvars import HostVars, HostVarsVars


class TestHostVars(unittest.TestCase):
    def test_raw_get(self):
        host_name = "test_host"
        hostvars = HostVars(None, None, None)
        hostvars.raw_get(host_name)

    def test_getitem(self):
        host_name = "test_host"
        hostvars = HostVars(None, None, None)
        hostvars[host_name]

    def test_set_host_variable(self):
        host_name = "test_host"
        hostvars = HostVars(None, None, None)
        host = hostvars._find_host(host_name)
        hostvars.set_host_variable(host, "test_var", "test_value")

    def test_set_nonpersistent_facts(self):
        host_name = "test_host"
        hostvars = HostVars(None, None, None)
        host = hostvars._find_host(host_name)
        hostvars.set_nonpersistent_facts(host, {"test_fact": "test_value"})

    def test_set_host_facts(self):
        host_name = "test_host"
        hostvars = HostVars(None, None, None)
        host = hostvars._find_host(host_name)
        hostvars.set_host_facts(host, {"test_fact": "test_value"})

    def test_contains(self):
        host_name = "test_host"
        hostvars = HostVars(None, None, None)
        host_name in hostvars

    def test_iter(self):
        hostvars = HostVars(None, None, None)
        iter(hostvars)

    def test_len(self):
        hostvars = HostVars(None, None, None)
        len(hostvars)

    def test_repr(self):
        hostvars = HostVars(None, None, None)
        repr(hostvars)

class TestHostVarsVars(unittest.TestCase):
    def test_getitem(self):
        variables = {"test_var": "test_value"}
        loader = None
        hostvars_vars = HostVarsVars(variables, loader)
        hostvars_vars["test_var"]

    def test_contains(self):
        variables = {"test_var": "test_value"}
        loader = None
        hostvars_vars = HostVarsVars(variables, loader)
        "test_var" in hostvars_vars

    def test_iter(self):
        variables = {"test_var": "test_value"}
        loader = None
        hostvars_vars = HostVarsVars(variables, loader)
        iter(hostvars_vars)

    def test_len(self):
        variables = {"test_var": "test_value"}
        loader = None
        hostvars_vars = HostVarsVars(variables, loader)
        len(hostvars_vars)

    def test_repr(self):
        variables = {"test_var": "test_value"}
        loader = None
        hostvars_vars = HostVarsVars(variables, loader)
        repr(hostvars_vars)

if __name__ == '__main__':
    unittest.main()