# Automatically generated by Pynguin.
import ansible.modules.iptables as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = '`E\rvO'
    str_1 = 'EQ\n'
    var_0 = module_0.append_tcp_flags(str_1, str_1, str_0)

def test_case_2():
    str_0 = 'C\\UjiO!\\k'
    set_0 = {str_0, str_0}
    str_1 = '}D,EB(#[;,%)W|f\t'
    str_2 = 'ansible.modules.iptables'
    tuple_0 = (str_1, str_2)
    str_3 = 's"!.S\x0cVEkL`;\x0b'
    var_0 = module_0.append_match_flag(set_0, tuple_0, set_0, str_3)

def test_case_3():
    str_0 = '__synthetic__'
    list_0 = [str_0, str_0]
    bool_0 = True
    int_0 = -360
    var_0 = module_0.append_match(list_0, bool_0, int_0)

def test_case_4():
    var_0 = module_0.main()

def test_case_5():
    pass

def test_case_6():
    bytes_0 = b'\xbdE\xb5\xf8\x86\xd8\x8f\x84\x94\x1f\xdc\xe1]\x99\x14"C\xae\xa35'
    str_0 = '__main__'
    float_0 = 26.603962404605202
    bytes_1 = None
    tuple_0 = ()
    var_0 = module_0.append_match(bytes_0, bytes_1, tuple_0)
    int_0 = -1020
    set_0 = set()
    var_1 = module_0.append_match_flag(str_0, float_0, int_0, set_0)
    int_1 = 2009
    bool_0 = None
    tuple_1 = (str_0, int_0)
    var_2 = module_0.append_tcp_flags(bool_0, tuple_1, int_1)

def test_case_7():
    int_0 = 656000
    tuple_0 = ()
    bool_0 = True
    str_0 = "q`r%!,'"
    var_0 = module_0.append_param(int_0, tuple_0, bool_0, str_0)

def test_case_8():
    set_0 = None
    int_0 = 90
    float_0 = None
    dict_0 = {int_0: set_0, float_0: int_0, set_0: float_0, int_0: float_0, int_0: int_0, float_0: float_0, float_0: float_0}
    var_0 = module_0.append_match_flag(set_0, float_0, dict_0, dict_0)
    dict_1 = {}
    var_1 = module_0.append_tcp_flags(dict_0, dict_1, set_0)

def test_case_9():
    var_0 = []
    var_1 = None
    str_0 = '--foo'
    bool_0 = False
    var_2 = module_0.append_match_flag(var_0, var_1, str_0, bool_0)
    var_3 = []
    str_1 = 'match'
    var_4 = module_0.append_match_flag(var_3, str_1, str_0, bool_0)
    var_5 = []
    str_2 = 'negate'
    var_6 = module_0.append_match_flag(var_5, str_2, str_0, bool_0)
    var_7 = []
    bool_1 = True
    var_8 = module_0.append_match_flag(var_7, var_1, str_0, bool_1)
    var_9 = []
    var_10 = module_0.append_match_flag(var_9, str_1, str_0, bool_1)
    var_11 = []
    var_12 = module_0.append_match_flag(var_11, str_2, str_0, bool_1)

def test_case_10():
    var_0 = []
    var_1 = None
    str_0 = '--tcp-flags'
    var_2 = module_0.append_tcp_flags(var_0, var_1, str_0)
    var_3 = []
    var_4 = {}
    str_1 = '--tcp-flags'
    var_5 = module_0.append_tcp_flags(var_3, var_4, str_1)
    str_2 = 'flags'
    var_6 = None
    var_7 = {str_2: var_6}
    str_3 = '--tcp-flags'
    var_8 = module_0.append_tcp_flags(str_3, var_7, str_3)
    var_9 = []
    str_4 = 'flags_set'
    var_10 = {str_4: var_6}
    str_5 = '--tcp-flags'
    var_11 = module_0.append_tcp_flags(var_9, var_10, str_5)