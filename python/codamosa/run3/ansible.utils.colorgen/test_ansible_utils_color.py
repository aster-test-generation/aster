# Automatically generated by Pynguin.
import ansible.utils.color as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = '+YiPd0r\tW\x0bo8\x0bnO_pn4|'
    var_0 = module_0.stringc(str_0, str_0)

def test_case_2():
    float_0 = 159.0
    bytes_0 = b'!\xa6\x11\xe3>\x01\xcf\xf1e\xd9\x9b\x17\xcf\x90'
    var_0 = module_0.colorize(float_0, float_0, bytes_0)

def test_case_3():
    bool_0 = False
    str_0 = 'm}%zZ8gU'
    var_0 = module_0.hostcolor(bool_0, str_0)

def test_case_4():
    str_0 = 'gray232'
    var_0 = module_0.parsecolor(str_0)

def test_case_5():
    str_0 = 'gray232'
    var_0 = module_0.parsecolor(str_0)
    str_1 = 'color231'
    var_1 = module_0.parsecolor(str_1)

def test_case_6():
    str_0 = 'rgb555'
    var_0 = module_0.parsecolor(str_0)
    var_1 = module_0.parsecolor(str_0)
    str_1 = 'gray232'
    var_2 = module_0.parsecolor(str_1)
    str_2 = 'color231'
    var_3 = module_0.parsecolor(str_2)