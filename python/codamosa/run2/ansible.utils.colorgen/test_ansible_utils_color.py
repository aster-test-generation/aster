# Automatically generated by Pynguin.
import ansible.utils.color as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = 'yellow'
    var_0 = module_0.stringc(str_0, str_0)

def test_case_2():
    str_0 = '%Qh\\,G((wiQ%}\\;\x0b/k4'
    var_0 = module_0.colorize(str_0, str_0, str_0)

def test_case_3():
    bytes_0 = b'v\x86\xda\xb7\x19\x90'
    var_0 = module_0.hostcolor(bytes_0, bytes_0)

def test_case_4():
    int_0 = -613
    str_0 = '%s salt=%s ident=%s'
    list_0 = [int_0, str_0, int_0, int_0]
    bool_0 = False
    tuple_0 = ()
    str_1 = "'8f.F5%\x0bY"
    set_0 = set()
    var_0 = module_0.colorize(tuple_0, str_1, set_0)
    bytes_0 = b' \xdeW\xcd\xfcg'
    var_1 = module_0.colorize(list_0, bool_0, bytes_0)
    var_2 = module_0.stringc(int_0, str_0)
    str_2 = "(H`4~!CBeg5#'u,/#"
    set_1 = {str_0, str_2}
    var_3 = module_0.colorize(bytes_0, set_1, str_0)
    list_1 = [var_2]
    bytes_1 = b'\xe9blo\xf4'
    var_4 = module_0.hostcolor(str_1, list_1, bytes_1)

def test_case_5():
    str_0 = 'gray01'
    var_0 = module_0.parsecolor(str_0)

def test_case_6():
    str_0 = 'red'
    str_1 = 'color1'
    var_0 = module_0.parsecolor(str_1)
    str_2 = 'rgb555'
    var_1 = module_0.parsecolor(str_2)
    str_3 = 'gray00'
    var_2 = module_0.parsecolor(str_3)
    str_4 = 'gray01'
    var_3 = module_0.parsecolor(str_4)
    var_4 = module_0.parsecolor(str_3)
    str_5 = 'gray23'
    var_5 = module_0.parsecolor(str_5)
    var_6 = module_0.parsecolor(str_0)
    var_7 = module_0.parsecolor(str_1)

def test_case_7():
    str_0 = 'rgb505'
    var_0 = module_0.parsecolor(str_0)
    str_1 = 'gray00'
    var_1 = module_0.parsecolor(str_1)
    var_2 = module_0.parsecolor(str_0)