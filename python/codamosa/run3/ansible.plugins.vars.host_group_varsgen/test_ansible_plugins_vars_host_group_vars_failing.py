# Automatically generated by Pynguin.
import ansible.plugins.vars.host_group_vars as module_0

def test_case_0():
    try:
        vars_module_0 = module_0.VarsModule()
        bytes_0 = b'\xd0\xbb~f1'
        vars_module_1 = module_0.VarsModule()
        var_0 = vars_module_1.get_vars(bytes_0, vars_module_1, bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        vars_module_0 = module_0.VarsModule()
        bool_0 = False
        float_0 = -225.42
        list_0 = [bool_0, vars_module_0, float_0, vars_module_0]
        var_0 = vars_module_0.get_vars(bool_0, vars_module_0, list_0)
    except BaseException:
        pass