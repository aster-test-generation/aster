# Automatically generated by Pynguin.
import ansible.parsing.utils.addresses as module_0

def test_case_0():
    try:
        str_0 = '!StiXj_n$Sd)?wF'
        var_0 = module_0.parse_address(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'ansible_ssh_common_args'
        var_0 = module_0.parse_address(str_0, str_0)
        str_1 = 'Q\rIsL|:)R#>LH(r6i'
        var_1 = module_0.parse_address(str_1)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'foo'
        var_0 = module_0.parse_address(str_0)
        str_1 = 'foo:123'
        var_1 = module_0.parse_address(str_1)
        str_2 = '[bar]:123'
        var_2 = module_0.parse_address(str_2)
        str_3 = '[fe80::1]:123'
        var_3 = module_0.parse_address(str_3)
        str_4 = 'fe80::1[1:2]'
        var_4 = module_0.parse_address(str_4)
    except BaseException:
        pass