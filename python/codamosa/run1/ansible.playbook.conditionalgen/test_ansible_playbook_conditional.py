# Automatically generated by Pynguin.
import ansible.playbook.conditional as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = 'ssh_public_key'
    bytes_0 = b' \xf0\r\xdc\xc4C\x1c\xa9'
    str_1 = ')jIVE\x0b'
    dict_0 = {bytes_0: bytes_0, bytes_0: str_1}
    conditional_0 = module_0.Conditional(dict_0)
    var_0 = conditional_0.extract_defined_undefined(str_0)

def test_case_2():
    bool_0 = True
    str_0 = 'hostvars["localhost"] is defined and hostvars["localhost"] is not defined'
    conditional_0 = module_0.Conditional(bool_0)
    var_0 = conditional_0.extract_defined_undefined(str_0)
    var_1 = print(str_0)
    str_1 = 'hostvars["localhost"] is undefined or hostvars["localhost"] is not defined'
    str_2 = 'Test case 3: conditional statement is: '
    var_2 = str_2 + str_1