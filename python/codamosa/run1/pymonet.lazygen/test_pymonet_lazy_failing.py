# Automatically generated by Pynguin.
import pymonet.lazy as module_0
import builtins as module_1

def test_case_0():
    try:
        dict_0 = {}
        lazy_0 = module_0.Lazy(dict_0)
        str_0 = lazy_0.__str__()
        var_0 = lazy_0.to_maybe()
    except BaseException:
        pass

def test_case_1():
    try:
        object_0 = module_1.object()
        lazy_0 = module_0.Lazy(object_0)
        var_0 = lazy_0.to_validation()
    except BaseException:
        pass

def test_case_2():
    try:
        dict_0 = {}
        lazy_0 = module_0.Lazy(dict_0)
        var_0 = lazy_0.to_box()
    except BaseException:
        pass

def test_case_3():
    try:
        float_0 = 3018.14
        lazy_0 = module_0.Lazy(float_0)
        var_0 = lazy_0.to_either()
    except BaseException:
        pass

def test_case_4():
    try:
        str_0 = '&'
        lazy_0 = module_0.Lazy(str_0)
        var_0 = lazy_0.to_maybe()
    except BaseException:
        pass

def test_case_5():
    try:
        dict_0 = {}
        list_0 = [dict_0, dict_0]
        object_0 = module_1.object()
        lazy_0 = module_0.Lazy(object_0)
        var_0 = lazy_0.to_try(*list_0)
        object_1 = module_1.object(**dict_0)
        bool_0 = lazy_0.__eq__(object_1)
        var_1 = lazy_0.to_validation()
    except BaseException:
        pass