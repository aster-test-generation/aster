# Automatically generated by Pynguin.
import ansible.inventory.host as module_0
import ansible.plugins.vars.host_group_vars as module_1
import ansible.errors as module_2
import ansible.inventory.group as module_3

def test_case_0():
    pass

def test_case_1():
    str_0 = 'advancing hosts in ITERATING_TAZKS'
    host_0 = module_0.Host(str_0)
    vars_module_0 = module_1.VarsModule()
    var_0 = vars_module_0.get_vars(vars_module_0, str_0, host_0)

def test_case_2():
    str_0 = '}C\nE7\x0bb#D\x0cMuP=Ps\x0c/'
    ansible_parser_error_0 = module_2.AnsibleParserError(str_0, str_0)
    group_0 = module_3.Group(str_0)
    vars_module_0 = module_1.VarsModule()
    var_0 = vars_module_0.get_vars(str_0, ansible_parser_error_0, group_0, vars_module_0)
    str_1 = '/etkts#eq'
    host_0 = module_0.Host(str_1)
    var_1 = vars_module_0.get_vars(vars_module_0, host_0, host_0)

def test_case_3():
    str_0 = '}C[E7\x0bb#O\x0cMuPks\x0c/'
    float_0 = None
    ansible_parser_error_0 = module_2.AnsibleParserError(float_0)
    group_0 = module_3.Group(str_0)
    vars_module_0 = module_1.VarsModule()
    var_0 = vars_module_0.get_vars(str_0, float_0, group_0, float_0)
    str_1 = '/etc/s.el'
    host_0 = module_0.Host(str_1)
    var_1 = vars_module_0.get_vars(ansible_parser_error_0, host_0, host_0)

def test_case_4():
    str_0 = '/etc/skel'
    host_0 = module_0.Host(str_0)
    vars_module_0 = module_1.VarsModule()
    var_0 = vars_module_0.get_vars(vars_module_0, host_0, host_0)