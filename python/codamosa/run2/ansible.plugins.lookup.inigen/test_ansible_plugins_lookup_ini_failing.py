# Automatically generated by Pynguin.
import ansible.plugins.lookup.ini as module_0

def test_case_0():
    try:
        str_0 = 'user'
        bool_0 = False
        lookup_module_0 = module_0.LookupModule()
        var_0 = lookup_module_0.get_value(str_0, str_0, str_0, bool_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'L^'
        bytes_0 = b'\xd5\x08\xcb];\x9e\x10\xf6\x99yR\xf6\xce\xa81f\x16'
        bool_0 = False
        set_0 = {bool_0, bytes_0, str_0, bytes_0}
        lookup_module_0 = module_0.LookupModule()
        var_0 = lookup_module_0.get_value(str_0, bytes_0, bool_0, set_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = False
        lookup_module_0 = module_0.LookupModule()
        var_0 = lookup_module_0.run(bool_0)
    except BaseException:
        pass