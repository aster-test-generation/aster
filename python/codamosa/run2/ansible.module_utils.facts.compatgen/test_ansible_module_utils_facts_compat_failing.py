# Automatically generated by Pynguin.
import ansible.module_utils.facts.compat as module_0

def test_case_0():
    try:
        bool_0 = True
        var_0 = module_0.get_all_facts(bool_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'integer'
        var_0 = module_0.ansible_facts(str_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '0c'
        var_0 = module_0.ansible_facts(str_0, str_0)
    except BaseException:
        pass