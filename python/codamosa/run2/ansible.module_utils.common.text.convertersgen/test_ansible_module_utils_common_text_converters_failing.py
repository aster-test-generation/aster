# Automatically generated by Pynguin.
import ansible.module_utils.common.text.converters as module_0

def test_case_0():
    try:
        int_0 = 934
        bool_0 = False
        var_0 = module_0.to_bytes(int_0, bool_0)
    except BaseException:
        pass

def test_case_1():
    try:
        float_0 = 2032.1
        str_0 = '0k5ppSmO;'
        list_0 = [float_0, float_0, float_0, str_0]
        dict_0 = {float_0: list_0}
        list_1 = [list_0, list_0, str_0]
        var_0 = module_0.container_to_text(dict_0, list_1)
        list_2 = None
        var_1 = module_0.container_to_bytes(list_2, list_2)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = b"\xde\xe6J-\xf0\xfcx\xa2'"
        set_0 = {bytes_0, bytes_0}
        var_0 = module_0.jsonify(set_0)
    except BaseException:
        pass

def test_case_3():
    try:
        list_0 = []
        int_0 = -203
        bytes_0 = b'\xe7\xfe\xcbk\x95\x8d\xbc\xca\xa6\x16\xad\x9ft\xf3'
        float_0 = -1750.63462
        var_0 = module_0.to_text(list_0, int_0, bytes_0, float_0)
    except BaseException:
        pass

def test_case_4():
    try:
        tuple_0 = None
        str_0 = 'JSd'
        bytes_0 = b'\xc7^y\xa7w\xdf\x1b{\x97/\xba/\x8b\xb7'
        list_0 = [str_0]
        var_0 = module_0.to_bytes(tuple_0, str_0, bytes_0, list_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = 'string'
        var_0 = module_0.to_bytes(str_0)
        var_1 = module_0.to_bytes(str_0)
        var_2 = module_0.to_bytes(str_0)
        var_3 = module_0.to_bytes(str_0)
        str_1 = 'string\ud800'
        str_2 = 'utf-8'
        str_3 = 'strict'
        var_4 = module_0.to_bytes(str_1, str_2, str_3)
    except BaseException:
        pass

def test_case_6():
    try:
        bytes_0 = b'string'
        var_0 = module_0.to_bytes(bytes_0)
        var_1 = module_0.to_bytes(bytes_0)
        str_0 = 'string'
        var_2 = module_0.to_bytes(str_0)
        var_3 = module_0.to_bytes(str_0)
        var_4 = module_0.to_bytes(str_0)
        var_5 = module_0.to_bytes(str_0)
        str_1 = 'string\ud800'
        var_6 = module_0.to_bytes(str_1)
    except BaseException:
        pass