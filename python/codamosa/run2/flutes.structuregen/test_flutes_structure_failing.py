# Automatically generated by Pynguin.
import flutes.structure as module_0

def test_case_0():
    try:
        bool_0 = False
        var_0 = module_0.no_map_instance(bool_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bool_0 = False
        bytes_0 = b'b\xc2\x8c'
        list_0 = [bool_0, bool_0, bytes_0]
        var_0 = module_0.no_map_instance(list_0)
        var_1 = module_0.map_structure(bool_0, bytes_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = False
        bytes_0 = b'b\xc2\x8c'
        list_0 = [bool_0, bool_0, bytes_0]
        var_0 = module_0.no_map_instance(list_0)
        list_1 = []
        set_0 = set()
        complex_0 = None
        tuple_0 = (set_0, complex_0, complex_0)
        var_1 = module_0.map_structure(list_1, tuple_0)
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = ']:z"XI;j-&%\\U!!{gG'
        var_0 = module_0.map_structure_zip(str_0, str_0)
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '!V!$Ak7.]=BSV83p#\rv;'
        bool_0 = True
        int_0 = 999
        var_0 = None
        list_0 = [str_0, bool_0, int_0, var_0]
        int_1 = 1225
        int_2 = 1821
        dict_0 = {var_0: int_1, var_0: int_2}
        list_1 = module_0.reverse_map(dict_0)
        bytes_0 = b'\x95\x19\xff<\x81\xcc\xefER@'
        var_1 = module_0.map_structure_zip(list_0, bytes_0)
    except BaseException:
        pass

def test_case_5():
    try:
        float_0 = -849.68
        module_0.register_no_map_class(float_0)
        dict_0 = None
        set_0 = {float_0}
        var_0 = module_0.map_structure(dict_0, set_0)
    except BaseException:
        pass

def test_case_6():
    try:
        bytes_0 = b'}b[C\x91\x827%&\xf0b\x18%g\xb2'
        int_0 = -1184
        dict_0 = {bytes_0: int_0, bytes_0: bytes_0}
        tuple_0 = (dict_0,)
        var_0 = module_0.map_structure_zip(tuple_0, tuple_0)
    except BaseException:
        pass

def test_case_7():
    try:
        bool_0 = False
        list_0 = [bool_0, bool_0]
        var_0 = module_0.no_map_instance(list_0)
        dict_0 = {bool_0: bool_0}
        var_1 = module_0.map_structure(bool_0, dict_0)
    except BaseException:
        pass

def test_case_8():
    try:
        tuple_0 = ()
        list_0 = None
        tuple_1 = (tuple_0, list_0)
        var_0 = module_0.map_structure_zip(tuple_0, tuple_1)
    except BaseException:
        pass

def test_case_9():
    try:
        int_0 = 1
        int_1 = -16
        int_2 = 3
        int_3 = [int_2]
        int_4 = -13
        int_5 = (int_4, int_0)
        int_6 = [int_2, int_0, int_5]
        int_7 = [int_1, int_3, int_6]
        int_8 = [int_1, int_0, int_7]
        var_0 = lambda x, y: x + y
        int_9 = (int_6, int_8)
        var_1 = module_0.map_structure_zip(var_0, int_9)
    except BaseException:
        pass

def test_case_10():
    try:
        dict_0 = {}
        var_0 = None
        list_0 = [dict_0, var_0, var_0]
        var_1 = module_0.no_map_instance(list_0)
        int_0 = -2974
        list_1 = [var_1, list_0, dict_0, dict_0]
        int_1 = 151
        dict_1 = {var_0: int_1, var_0: int_1}
        list_2 = module_0.reverse_map(dict_1)
        bytes_0 = b'm\xd5gK\xe8\xa9\x04\x96(\xb5\x01\xc1\xa7_\x06\x80'
        module_0.register_no_map_class(bytes_0)
        tuple_0 = (list_1,)
        var_2 = module_0.map_structure_zip(int_0, tuple_0)
    except BaseException:
        pass

def test_case_11():
    try:
        dict_0 = {}
        var_0 = None
        list_0 = [dict_0, var_0, var_0]
        var_1 = module_0.no_map_instance(list_0)
        int_0 = -2974
        list_1 = [dict_0, dict_0]
        int_1 = -3384
        dict_1 = {var_0: int_1, var_0: int_1}
        list_2 = module_0.reverse_map(dict_1)
        tuple_0 = (list_1,)
        var_2 = module_0.map_structure_zip(int_0, tuple_0)
        var_3 = module_0.map_structure(dict_1, var_1)
    except BaseException:
        pass

def test_case_12():
    try:
        var_0 = None
        int_0 = 32768
        str_0 = 'kill_proc_tree'
        var_1 = module_0.no_map_instance(str_0)
        dict_0 = {var_0: int_0}
        list_0 = module_0.reverse_map(dict_0)
        int_1 = -3844
        int_2 = 2372
        set_0 = {int_1, int_2, int_2}
        float_0 = 0.0
        list_1 = [set_0, int_0, list_0, float_0]
        var_2 = module_0.no_map_instance(list_0)
        var_3 = module_0.map_structure_zip(float_0, list_1)
    except BaseException:
        pass