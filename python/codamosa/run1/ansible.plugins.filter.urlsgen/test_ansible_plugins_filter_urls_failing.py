# Automatically generated by Pynguin.
import ansible.plugins.filter.urls as module_0
import urllib.parse as module_1

def test_case_0():
    try:
        bytes_0 = b'q >f\xe5/\xab\xf3\x9b'
        var_0 = module_0.do_urldecode(bytes_0)
    except BaseException:
        pass

def test_case_1():
    try:
        filter_module_0 = module_0.FilterModule()
        var_0 = module_0.unicode_urlencode(filter_module_0)
    except BaseException:
        pass

def test_case_2():
    try:
        float_0 = 0.1
        var_0 = module_0.do_urlencode(float_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bool_0 = True
        tuple_0 = (bool_0,)
        var_0 = module_0.do_urlencode(tuple_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = 'test'
        str_1 = 'test&=()'
        str_2 = 'tesOt'
        str_3 = ".6Tv]T;D<Oo*@v'w"
        dict_0 = {str_1: str_0, str_3: str_2, str_2: str_0, str_2: str_1}
        var_0 = module_0.do_urlencode(dict_0)
        str_4 = 'test&=()'
        var_1 = module_0.unicode_urlencode(str_0)
        bytes_0 = b'/'
        var_2 = module_1.quote(str_2, bytes_0)
        var_3 = module_0.unicode_urlencode(str_1)
        var_4 = module_1.quote_plus(str_4)
        var_5 = module_0.unicode_urldecode(str_0)
        str_5 = None
        var_6 = module_0.do_urlencode(str_5)
    except BaseException:
        pass