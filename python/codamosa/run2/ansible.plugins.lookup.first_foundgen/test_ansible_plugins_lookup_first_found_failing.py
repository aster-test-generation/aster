# Automatically generated by Pynguin.
import ansible.plugins.lookup.first_found as module_0

def test_case_0():
    try:
        lookup_module_0 = module_0.LookupModule()
        list_0 = [lookup_module_0]
        tuple_0 = ()
        var_0 = lookup_module_0.run(list_0, tuple_0)
    except BaseException:
        pass

def test_case_1():
    try:
        tuple_0 = ()
        lookup_module_0 = module_0.LookupModule()
        var_0 = lookup_module_0.run(tuple_0, tuple_0)
    except BaseException:
        pass

def test_case_2():
    try:
        list_0 = []
        str_0 = 'apk'
        tuple_0 = (list_0, str_0, str_0)
        dict_0 = {str_0: str_0}
        lookup_module_0 = module_0.LookupModule(**dict_0)
        var_0 = lookup_module_0.run(tuple_0, dict_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bytes_0 = b''
        complex_0 = None
        str_0 = ': %s'
        dict_0 = {str_0: complex_0}
        lookup_module_0 = module_0.LookupModule(**dict_0)
        dict_1 = {lookup_module_0: lookup_module_0}
        list_0 = [bytes_0, dict_1]
        var_0 = lookup_module_0.run(list_0, dict_0)
    except BaseException:
        pass