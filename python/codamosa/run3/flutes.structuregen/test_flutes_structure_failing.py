# Automatically generated by Pynguin.
import flutes.structure as module_0

def test_case_0():
    try:
        dict_0 = None
        list_0 = module_0.reverse_map(dict_0)
    except BaseException:
        pass

def test_case_1():
    try:
        bool_0 = None
        float_0 = -1495.0
        list_0 = []
        var_0 = module_0.map_structure(float_0, list_0)
        bytes_0 = b'\xb7\xac\x02\xf56\x16b\x12\x9f>\xbb\x92'
        var_1 = module_0.no_map_instance(bytes_0)
        var_2 = module_0.no_map_instance(bool_0)
    except BaseException:
        pass

def test_case_2():
    try:
        int_0 = None
        bytes_0 = b'&'
        str_0 = '-{c,\x0bFrOh$xU'
        tuple_0 = ()
        str_1 = 'Q<n|E,BkB-jEs'
        set_0 = {tuple_0}
        list_0 = [str_0, tuple_0, str_1, set_0]
        var_0 = module_0.no_map_instance(list_0)
        dict_0 = {}
        list_1 = module_0.reverse_map(dict_0)
        var_1 = module_0.map_structure_zip(int_0, bytes_0)
    except BaseException:
        pass

def test_case_3():
    try:
        bool_0 = True
        set_0 = {bool_0, bool_0, bool_0, bool_0}
        var_0 = module_0.map_structure(bool_0, set_0)
    except BaseException:
        pass

def test_case_4():
    try:
        int_0 = None
        float_0 = None
        var_0 = module_0.map_structure(int_0, float_0)
    except BaseException:
        pass

def test_case_5():
    try:
        bool_0 = None
        set_0 = {bool_0}
        var_0 = module_0.no_map_instance(set_0)
        bool_1 = None
        float_0 = 1655.7495
        module_0.register_no_map_class(float_0)
        list_0 = [set_0, bool_0, bool_1]
        float_1 = -1495.0
        list_1 = []
        var_1 = module_0.map_structure(float_1, list_1)
        str_0 = 'pi+N_m^42L*8tj;'
        list_2 = [list_0, str_0]
        var_2 = module_0.map_structure_zip(bool_1, list_2)
    except BaseException:
        pass

def test_case_6():
    try:
        bytes_0 = b'\xd9'
        str_0 = '.~g'
        var_0 = module_0.map_structure_zip(bytes_0, str_0)
    except BaseException:
        pass

def test_case_7():
    try:
        float_0 = 0.1
        list_0 = [float_0, float_0, float_0]
        var_0 = module_0.map_structure(float_0, list_0)
    except BaseException:
        pass

def test_case_8():
    try:
        float_0 = 4097.865
        dict_0 = {float_0: float_0, float_0: float_0, float_0: float_0}
        var_0 = module_0.map_structure(float_0, dict_0)
    except BaseException:
        pass

def test_case_9():
    try:
        set_0 = set()
        var_0 = module_0.map_structure(set_0, set_0)
        str_0 = 'Register a container type as `non-mappable`, i.e., instances of the class will be treated as singleton objects in\n    :func:`map_structure` and :func:`map_structure_zip`, their contents will not be traversed. This would be useful for\n    certain types that subclass built-in container types, such as ``torch.Size``.\n\n    :param container_type: The type of the container, e.g. :py:class:`list`, :py:class:`dict`.\n    '
        tuple_0 = (str_0, set_0)
        var_1 = module_0.no_map_instance(tuple_0)
        float_0 = 3232.14
        int_0 = 287
        var_2 = None
        list_0 = [int_0, var_2]
        var_3 = module_0.map_structure_zip(float_0, list_0)
    except BaseException:
        pass

def test_case_10():
    try:
        str_0 = 'i]J\x0cssQR<8:El>80'
        tuple_0 = (str_0, str_0)
        var_0 = module_0.map_structure(str_0, tuple_0)
    except BaseException:
        pass

def test_case_11():
    try:
        int_0 = 1
        int_1 = 2
        int_2 = 3
        int_3 = [int_0, int_1, int_2]
        var_0 = lambda x: x * int_1
        var_1 = module_0.no_map_instance(int_3)
        var_2 = module_0.map_structure(var_0, var_1)
    except BaseException:
        pass

def test_case_12():
    try:
        list_0 = None
        tuple_0 = ()
        int_0 = -1023
        bool_0 = False
        tuple_1 = (tuple_0, int_0, bool_0)
        var_0 = module_0.map_structure_zip(list_0, tuple_1)
    except BaseException:
        pass

def test_case_13():
    try:
        bool_0 = True
        dict_0 = {bool_0: bool_0}
        str_0 = ',@\n7fIaa\nJ0#.;'
        var_0 = module_0.no_map_instance(str_0)
        list_0 = None
        set_0 = set()
        bytes_0 = b'\xce\x86\xf0DF\xb2\x8f\xd8\x19\r\xa2c\xca\xfdoH\xdfzc'
        tuple_0 = (set_0, bytes_0, set_0)
        float_0 = 632.107
        tuple_1 = (list_0, tuple_0, set_0, float_0)
        list_1 = [dict_0, tuple_1, bytes_0, bytes_0]
        var_1 = module_0.map_structure_zip(dict_0, list_1)
    except BaseException:
        pass

def test_case_14():
    try:
        float_0 = 0.0
        var_0 = module_0.no_map_instance(float_0)
        list_0 = [var_0, var_0]
        var_1 = module_0.map_structure_zip(float_0, list_0)
    except BaseException:
        pass

def test_case_15():
    try:
        str_0 = 'a'
        int_0 = 2
        int_1 = [int_0, int_0, str_0, int_0]
        str_1 = ")'sh7G \n"
        str_2 = ','
        var_0 = lambda *x: x
        dict_0 = {}
        list_0 = module_0.reverse_map(dict_0)
        list_1 = [str_2, int_1]
        var_1 = module_0.no_map_instance(list_1)
        str_3 = [str_0, str_2]
        str_4 = [dict_0, str_1, dict_0, str_2]
        str_5 = (str_3, str_4)
        int_2 = [int_1, int_0]
        int_3 = 41
        int_4 = [int_3, int_3]
        int_5 = (int_2, int_4)
        str_6 = [str_1, str_5]
        dict_1 = {}
        list_2 = module_0.reverse_map(dict_1)
        var_2 = [str_5, int_5, str_6]
        var_3 = lambda *x: x
        var_4 = module_0.map_structure_zip(var_3, var_2)
        bytes_0 = b'fT\xeb\x08#\t\xe2P\rc\x18t '
        list_3 = [var_2, str_1, str_2]
        var_5 = module_0.map_structure(bytes_0, list_3)
    except BaseException:
        pass