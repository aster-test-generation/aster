# Automatically generated by Pynguin.
import ansible.playbook.role_include as module_0

def test_case_0():
    pass

def test_case_1():
    include_role_0 = module_0.IncludeRole()

def test_case_2():
    include_role_0 = module_0.IncludeRole()
    var_0 = include_role_0.get_name()

def test_case_3():
    bool_0 = True
    include_role_0 = module_0.IncludeRole(bool_0)
    include_role_1 = module_0.IncludeRole()
    var_0 = include_role_1.get_include_params()