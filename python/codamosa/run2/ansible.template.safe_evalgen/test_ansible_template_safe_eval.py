# Automatically generated by Pynguin.
import ansible.template.safe_eval as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = 'F'
    var_0 = module_0.safe_eval(str_0)

def test_case_2():
    dict_0 = None
    var_0 = module_0.safe_eval(dict_0)

def test_case_3():
    bytes_0 = b'6\x82[o\xfcI\xf6\xf2\xbf\xb1\xff\x11D\xaf();Y\x9e'
    bool_0 = False
    int_0 = -391
    var_0 = module_0.safe_eval(bool_0, int_0)
    set_0 = {bytes_0}
    dict_0 = {var_0: bytes_0}
    var_1 = module_0.safe_eval(set_0, dict_0)
    str_0 = 'ds\x0cGSa\\d'
    set_1 = set()
    str_1 = 'Si+i]#]?${6cb'
    var_2 = module_0.safe_eval(set_1, str_1)
    var_3 = module_0.safe_eval(bytes_0, str_0)
    dict_1 = {}
    str_2 = '0\tFkqE'
    list_0 = None
    list_1 = [var_3, bool_0]
    var_4 = module_0.safe_eval(list_1)
    var_5 = module_0.safe_eval(str_2, list_0)
    var_6 = module_0.safe_eval(int_0)
    str_3 = 'Q7|#_o'
    tuple_0 = (list_0,)
    tuple_1 = (tuple_0, str_0, dict_1, dict_0)
    var_7 = module_0.safe_eval(str_3, tuple_1)
    tuple_2 = (str_2,)
    var_8 = module_0.safe_eval(tuple_2, dict_0)
    str_4 = 'r5W*'
    bytes_1 = b')B\xd2'
    var_9 = module_0.safe_eval(bytes_1)
    var_10 = module_0.safe_eval(dict_1)
    var_11 = module_0.safe_eval(str_4)
    var_12 = module_0.safe_eval(int_0, dict_1)
    var_13 = module_0.safe_eval(str_4, dict_1, int_0)
    bytes_2 = b'\xb8K\x90\xe6\xb2T\x7f'
    var_14 = module_0.safe_eval(bytes_2)
    var_15 = module_0.safe_eval(dict_0)
    var_16 = module_0.safe_eval(dict_1)

def test_case_4():
    str_0 = '\n'
    var_0 = module_0.safe_eval(str_0)

def test_case_5():
    str_0 = '1 + 2'
    var_0 = module_0.safe_eval(str_0)

def test_case_6():
    str_0 = 'ifeEt*cKt'
    var_0 = module_0.safe_eval(str_0, str_0, str_0)

def test_case_7():
    str_0 = "ansible_env['HOME']"
    var_0 = module_0.safe_eval(str_0)

def test_case_8():
    str_0 = 'ifteEt*cKt'
    var_0 = module_0.safe_eval(str_0, str_0)

def test_case_9():
    int_0 = 1
    int_1 = 2
    var_0 = type(int_1)
    str_0 = 'a'
    int_2 = {str_0: int_0}
    var_1 = module_0.safe_eval(int_2)
    var_2 = type(var_1)
    str_1 = 'test()'
    var_3 = module_0.safe_eval(str_1)
    str_2 = 'test'
    var_4 = {}
    bool_0 = True
    var_5 = module_0.safe_eval(str_2, var_4, bool_0)
    str_3 = '1+2'
    var_6 = {}
    bool_1 = True
    var_7 = module_0.safe_eval(str_3, var_6, bool_1)