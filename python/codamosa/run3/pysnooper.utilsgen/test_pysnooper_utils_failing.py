# Automatically generated by Pynguin.
import pysnooper.utils as module_0

def test_case_0():
    try:
        bool_0 = True
        var_0 = module_0.shitcode(bool_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'Lo'
        dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0}
        var_0 = module_0.get_shortish_repr(dict_0, dict_0)
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = 'Lo'
        var_0 = module_0.get_shortish_repr(str_0)
        var_1 = module_0.get_shortish_repr(str_0, str_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = 'Lo'
        var_0 = module_0.normalize_repr(str_0)
        dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0}
        var_1 = module_0.get_shortish_repr(dict_0)
        var_2 = module_0.get_shortish_repr(dict_0, dict_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'g(vi%]%kq'
        list_0 = [str_0]
        bytes_0 = b''
        bytes_1 = b'\xf5\x01\xd2\x15\xda\xef\xb8\xf4t\xa0\xa3Ev}\x0f\xbf'
        var_0 = module_0.get_shortish_repr(list_0, bytes_0, bytes_1)
    except BaseException:
        pass

def test_case_5():
    try:
        set_0 = set()
        var_0 = module_0.ensure_tuple(set_0)
        str_0 = '$o'
        dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0}
        var_1 = module_0.get_shortish_repr(str_0)
        var_2 = module_0.get_shortish_repr(dict_0, dict_0)
    except BaseException:
        pass

def test_case_6():
    try:
        var_0 = lambda x: x
        str_0 = ''
        str_1 = 'hello'
        var_1 = type(str_0)
        int_0 = 5
        var_2 = module_0.ensure_tuple(str_1)
        var_3 = lambda x: int_0
        var_4 = (var_1, var_3)
        var_5 = [var_4]
        var_6 = module_0.get_repr_function(str_1, var_5)
        int_1 = 7
        var_7 = lambda x: int_1
        var_8 = lambda x: int_1
        int_2 = 3
        var_9 = lambda x: int_2
        bytes_0 = b'\xd2J\t\n\xe1\xb1\xee'
        var_10 = module_0.shitcode(bytes_0)
    except BaseException:
        pass

def test_case_7():
    try:
        str_0 = 'Lo'
        var_0 = module_0.normalize_repr(str_0)
        list_0 = [str_0]
        int_0 = None
        var_1 = module_0.truncate(list_0, int_0)
        dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0, str_0: str_0}
        var_2 = module_0.get_shortish_repr(dict_0)
        var_3 = module_0.get_shortish_repr(dict_0, dict_0)
    except BaseException:
        pass