# Automatically generated by Pynguin.
import ansible.plugins.lookup.ini as module_0

def test_case_0():
    try:
        lookup_module_0 = module_0.LookupModule()
        string_i_o_0 = None
        var_0 = lookup_module_0.get_value(string_i_o_0, lookup_module_0, string_i_o_0, string_i_o_0)
    except BaseException:
        pass

def test_case_1():
    try:
        lookup_module_0 = module_0.LookupModule()
        bytes_0 = b'\x0f\x8c\x86\xf5\x9f\xfaCf\xc8\x93\xe4P\xbd\x051\xf7\x93_'
        str_0 = '<`/^T)m'
        dict_0 = {str_0: lookup_module_0}
        list_0 = [bytes_0, str_0, dict_0, str_0]
        var_0 = lookup_module_0.get_value(bytes_0, dict_0, bytes_0, list_0)
    except BaseException:
        pass

def test_case_2():
    try:
        lookup_module_0 = module_0.LookupModule()
        set_0 = {lookup_module_0, lookup_module_0}
        var_0 = lookup_module_0.run(set_0)
    except BaseException:
        pass