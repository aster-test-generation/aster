# Automatically generated by Pynguin.
import ansible.module_utils.common.text.converters as module_0
import datetime as module_1

def test_case_0():
    try:
        set_0 = None
        list_0 = [set_0, set_0, set_0, set_0]
        var_0 = module_0.to_bytes(list_0, set_0, set_0)
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = 'ihC56`>i_R\x0cI,p/m__AW'
        dict_0 = {str_0: str_0, str_0: str_0, str_0: str_0}
        list_0 = [dict_0, dict_0]
        tuple_0 = (dict_0, list_0)
        list_1 = [tuple_0, str_0, tuple_0, str_0]
        list_2 = [list_1, list_0]
        var_0 = module_0.container_to_bytes(list_2, dict_0)
    except BaseException:
        pass

def test_case_2():
    try:
        tuple_0 = ()
        int_0 = 32700
        var_0 = module_0.to_text(int_0, int_0, tuple_0)
        var_1 = module_0.container_to_bytes(tuple_0)
        float_0 = -509.9548413940208
        str_0 = 'OpenRC'
        var_2 = module_0.jsonify(str_0)
        bool_0 = False
        var_3 = module_0.to_bytes(float_0, bool_0)
    except BaseException:
        pass

def test_case_3():
    try:
        int_0 = 823
        set_0 = {int_0}
        var_0 = module_0.container_to_bytes(set_0)
        time_0 = module_1.time()
        list_0 = [time_0]
        var_1 = module_0.container_to_text(list_0)
        var_2 = module_0.jsonify(time_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bytes_0 = b'\xa6{\xb3\xc5\x912\xc2\x94\xc3'
        set_0 = {bytes_0, bytes_0, bytes_0}
        list_0 = [set_0, bytes_0, bytes_0, set_0]
        str_0 = '&_'
        dict_0 = {str_0: list_0}
        var_0 = module_0.jsonify(dict_0)
    except BaseException:
        pass

def test_case_5():
    try:
        tuple_0 = ()
        int_0 = 32700
        var_0 = module_0.to_text(int_0, int_0, tuple_0)
        float_0 = -509.9548413940208
        str_0 = 'OpenRC'
        var_1 = module_0.jsonify(str_0)
        bool_0 = False
        var_2 = module_0.to_bytes(float_0, bool_0)
    except BaseException:
        pass

def test_case_6():
    try:
        bool_0 = False
        set_0 = {bool_0, bool_0, bool_0, bool_0}
        var_0 = module_0.jsonify(set_0)
        str_0 = "\ti=Jd8(Fx!h&.'5H"
        var_1 = module_0.container_to_bytes(str_0)
        var_2 = module_0.container_to_bytes(bool_0)
        str_1 = 'jKFkDuaVkc,9/F'
        float_0 = 9.098108332638034
        list_0 = [var_2]
        var_3 = module_0.jsonify(list_0)
        var_4 = module_0.to_bytes(list_0)
        var_5 = module_0.to_text(float_0)
        var_6 = module_0.container_to_text(str_1)
        bool_1 = False
        float_1 = -936.4
        bool_2 = False
        dict_0 = {bool_2: set_0}
        var_7 = module_0.container_to_bytes(dict_0)
        var_8 = module_0.to_text(bool_1, list_0, float_1, bool_1)
    except BaseException:
        pass

def test_case_7():
    try:
        tuple_0 = ()
        int_0 = -2798
        var_0 = module_0.to_text(int_0)
        list_0 = [var_0]
        var_1 = module_0.container_to_bytes(list_0)
        var_2 = module_0.container_to_bytes(tuple_0)
        float_0 = -510.9939829543963
        str_0 = 'OpenRC'
        var_3 = module_0.jsonify(str_0)
        bool_0 = False
        var_4 = module_0.to_bytes(float_0, bool_0)
    except BaseException:
        pass

def test_case_8():
    try:
        time_0 = module_1.time()
        var_0 = module_0.jsonify(time_0)
    except BaseException:
        pass

def test_case_9():
    try:
        bytes_0 = b'\x92^6\x198KY\x9bq9\xd6K\x00\xb1\x12\xe9\xe1\xe2\x85'
        var_0 = module_0.jsonify(bytes_0)
        bool_0 = True
        list_0 = []
        set_0 = None
        str_0 = None
        var_1 = module_0.to_text(bool_0, list_0, set_0, str_0)
    except BaseException:
        pass

def test_case_10():
    try:
        int_0 = None
        str_0 = None
        str_1 = 'L\x0c9AXr,:/@'
        dict_0 = {}
        var_0 = module_0.to_bytes(int_0, str_1, str_0, dict_0)
    except BaseException:
        pass

def test_case_11():
    try:
        str_0 = 'latin-1'
        str_1 = '�'
        str_2 = 'surrogate_or_strict'
        var_0 = module_0.to_bytes(str_1, str_0, str_2)
    except BaseException:
        pass