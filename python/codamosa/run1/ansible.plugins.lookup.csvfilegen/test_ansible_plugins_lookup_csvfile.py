# Automatically generated by Pynguin.
import ansible.plugins.lookup.csvfile as module_0

def test_case_0():
    pass

def test_case_1():
    bool_0 = False
    c_s_v_recoder_0 = module_0.CSVRecoder(bool_0)

def test_case_2():
    bool_0 = False
    c_s_v_recoder_0 = module_0.CSVRecoder(bool_0)
    var_0 = c_s_v_recoder_0.__iter__()

def test_case_3():
    str_0 = '/yG}b2Qi)8P<'
    c_s_v_reader_0 = module_0.CSVReader(str_0)

def test_case_4():
    lookup_module_0 = module_0.LookupModule()
    var_0 = None
    str_0 = 'g'
    str_1 = 'utf-8'
    str_2 = 'defaultval'
    int_0 = 1642
    var_1 = lookup_module_0.read_csv(var_0, str_0, str_0, str_1, int_0)

def test_case_5():
    str_0 = '/yG}b2Qi)8P<'
    c_s_v_reader_0 = module_0.CSVReader(str_0)
    var_0 = c_s_v_reader_0.__iter__()