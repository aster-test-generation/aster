# Automatically generated by Pynguin.
import pymonet.validation as module_0

def test_case_0():
    try:
        bytes_0 = b'\xaf\xfc\xab\xce\xaej\xa9\xdd\x17p\x0fB\x05\xadSw'
        float_0 = -963.1799
        int_0 = -2056
        validation_0 = module_0.Validation(int_0, bytes_0)
        bool_0 = True
        str_0 = 'GM{Z!(y{\x0cd1!='
        validation_1 = module_0.Validation(bool_0, str_0)
        str_1 = '|G?1|if;kqUe'
        validation_2 = module_0.Validation(validation_1, str_1)
        set_0 = {bytes_0, float_0}
        set_1 = set()
        tuple_0 = (set_0, set_1)
        validation_3 = module_0.Validation(validation_2, tuple_0)
        var_0 = validation_3.__eq__(validation_0)
        validation_4 = module_0.Validation(bytes_0, float_0)
        var_1 = validation_4.is_fail()
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = -167.0
        validation_0 = module_0.Validation(float_0, float_0)
        var_0 = validation_0.to_try()
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '`2-.s*2$3y>cSukmq'
        str_1 = 'mrZw'
        bytes_0 = b'\xd7\x1a\xb8\xa8\xb7\xe4y\xb3\xbd\xea\xbf\x8f\x8f\x08'
        validation_0 = module_0.Validation(str_1, bytes_0)
        validation_1 = module_0.Validation(str_0, validation_0)
        var_0 = validation_1.to_lazy()
        bytes_1 = b"(\x188\x12\xed\xe5\xaf3'\xd9\xc7\xb4\xbas\xa0\xff"
        bytes_2 = b'\x95}\x93\xe9\xfc\x8d>\xaa\xf3\x0c\xe6\x9c\x07H\xfb\xce'
        int_0 = 2616
        bool_0 = True
        validation_2 = module_0.Validation(bool_0, int_0)
        list_0 = []
        validation_3 = module_0.Validation(validation_2, list_0)
        var_1 = validation_3.is_fail()
        validation_4 = module_0.Validation(bytes_2, int_0)
        var_2 = validation_4.map(bytes_1)
    except BaseException:
        pass

def test_case_3():
    try:
        list_0 = []
        list_1 = []
        str_0 = '\n}'
        float_0 = None
        validation_0 = module_0.Validation(float_0, list_1)
        tuple_0 = (validation_0,)
        validation_1 = module_0.Validation(tuple_0, list_1)
        validation_2 = module_0.Validation(str_0, validation_1)
        validation_3 = module_0.Validation(list_1, validation_2)
        var_0 = validation_3.bind(list_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bool_0 = True
        set_0 = {bool_0}
        bool_1 = True
        float_0 = -1563.3588
        validation_0 = module_0.Validation(bool_1, float_0)
        var_0 = validation_0.ap(set_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = '#W<1>.^E^i(LbQXio?Vr'
        float_0 = 2032.6
        validation_0 = module_0.Validation(str_0, float_0)
        var_0 = validation_0.to_maybe()
    except BaseException:
        pass

def test_case_6():
    try:
        bytes_0 = b'\xaf\xfc\xab\xce\xaej\xa9\xdd\x17p\x0fB\x05\xadSw'
        float_0 = -963.1799
        int_0 = -2056
        str_0 = ';9xt1\x0b@Uf|xF.sY_'
        validation_0 = module_0.Validation(str_0, str_0)
        var_0 = validation_0.__str__()
        validation_1 = module_0.Validation(int_0, bytes_0)
        bool_0 = False
        str_1 = 'GM{Z!(y{\x0cd1!='
        validation_2 = module_0.Validation(bool_0, str_1)
        var_1 = validation_1.is_fail()
        var_2 = validation_1.__eq__(validation_1)
        validation_3 = module_0.Validation(bytes_0, float_0)
        var_3 = validation_3.is_fail()
    except BaseException:
        pass

def test_case_7():
    try:
        bool_0 = None
        str_0 = 'tm:JWo@~W|]:'
        str_1 = ''
        validation_0 = module_0.Validation(str_0, str_1)
        var_0 = validation_0.to_either()
        float_0 = 1464.373
        bool_1 = True
        bytes_0 = b'\xc7\xdd\xe1\x02\x0c\xc6\xe0y7\xd4\xdf/r\xdc\x8f"\xe82\x0b'
        list_0 = [var_0, str_0, bytes_0]
        var_1 = validation_0.__eq__(list_0)
        var_2 = validation_0.is_fail()
        var_3 = validation_0.to_maybe()
        list_1 = [float_0]
        validation_1 = module_0.Validation(bool_1, list_1)
        validation_2 = module_0.Validation(float_0, validation_1)
        var_4 = validation_0.__str__()
        int_0 = -1208
        str_2 = "0GR q~Z'+-lW\x0bD~T"
        validation_3 = module_0.Validation(int_0, str_2)
        var_5 = validation_1.__eq__(validation_3)
        var_6 = validation_2.map(bool_0)
    except BaseException:
        pass