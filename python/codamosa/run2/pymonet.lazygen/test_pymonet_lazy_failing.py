# Automatically generated by Pynguin.
import pymonet.lazy as module_0

def test_case_0():
    try:
        bytes_0 = b'\x9c\xee(\xa0?\x81\x068M\xab\t\xe1F\xe9'
        lazy_0 = module_0.Lazy(bytes_0)
        var_0 = lazy_0.to_maybe()
    except BaseException:
        pass

def test_case_1():
    try:
        set_0 = set()
        lazy_0 = module_0.Lazy(set_0)
        var_0 = lazy_0.to_box()
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = True
        lazy_0 = module_0.Lazy(bool_0)
        var_0 = lazy_0.to_either()
    except BaseException:
        pass

def test_case_3():
    try:
        str_0 = '62>g{$07'
        lazy_0 = module_0.Lazy(str_0)
        var_0 = lazy_0.to_validation()
    except BaseException:
        pass