# Automatically generated by Pynguin.
import ansible.plugins.lookup.sequence as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = '\r.+k?u\x0be>"yX\x0c=y{Ww@*'
    lookup_module_0 = module_0.LookupModule(str_0)
    var_0 = lookup_module_0.reset()

def test_case_2():
    lookup_module_0 = module_0.LookupModule()
    str_0 = '0x0a-0x0f/3'
    var_0 = lookup_module_0.parse_simple_args(str_0)

def test_case_3():
    lookup_module_0 = module_0.LookupModule()
    str_0 = '2'
    int_0 = 5
    var_0 = lookup_module_0.run(str_0, int_0)

def test_case_4():
    lookup_module_0 = module_0.LookupModule()
    str_0 = '0xa-0x0f3'
    var_0 = lookup_module_0.parse_simple_args(str_0)

def test_case_5():
    lookup_module_0 = module_0.LookupModule()
    str_0 = 'count=5'
    str_1 = [str_0, str_0, str_0, str_0, str_0, str_0, str_0]
    int_0 = 10
    var_0 = lookup_module_0.run(str_1, int_0)

def test_case_6():
    lookup_module_0 = module_0.LookupModule()
    var_0 = lookup_module_0.reset()
    str_0 = 'format'
    str_1 = '%s'
    str_2 = {str_0: str_1}
    var_1 = lookup_module_0.parse_kv_args(str_2)
    var_2 = lookup_module_0.format