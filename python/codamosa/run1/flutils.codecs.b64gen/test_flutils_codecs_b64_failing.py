# Automatically generated by Pynguin.
import flutils.codecs.b64 as module_0
import collections as module_1
import codecs as module_2

def test_case_0():
    try:
        str_0 = 'TGN`sxi< fPlIo<Wk#'
        tuple_0 = module_0.encode(str_0)
    except BaseException:
        pass

def test_case_1():
    try:
        tuple_0 = None
        user_string_0 = module_1.UserString(tuple_0)
        tuple_1 = module_0.encode(user_string_0)
        float_0 = None
        tuple_2 = module_0.decode(float_0)
    except BaseException:
        pass

def test_case_2():
    try:
        byte_string_0 = None
        tuple_0 = module_0.decode(byte_string_0)
    except BaseException:
        pass

def test_case_3():
    try:
        tuple_0 = ()
        str_0 = 'b64'
        tuple_1 = module_0.decode(tuple_0, str_0)
        module_0.register()
        str_1 = 'HV4'
        user_string_0 = module_1.UserString(str_1)
        str_2 = ' '
        tuple_2 = module_0.encode(str_1, str_2)
    except BaseException:
        pass

def test_case_4():
    try:
        module_0.register()
        module_0.register()
        str_0 = 'H\x0b@JD1%b,2,0!'
        tuple_0 = module_0.encode(str_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'b64'
        var_0 = module_2.getdecoder(str_0)
        module_0.register()
        str_1 = 'Xb64'
        var_1 = module_2.getdecoder(str_1)
    except BaseException:
        pass