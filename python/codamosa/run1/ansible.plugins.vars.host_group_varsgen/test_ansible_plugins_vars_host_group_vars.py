# Automatically generated by Pynguin.
import ansible.plugins.vars.host_group_vars as module_0
import ansible.inventory.host as module_1

def test_case_0():
    pass

def test_case_1():
    vars_module_0 = module_0.VarsModule()
    str_0 = 'V'
    host_0 = module_1.Host(str_0)
    var_0 = vars_module_0.get_vars(str_0, host_0, host_0)

def test_case_2():
    vars_module_0 = module_0.VarsModule()
    str_0 = ''
    host_0 = module_1.Host(str_0)
    var_0 = vars_module_0.get_vars(str_0, host_0, host_0, str_0)

def test_case_3():
    vars_module_0 = module_0.VarsModule()
    str_0 = '/";@4'
    host_0 = module_1.Host(str_0)
    var_0 = vars_module_0.get_vars(str_0, host_0, host_0)