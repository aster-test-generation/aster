# Automatically generated by Pynguin.
import builtins as module_0
import pymonet.lazy as module_1

def test_case_0():
    pass

def test_case_1():
    object_0 = module_0.object()
    lazy_0 = module_1.Lazy(object_0)

def test_case_2():
    callable_0 = None
    lazy_0 = module_1.Lazy(callable_0)
    str_0 = '7'
    list_0 = [str_0, str_0, str_0]
    lazy_1 = module_1.Lazy(list_0)
    str_1 = lazy_0.__str__()
    var_0 = lazy_1.to_try()
    object_0 = None
    lazy_2 = module_1.Lazy(callable_0)
    bool_0 = False
    lazy_3 = module_1.Lazy(bool_0)
    bytes_0 = b"\xc5\x11 \xa5\x120\xd7/\xf8\xf6'"
    var_1 = lazy_3.ap(bytes_0)
    bool_1 = lazy_3.__eq__(object_0)

def test_case_3():
    int_0 = 5
    lazy_0 = module_1.Lazy(int_0)
    bool_0 = lazy_0.__eq__(lazy_0)

def test_case_4():
    object_0 = module_0.object()
    lazy_0 = module_1.Lazy(object_0)
    bool_0 = lazy_0.__eq__(object_0)
    callable_0 = None
    var_0 = lazy_0.map(callable_0)
    var_1 = lazy_0.to_try()

def test_case_5():
    str_0 = '}]tX.i4B(P'
    list_0 = [str_0, str_0]
    object_0 = module_0.object()
    lazy_0 = module_1.Lazy(object_0)
    var_0 = lazy_0.ap(list_0)

def test_case_6():
    float_0 = None
    list_0 = [float_0]
    bool_0 = True
    lazy_0 = module_1.Lazy(bool_0)
    var_0 = lazy_0.bind(list_0)

def test_case_7():
    bytes_0 = b'\xf6\xbb\x80v'
    lazy_0 = module_1.Lazy(bytes_0)
    var_0 = lazy_0.to_try()

def test_case_8():
    object_0 = module_0.object()
    bytes_0 = b'\xed\x97\xa8\xbc\xfb\x1f\x8c\xbdIz\xaf,\x88\xaf\xb8\xe0d\xa1\xed\xcc'
    lazy_0 = module_1.Lazy(bytes_0)
    bool_0 = lazy_0.__eq__(object_0)