# Automatically generated by Pynguin.
import ansible.template.native_helpers as module_0

def test_case_0():
    pass

def test_case_1():
    bytes_0 = b'v\xe1'
    var_0 = module_0.ansible_native_concat(bytes_0)

def test_case_2():
    str_0 = 'v{a'
    list_0 = [str_0]
    list_1 = [str_0, str_0, str_0, list_0]
    var_0 = module_0.ansible_native_concat(list_1)

def test_case_3():
    str_0 = 'm'
    var_0 = module_0.ansible_native_concat(str_0)

def test_case_4():
    str_0 = 'h\rI7'
    var_0 = module_0.ansible_native_concat(str_0)

def test_case_5():
    list_0 = []
    var_0 = module_0.ansible_native_concat(list_0)

def test_case_6():
    bytes_0 = b'\x9c\xab'
    dict_0 = {bytes_0: bytes_0}
    var_0 = module_0.ansible_native_concat(dict_0)

def test_case_7():
    str_0 = '(0#J@1[b'
    dict_0 = {str_0: str_0}
    list_0 = [str_0, dict_0, str_0, str_0]
    var_0 = module_0.ansible_native_concat(list_0)