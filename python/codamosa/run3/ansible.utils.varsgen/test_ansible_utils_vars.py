# Automatically generated by Pynguin.
import ansible.utils.vars as module_0

def test_case_0():
    pass

def test_case_1():
    var_0 = module_0.get_unique_id()

def test_case_2():
    bool_0 = False
    var_0 = module_0.load_extra_vars(bool_0)

def test_case_3():
    str_0 = '.OR\x0cZ%uRH:W42N;W?'
    var_0 = module_0.load_options_vars(str_0)

def test_case_4():
    dict_0 = None
    var_0 = module_0.load_options_vars(dict_0)

def test_case_5():
    str_0 = 'C;'
    var_0 = module_0._isidentifier_PY3(str_0)

def test_case_6():
    float_0 = -3022.2
    var_0 = module_0._isidentifier_PY3(float_0)
    str_0 = 'BJWJz>'
    var_1 = module_0._isidentifier_PY3(str_0)

def test_case_7():
    str_0 = "^uWS@Q'C^}o09z,"
    str_1 = 'replace'
    var_0 = module_0._isidentifier_PY3(str_1)
    list_0 = [str_0, str_0]
    var_1 = module_0._isidentifier_PY3(list_0)
    var_2 = module_0.get_unique_id()
    int_0 = None
    var_3 = module_0.load_options_vars(int_0)
    float_0 = 1.0
    var_4 = module_0.load_options_vars(float_0)
    int_1 = -3010
    set_0 = set()
    var_5 = module_0.load_extra_vars(set_0)
    var_6 = module_0.get_unique_id()
    var_7 = module_0.load_options_vars(int_1)
    bytes_0 = b'\xb3\xb3\x1a\xa4\x92C]'
    bool_0 = False
    var_8 = module_0.load_options_vars(bool_0)
    var_9 = module_0._isidentifier_PY3(bytes_0)
    bool_1 = False
    str_2 = '_#=R_f'
    var_10 = module_0._isidentifier_PY3(str_2)
    var_11 = module_0.load_extra_vars(set_0)
    dict_0 = {var_2: var_5}
    var_12 = module_0.combine_vars(dict_0, var_8, bool_1)

def test_case_8():
    str_0 = 'd9H'
    var_0 = module_0._isidentifier_PY3(str_0)
    var_1 = module_0.get_unique_id()

def test_case_9():
    str_0 = 'c'
    str_1 = 's'
    int_0 = 3
    int_1 = 2
    int_2 = {str_1: str_1, str_1: int_0, str_0: int_0, str_1: int_1}
    int_3 = 1
    int_4 = {str_0: int_3, str_1: int_0}
    var_0 = module_0.merge_hash(int_2, int_4)

def test_case_10():
    str_0 = 'a'
    int_0 = 1
    int_1 = {str_0: int_0}
    int_2 = {str_0: int_1}
    str_1 = 'c'
    int_3 = {str_1: int_2}
    int_4 = {str_0: int_3}
    var_0 = module_0.merge_hash(int_2, int_4)

def test_case_11():
    str_0 = 'a'
    int_0 = 1
    int_1 = {str_0: int_0}
    var_0 = module_0.merge_hash(int_1, int_1)
    int_2 = {str_0: int_1}
    int_3 = {str_0: int_2}
    var_1 = module_0.merge_hash(int_2, int_3)

def test_case_12():
    str_0 = 'b'
    int_0 = {}
    int_1 = {str_0: int_0}
    int_2 = [int_0]
    int_3 = {str_0: int_2}
    int_4 = [int_3]
    int_5 = {str_0: int_4}
    var_0 = module_0.merge_hash(int_3, int_5)
    str_1 = 'd'
    int_6 = {str_1: int_0}
    int_7 = {str_1: int_0, str_0: int_6}
    var_1 = module_0.merge_hash(int_1, int_7)

def test_case_13():
    str_0 = '€hello'
    var_0 = module_0._isidentifier_PY3(str_0)

def test_case_14():
    int_0 = 1
    int_1 = 2
    int_2 = {int_0: int_0, int_1: int_1}
    int_3 = 3
    int_4 = {int_3: int_3}
    var_0 = module_0.merge_hash(int_2, int_4)
    int_5 = {int_0: int_0, int_1: int_1}
    int_6 = {int_3: int_3}
    bool_0 = False
    var_1 = module_0.merge_hash(int_5, int_6, bool_0)
    int_7 = {int_0: int_0, int_1: int_1}
    int_8 = {int_1: int_3}
    var_2 = module_0.merge_hash(int_7, int_8, bool_0)
    int_9 = {int_0: int_0, int_1: int_1}
    int_10 = {int_1: int_3}
    bool_1 = True
    var_3 = module_0.merge_hash(int_9, int_10, bool_1)

def test_case_15():
    str_0 = 'a'
    int_0 = 1
    int_1 = {str_0: int_0}
    int_2 = {str_0: int_0}
    var_0 = module_0.merge_hash(int_1, int_2)
    int_3 = {str_0: int_0}
    int_4 = {str_0: int_3}
    var_1 = module_0.load_extra_vars(int_4)
    str_1 = '{e=%'
    var_2 = module_0._isidentifier_PY3(str_1)
    var_3 = module_0.merge_hash(int_3, int_4)
    int_5 = {str_0: int_2}
    var_4 = module_0.merge_hash(int_5, int_1)

def test_case_16():
    str_0 = 'openstack'
    var_0 = module_0._isidentifier_PY3(str_0)
    str_1 = 'openstack-abc'
    var_1 = module_0._isidentifier_PY3(str_1)
    str_2 = 'openstack_abc'
    var_2 = module_0._isidentifier_PY3(str_2)
    str_3 = 'True'
    var_3 = module_0._isidentifier_PY3(str_3)
    str_4 = 'False'
    var_4 = module_0._isidentifier_PY3(str_4)
    str_5 = 'None'
    var_5 = module_0._isidentifier_PY3(str_5)
    str_6 = ''
    var_6 = module_0._isidentifier_PY3(str_6)
    str_7 = '1openstack'
    var_7 = module_0._isidentifier_PY3(str_7)
    str_8 = 'openstack1'
    var_8 = module_0._isidentifier_PY3(str_8)
    str_9 = '1openstack1'
    var_9 = module_0._isidentifier_PY3(str_9)
    str_10 = 'openstack-1'
    var_10 = module_0._isidentifier_PY3(str_10)
    str_11 = 'openstack_1'
    var_11 = module_0._isidentifier_PY3(str_11)
    str_12 = '1_openstack'
    var_12 = module_0._isidentifier_PY3(str_12)
    str_13 = 'openstack_1abc'
    var_13 = module_0._isidentifier_PY3(str_13)
    str_14 = 'openstack_1_abc'
    var_14 = module_0._isidentifier_PY3(str_14)

def test_case_17():
    str_0 = 'a'
    str_1 = 'b'
    str_2 = {str_0: str_1}
    str_3 = 'c'
    str_4 = 'd'
    str_5 = [str_3, str_4]
    str_6 = {str_0: str_5}
    bool_0 = True
    str_7 = 'append_rp'
    var_0 = module_0.merge_hash(str_2, str_6, bool_0, str_7)
    str_8 = [str_3, str_4]
    str_9 = {str_0: str_8}
    str_10 = {str_0: str_1}
    str_11 = 'prepend_rp'
    var_1 = module_0.merge_hash(str_9, str_10, bool_0, str_11)
    str_12 = {str_1: str_3}
    str_13 = {str_0: str_12}
    str_14 = 'e'
    var_2 = module_0.merge_hash(str_13, str_10, bool_0)
    str_15 = {str_1: str_3}
    str_16 = {str_0: str_15}
    str_17 = {str_1: str_14}
    str_18 = {str_0: str_17}
    var_3 = module_0.merge_hash(str_16, str_18, bool_0)