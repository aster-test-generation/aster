# Automatically generated by Pynguin.
import ansible.vars.hostvars as module_0
import ansible.template as module_1

def test_case_0():
    pass

def test_case_1():
    bool_0 = True
    list_0 = [bool_0, bool_0, bool_0]
    host_vars_vars_0 = module_0.HostVarsVars(bool_0, list_0)

def test_case_2():
    tuple_0 = ()
    ansible_undefined_0 = module_1.AnsibleUndefined()
    host_vars_0 = module_0.HostVars(ansible_undefined_0, ansible_undefined_0, ansible_undefined_0)
    var_0 = host_vars_0.__setstate__(tuple_0)