# Automatically generated by Pynguin.
import ansible.module_utils.common.parameters as module_0

def test_case_0():
    pass

def test_case_1():
    float_0 = None
    bytes_0 = b'\xbb'
    var_0 = module_0.remove_values(float_0, bytes_0)

def test_case_2():
    bytes_0 = b'\xf6\x7f\xe6\x1d'
    list_0 = [bytes_0, bytes_0, bytes_0, bytes_0]
    var_0 = module_0.remove_values(list_0, list_0)

def test_case_3():
    str_0 = '--destination-port'
    str_1 = 'managed'
    str_2 = "w-\x0b}(A3'g)yRnL=~I,.;"
    dict_0 = {str_0: str_0, str_1: str_1, str_1: str_1, str_2: str_1}
    list_0 = [str_1, str_1]
    var_0 = module_0.remove_values(dict_0, list_0)

def test_case_4():
    int_0 = 453
    dict_0 = {int_0: int_0, int_0: int_0}
    var_0 = module_0.remove_values(int_0, dict_0)

def test_case_5():
    str_0 = 'ms\rJ7U,~ '
    dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
    var_0 = module_0.remove_values(str_0, dict_0)

def test_case_6():
    list_0 = None
    list_1 = [list_0, list_0, list_0, list_0]
    str_0 = None
    dict_0 = {str_0: str_0, str_0: str_0}
    var_0 = module_0.sanitize_keys(list_1, dict_0)

def test_case_7():
    bool_0 = True
    dict_0 = {bool_0: bool_0, bool_0: bool_0, bool_0: bool_0}
    var_0 = module_0.sanitize_keys(bool_0, dict_0)

def test_case_8():
    bytes_0 = b'\xf8\xc4\x11\xf5\x06F\xf0V\x11&\x15n*>'
    tuple_0 = ()
    var_0 = module_0.sanitize_keys(bytes_0, tuple_0)

def test_case_9():
    bool_0 = True
    set_0 = {bool_0, bool_0}
    tuple_0 = (set_0,)
    var_0 = module_0.sanitize_keys(tuple_0, tuple_0)
    bytes_0 = b'\xf8\xc4\x11\xf5\x06F\xf0V\x11&\x15n*>'
    tuple_1 = ()
    var_1 = module_0.sanitize_keys(bytes_0, tuple_1)

def test_case_10():
    set_0 = set()
    dict_0 = {}
    var_0 = module_0.sanitize_keys(set_0, dict_0)

def test_case_11():
    str_0 = 'zVG'
    str_1 = '*wBVv6x9'
    dict_0 = {str_0: str_0, str_1: str_1}
    dict_1 = {str_1: dict_0, str_0: dict_0}
    list_0 = [dict_0, dict_0]
    var_0 = module_0.sanitize_keys(dict_0, dict_1, list_0)

def test_case_12():
    dict_0 = {}
    bytes_0 = b'u\n\x13\xad_\xd3hg\x80\xa3'
    bytes_1 = b''
    var_0 = module_0.remove_values(bytes_0, bytes_1)
    var_1 = module_0.remove_values(dict_0, bytes_1)