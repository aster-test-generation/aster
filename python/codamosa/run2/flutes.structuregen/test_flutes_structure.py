# Automatically generated by Pynguin.
import flutes.structure as module_0

def test_case_0():
    pass

def test_case_1():
    dict_0 = {}
    list_0 = module_0.reverse_map(dict_0)

def test_case_2():
    float_0 = 594.445
    module_0.register_no_map_class(float_0)

def test_case_3():
    dict_0 = {}
    list_0 = [dict_0, dict_0, dict_0]
    tuple_0 = (list_0,)
    var_0 = module_0.map_structure(dict_0, tuple_0)

def test_case_4():
    bytes_0 = b'\x83\x05g.U\xf2J5mu\xa6zrp\x9d\xa6\x15\xe7\x0e\xd6'
    tuple_0 = ()
    var_0 = module_0.map_structure(bytes_0, tuple_0)

def test_case_5():
    dict_0 = {}
    var_0 = module_0.map_structure(dict_0, dict_0)

def test_case_6():
    dict_0 = {}
    int_0 = -2957
    list_0 = [dict_0, dict_0]
    tuple_0 = (list_0,)
    var_0 = module_0.map_structure_zip(int_0, tuple_0)
    var_1 = module_0.map_structure(dict_0, dict_0)

def test_case_7():
    int_0 = 1
    int_1 = -16
    int_2 = 3
    int_3 = [int_2]
    int_4 = -13
    int_5 = (int_4, int_0)
    int_6 = [int_1, int_3, int_5]
    int_7 = [int_2, int_0, int_6]
    int_8 = [int_1, int_3, int_7]
    int_9 = [int_1, int_0, int_8]
    var_0 = lambda x, y: x + y
    int_10 = (int_7, int_9)
    var_1 = module_0.map_structure_zip(var_0, int_10)