# Automatically generated by Pynguin.
import ansible.plugins.filter.urls as module_0

def test_case_0():
    try:
        bool_0 = True
        var_0 = module_0.unicode_urlencode(bool_0)
    except BaseException:
        pass

def test_case_1():
    try:
        filter_module_0 = module_0.FilterModule()
        var_0 = module_0.unicode_urlencode(filter_module_0, filter_module_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = False
        var_0 = module_0.do_urlencode(bool_0)
    except BaseException:
        pass

def test_case_3():
    try:
        dict_0 = {}
        var_0 = module_0.do_urlencode(dict_0)
        str_0 = ':88"l*\x0bwE\x0cOR'
        var_1 = module_0.unicode_urldecode(str_0)
        bytes_0 = None
        var_2 = module_0.unicode_urlencode(dict_0, bytes_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '_ansible_notify'
        str_1 = '%s is not a directory'
        str_2 = '(jU1`BK0a}e"GY+'
        dict_0 = {str_0: str_0, str_1: str_0, str_2: str_0}
        var_0 = module_0.do_urlencode(dict_0)
        filter_module_0 = module_0.FilterModule()
        var_1 = filter_module_0.filters()
        bytes_0 = b'\x91\x89=\xc1XA'
        var_2 = filter_module_0.filters()
        var_3 = module_0.unicode_urldecode(bytes_0)
    except BaseException:
        pass

def test_case_5():
    try:
        str_0 = '0EnUYQs,nT~$Y'
        var_0 = module_0.do_urlencode(str_0)
        filter_module_0 = module_0.FilterModule()
        var_1 = filter_module_0.filters()
        bytes_0 = b'tT4J\xaeb'
        int_0 = None
        var_2 = filter_module_0.filters()
        tuple_0 = (bytes_0, int_0)
        var_3 = module_0.do_urlencode(tuple_0)
    except BaseException:
        pass