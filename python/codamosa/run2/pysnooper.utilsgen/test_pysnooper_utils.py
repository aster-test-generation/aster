# Automatically generated by Pynguin.
import pysnooper.utils as module_0

def test_case_0():
    pass

def test_case_1():
    str_0 = '`\rC(_yV?\\'
    var_0 = module_0.shitcode(str_0)

def test_case_2():
    dict_0 = {}
    list_0 = [dict_0, dict_0]
    var_0 = module_0.get_shortish_repr(list_0)

def test_case_3():
    dict_0 = {}
    list_0 = [dict_0, dict_0]
    var_0 = module_0.get_shortish_repr(list_0)
    int_0 = 2
    complex_0 = None
    tuple_0 = (int_0, complex_0)
    bool_0 = True
    var_1 = module_0.truncate(tuple_0, bool_0)

def test_case_4():
    str_0 = '`\rC(_yV?\\'
    var_0 = module_0.shitcode(str_0)
    float_0 = 1033.5
    list_0 = [float_0, float_0, float_0]
    dict_0 = {}
    var_1 = module_0.get_repr_function(list_0, dict_0)
    list_1 = []
    var_2 = module_0.ensure_tuple(list_1)

def test_case_5():
    bool_0 = False
    var_0 = module_0.ensure_tuple(bool_0)
    str_0 = ',YrciM\\Uif&r1]Gyp2J:'
    var_1 = module_0.ensure_tuple(str_0)
    dict_0 = {}
    list_0 = [dict_0, dict_0]
    var_2 = module_0.get_shortish_repr(list_0)

def test_case_6():
    dict_0 = None
    var_0 = module_0.ensure_tuple(dict_0)
    dict_1 = {}
    list_0 = [dict_1, dict_1]
    var_1 = module_0.get_shortish_repr(list_0)

def test_case_7():
    str_0 = 'א'
    var_0 = module_0.shitcode(str_0)