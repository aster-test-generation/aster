# Automatically generated by Pynguin.
import types as module_0
import flutils.namedtupleutils as module_1
import collections as module_2

def test_case_0():
    simple_namespace_0 = module_0.SimpleNamespace()
    var_0 = module_1.to_namedtuple(simple_namespace_0)

def test_case_1():
    int_0 = 1293
    tuple_0 = (int_0,)
    tuple_1 = (tuple_0,)
    var_0 = module_1.to_namedtuple(tuple_1)
    simple_namespace_0 = module_0.SimpleNamespace()
    var_1 = module_1.to_namedtuple(simple_namespace_0)

def test_case_2():
    str_0 = 'directory_present'
    str_1 = 'a\x0b<,JRN;&'
    dict_0 = {str_0: str_0, str_0: str_0, str_1: str_0}
    list_0 = [dict_0, str_0]
    var_0 = module_1.to_namedtuple(list_0)

def test_case_3():
    str_0 = 'Zl'
    bytes_0 = b'\xadtX\xc1<\xb5z\xe6\x9b25'
    dict_0 = {str_0: str_0, str_0: bytes_0}
    var_0 = module_1.to_namedtuple(dict_0)
    list_0 = [bytes_0, bytes_0, var_0, dict_0]
    var_1 = module_1.to_namedtuple(list_0)

def test_case_4():
    int_0 = 1
    int_1 = [int_0]
    int_2 = 2
    int_3 = [int_2]
    int_4 = 3
    int_5 = [int_4]
    ordered_dict_0 = module_2.OrderedDict()
    list_0 = []
    tuple_0 = (ordered_dict_0, int_4, list_0)
    var_0 = module_1.to_namedtuple(tuple_0)
    int_6 = [int_1, int_3, int_5]
    var_1 = module_1.to_namedtuple(int_6)
    var_2 = len(var_1)
    str_0 = '__iter__'
    var_3 = hasattr(var_1, str_0)