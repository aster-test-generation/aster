# Automatically generated by Pynguin.
import pymonet.lazy as module_0

def test_case_0():
    try:
        bool_0 = False
        lazy_0 = module_0.Lazy(bool_0)
        var_0 = lazy_0.to_either()
    except BaseException:
        pass

def test_case_1():
    try:
        str_0 = '\t\\+G}&'
        lazy_0 = module_0.Lazy(str_0)
        var_0 = lazy_0.to_box()
    except BaseException:
        pass

def test_case_2():
    try:
        str_0 = '_:'
        lazy_0 = module_0.Lazy(str_0)
        var_0 = lazy_0.to_maybe()
    except BaseException:
        pass

def test_case_3():
    try:
        float_0 = -272.0
        lazy_0 = module_0.Lazy(float_0)
        var_0 = lazy_0.to_validation()
    except BaseException:
        pass