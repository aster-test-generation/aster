# Automatically generated by Pynguin.
import ansible.utils.vars as module_0

def test_case_0():
    try:
        tuple_0 = ()
        int_0 = -486
        var_0 = module_0.merge_hash(tuple_0, int_0)
    except BaseException:
        pass

def test_case_1():
    try:
        int_0 = -23
        set_0 = {int_0, int_0, int_0}
        var_0 = module_0.combine_vars(set_0, int_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bytes_0 = None
        float_0 = -2513.82474
        var_0 = module_0.combine_vars(bytes_0, float_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b')\xc4'
        str_0 = '2;S>=5;uu\\'
        int_0 = 3744
        dict_0 = {bytes_0: bytes_0, str_0: bytes_0, int_0: bytes_0, str_0: bytes_0}
        var_0 = module_0.combine_vars(bytes_0, str_0, dict_0)
    except BaseException:
        pass

def test_case_4():
    try:
        int_0 = None
        var_0 = module_0.get_unique_id()
        str_0 = 'aWY\x0b{\n'
        dict_0 = {var_0: int_0, int_0: var_0, int_0: str_0, int_0: var_0}
        var_1 = module_0.load_options_vars(dict_0)
        var_2 = module_0.load_extra_vars(int_0)
        set_0 = set()
        var_3 = module_0.load_options_vars(set_0)
        var_4 = module_0.load_extra_vars(int_0)
        var_5 = module_0.get_unique_id()
        bytes_0 = b'\xe1\xd0y($\x0c\xdf'
        bool_0 = False
        list_0 = None
        var_6 = module_0.merge_hash(bytes_0, bool_0, set_0, list_0)
    except BaseException:
        pass

def test_case_5():
    try:
        float_0 = 3456.0161
        dict_0 = {float_0: float_0, float_0: float_0}
        set_0 = set()
        complex_0 = None
        var_0 = module_0.merge_hash(dict_0, set_0, complex_0)
    except BaseException:
        pass

def test_case_6():
    try:
        str_0 = 'a'
        int_0 = 1
        int_1 = {str_0: int_0}
        int_2 = {str_0: int_0}
        int_3 = {str_0: int_2}
        var_0 = module_0.load_extra_vars(int_3)
        var_1 = module_0._isidentifier_PY3(str_0)
        bytes_0 = b'B\x1b\x11\xb5'
        var_2 = module_0._isidentifier_PY3(bytes_0)
        var_3 = module_0.combine_vars(int_2, int_1)
        set_0 = None
        var_4 = module_0.load_options_vars(set_0)
    except BaseException:
        pass