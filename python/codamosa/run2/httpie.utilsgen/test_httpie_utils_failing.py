# Automatically generated by Pynguin.
import httpie.utils as module_0

def test_case_0():
    try:
        bytes_0 = b',\xe6\x11\x03\xcfbK'
        var_0 = module_0.load_json_preserve_order(bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '--cert-key'
        str_1 = ',tB-9.Cfp\rz='
        str_2 = ''
        dict_0 = {str_0: str_0, str_1: str_0, str_2: str_0}
        var_0 = module_0.humanize_bytes(dict_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = None
        var_0 = module_0.get_content_type(bool_0)
    except BaseException:
        pass

def test_case_3():
    try:
        float_0 = -2823.42
        set_0 = {float_0, float_0}
        var_0 = module_0.humanize_bytes(float_0, set_0)
    except BaseException:
        pass

def test_case_4():
    try:
        int_0 = 1048576
        var_0 = module_0.humanize_bytes(int_0)
        explicit_null_auth_0 = module_0.ExplicitNullAuth()
    except BaseException:
        pass