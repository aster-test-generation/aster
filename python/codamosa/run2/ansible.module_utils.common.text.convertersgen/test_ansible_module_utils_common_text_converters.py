# Automatically generated by Pynguin.
import ansible.module_utils.common.text.converters as module_0

def test_case_0():
    pass

def test_case_1():
    list_0 = []
    var_0 = module_0.to_bytes(list_0)

def test_case_2():
    bytes_0 = b'2:\x96'
    bool_0 = True
    var_0 = module_0.to_bytes(bytes_0, bool_0)
    var_1 = module_0.to_bytes(bool_0)

def test_case_3():
    float_0 = None
    var_0 = module_0.to_text(float_0)

def test_case_4():
    bytes_0 = b"\xde\xe6J-\xf0\xfcx\xa2'"
    var_0 = module_0.to_text(bytes_0)

def test_case_5():
    str_0 = '\x0b7DY\tp%i@O.2dZ'
    var_0 = module_0.jsonify(str_0)

def test_case_6():
    dict_0 = {}
    bool_0 = False
    var_0 = module_0.container_to_bytes(dict_0, bool_0)
    int_0 = 2018
    var_1 = module_0.to_text(int_0)

def test_case_7():
    str_0 = 'vX?H'
    tuple_0 = ()
    dict_0 = {str_0: tuple_0, str_0: tuple_0}
    var_0 = module_0.container_to_bytes(dict_0)
    var_1 = module_0.jsonify(tuple_0)
    var_2 = module_0.container_to_text(str_0)

def test_case_8():
    bytes_0 = b'\x16\xb8O'
    list_0 = [bytes_0]
    float_0 = 60.0
    tuple_0 = (float_0, float_0, list_0)
    var_0 = module_0.to_text(tuple_0)
    var_1 = module_0.container_to_bytes(list_0)

def test_case_9():
    str_0 = 'hl('
    var_0 = module_0.container_to_bytes(str_0)

def test_case_10():
    str_0 = 'vX?H'
    var_0 = module_0.container_to_text(str_0)

def test_case_11():
    bytes_0 = b'\x02'
    var_0 = module_0.container_to_text(bytes_0)

def test_case_12():
    str_0 = 'simplerepr'
    int_0 = -3897
    set_0 = {int_0}
    dict_0 = {}
    tuple_0 = None
    str_1 = '>+K0$5i'
    tuple_1 = (set_0, dict_0, tuple_0, str_1)
    var_0 = module_0.jsonify(tuple_1)
    dict_1 = {}
    var_1 = module_0.to_text(str_0, int_0, dict_1)

def test_case_13():
    list_0 = []
    var_0 = module_0.jsonify(list_0)

def test_case_14():
    tuple_0 = ()
    var_0 = module_0.jsonify(tuple_0)

def test_case_15():
    dict_0 = {}
    bool_0 = False
    var_0 = module_0.container_to_bytes(dict_0, bool_0)
    list_0 = [dict_0, bool_0, bool_0]
    float_0 = -279.15
    str_0 = 'h/8Jr9AU->rPY'
    var_1 = module_0.to_text(list_0, float_0, str_0)
    int_0 = 2018
    var_2 = module_0.to_text(int_0)

def test_case_16():
    int_0 = None
    var_0 = module_0.container_to_text(int_0)
    list_0 = []
    list_1 = [list_0, list_0]
    var_1 = module_0.jsonify(list_1)
    list_2 = []
    var_2 = module_0.container_to_bytes(list_2)

def test_case_17():
    set_0 = set()
    var_0 = module_0.jsonify(set_0)

def test_case_18():
    bytes_0 = b''
    var_0 = module_0.to_bytes(bytes_0)
    bytes_1 = b'abc'
    var_1 = module_0.to_bytes(bytes_1)
    str_0 = ''
    var_2 = module_0.to_bytes(str_0)
    str_1 = 'abc'
    var_3 = module_0.to_bytes(str_1)
    str_2 = 'abc 🐉'
    var_4 = module_0.to_bytes(str_2)
    str_3 = '\udce9\udc9c'
    var_5 = module_0.to_bytes(str_3)
    str_4 = 'utf-16'
    var_6 = module_0.to_bytes(str_3, str_4)
    str_5 = 'utf-16-be'
    var_7 = module_0.to_bytes(str_3, str_5)