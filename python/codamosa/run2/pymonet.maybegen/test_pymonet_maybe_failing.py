# Automatically generated by Pynguin.
import pymonet.maybe as module_0
import builtins as module_1

def test_case_0():
    try:
        float_0 = None
        tuple_0 = None
        list_0 = [tuple_0, tuple_0, tuple_0]
        bool_0 = False
        maybe_0 = module_0.Maybe(list_0, bool_0)
        var_0 = maybe_0.map(float_0)
    except BaseException:
        pass

def test_case_1():
    try:
        var_0 = None
        bool_0 = True
        maybe_0 = module_0.Maybe(var_0, bool_0)
        object_0 = module_1.object()
        bool_1 = maybe_0.__eq__(object_0)
        callable_0 = None
        var_1 = maybe_0.to_lazy()
        bool_2 = True
        maybe_1 = module_0.Maybe(var_0, bool_2)
        var_2 = maybe_1.bind(callable_0)
        bool_3 = False
        maybe_2 = module_0.Maybe(var_0, bool_3)
        maybe_3 = module_0.Maybe(var_0, bool_3)
        var_3 = maybe_3.bind(callable_0)
    except BaseException:
        pass

def test_case_2():
    try:
        bool_0 = True
        maybe_0 = module_0.Maybe(bool_0, bool_0)
        callable_0 = None
        var_0 = maybe_0.filter(callable_0)
        bool_1 = False
        maybe_1 = module_0.Maybe(maybe_0, bool_1)
        var_1 = maybe_1.filter(callable_0)
    except BaseException:
        pass

def test_case_3():
    try:
        list_0 = []
        bytes_0 = b'L\x9c\x01Yt\xd5\x00\xe4\x8b\xe2\x01\xc9":\xcc\xd2\x1d5'
        dict_0 = {bytes_0: bytes_0}
        bool_0 = False
        maybe_0 = module_0.Maybe(dict_0, bool_0)
        var_0 = maybe_0.filter(list_0)
    except BaseException:
        pass

def test_case_4():
    try:
        bool_0 = False
        bytes_0 = b'o5\x8a/O\xdd'
        maybe_0 = module_0.Maybe(bytes_0, bool_0)
        var_0 = maybe_0.to_lazy()
        object_0 = module_1.object()
        maybe_1 = module_0.Maybe(object_0, bool_0)
        float_0 = -2531.5
        maybe_2 = module_0.Maybe(float_0, bool_0)
        var_1 = maybe_1.to_either()
        float_1 = -1921.0
        var_2 = maybe_1.filter(float_1)
    except BaseException:
        pass

def test_case_5():
    try:
        object_0 = module_1.object()
        bool_0 = True
        dict_0 = None
        set_0 = {dict_0, dict_0, bool_0}
        callable_0 = None
        str_0 = '\n        :param fork: function to call during fork\n        :type fork: Function(reject, resolve) -> Any\n        '
        maybe_0 = module_0.Maybe(str_0, bool_0)
        var_0 = maybe_0.map(callable_0)
        bool_1 = False
        maybe_1 = module_0.Maybe(set_0, bool_1)
        var_1 = maybe_1.to_validation()
        dict_1 = {object_0: bool_0}
        bool_2 = True
        var_2 = None
        bool_3 = False
        maybe_2 = module_0.Maybe(var_2, bool_3)
        int_0 = 2028
        bool_4 = False
        maybe_3 = module_0.Maybe(str_0, bool_4)
        var_3 = maybe_3.get_or_else(int_0)
        maybe_4 = module_0.Maybe(dict_1, bool_2)
        str_1 = '\tW(%3nOd<h^*vhe'
        tuple_0 = (str_1,)
        var_4 = maybe_4.map(tuple_0)
        var_5 = maybe_4.to_either()
        var_6 = maybe_4.to_try()
        var_7 = maybe_4.ap(dict_0)
        maybe_5 = module_0.Maybe(object_0, bool_0)
        var_8 = maybe_5.to_box()
        maybe_6 = module_0.Maybe(var_2, bool_2)
        var_9 = maybe_1.ap(dict_1)
    except BaseException:
        pass